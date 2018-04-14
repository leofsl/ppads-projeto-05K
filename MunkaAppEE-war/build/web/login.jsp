<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br" class="login-bg">

    <head>
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import CSS-->
        <link type="text/css" rel="stylesheet" href="css/materialize.css" media="screen,projection" />
        <Link type="text/css" rel="stylesheet" href="css/style.css" media="screen,projection" />

        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />

        <!-- Basic Head Information -->
        <title>Login - Munka</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>

    <body>
        <c:if test="${usuarioLogado!=null}">     
            <c:redirect url="index.jsp"></c:redirect>
        </c:if>
        <div class="container center">
            <c:if test="${error!=null}">
                <script type="text/javascript">
                    window.onload = function () {
                        Materialize.toast('${error}', 50000);
                    };
                </script>
            </c:if>
            <c:if test="${cadastroMessage!=null}">
                <script type="text/javascript">
                    window.onload = function () {
                        Materialize.toast('${cadastroMessage}', 50000);
                    };
                </script>
            </c:if>
            <!-- Login Box -->
            <div class="z-depth-1 row box-all box-login">
                <div class="row">
                    <div class="col s12">
                        <a href="index.jsp"><img class="logo-login" src="images/logo_munka.png" alt="Munka Logo"></a>
                    </div>
                </div>

                <form class="col s12" method="post" action="FrontControllerServlet?control=Usuario&action=logar">
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
                            <input type="checkbox" class="filled-in" id="remeber">
                            <label for="remember">Lembrar senha</label>
                        </div>
                    </div>

                    <br>
                    <div class='row'>
                        <button type='submit' name='btn-login' class='col s12 btn btn-large waves-effect'>Entrar</button>
                    </div>
                    <div class="row">
                        <label><a class='pink-text' href='#'><b>Esqueci minha senha?</b></a></label>
                    </div>
                    <div class="row">
                        <hr>
                        <label>Ainda não tem uma conta? <a class='pink-text' href='cadastro.jsp'><b>Criar Conta</b></a></label>
                    </div>
                </form>
            </div>
            <!-- END Login Box -->

        </div>
        <!--Import jQuery before materialize.js-->
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.js"></script>
        <script type="text/javascript" src="js/init.js"></script>
    </body>

</html>