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
        <title>Munka</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>

    <body style="background-color: #f0f0f0;">
        <!-- Menu -->
        <%@include file="menu.jspf" %>
        <c:if test="${(usuarioLogado==null)}">     
            <c:redirect url="login.jsp"></c:redirect>
        </c:if>
        <c:if test="${error!=null}">
            <script type="text/javascript">
                window.onload = function () {
                    Materialize.toast('${error}', 50000);
                };
            </script>
        </c:if>
        <!-- End Menu -->

        <!-- Modal Login -->

        <!-- Modal Structure -->
        <div id="modal1" class="modal modal-fixed-footer">
            <div class="modal-content">

                <!-- Login Box -->
                <div class="z-depth-1 row box-all box-login">
                    <div class="row">
                        <div class="col s12">
                            <a href="index.html"><img class="logo-login" src="images/logo_munka.png" alt="Munka Logo"></a>
                        </div>
                    </div>

                    <form class="col s12" method="post">
                        <div class='row'>
                            <div class='col s12'>
                            </div>
                        </div>

                        <div class='row'>
                            <div class='input-field col s12'>
                                <input class='validate' type='email' name='email' id='email'>
                                <label for='email'>Email</label>
                            </div>
                        </div>

                        <div class='row'>
                            <div class='input-field col s12'>
                                <input class='validate' type='password' name='password' id='password'>
                                <label for='password'>Senha</label>
                            </div>
                        </div>

                        <div class="row">
                            <div class="remember-pass col s12">
                                <input type="checkbox" id="remeber">
                                <label for="remember">Lembrar senha</label>
                            </div>
                        </div>

                        <br>
                        <div class='row'>
                            <button type='submit' name='btn-login' class='col s12 btn btn-large waves-effect'>Entrar</button>
                        </div>
                        <div class="row">
                            <label><a class='pink-text' href='#!'><b>Esqueci minha senha?</b></a></label>
                        </div>
                        <div class="row">
                            <hr>
                            <label>Ainda não tem uma conta? <a class='pink-text' href='#!'><b>Criar Conta</b></a></label>
                        </div>
                    </form>
                </div>
                <!-- END Login Box -->

            </div>
            <div class="modal-footer">
                <a href="#!" class="modal-action modal-close waves-effect waves-green btn-flat ">Agree</a>
            </div>
        </div>
        <!-- END Modal Login -->

        <!-- Conteudo -->
        <div class="center">
            <div class="z-depth-1 box-all-post">
                <div class="row">
                    <div class="col s12">
                        <h3>Criar post</h3><br>
                    </div>
                </div>

                <form class="col s12" method="post" action="FrontControllerServlet?control=Post&action=criar">
                    <div class='row'>
                        <div class='input-field col s8 offset-l2'>
                            <input class='validate' type='text' name='assunto' id='assunto' value='${postSession.assunto}'>
                            <label for='assunto'>Assunto</label>
                        </div>
                    </div>
                    <div class='row'>
                        <div class='input-field col s8 offset-l2'>
                            <input class='validate' type='text' name='local' id='local' value='${postSession.localPost}'>
                            <label for='local'>Local</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s8 offset-l2">
                            <textarea id="descricao" name="descricao" class="materialize-textarea" maxlength="1900">${postSession.texto}</textarea>
                            <label for="descricao">Descrição</label>
                        </div>
                    </div>
                    <div class='row'>
                        <div class="input-field col s8 offset-l2">
                            <select name="categoria" id="categoria">
                                <c:choose>
                                    <c:when test="${postSession.fkcategoria.nomeCategoria!=null}">
                                        <option value="" disabled>Selecione uma categoria</option>
                                        <c:forEach items="${categorias}" var="categoria">
                                            <c:choose>
                                                <c:when test="${postSession.fkcategoria.nomeCategoria==categoria.nomeCategoria}">
                                                    <option value="${categoria.idcategoria}" selected>${categoria.nomeCategoria}</option>
                                                </c:when>    
                                                <c:otherwise>
                                                    <option value="${categoria.idcategoria}">${categoria.nomeCategoria}</option>
                                                </c:otherwise>
                                            </c:choose>
                                        </c:forEach>
                                    </c:when>    
                                    <c:otherwise>
                                        <option value="" disabled selected>Selecione uma categoria</option>
                                        <c:forEach items="${categorias}" var="categoria">
                                            <option value="${categoria.idcategoria}">${categoria.nomeCategoria}</option>
                                        </c:forEach>
                                    </c:otherwise>
                                </c:choose>
                            </select>
                            <label>Categoria</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="">
                            <div class="file-field input-field col s8 offset-l2">
                                <div class="btn">
                                    <span>File</span>
                                    <input type="file" multiple>
                                </div>
                                <div class="file-path-wrapper">
                                    <input class="file-path validate" type="text" placeholder="Faça o upload de uma imagem">
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class='row'>
                        <div class='input-field col s12'>
                            <input type="hidden" name="command" value="Usuario.register" />
                            <button type='submit' name='btn-cadastro' class='btn btn-large waves-effect'>Salvar</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <!-- END Conteudo -->

        <!-- Footer -->
        <%@include file="footer.jspf" %>
        <!-- END Footer -->

        <!--Import jQuery before materialize.js-->
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.js"></script>
        <script type="text/javascript" src="js/init.js"></script>
    </body>

</html>
