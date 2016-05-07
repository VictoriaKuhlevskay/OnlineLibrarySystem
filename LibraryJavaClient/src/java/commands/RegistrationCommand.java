/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;


import servlet.Constants;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Home
 */
public class RegistrationCommand implements Command  {

    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String login = request.getParameter(Constants.loginUser);
            String password = request.getParameter(Constants.passUser);
            String email = request.getParameter(Constants.email);
            org.tempuri.MyService service = new org.tempuri.MyService();
            org.tempuri.IMyService client = service.getBasicHttpBindingIMyService();
            client.registration(login, password, email);
            Constants.flag++;
            request.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);

    }
}
