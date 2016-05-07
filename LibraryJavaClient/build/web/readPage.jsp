<%-- 
    Document   : index
    Created on : 27.04.2016, 21:39:18
    Author     : master
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Электронная библиотека книг</title>
        <link rel="stylesheet" type="text/css" href="css/style.css" />

        <link href="/css/ui-lightness/jquery-ui-1.9.2.custom.css" rel="stylesheet" type="text/css" />
        <script language="javascript" src="js/jquery-1.10.2.js"></script>
        <script language="javascript" src="js/enter&check.js"></script>


        <script>
             function w() {
               $("div#welcome").hide();
               $("div#reg").show();
               $("div#dialog").hide();
            }
            
            function w1() {
               $("div#dialog").show();
            }
            function w2() {
               $("div#dialog").show();
            }
              
            $(document).ready(function() {
                $("div#reg").hide();
                $("div#welcome").show();
                $("div#dialog").hide();
            });
            
            $("#regLink").on("click",function() {
                $("div#reg").show();
                $("div#welcome").hide();
                $("div#dialog").hide();
            });
        </script>
    </head>


    <body>
        <div id="main">
            <div id="top">
                <div id="text">
                    <p>Книга — чистейшая сущность человеческой души. 
                        © Карлейль</p>
                </div>
                <div id="enterDiv">
                    <a href="#" onclick="w1()">Вход / Регистрация</a>
                    <div id="dialog">
                     <form action="/LibraryJavaClient/Servlet" method="POST">
                         <input type="hidden" name="command" value="login"/>
                            <p>Логин<input type = "text" name = loginUser id = "loginUser" placeholder="Введите логин"></p><br>
                            <p>Пароль<input type = "password" name = passUser id="passUser" placeholder="Введите пароль"></p><br>
                      
                            <input type="submit" name="login" value="Войти" onclick="w2()">
                            <a href="#" onclick="w()">Регистрация</a> 
                       </form>
                    </div>
            
                </div>
                <div id="head">
                    <p><a href="index.jsp">ЭЛЕКТРОННАЯ БИБЛИОТЕКА КНИГ</a></p>
                </div>
                <div id="link">
                    <a href="Servlet?command=book" id="Books">Книги</a>
                    <a href="#">Советуем прочитать</a>                
                    <a href="#">Контакты</a>
                    <a href="#">Популярное</a>
                </div>
                <div id="search">
                    <form  action="/LibraryJavaClient/Servlet" method="POST">
                        <input type="text" id="searchText" name="searchText" placeholder="Введите название книги">
                        <input type="hidden" name="command" value="search"/>
                        <input type="submit" value="Найти" name="search">
                    </form>
                </div>
            </div>
            <div id="middle"> 
                <div id="reg">
                    <form action="/LibraryJavaClient/Servlet" method="POST">
                        <input type="hidden" name="command" value="reg"/>
                        <p>Логин&nbsp;&nbsp;<input type = "text" name = loginUser id = "loginUser" placeholder="Введите логин"></p><br>
                        <p>Пароль<input type = "password" name = passUser id="passUser" placeholder="Введите пароль"></p><br>
                        <p>e-mail&nbsp;&nbsp;<input type="text" name="email" id="email" placeholder="Введите e-mail"></p><br>
                        <input type="submit" name="ok" value="Зарегистрироваться"></form>
                </div>
                <div id="readDiv">
                    <h1>${nameAtt}</h1>
                    <h6>${textAtt}</h6>
                </div>
            </div>
        <div id="bottom">
            <p>Минск, 2016</p>
        </div>
    </div>
</body>
</html>