package com.munka.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Felipe Dourado e Leonardo Ferreira
 *
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByEmailAndSenha", query = "SELECT u FROM Usuario u WHERE u.email = :email and u.senha = :senha order by u.tipoUsuario desc")
    , @NamedQuery(name = "Usuario.findByIdusuario", query = "SELECT u FROM Usuario u WHERE u.idusuario = :idusuario")
    , @NamedQuery(name = "Usuario.findByNomeUsuario", query = "SELECT u FROM Usuario u WHERE u.nomeUsuario = :nomeUsuario")
    , @NamedQuery(name = "Usuario.findByTipoUsuario", query = "SELECT u FROM Usuario u WHERE u.tipoUsuario = :tipoUsuario")
    , @NamedQuery(name = "Usuario.findByEmail", query = "SELECT u FROM Usuario u WHERE u.email = :email")
    , @NamedQuery(name = "Usuario.findBySenha", query = "SELECT u FROM Usuario u WHERE u.senha = :senha")
    , @NamedQuery(name = "Usuario.findByTelefone", query = "SELECT u FROM Usuario u WHERE u.telefone = :telefone")
    , @NamedQuery(name = "Usuario.findByIdentInternoEmpresa", query = "SELECT u FROM Usuario u WHERE u.identInternoEmpresa = :identInternoEmpresa")
    , @NamedQuery(name = "Usuario.findByDataEntrada", query = "SELECT u FROM Usuario u WHERE u.dataEntrada = :dataEntrada")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDUSUARIO")
    private Integer idusuario;
    @Basic(optional = false)
    @Column(name = "NOME_USUARIO")
    private String nomeUsuario;
    @Column(name = "TIPO_USUARIO")
    private Short tipoUsuario;
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "SENHA")
    private String senha;
    @Basic(optional = false)
    @Column(name = "TELEFONE")
    private String telefone;
    @Column(name = "IDENT_INTERNO_EMPRESA")
    private String identInternoEmpresa;
    @Lob
    @Column(name = "FOTO")
    private byte[] foto;
    @Column(name = "DATA_ENTRADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntrada;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkusuario")
    private Collection<InstituicaoUsuario> instituicaoUsuarioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkusuario")
    private Collection<Post> postCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkZeladorResponsavel")
    private Collection<Post> postCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkusuario")
    private Collection<Comentario> comentarioCollection;

    public Usuario() {
    }

    public Usuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Usuario(Integer idusuario, String nomeUsuario, String email, String senha, String telefone) {
        this.idusuario = idusuario;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Short getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(Short tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getIdentInternoEmpresa() {
        return identInternoEmpresa;
    }

    public void setIdentInternoEmpresa(String identInternoEmpresa) {
        this.identInternoEmpresa = identInternoEmpresa;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    @XmlTransient
    public Collection<InstituicaoUsuario> getInstituicaoUsuarioCollection() {
        return instituicaoUsuarioCollection;
    }

    public void setInstituicaoUsuarioCollection(Collection<InstituicaoUsuario> instituicaoUsuarioCollection) {
        this.instituicaoUsuarioCollection = instituicaoUsuarioCollection;
    }

    @XmlTransient
    public Collection<Post> getPostCollection() {
        return postCollection;
    }

    public void setPostCollection(Collection<Post> postCollection) {
        this.postCollection = postCollection;
    }

    @XmlTransient
    public Collection<Post> getPostCollection1() {
        return postCollection1;
    }

    public void setPostCollection1(Collection<Post> postCollection1) {
        this.postCollection1 = postCollection1;
    }

    @XmlTransient
    public Collection<Comentario> getComentarioCollection() {
        return comentarioCollection;
    }

    public void setComentarioCollection(Collection<Comentario> comentarioCollection) {
        this.comentarioCollection = comentarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuario != null ? idusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idusuario == null && other.idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.munka.entities.Usuario[ idusuario=" + idusuario + " ]";
    }

}
