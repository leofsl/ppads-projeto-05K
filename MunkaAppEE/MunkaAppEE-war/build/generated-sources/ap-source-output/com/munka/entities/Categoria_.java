package com.munka.entities;

import com.munka.entities.Post;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-18T15:09:10")
@StaticMetamodel(Categoria.class)
public class Categoria_ { 

    public static volatile CollectionAttribute<Categoria, Post> postCollection;
    public static volatile SingularAttribute<Categoria, Integer> idcategoria;
    public static volatile SingularAttribute<Categoria, String> nomeCategoria;

}