package com.munka.entities;

import com.munka.entities.Instituicao;
import com.munka.entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-03T16:49:29")
@StaticMetamodel(InstituicaoUsuario.class)
public class InstituicaoUsuario_ { 

    public static volatile SingularAttribute<InstituicaoUsuario, Integer> idinstituicaousuario;
    public static volatile SingularAttribute<InstituicaoUsuario, Instituicao> fkinstituicao;
    public static volatile SingularAttribute<InstituicaoUsuario, Usuario> fkusuario;

}