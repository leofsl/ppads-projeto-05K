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
@Table(name = "instituicao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Instituicao.findAll", query = "SELECT i FROM Instituicao i")
    , @NamedQuery(name = "Instituicao.findByIdinstituicao", query = "SELECT i FROM Instituicao i WHERE i.idinstituicao = :idinstituicao")
    , @NamedQuery(name = "Instituicao.findByNomeInstituicao", query = "SELECT i FROM Instituicao i WHERE i.nomeInstituicao = :nomeInstituicao")
    , @NamedQuery(name = "Instituicao.findByCnpj", query = "SELECT i FROM Instituicao i WHERE i.cnpj = :cnpj")
    , @NamedQuery(name = "Instituicao.findByRazaoSocial", query = "SELECT i FROM Instituicao i WHERE i.razaoSocial = :razaoSocial")
    , @NamedQuery(name = "Instituicao.findByEndereco", query = "SELECT i FROM Instituicao i WHERE i.endereco = :endereco")
    , @NamedQuery(name = "Instituicao.findByEmail", query = "SELECT i FROM Instituicao i WHERE i.email = :email")
    , @NamedQuery(name = "Instituicao.findByDataEntrada", query = "SELECT i FROM Instituicao i WHERE i.dataEntrada = :dataEntrada")})
public class Instituicao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDINSTITUICAO")
    private Integer idinstituicao;
    @Basic(optional = false)
    @Column(name = "NOME_INSTITUICAO")
    private String nomeInstituicao;
    @Column(name = "CNPJ")
    private String cnpj;
    @Column(name = "RAZAO_SOCIAL")
    private String razaoSocial;
    @Column(name = "ENDERECO")
    private String endereco;
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Lob
    @Column(name = "POSTS_LIVRES")
    private byte[] postsLivres;
    @Column(name = "DATA_ENTRADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntrada;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkinstituicao")
    private Collection<InstituicaoUsuario> instituicaoUsuarioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkinstituicao")
    private Collection<Post> postCollection;

    public Instituicao() {
    }

    public Instituicao(Integer idinstituicao) {
        this.idinstituicao = idinstituicao;
    }

    public Instituicao(Integer idinstituicao, String nomeInstituicao, byte[] postsLivres) {
        this.idinstituicao = idinstituicao;
        this.nomeInstituicao = nomeInstituicao;
        this.postsLivres = postsLivres;
    }

    public Integer getIdinstituicao() {
        return idinstituicao;
    }

    public void setIdinstituicao(Integer idinstituicao) {
        this.idinstituicao = idinstituicao;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getPostsLivres() {
        return postsLivres;
    }

    public void setPostsLivres(byte[] postsLivres) {
        this.postsLivres = postsLivres;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinstituicao != null ? idinstituicao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Instituicao)) {
            return false;
        }
        Instituicao other = (Instituicao) object;
        if ((this.idinstituicao == null && other.idinstituicao != null) || (this.idinstituicao != null && !this.idinstituicao.equals(other.idinstituicao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.munka.entities.Instituicao[ idinstituicao=" + idinstituicao + " ]";
    }

}
