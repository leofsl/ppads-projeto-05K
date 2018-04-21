<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">

    <head>
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import CSS-->
        <link type="text/css" rel="stylesheet" href="css/materialize.css" media="screen,projection" />
        <Link type="text/css" rel="stylesheet" href="css/style.css" media="screen,projection" />

        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />

        <!-- Basic Head Information -->
        <title>Admin Posts - Munka</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>

    <body>
        <c:if test="${(usuarioLogado.tipoUsuario == 2)||(usuarioLogado.tipoUsuario == 3)}">     
            <c:redirect url="dash-adm.jsp"></c:redirect>
        </c:if>
        <c:if test="${msgPost!=null}">
            <script type="text/javascript">
                window.onload = function () {
                    Materialize.toast('${msgPost}', 50000);
                };
            </script>
        </c:if>

        <!-- Menu -->
        <%@include file="menu2.jspf" %>
        <!-- End Menu -->

        <!-- Conteudo -->
        <div class="dash-table">

            <!-- Filtros -->
            <div class="container center">
                <div class="row">
                    <form class="form" method="post" action="FrontControllerServlet?control=Dashboard&action=filtrar">
                        <div class="input-field col s4">
                            <select name="categoria" id="categoria">
                                <option value="" disabled selected>Selecione uma categoria</option>
                                <c:forEach items="${categorias}" var="categoria">
                                    <option value="${categoria.idcategoria}">${categoria.nomeCategoria}</option>
                                </c:forEach>
                            </select>
                            <label>Categoria</label>
                        </div>

                        <div class="input-field col s4">
                            <select name="statusPost" id="statusPost">
                                <option value="" disabled selected>Selecione um status</option>
                                <c:forEach items="${listaStatus}" var="statusLista">
                                    <option value="${statusLista.idstatus}">${statusLista.nomeStatus}</option>
                                </c:forEach>
                            </select>
                            <label>Status</label>
                        </div>
                        <div class="col s2"><br>
                            <div class='row'>
                                <button type='submit' name='btn-filtro' class='col s12 btn waves-effect'>Filtrar</button>
                            </div>
                        </div>
                        <div class="col s2"><br>
                            <div class='row'>
                                <!--<a class="waves-effect waves-light btn" href="FrontControllerServlet?control=Post&action=redirectToCriar">Criar Post</a>-->
                                <a class="waves-effect waves-light btn" href="#">Criar Post</a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <!-- END Filtros -->

            <!-- Tabela de Posts -->
            <!-- Sub Menu 2 -->
            <div class="container center light blue dash-sub">
                <div class="row">
                    <c:if test="${usuarioLogado==null}">     
                        <div class="col s12 selected-sub">
                            <a class="btn-flat" id="todosPosts">Todos os Posts</a>
                        </div>
                    </c:if>
                    <c:if test="${usuarioLogado!=null}">     
                        <div class="col s6 selected-sub">
                            <a class="btn-flat" id="todosPosts">Todos os Posts</a>
                        </div>
                        <div class="col s6">
                            <a class="btn-flat" id="meusPosts">Meus os Posts</a>
                        </div>
                    </c:if>


                </div>
            </div>
            <!-- END Sub Menu 2 -->
            <div class="container center">
                <table class="striped centered responsive-table" id="tabTodosPosts">
                    <thead>
                        <tr>
                            <th>Título</th>
                            <th>Categoria</th>
                            <th>Status</th>
                            <th>Visualizar</th>
                        </tr>
                    </thead>

                    <tbody>
                        <c:forEach items="${tabelasPosts}" var="post">
                            <tr>
                                <td> ${post.assunto}</td>
                                <td> ${post.categoria} </td>
                                <td> ${post.status}</td>
                                <td><a href="FrontControllerServlet?control=Post&action=redirectToPost&idPost=${post.id}" ><i class="material-icons">play_arrow</i></a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

                <c:if test="${usuarioLogado!=null}">     
                    <table class="striped centered responsive-table" id="tabMeusPosts">
                        <thead>
                            <tr>
                                <th>Título</th>
                                <th>Categoria</th>
                                <th>Status</th>
                                <th>Alterar</th>
                            </tr>
                        </thead>

                        <tbody>
                            <c:forEach items="${meusPosts}" var="post">
                                <tr>
                                    <td> ${post.assunto}</td>
                                    <td> ${post.categoria} </td>
                                    <td> ${post.status}</td>
                                    <td><a href="FrontControllerServlet?control=Post&action=redirectToPost&idPost=${post.id}" ><i class="material-icons">create</i></a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </c:if>
            </div>  
            <!-- END Tabela de Posts -->
        </div>
        <!-- END Conteudo -->

        <!-- Footer -->
        <%@include file="footer.jspf" %>
        <!-- END Footer -->

        <!--Import jQuery before materialize.js-->
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.js"></script>
        <script type="text/javascript" src="js/init.js"></script>
        <script>
                $(document).ready(function () {
                    $("#tabMeusPosts").hide();
                    $("#todosPosts").click(function () {
                        $("#tabTodosPosts").fadeIn();
                        $("#tabMeusPosts").hide();
                    });
                    $("#meusPosts").click(function () {
                        $("#tabMeusPosts").fadeIn();
                        $("#tabTodosPosts").hide();
                    });
                });
        </script>
    </body>

</html>
