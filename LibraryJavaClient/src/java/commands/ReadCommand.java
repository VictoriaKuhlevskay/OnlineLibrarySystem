/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author master
 */
public class ReadCommand implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ReadCommand");
        String idBook = request.getParameter("idBook");
        System.out.println(idBook);
        org.tempuri.MyService service = new org.tempuri.MyService();
        org.tempuri.IMyService client = service.getBasicHttpBindingIMyService();
        List<String> listText = new ArrayList<String>();
        List<String> listName = new ArrayList<String>();
        List<String> list = client.getAllBook().getString();
        for (int i = 0; i < list.size(); i++) {
            String[] mas;
            mas = list.get(i).split(";");
            listName.add(mas[1]);
            listText.add(mas[8]);
        }
        String fileName = listText.get(Integer.valueOf(idBook) - 1);
        String nextString;
        String text = new String();

        try {
            final BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(fileName), "UTF8"));

            while ((nextString = br.readLine()) != null) {
                System.out.println(nextString);
                
                text += nextString + "\n";               
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        client.analyticsRead(Integer.valueOf(idBook));
        
        request.setAttribute("nameAtt", listName.get(Integer.valueOf(idBook) - 1).toString());
        request.setAttribute("textAtt", text);
        request.getServletContext().getRequestDispatcher("/readPage.jsp").forward(request, response);
    }
}
