/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.tempuri.IMyService;
import org.tempuri.MyService;

/**
 *
 * @author master
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        // TODO code application logic here
        try {
            Show();
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }
        
        
    }

    
    private static void Show() {
        org.tempuri.MyService service = new org.tempuri.MyService();
        org.tempuri.IMyService client = service.getBasicHttpBindingIMyService();
        int i = client.getAllGenre().getGenres().size();
        List<String> list = new ArrayList<String>();        
        for (int j = 0; j < i; j++)
        {
             System.out.println(client.getAllGenre().getGenres().get(j).getNameGenre().getValue());  
             list.add(client.getAllGenre().getGenres().get(j).getNameGenre().getValue());
        }
        
        //HttpServletRequest request;
        //request.setAttribute("genre", port.getAllGenres());
    }
    
}
