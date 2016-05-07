/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servlet.Constants;

/**
 *
 * @author master
 */
public class LoginCommand implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(" zahodili ");
        String login = request.getParameter(Constants.loginUser);
        String password = request.getParameter(Constants.passUser);
        System.out.println(login + " zahodili " + password);
        Exception show = new Exception();
        org.tempuri.MyService service = new org.tempuri.MyService();
        org.tempuri.IMyService client = service.getBasicHttpBindingIMyService();
        int i = client.enter(login, password);
        if (i == -1) {
            show.errorPage("Error!", "index.jsp", response);
        } else {
            Constants.flag++;
            RequestDispatcher dispatcher2 = request.getRequestDispatcher("index.jsp");
            dispatcher2.forward(request, response);
        }

    }
}
