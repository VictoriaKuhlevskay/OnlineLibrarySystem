/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author master
 */
public class DownCommand implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("DownCommand1");
        String idBook = request.getParameter("idBook");
        System.out.println(idBook);
        org.tempuri.MyService service = new org.tempuri.MyService();
        org.tempuri.IMyService client = service.getBasicHttpBindingIMyService();
        List<String> listText = new ArrayList<String>();
        List<String> list = client.getAllBook().getString();
        for (int i = 0; i < list.size(); i++) {
            String[] mas;
            mas = list.get(i).split(";");
            listText.add(mas[8]);
        }
        String fileName = listText.get(Integer.valueOf(idBook) - 1) + ".rar";
         System.out.println(fileName);
        request.setAttribute("adress", fileName);
        //Возвращаем полученный текст с файла
        request.getServletContext().getRequestDispatcher("/Servlet?command=book").forward(request, response);
    }
}
