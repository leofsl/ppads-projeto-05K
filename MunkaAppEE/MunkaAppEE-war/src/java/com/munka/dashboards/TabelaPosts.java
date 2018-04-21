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
public class TabelaPosts implements Serializable {

    String assunto;
    String categoria;
    String status;
    @Id
    int id;

    public TabelaPosts(String assunto, String categoria, String status, int id) {
        this.assunto = assunto;
        this.categoria = categoria;
        this.status = status;
        this.id = id;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TabelaPosts{" + "assunto=" + assunto + ", categoria=" + categoria + ", status=" + status + ", id=" + id + '}';
    }

}
