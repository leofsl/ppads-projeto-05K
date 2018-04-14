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
        <!-- End Menu -->

        <!-- Modal Login -->
        <c:if test="${error!=null}">
            <script type="text/javascript">
                window.onload = function () {
                    Materialize.toast('${error}', 50000);
                };
            </script>
        </c:if>
        <c:if test="${msgComentario!=null}">
            <script type="text/javascript">
                window.onload = function () {
                    Materialize.toast('${msgComentario}', 50000);
                };
            </script>
        </c:if>
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
            <div class="z-depth-1 box-all-posts">
                <div class="row">
                    <div class="col s12">
                        <h3>Assunto: ${postSession.assunto} &nbsp;&nbsp;
                            <c:choose>
                                <c:when test="${(((usuarioLogado.tipoUsuario==2)||(usuarioLogado.tipoUsuario==3)) || (postSession.fkusuario.idusuario == usuarioLogado.idusuario))&&(usuarioLogado.identInternoEmpresa.substring(0,4)==postSession.fkusuario.identInternoEmpresa.substring(0,4))}">
                                    <a onclick="confRemoverPost();"><i class="material-icons red-text">delete_forever</i></a>
                                </c:when>    
                            </c:choose>
                        </h3>
                    </div>
                </div>
                <form class="col s12" method="post">
                    <div class="row">
                        <div class="col s6">                
                            <img src="images/profile.png" alt="foto perfil"/>
                        </div>
                        <div class="col s6">                              
                            <p style="font-weight:bolder;">Descrição:</p> <!--nao to conseguindo deixar em negrito!-->
                            <p>IMAGEM</p>
                            <p>${postSession.texto}</p>
                            <p>Data de criação: ${postSession.getDataFormatada()}</p>
                            <p>Likes: ${postSession.up} &nbsp;&nbsp; <a href="FrontControllerServlet?control=Post&action=up&idpost=${postSession.idpost}" ><i class="material-icons">thumb_up</i></a></p>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col s4 offset-l2">
                            <p>Usuário: ${postSession.fkusuario.nomeUsuario}</p>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col s4 offset-l2">
                            <p>Status do post: ${postSession.fkstatus.nomeStatus} &nbsp;</p>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col s4 offset-l2">
                            <p>Local: ${postSession.localPost} </p>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col s4 offset-l2">
                            <p>Categoria: ${postSession.fkcategoria.nomeCategoria}</p>
                        </div>
                    </div>
                    <c:if test="${(((usuarioLogado.tipoUsuario==2)||(usuarioLogado.tipoUsuario==3)) || (postSession.fkusuario.idusuario == usuarioLogado.idusuario))&&(usuarioLogado.identInternoEmpresa.substring(0,4)==postSession.fkusuario.identInternoEmpresa.substring(0,4))}">
                        <div class="row">
                            <div class="col s4 offset-s1">
                                <a class="waves-effect waves-light btn green" onclick="confResolverPost();">Resolver post</a>
                            </div>
                        </div>
                    </c:if>
                </form>
                <div class="row center col s10 offset-s1">
                    <div class="col s11 offset-s1">
                        <h3>Comentários</h3>
                    </div>
                    <div class="col s11 offset-s1"><br>
                        <div class="row">
                            <c:forEach items="${comentariosPostSession}" var="comentario">
                                <div class="col s6">
                                    <div class="card grey lighten-3 hoverable">
                                        <div class="card-content">
                                            <span class="card-title">Usuário: ${comentario.fkusuario.nomeUsuario} 
                                                ${((comentario.fkusuario.tipoUsuario==2)||(comentario.fkusuario.tipoUsuario==3))?'(Administrador)':''}
                                                <c:choose>
                                                    <c:when test="${comentario.fkusuario.idusuario==usuarioLogado.idusuario}">
                                                        <a onclick='confRemoverComentario("FrontControllerServlet?control=Post&action=deletarComentario&idpost=${postSession.idpost}&idcomentario=${comentario.idcomentario}")' ><i class="material-icons">delete_forever</i></a>
                                                    </c:when>    
                                                </c:choose></span>
                                            <p>${comentario.texto}</p>
                                            <p class="right">Data: ${comentario.getDataFormatada()}
                                            </p>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach><br>
                        </div>
                    </div>
                </div>
                <c:if test="${usuarioLogado!=null}">
                    <c:choose>
                        <c:when test="${usuarioLogado.tipoUsuario==1}">
                            <form class="col s10 offset-s1" method="post" action="FrontControllerServlet?control=Post&action=comentar&idPost=${postSession.idpost}">
                                <div class='row'>
                                    <div class='input-field col s9 offset-s1'>
                                        <input class='validate' type='text' name='comentario' id='comentario' maxlength="180">
                                        <label for='comentario'>Digite aqui seu comentário (max: 180 carac.)</label>
                                    </div>
                                    <div class='input-field col s2'>
                                        <input type="hidden" name="command" value="Usuario.register" />
                                        <button type='submit' name='btn-cadastro' class='btn btn-large waves-effect'>Comentar</button>
                                    </div>
                                </div>
                            </form>
                        </c:when>  
                        <c:when test="${usuarioLogado.tipoUsuario==2 || usuarioLogado.tipoUsuario==3}">
                            <form class="col s10 offset-s1" method="post" action="FrontControllerServlet?control=Post&action=comentarAdm&idPost=${postSession.idpost}">
                                <div class='row'>
                                    <div class='input-field col s9 offset-s1'>
                                        <input class='validate' type='text' name='comentario' id='comentario' maxlength="180">
                                        <label for='comentario'>Digite aqui seu comentário (max: 180 carac.)</label>
                                    </div>
                                    <div class='input-field col s2'>
                                        <input type="hidden" name="command" value="Usuario.register" />
                                        <button type='submit' name='btn-cadastro' class='btn btn-large waves-effect'>Comentar</button>
                                    </div>
                                </div>
                            </form>
                        </c:when>   
                    </c:choose></span>

                </c:if>
            </div>
        </div>
        <c:if test="${(((usuarioLogado.tipoUsuario==2)||(usuarioLogado.tipoUsuario==3)) || (usuarioLogado.idusuario==postSession.fkusuario.idusuario))&&(usuarioLogado.identInternoEmpresa.substring(0,4)==postSession.fkusuario.identInternoEmpresa.substring(0,4))}">     
            <div class="center">
                <div class="z-depth-1 box-all-post">
                    <div class="row">
                        <div class="col s12">
                            <h3>Editar post</h3><br>
                        </div>
                    </div>

                    <form class="col s12" method="post" action="FrontControllerServlet?control=Post&action=alterar&idPost=${postSession.idpost}">
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
                                <label>Categoria (Atual:  ${postSession.fkcategoria.nomeCategoria})</label>
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
        </c:if>
        <!-- END Conteudo -->

        <!-- Footer -->
        <%@include file="footer.jspf" %>
        <!-- END Footer -->

        <!--Import jQuery before materialize.js-->
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.js"></script>
        <script type="text/javascript" src="js/init.js"></script>
        <script>
                                                            function confResolverPost() {
                                                                var r = confirm("Sua situação realmente foi resolvida?");
                                                                if (r) {
                                                                    window.location.replace("FrontControllerServlet?control=Post&action=resolverPost&idpost=${postSession.idpost}");
                                                                }
                                                            }

                                                            function confRemoverPost() {
                                                                var r = confirm("Você deseja realmente REMOVER esse post?");
                                                                if (r) {
                                                                    window.location.replace("FrontControllerServlet?control=Post&action=deletarPost&idpost=${postSession.idpost}");
                                                                }
                                                            }

                                                            function confRemoverComentario(redirecionamento) {
                                                                var r = confirm("Você deseja realmente REMOVER esse comentario?");
                                                                if (r) {
                                                                    window.location.replace(redirecionamento);
                                                                }
                                                            }
        </script>
    </body>

</html>
