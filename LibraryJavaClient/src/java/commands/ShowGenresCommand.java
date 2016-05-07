/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ShowGenresCommand implements Command{
    
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        org.tempuri.MyService service = new org.tempuri.MyService();
        org.tempuri.IMyService client = service.getBasicHttpBindingIMyService();
        int i = client.getAllGenre().getGenres().size();
        List<String> list = new ArrayList<String>();        
        for (int j = 0; j < i; j++)
        {
             System.out.println(client.getAllGenre().getGenres().get(j).getNameGenre().getValue()); 
             list.add(client.getAllGenre().getGenres().get(j).getNameGenre().getValue());
        }
        request.setAttribute("genre", client.getAllGenre().getGenres());
        request.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);

    }    
}
