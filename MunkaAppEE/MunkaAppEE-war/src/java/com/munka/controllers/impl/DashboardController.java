package com.munka.controllers.impl;

import com.munka.controllers.AbstractController;
import com.munka.dao.CategoriaDAO;
import com.munka.dao.StatusPostDAO;
import com.munka.dao.UsuarioDAO;
import com.munka.dashboards.DashboardUtil;
import com.munka.dashboards.Grafico;
import com.munka.dashboards.TabelaPosts;
import com.munka.dashboards.TabelaUsuario;
import com.munka.entities.Categoria;
import com.munka.entities.StatusPost;
import com.munka.entities.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Felipe Dourado e Leonardo Ferreira
 *
 */
public class DashboardController extends AbstractController {

    private String fCategoria;
    private String fStatusPost;
    private List<TabelaPosts> tabelasPostsf;
    private List<TabelaPosts> meusPostsf;
    private List<TabelaUsuario> tabelasUsuariof;
    private List<Grafico> graficosf;
    private final List<Categoria> categoriasf = new CategoriaDAO().findAll();
    private final List<StatusPost> listaStatusf = new StatusPostDAO().findAll();

    @Override
    public void execute() {
        String action = super.getRequest().getParameter("action");
        super.getRequest().getSession().setAttribute("msgDelecao", null);
        super.getRequest().getSession().setAttribute("msgAprovacao", null);
        super.getRequest().getSession().setAttribute("msgNegacao", null);
        super.getRequest().getSession().setAttribute("msgPost", null);
        super.getRequest().getSession().setAttribute("msgComentario", null);
        switch (action) {
            case "redirectToDashboard":
                Usuario u = (Usuario) super.getRequest().getSession().getAttribute("usuarioLogado");
                List<TabelaPosts> tabelasPosts = null;
                List<TabelaPosts> meusPosts = null;
                List<TabelaUsuario> tabelasUsuarioAprov = null;
                List<TabelaUsuario> tabelasUsuarios = null;
                List<Usuario> infosUsuariosTabelas = null;
                List<Categoria> categorias = new CategoriaDAO().findAll();
                List<StatusPost> listaStatus = new StatusPostDAO().findAll();
                if (u != null) {
                    if (u.getTipoUsuario() == 1) {
                        meusPosts = new DashboardUtil().getTabelaMeusPosts(u.getIdusuario());
                        tabelasPosts = new DashboardUtil().getTabelaPosts();
                        super.getRequest().getSession().setAttribute("listaStatus", listaStatus);
                        super.getRequest().getSession().setAttribute("categorias", categorias);
                        super.getRequest().getSession().setAttribute("meusPosts", meusPosts);
                        super.getRequest().getSession().setAttribute("tabelasPosts", tabelasPosts);
                        super.setReturnPage("/dashboard.jsp");
                    } else {
                        tabelasUsuarioAprov = new DashboardUtil().getTabelaUsuariosAprov(Integer.parseInt(u.getIdentInternoEmpresa().substring(0, 4)));
                        tabelasUsuarios = new DashboardUtil().getTabelaUsuarios(Integer.parseInt(u.getIdentInternoEmpresa().substring(0, 4)));
                        infosUsuariosTabelas = new ArrayList();
                        for (TabelaUsuario user : tabelasUsuarios) {
                            Usuario uInfo = new UsuarioDAO().find(Long.parseLong(user.getIdusuario()));
                            if (uInfo != null) {
                                infosUsuariosTabelas.add(uInfo);
                            }
                        }
                        meusPosts = new DashboardUtil().getTabelaMeusPosts(u.getIdusuario());
                        tabelasPosts = new DashboardUtil().getTabelaPosts();
                        super.getRequest().getSession().setAttribute("listaStatus", listaStatus);
                        super.getRequest().getSession().setAttribute("categorias", categorias);
                        super.getRequest().getSession().setAttribute("meusPosts", meusPosts);
                        super.getRequest().getSession().setAttribute("tabelasUsuarioAprov", tabelasUsuarioAprov);
                        super.getRequest().getSession().setAttribute("tabelasUsuarios", tabelasUsuarios);
                        super.getRequest().getSession().setAttribute("tabelasPosts", tabelasPosts);
                        super.getRequest().getSession().setAttribute("infosUsuariosTabelas", infosUsuariosTabelas);
                        super.setReturnPage("/dash-adm.jsp");
                    }
                } else {
                    tabelasPosts = new DashboardUtil().getTabelaPosts();
                    super.getRequest().getSession().setAttribute("listaStatus", listaStatus);
                    super.getRequest().getSession().setAttribute("categorias", categorias);
                    super.getRequest().getSession().setAttribute("tabelasPosts", tabelasPosts);
                    super.setReturnPage("/dashboard.jsp");
                }

                break;

            case "redirectToAnalytics":
                List<Grafico> graficosStatus = null;
                List<Grafico> graficosZelador = null;
                Usuario uAn = (Usuario) super.getRequest().getSession().getAttribute("usuarioLogado");
                if (uAn != null) {
                    if (uAn.getTipoUsuario() == 2 || uAn.getTipoUsuario() == 3) {
                        graficosStatus = new DashboardUtil().getGraficoStatus();
                        graficosZelador = new DashboardUtil().getGraficoZelador();
                        String gStatus = "";
                        String gZelador = "";
                        String labels = "[";
                        String data = "[";
                        String color = "[";
                        for (int i = 0; i < graficosStatus.size(); i++) {
                            if (i == graficosStatus.size() - 1) {
                                labels += "'" + graficosStatus.get(i).getNome() + "']";
                                data += graficosStatus.get(i).getPorcentagem() + "]";
                                color += "getRandomColor()]";
                            } else {
                                labels += "'" + graficosStatus.get(i).getNome() + "',";
                                data += graficosStatus.get(i).getPorcentagem() + ",";
                                color += "getRandomColor(),";
                            }
                        }
                        gStatus = ""
                                + "<script>\n"
                                + "function getRandomColor() {\n"
                                + "                return '#' + (Math.random() * 0xFFFFFF << 0).toString(16);\n"
                                + "            }"
                                + "            var ctx = document.getElementById(\"myChart\");\n"
                                + "            var myChart = new Chart(ctx, {\n"
                                + "                type: 'doughnut',\n"
                                + "                data: {\n"
                                + "                    // These labels appear in the legend and in the tooltips when hovering different arcs\n"
                                + "                    labels: " + labels + ",\n"
                                + "                    datasets: [{\n"
                                + "                            data: " + data + ",\n"
                                + "                            backgroundColor: " + color + "\n"
                                + "                        }]\n"
                                + "                },\n"
                                + "                options: {}\n"
                                + "            });"
                                + "</script>";
                        labels = "[";
                        data = "[";
                        color = "[";
                        for (int i = 0; i < graficosZelador.size(); i++) {
                            if (i == graficosZelador.size() - 1) {
                                labels += "'" + graficosZelador.get(i).getNome() + "']";
                                data += graficosZelador.get(i).getPorcentagem() + "]";
                                color += "getRandomColor()]";
                            } else {
                                labels += "'" + graficosZelador.get(i).getNome() + "',";
                                data += graficosZelador.get(i).getPorcentagem() + ",";
                                color += "getRandomColor(),";
                            }
                        }
                        gZelador = ""
                                + "<script>\n"
                                + "var ctx2 = document.getElementById(\"myChart2\");\n"
                                + "            var myChart2 = new Chart(ctx2, {\n"
                                + "                type: 'doughnut',\n"
                                + "                data: {\n"
                                + "                    // These labels appear in the legend and in the tooltips when hovering different arcs\n"
                                + "                    labels: " + labels + ",\n"
                                + "                    datasets: [{\n"
                                + "                            data: " + data + ",\n"
                                + "                            backgroundColor: " + color + "\n"
                                + "                        }]\n"
                                + "                },\n"
                                + "                options: {}\n"
                                + "            });"
                                + "</script>";
                        super.getRequest().getSession().setAttribute("graficosStatus", gStatus);
                        super.getRequest().getSession().setAttribute("graficosZelador", gZelador);
                        super.setReturnPage("/dash-adm2.jsp");
                    } else {
                        super.setReturnPage("/dashboard.jsp");
                    }
                } else {
                    super.setReturnPage("/dashboard.jsp");
                }
                break;

            case "filtrar":
                Usuario uf = (Usuario) super.getRequest().getSession().getAttribute("usuarioLogado");
                fCategoria = super.getRequest().getParameter("categoria");
                fStatusPost = super.getRequest().getParameter("statusPost");
                if (uf != null) {
                    if (uf.getTipoUsuario() == 1) {
                        filtrar(1);
                        super.getRequest().getSession().setAttribute("listaStatus", listaStatusf);
                        super.getRequest().getSession().setAttribute("categorias", categoriasf);
                        super.getRequest().getSession().setAttribute("meusPosts", meusPostsf);
                        super.getRequest().getSession().setAttribute("tabelasPosts", tabelasPostsf);
                        super.setReturnPage("/dashboard.jsp");
                    } else {
                        filtrar(uf.getTipoUsuario() == 2 ? 2 : 3);
                        super.getRequest().getSession().setAttribute("listaStatus", listaStatusf);
                        super.getRequest().getSession().setAttribute("categorias", categoriasf);
                        super.getRequest().getSession().setAttribute("meusPosts", meusPostsf);
                        super.getRequest().getSession().setAttribute("tabelasPosts", tabelasPostsf);
                        super.setReturnPage("/dash-adm.jsp");
                    }
                } else {
                    filtrar(0);
                    super.getRequest().getSession().setAttribute("listaStatus", listaStatusf);
                    super.getRequest().getSession().setAttribute("categorias", categoriasf);
                    super.getRequest().getSession().setAttribute("tabelasPosts", tabelasPostsf);
                    super.setReturnPage("/dashboard.jsp");
                }
                break;
        }
    }

