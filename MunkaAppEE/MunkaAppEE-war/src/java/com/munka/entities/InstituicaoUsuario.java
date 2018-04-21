package com.munka.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Felipe Dourado e Leonardo Ferreira
 *
 */
@Entity
@Table(name = "instituicao_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InstituicaoUsuario.findAll", query = "SELECT i FROM InstituicaoUsuario i")
    , @NamedQuery(name = "InstituicaoUsuario.findByIdinstituicaousuario", query = "SELECT i FROM InstituicaoUsuario i WHERE i.idinstituicaousuario = :idinstituicaousuario")})
public class InstituicaoUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDINSTITUICAOUSUARIO")
    private Integer idinstituicaousuario;
    @JoinColumn(name = "FKINSTITUICAO", referencedColumnName = "IDINSTITUICAO")
    @ManyToOne(optional = false)
    private Instituicao fkinstituicao;
    @JoinColumn(name = "FKUSUARIO", referencedColumnName = "IDUSUARIO")
    @ManyToOne(optional = false)
    private Usuario fkusuario;

    public InstituicaoUsuario() {
    }

    public InstituicaoUsuario(Integer idinstituicaousuario) {
        this.idinstituicaousuario = idinstituicaousuario;
    }

    public Integer getIdinstituicaousuario() {
        return idinstituicaousuario;
    }

    public void setIdinstituicaousuario(Integer idinstituicaousuario) {
        this.idinstituicaousuario = idinstituicaousuario;
    }

    public Instituicao getFkinstituicao() {
        return fkinstituicao;
    }

    public void setFkinstituicao(Instituicao fkinstituicao) {
        this.fkinstituicao = fkinstituicao;
    }

    public Usuario getFkusuario() {
        return fkusuario;
    }

    public void setFkusuario(Usuario fkusuario) {
        this.fkusuario = fkusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinstituicaousuario != null ? idinstituicaousuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InstituicaoUsuario)) {
            return false;
        }
        InstituicaoUsuario other = (InstituicaoUsuario) object;
        if ((this.idinstituicaousuario == null && other.idinstituicaousuario != null) || (this.idinstituicaousuario != null && !this.idinstituicaousuario.equals(other.idinstituicaousuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.munka.entities.InstituicaoUsuario[ idinstituicaousuario=" + idinstituicaousuario + " ]";
    }

}
