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

        <c:if test="${usuarioLogado==null}">     
            <c:redirect url="index.jsp"></c:redirect>
        </c:if>
        <c:if test="${usuarioLogado.tipoUsuario==1}">     
            <c:redirect url="dashboard.jsp"></c:redirect>
        </c:if>
        <c:if test="${msgDelecao!=null}">
            <script type="text/javascript">
                window.onload = function () {
                    Materialize.toast('${msgDelecao}', 50000);
                };
            </script>
        </c:if>
        <c:if test="${msgAprovacao!=null}">
            <script type="text/javascript">
                window.onload = function () {
                    Materialize.toast('${msgAprovacao}', 50000);
                };
            </script>
        </c:if>
        <c:if test="${msgNegacao!=null}">
            <script type="text/javascript">
                window.onload = function () {
                    Materialize.toast('${msgAprovacao}', 50000);
                };
            </script>
        </c:if>
        <c:if test="${msgPost!=null}">
            <script type="text/javascript">
                window.onload = function () {
                    Materialize.toast('${msgPost}', 50000);
                };
            </script>
        </c:if>
        <!-- Menu -->
        <%@include file="menu.jspf" %>
        <!-- End Menu -->

        <!-- Conteudo -->
        <!-- Sub Menu -->
        <div class="dash-table">
            <div class="container center light blue dash-sub">
                <div class="row">
                    <div class="col s6 selected-sub">
                        <a href="#!" class="waves-effect waves-teal btn-flat">Posts/Usuarios</a>
                    </div>

                    <div class="col s6">
                        <a href="FrontControllerServlet?control=Dashboard&action=redirectToAnalytics" class="waves-effect waves-teal btn-flat">Analytics</a>
                    </div>
                </div>
            </div>
            <!-- END Sub Menu -->

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
                                <a class="waves-effect waves-light btn" href="FrontControllerServlet?control=Post&action=redirectToCriar">Criar Post</a>
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
                    <br>
                    <div class="col s12 selected-sub">
                        <a class="btn-flat" id="usuariosAprov">Usuarios para Aprovação</a>
                    </div>
                    <table class="striped centered responsive-table" id="usuariosAprov">
                        <thead>
                            <tr>
                                <th>Usuario</th>
                                <th>Cod. Identificador</th>
                                <th>Aprovar</th>
                                <th>Negar</th>
                            </tr>
                        </thead>

                        <tbody>
                            <c:forEach items="${tabelasUsuarioAprov}" var="usuarioAprov">
                                <tr>
                                    <td> ${usuarioAprov.nome}</td>
                                    <td> ${usuarioAprov.codigo} </td>
                                    <td><a href="FrontControllerServlet?control=Usuario&action=aprovar&idUsuario=${usuarioAprov.idusuario}&idEmpresa=${usuarioAprov.codigo.substring(0,4)}" ><i class="material-icons">check_circle</i></a></td>
                                    <td><a onclick='confNegarUsuario("FrontControllerServlet?control=Usuario&action=negar&idUsuario=${usuarioAprov.idusuario}");' ><i class="material-icons">delete_forever</i></a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <br><br>
                    <div class="col s12 selected-sub">
                        <a class="btn-flat" id="usuariosEmp">Usuarios da Empresa</a>
                    </div>
                    <table class="striped centered responsive-table" id="usuariosEmp">
                        <thead>
                            <tr>
                                <th>Usuario</th>
                                <th>Cod. Identificador</th>
                                <th>Modificar acesso</th>
                                <th>Excluir</th>
                            </tr>
                        </thead>

                        <tbody>
                            <c:forEach items="${tabelasUsuarios}" var="usuarioEmp">
                                <tr>
                                    <td> ${usuarioEmp.nome}</td>
                                    <td> ${usuarioEmp.codigo} </td>
                                    <td><a href="#modal${usuarioEmp.idusuario}" data-target="modal1" class="modal-trigger"><i class="material-icons">lock_open</i></a></td>
                                    <td><a onclick='confRemoverUsuario("FrontControllerServlet?control=Usuario&action=excluirId&idUsuario=${usuarioEmp.idusuario}");'><i class="material-icons">delete_forever</i></a></td>

                            <div id="modal${usuarioEmp.idusuario}" class="modal">
                                <div class="modal-content">
                                    <h4>Modificação de acesso</h4>
                                    <p>Escolha um dos tipos de acesso para o usuário: ${usuarioEmp.nome}</p>
                                    <c:forEach items="${infosUsuariosTabelas}" var="usuarioTabela">
                                        <c:if test="${usuarioTabela.idusuario==usuarioEmp.idusuario}">
                                            <p>Tipo de acesso atual: ${usuarioTabela.tipoUsuario==1?"Comum":"Administrador"}</p>
                                        </c:if>
                                    </c:forEach>
                                </div>
                                <div class="modal-footer">
                                    <a href="FrontControllerServlet?control=Usuario&action=modAcesso&idUsuario=${usuarioEmp.idusuario}&tipo=1" class="modal-action modal-close btn waves-effect waves-green btn-flat">Comum</a>
                                    <a href="FrontControllerServlet?control=Usuario&action=modAcesso&idUsuario=${usuarioEmp.idusuario}&tipo=2" class="modal-action modal-close btn waves-effect waves-red btn-flat">Administrador</a>
                                </div>
                            </div>
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
                                            $('.modal').modal();
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

                                        function confRemoverUsuario(redirecionamento) {
                                            var r = confirm("Você deseja realmente REMOVER esse usuário?");
                                            if (r) {
                                                window.location.replace(redirecionamento);
                                            }
                                        }

                                        function confNegarUsuario(redirecionamento) {
                                            var r = confirm("Você deseja realmente NEGAR esse usuário?");
                                            if (r) {
                                                window.location.replace(redirecionamento);
                                            }
                                        }
        </script>
    </body>

</html>
