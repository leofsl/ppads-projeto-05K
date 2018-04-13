package com.munka.entities;

import com.munka.entities.InstituicaoUsuario;
import com.munka.entities.Post;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-03T16:49:29")
@StaticMetamodel(Instituicao.class)
public class Instituicao_ { 

    public static volatile SingularAttribute<Instituicao, byte[]> postsLivres;
    public static volatile SingularAttribute<Instituicao, String> nomeInstituicao;
    public static volatile CollectionAttribute<Instituicao, Post> postCollection;
    public static volatile SingularAttribute<Instituicao, String> endereco;
    public static volatile SingularAttribute<Instituicao, Date> dataEntrada;
    public static volatile SingularAttribute<Instituicao, Integer> idinstituicao;
    public static volatile CollectionAttribute<Instituicao, InstituicaoUsuario> instituicaoUsuarioCollection;
    public static volatile SingularAttribute<Instituicao, String> cnpj;
    public static volatile SingularAttribute<Instituicao, String> razaoSocial;
    public static volatile SingularAttribute<Instituicao, String> email;

}