    private void filtrar(int tipo) {
        Usuario uf = (Usuario) super.getRequest().getSession().getAttribute("usuarioLogado");
        switch (tipo) {
            case 1:
                if (fCategoria == null && fStatusPost == null) {
                    meusPostsf = new DashboardUtil().getTabelaMeusPosts(uf.getIdusuario());
                    tabelasPostsf = new DashboardUtil().getTabelaPosts();
                } else {
                    if (fCategoria != null && fStatusPost != null) {
                        meusPostsf = new DashboardUtil().getTabelaMeusPostsByStatusECat(uf.getIdusuario(), Integer.parseInt(fStatusPost), Integer.parseInt(fCategoria));
                        tabelasPostsf = new DashboardUtil().getTabelaPostsByStatusECategoria(Integer.parseInt(fStatusPost), Integer.parseInt(fCategoria));
                    } else {
                        if (fCategoria != null) {
                            meusPostsf = new DashboardUtil().getTabelaMeusPostsByCategoria(uf.getIdusuario(), Integer.parseInt(fCategoria));
                            tabelasPostsf = new DashboardUtil().getTabelaPostsByCategoria(Integer.parseInt(fCategoria));
                        }
                        if (fStatusPost != null) {
                            meusPostsf = new DashboardUtil().getTabelaMeusPostsByStatus(uf.getIdusuario(), Integer.parseInt(fStatusPost));
                            tabelasPostsf = new DashboardUtil().getTabelaPostsByStatus(Integer.parseInt(fStatusPost));
                        }
                    }
                }
                break;

            case 2:
            case 3:
                if (fCategoria == null && fStatusPost == null) {
                    meusPostsf = new DashboardUtil().getTabelaMeusPosts(uf.getIdusuario());
                    tabelasPostsf = new DashboardUtil().getTabelaPosts();
                } else {
                    if (fCategoria != null && fStatusPost != null) {
                        meusPostsf = new DashboardUtil().getTabelaMeusPostsByStatusECat(uf.getIdusuario(), Integer.parseInt(fStatusPost), Integer.parseInt(fCategoria));
                        tabelasPostsf = new DashboardUtil().getTabelaPostsByStatusECategoria(Integer.parseInt(fStatusPost), Integer.parseInt(fCategoria));
                    } else {
                        if (fCategoria != null) {
                            meusPostsf = new DashboardUtil().getTabelaMeusPostsByCategoria(uf.getIdusuario(), Integer.parseInt(fCategoria));
                            tabelasPostsf = new DashboardUtil().getTabelaPostsByCategoria(Integer.parseInt(fCategoria));
                        }
                        if (fStatusPost != null) {
                            meusPostsf = new DashboardUtil().getTabelaMeusPostsByStatus(uf.getIdusuario(), Integer.parseInt(fStatusPost));
                            tabelasPostsf = new DashboardUtil().getTabelaPostsByStatus(Integer.parseInt(fStatusPost));
                        }
                    }
                }
                break;

            case 0:
                if (fCategoria == null && fStatusPost == null) {
                    tabelasPostsf = new DashboardUtil().getTabelaPosts();
                } else {
                    if (fCategoria != null && fStatusPost != null) {
                        tabelasPostsf = new DashboardUtil().getTabelaPostsByStatusECategoria(Integer.parseInt(fStatusPost), Integer.parseInt(fCategoria));
                    } else {
                        if (fCategoria != null) {
                            tabelasPostsf = new DashboardUtil().getTabelaPostsByCategoria(Integer.parseInt(fCategoria));
                        }
                        if (fStatusPost != null) {
                            tabelasPostsf = new DashboardUtil().getTabelaPostsByStatus(Integer.parseInt(fStatusPost));
                        }
                    }
                }
                break;
        }
    }

}
