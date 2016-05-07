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
            function disp(form) {
                if (form.style.display == "none" && dialog.style.display == "none") {
                    form.style.display = "block";
                    dialog.style.display = "block";

                } else {
                    form.style.display = "none";
                    dialog.style.display = "none";
                }
            }

            function w() {
                $("div#welcome").hide();
                $("div#reg").show();
                $("div#dialog").hide();
            }
            function qwe() {
                alert("123");
                location.href = "images/search.png" download;
            }

            function w1() {
                $("div#dialog").show();
            }
            function w2() {
                $("div#dialog").show();
            }

            function w() {
                $("div#welcome").hide();
                $("div#reg").show();
                $("div#dialog").hide();
                $("div#dialog").hide();
            }

            $(document).ready(function () {
                $("div#reg").hide();
                $("div#welcome").show();
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
                    <a href="Servlet?command=analytics">Популярное</a>
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
                <div id="genreDiv">                    
                    <c:forEach items="${requestScope.genre}" var="genre">
                        <form  action="/LibraryJavaClient/Servlet" method="POST">
                            <input type="hidden" name="command" value="genreFilter"/>
                            <input type="hidden" name="idGenre" value="${genre.getIdGenre().byteValue()}"/>
                            <input type="submit" value="${genre.getNameGenre().getValue()}" name="genreFilter">
                        </form>

                    </c:forEach>
                </div>

                <div id="bookDiv">  
                    <table id="tableBook">  
                        <tr>
                            <c:forEach items="${requestScope.listName}" var="listName">
                                <td width="200px" valign="top"><h1>${listName}</h1></td>
                                    </c:forEach>
                        </tr>
                        <tr>
                            <c:forEach items="${requestScope.listGenre}" var="listGenre">
                                <td valign="top" width="200px"><p>${listGenre}</p></td>
                                    </c:forEach>
                        </tr>
                        <tr>
                            <c:forEach items="${requestScope.listAuthor}" var="listAuthor">
                                <td valign="top" width="200px"><p>${listAuthor}</p></td>
                                    </c:forEach>
                        </tr>
                        <tr>
                            <c:forEach items="${requestScope.listDate}" var="listDate">
                                <td valign="top" width="200px"><p>${listDate}</p></td>
                                    </c:forEach>
                        </tr>
                        <tr>
                            <c:forEach items="${requestScope.listPubl}" var="listPubl">
                                <td valign="top" width="200px"><p>${listPubl}</p></td>
                                    </c:forEach>
                        </tr>
                        <tr>
                            <c:forEach items="${requestScope.listAbout}" var="listAbout">
                                <td valign="top" width="200px"><p>${listAbout}</p></td>
                                    </c:forEach>
                        </tr>
                        <tr>
                            <c:forEach items="${requestScope.listImg}" var="listImg">
                                <td valign="top" width="200px">
                                    <img src="${listImg}"><br>
                                </td>
                            </c:forEach>
                        </tr>
                        <tr>
                            <c:forEach items="${requestScope.listId}" var="listId">
                                <td valign="top" width="200px">
                                    <form  action="/LibraryJavaClient/Servlet" method="POST">
                                        <input type="hidden" name="command" value="read"/>
                                        <input type="hidden" name="idBook" value="${listId}"/>
                                        <input type="submit" value="Читать онлайн" name="read">
                                    </form>
                                </td>
                            </c:forEach> 
                        </tr>
                        <tr>
                            <c:forEach items="${requestScope.listId}" var="listId">
                                <td valign="top" width="200px">
                                    <form  action="/LibraryJavaClient/Servlet" method="POST" id="form1">
                                        <input type="hidden" name="command" value="down"/>
                                        <input type="hidden" name="idBook" value="${listId}"/>
                                        <input type=button onclick=location.href='text/1.txt.rar' value="Скачать" name="down">
                                    </form>
                                </td>
                            </c:forEach>

                        </tr>


                    </table>
                </div>
                <div id="authorDiv">                    
                    <c:forEach items="${requestScope.author}" var="author">
                        <form  action="/LibraryJavaClient/Servlet" method="POST">
                            <input type="hidden" name="command" value="authorFilter"/>
                            <input type="hidden" name="idAuthor" value="${author.getIdAuthor().byteValue()}"/>
                            <input type="submit" value="${author.getName().getValue()} ${author.getSurname().getValue()}" name="genreFilter">
                        </form>
                    </c:forEach>
                </div>
            </div>
            <div id="bottom">
                <p>Минск, 2016</p>
            </div>
        </div>


        <script type="text/javascript">
            function showHide(element, element2) {
                var obj = document.getElementById(element);
                var obj2 = document.getElementById(element2);
                obj.style.display = "block";
                obj2.style.display = "none";
            }
        </script>
    </body>
</html>