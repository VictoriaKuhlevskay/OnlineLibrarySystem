/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Home
 */
public class Exception {

    public void errorPage(String error,String href, HttpServletResponse response) throws IOException
    {
        OutputStreamWriter streamWriter = new OutputStreamWriter(response.getOutputStream(), "Cp1251");
        String out = "" + "<html> <head> <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" pageEncoding=\"UTF-8\"> </head><body bgcolor=\"black\"> <center> <p><font color=\"#f17f23\" size=\"+4\" face=\"Segoe print\">"+error+"</font></p><p><a href="+href+">OK</a></p>";
        String end = "</center> </body> </html>";
        out=out+end;
        streamWriter.write(out);
        streamWriter.close();
    }
}
