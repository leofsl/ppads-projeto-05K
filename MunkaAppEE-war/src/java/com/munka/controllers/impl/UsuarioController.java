package com.munka.controllers.impl;

import com.munka.controllers.AbstractController;
import com.munka.dao.InstituicaoDAO;
import com.munka.dao.InstituicaoUsuarioDAO;
import com.munka.dao.UsuarioDAO;
import com.munka.entities.Instituicao;
import com.munka.entities.InstituicaoUsuario;
import com.munka.entities.Usuario;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Felipe Dourado e Leonardo Ferreira
 *
 */
public class UsuarioController extends AbstractController {

    @Override
    public void execute() {
        String action = super.getRequest().getParameter("action");

        super.getRequest().getSession().setAttribute("msgAlt", null);
        super.getRequest().getSession().setAttribute("error", null);
        switch (action) {
            case "buscarTodos":
                List<Usuario> usuarios = new UsuarioDAO().findAll();
                super.setSessionValues("listaUsuarios", usuarios, "/usuariosTeste.jsp");
                break;
            case "cadastrar":
                String nome_cad = super.getRequest().getParameter("nome");
                String senha_cad = super.getRequest().getParameter("password");
                String senha2_cad = super.getRequest().getParameter("password2");
                String cod_empresa_cad = super.getRequest().getParameter("idempresa");
                String ident_empresa = super.getRequest().getParameter("empresa_ass");
                String telefone_cad = super.getRequest().getParameter("telefone");
                String email_cad = super.getRequest().getParameter("email");
                String email2_cad = super.getRequest().getParameter("email2");

                if (!senha_cad.equals(senha2_cad)) {
                    super.setSessionValues("error", "Senhas diferem.", "/cadastro.jsp");
                } else {
                    if (!email_cad.equals(email2_cad)) {
                        super.setSessionValues("error", "Emails diferem.", "/cadastro.jsp");
                    } else {
                        Usuario usuarioCreate = new Usuario();
                        usuarioCreate.setNomeUsuario(nome_cad);
                        usuarioCreate.setIdentInternoEmpresa(ident_empresa); 
                        usuarioCreate.setEmail(email_cad);
                        usuarioCreate.setSenha(senha_cad);
                        usuarioCreate.setTelefone(telefone_cad);
                        usuarioCreate.setTipoUsuario(Short.parseShort("0"));

                        if (new UsuarioDAO().create(usuarioCreate)) {
                            super.setSessionValues("cadastroMessage", "Aguarde a confirmação de seu usuário para logar.", "/login.jsp");
                        } else {
                            super.setSessionValues("error", "Erro durante a solicitação, tente novamente.", "/cadastro.jsp");
                        }
                    }
                }
                break;
            case "logar":
                String email = super.getRequest().getParameter("email");
                String senha = super.getRequest().getParameter("password");
                Usuario usuarioLogado = new UsuarioDAO().autenticar(email, senha);
                if (usuarioLogado != null) {
                    Instituicao instLogado = new InstituicaoDAO().find(Long.parseLong(usuarioLogado.getIdentInternoEmpresa().substring(0, 4)));
                    if (usuarioLogado.getTipoUsuario() == 0) {
                        super.setSessionValues("error", "Aguarde a aprovação de sua conta.", "/login.jsp");
                    } else if (usuarioLogado.getTipoUsuario() == -1) {
                        super.setSessionValues("error", "O seu acesso foi negado pela empresa. Contate o suporte Munka para mais informações.", "/login.jsp");
  
                    } else {
                        super.getRequest().getSession().setAttribute("usuarioLogado", usuarioLogado);
                        super.getRequest().getSession().setAttribute("instLogado", instLogado.getNomeInstituicao());
                        super.setSessionValues("error", null);
                        super.setReturnPage("/index.jsp"); 
                    }
                } else {
                    super.getRequest().getSession().invalidate();
                    super.getRequest().getSession().setAttribute("error", "Usuário ou senha incorretos!");
                    super.setReturnPage("/login.jsp");
                }
                break;
            case "logoff":
                super.getRequest().getSession().invalidate();
                super.setSessionValues("usuarioLogado", null);
                super.setReturnPage("/index.jsp");
                break;
            case "excluir":
                Usuario usuarioD = (Usuario) super.getRequest().getSession().getAttribute("usuarioLogado");
                if (new InstituicaoUsuarioDAO().deleteByUsuarioId(usuarioD.getIdusuario().toString()) && new UsuarioDAO().delete(usuarioD)) {
                    super.setSessionValues("usuarioLogado", null, "/index.jsp");
                }
                break;
            case "excluirId":
                String idUsuarioExc = super.getRequest().getParameter("idUsuario");
                if (new UsuarioDAO().delete(new UsuarioDAO().find(Long.parseLong(idUsuarioExc)))) {
                    super.setSessionValues("msgDelecao", "Usuario deletado!", "/FrontControllerServlet?control=Dashboard&action=redirectToDashboard");
                } else {
                    super.setSessionValues("msgDelecao", "Ocorreu um erro durante a deleção, tente novamente", "/dash-adm.jsp");
                }
                break;
            case "aprovar":
                String idUsuario = super.getRequest().getParameter("idUsuario");
                String idEmpresa = super.getRequest().getParameter("idEmpresa");
                if (new InstituicaoUsuarioDAO().approve(Integer.parseInt(idEmpresa), Integer.parseInt(idUsuario))) {
                    Usuario uAp = new UsuarioDAO().find(Long.parseLong(idUsuario));
                    if (uAp == null) {
                        super.setSessionValues("msgAprovacao", "Usuario nulo", "/dash-adm.jsp");
                    } else {
                        uAp.setTipoUsuario(Short.parseShort("1"));
                        if (new UsuarioDAO().update(uAp) != null) {
                            super.setSessionValues("msgAprovacao", "Usuario aprovado!", "/FrontControllerServlet?control=Dashboard&action=redirectToDashboard");
                        } else {
                            super.setSessionValues("msgAprovacao", "Update nulo", "/dash-adm.jsp");
                        }
                    }
                } else {
                    super.setSessionValues("msgAprovacao", "Ocorreu um erro durante a aprovação, tente novamente", "/dash-adm.jsp");
                }
                break;
            case "negar":
                if (new InstituicaoUsuarioDAO().negar(super.getRequest().getParameter("idUsuario"))) {
                    super.setSessionValues("msgNegacao", "Usuario negado!", "/FrontControllerServlet?control=Dashboard&action=redirectToDashboard");
                } else {
                    super.setSessionValues("msgNegacao", "Ocorreu um erro durante a negação de usuário, tente novamente", "/dash-adm.jsp");
                }
                break;
            case "alterar":
                String nome_alt = super.getRequest().getParameter("username");
                String senha_alt = super.getRequest().getParameter("password");
                String senha2_alt = super.getRequest().getParameter("password2");
                String cod_ident = super.getRequest().getParameter("empresa_id");
                String telefone_alt = super.getRequest().getParameter("telefone");

                if (!senha_alt.equals(senha2_alt)) {
                    super.setSessionValues("error", "Senhas diferem.", "/perfil.jsp");
                } else {
                    Usuario usuarioUpdt = (Usuario) super.getRequest().getSession().getAttribute("usuarioLogado");
                    String cod_ident_ant = usuarioUpdt.getIdentInternoEmpresa();
                    if (usuarioUpdt.getSenha().equals(senha_alt)) {
                        usuarioUpdt.setNomeUsuario(nome_alt);
                        usuarioUpdt.setIdentInternoEmpresa(cod_ident);
                        usuarioUpdt.setSenha(senha_alt);
                        usuarioUpdt.setTelefone(telefone_alt);
                        if (!cod_ident.equals(cod_ident_ant)) {
                            new InstituicaoUsuarioDAO().alterarEmpresa(cod_ident_ant.substring(0, 4),
                                    usuarioUpdt.getIdusuario().toString());
                            usuarioUpdt.setTipoUsuario(Short.parseShort("0"));
                        }
                        new UsuarioDAO().update(usuarioUpdt);

                        super.getRequest().getSession().invalidate();
                        super.getRequest().getSession().setAttribute("usuarioLogado", usuarioUpdt);
                        super.getRequest().getSession().setAttribute("msgAlt", "Usuario alterado!");
                        super.setReturnPage("/perfil.jsp");
                    } else {
                        super.setSessionValues("error", "Senha incorreta", "/perfil.jsp");
                    }
                }
                break;
            case "modAcesso":
                String tipoMod = super.getRequest().getParameter("tipo");
                String idUsuarioMod = super.getRequest().getParameter("idUsuario");
                Usuario uMod = new UsuarioDAO().find(Long.parseLong(idUsuarioMod));
                if (uMod != null) {
                    uMod.setTipoUsuario(Short.parseShort(tipoMod));
                    new UsuarioDAO().update(uMod);
                    super.setReturnPage("/FrontControllerServlet?control=Dashboard&action=redirectToDashboard");
                } else {
                    super.setSessionValues("error", "Ocorreu um erro em sua solicitação. Tente novamente mais tarde", "/dash-adm.jsp");
                }
                break;
        }
    }

}
