package com.munka.dashboards;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Felipe Dourado e Leonardo Ferreira
 *
 */
@Entity
@XmlRootElement
public class TabelaUsuario implements Serializable {

    String idusuario;
    String nome;
    @Id
    String codigo;

    public TabelaUsuario(String nome, String codigo, String idusuario) {
        this.nome = nome;
        this.codigo = codigo;
        this.idusuario = idusuario;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "TabelaUsuario{" + "nome=" + nome + ", codigo=" + codigo + '}';
    }

}
