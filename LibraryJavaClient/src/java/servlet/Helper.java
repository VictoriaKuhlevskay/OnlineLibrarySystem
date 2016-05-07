/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import commands.*;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author master
 */
public class Helper {
    
    private static Helper instance = null;
    public static final String genre = "genre";
    public static final String book = "book";
    public static final String author = "author";
    public static final String genreFilter = "genreFilter";
    public static final String authorFilter = "authorFilter";
    public static final String search = "search";
    public static final String reg = "reg";
    public static final String login = "login";
    public static final String read = "read";
    public static final String down = "down";
    public static final String analytics = "analytics";
    
    HashMap<String, Command> commands = new HashMap<String, Command>();

    private Helper() {
        commands.put(genre, new ShowGenresCommand());
        commands.put(book, new ShowBooksCommand());
        commands.put(author, new ShowAuthorsCommand());
        commands.put(genreFilter, new GenreFilterCommand());
        commands.put(authorFilter, new AuthorFilterCommand());
        commands.put(search, new SearchCommand());
        commands.put(reg, new RegistrationCommand());
        commands.put(login, new LoginCommand());
        commands.put(read, new ReadCommand());
        commands.put(down, new DownCommand());
        commands.put(analytics, new AnalyticsCommand());
    }

    public Command getCommand(HttpServletRequest request) {
        String action = request.getParameter("command");
        Command command = commands.get(action);
        if (command == null) {
            command = new NoCommand();
        }
        return command;
    }

    public static Helper getInstance() {
        if (instance == null) {
            instance = new Helper();
        }
        return instance;
    }
}
