/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.munka.beans;

import com.munka.entities.Instituicao;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Felipe Dourado e Leonardo Ferreira
 */
@Local
public interface InstituicaoBeanLocal {

    List<Instituicao> findAll();

}