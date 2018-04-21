<%@page import="com.munka.entities.Usuario"%>
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
        <title>Perfil - Munka</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>

    <body>
        <!--validacao-->
        <c:if test="${error!=null}">
            <script type="text/javascript">
                window.onload = function () {
                    Materialize.toast('${error}', 50000);
                };
            </script>
        </c:if>
        <c:if test="${msgAlt!=null}">
            <script type="text/javascript">
                window.onload = function () {
                    Materialize.toast('${msgAlt}', 50000);
                };
            </script>
        </c:if>
        <!-- Menu -->
        <%@include file="menu2.jspf" %>
        <!-- End Menu -->

        <!-- Conteudo -->
        <!-- Perfil Box -->
        <section style="margin-top: 50px;" >
            <h3 class="center" style="margin-top: 30px;">Perfil</h3>
            <div class="row">

                <div class="user-info col s3 offset-s1" style="margin-bottom: 50px;">
                    <%@include file="menuperfil.jspf" %>
                </div>

                <ul class="collapsible col s5 push-s1" data-collapsible="accordion">
                    <li>
                        <div class="collapsible-header">Informações do perfil</div>
                        <div class="collapsible-body">
                            <p>Nome: ${usuarioLogado.nomeUsuario} </p>
                            <p>Email: ${usuarioLogado.email}</p>
                            <p>Empresa Associada: ${instLogado}</p>
                            <p>Telefone: ${usuarioLogado.telefone}</p>
                            <p>Tipo: <%=((Usuario) session.getAttribute("usuarioLogado")).getTipoUsuario() == 1 ? "Comum" : "Administrador"%></p>
                        </div>
                    </li>
                    <li>
                        <div class="collapsible-header">Alterar Dados</div>
                        <div class="collapsible-body">

                            <div class="row">
                                <form method="post" action="FrontControllerServlet?control=Usuario&action=alterar" class="col s12">

                                    <div class="row">
                                        <div class="input-field col s10 row" style="margin-top: -20px; margin-left: -10px;">
                                            <p class="left col s6" style="font-size: 1.3em">Avatar</p>
                                            <div class="right col s6" style="margin-top: 20px">
                                                <input id="avatar" type="file" name="file"/>
                                                <label for="avatar"></label>
                                            </div>
                                        </div>
                                        <div class="input-field col s10">
                                            <input id="username" type="text" name="username" class="validate" value="${usuarioLogado.nomeUsuario}" required/>
                                            <label for="username">Nome de usuário</label>
                                        </div>

                                        <div class="input-field col s10">
                                            <input id="password" type="password" name="password" class="validate" required/>
                                            <label for="password">Senha</label>
                                        </div>
                                        <div class="input-field col s10">
                                            <input id="password2" name="password2" type="password" class="validate" required/>
                                            <label for="passoword2">Digite a senha novamente</label>
                                        </div>
                                        <div class="input-field col s10">
                                            <input disabled id="email" type="email" name="email" class="validate" value="${usuarioLogado.email}" required/>
                                            <label for="email">Email</label>
                                        </div>
                                        <div class="input-field col s10" >
                                            <input id="empresa_id" type="text" name="empresa_id" 
                                                   class="validate tooltipped" required value="${usuarioLogado.identInternoEmpresa}"
                                                   data-position="bottom" data-delay="50" data-tooltip="Caso deseje trocar, substitua pelo identificador da nova empresa"/>
                                            <label for="empresa">Empresa Associada (COD IDENTIFICADOR)</label>
                                        </div>
                                        <div class="input-field col s10">
                                            <input id="telefone" type="text" name="telefone" class="validate" value="${usuarioLogado.telefone}" required/>
                                            <label for="telefone">Telefone</label>
                                        </div>
                                        <input type="hidden" name="command"/>
                                        <div class="botao">
                                            <input type="submit" value="ATUALIZAR" class="botaoEnviar" />
                                        </div>
                                    </div>
                                </form>
                            </div>
                    </li>

                    <li>
                        <div class="collapsible-header">Excluir Conta</div>
                        <div class="collapsible-body">
                            <div class="botao3">
                                <a onclick="confirmRemove()">
                                    <button class="botaoEnviar3" id="button">EXCLUIR CONTA</button>
                                </a>
                            </div>
                        </div>

                    </li>
                </ul>
            </div>
        </section>
        <!-- FIM Perfil Box -->
        <!-- END Conteudo -->

        <!-- Footer -->
        <%@include file="footer.jspf" %>
        <!-- END Footer -->

        <!--Import jQuery before materialize.js-->
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.js"></script>
        <script type="text/javascript" src="js/init.js"></script>
        <script>
                                    function confirmRemove() {
                                        var r = confirm("Você deseja realmente REMOVER essa conta?");
                                        if (r) {
                                            window.location.replace("FrontControllerServlet?control=Usuario&action=excluir");
                                        }
                                    }
        </script>
    </body>

</html>
