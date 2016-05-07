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
public class ShowAuthorsCommand implements Command {
        @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        org.tempuri.MyService service = new org.tempuri.MyService();
        org.tempuri.IMyService client = service.getBasicHttpBindingIMyService();
        int i = client.getAllAuthor().getAuthors().size();
        List<String> list = new ArrayList<String>();        
        for (int j = 0; j < i; j++)
        {
             System.out.println(client.getAllAuthor().getAuthors().get(j).getName().getValue());  
             //list.add(client.getAllAuthor().getAuthors().get(j).getName().getValue() + " " + );
        }
        request.setAttribute("author", client.getAllAuthor().getAuthors());
        request.setAttribute("genre", client.getAllGenre().getGenres());
        request.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);

    }  
}
