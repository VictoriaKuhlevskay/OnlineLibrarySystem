/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author master
 */
public class ShowBooksCommand implements Command{
    
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ShowBooksCommand");
        org.tempuri.MyService service = new org.tempuri.MyService();
        org.tempuri.IMyService client = service.getBasicHttpBindingIMyService();
        List<String> listId = new ArrayList<String>();
        List<String> listName = new ArrayList<String>();
        List<String> listGenre = new ArrayList<String>();
        List<String> listAuthor = new ArrayList<String>();
        List<String> listPubl = new ArrayList<String>();
        List<String> listDate = new ArrayList<String>();
        List<String> listPage = new ArrayList<String>();
        List<String> listAbout = new ArrayList<String>();
        List<String> listText = new ArrayList<String>();
        List<String> listImg = new ArrayList<String>();
        List<String> list = client.getAllBook().getString();

        for (int i = 0; i < list.size(); i++) {
            String[] mas;
            mas = list.get(i).split(";");
            listId.add(mas[0]);
            listName.add(mas[1]);
            listGenre.add(mas[2]);
            listAuthor.add(mas[3]);
            listPubl.add(mas[4]);
            listDate.add(mas[5]);
            listPage.add(mas[6]);
            listAbout.add(mas[7]);
            listText.add(mas[8]);
            listImg.add(mas[9]);
        }

        
        request.setAttribute("list", list);
        request.setAttribute("listId", listId);
        request.setAttribute("listName", listName);
        request.setAttribute("listGenre", listGenre);
        request.setAttribute("listAuthor", listAuthor);
        request.setAttribute("listPubl", listPubl);
        request.setAttribute("listDate", listDate);
        request.setAttribute("listPage", listPage);
        request.setAttribute("listAbout", listAbout);
        request.setAttribute("listText", listText);
        request.setAttribute("listImg", listImg);
        request.setAttribute("author", client.getAllAuthor().getAuthors());
        request.setAttribute("genre", client.getAllGenre().getGenres());
        request.getServletContext().getRequestDispatcher("/bookPage.jsp").forward(request, response);

    }    
}
