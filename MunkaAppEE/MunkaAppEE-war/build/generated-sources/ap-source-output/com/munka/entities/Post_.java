package com.munka.entities;

import com.munka.entities.Categoria;
import com.munka.entities.Comentario;
import com.munka.entities.Instituicao;
import com.munka.entities.StatusPost;
import com.munka.entities.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-18T15:09:10")
@StaticMetamodel(Post.class)
public class Post_ { 

    public static volatile SingularAttribute<Post, String> localPost;
    public static volatile SingularAttribute<Post, Categoria> fkcategoria;
    public static volatile SingularAttribute<Post, String> assunto;
    public static volatile SingularAttribute<Post, String> texto;
    public static volatile SingularAttribute<Post, Date> dataCriado;
    public static volatile SingularAttribute<Post, byte[]> foto;
    public static volatile SingularAttribute<Post, StatusPost> fkstatus;
    public static volatile SingularAttribute<Post, Integer> idpost;
    public static volatile SingularAttribute<Post, Integer> up;
    public static volatile SingularAttribute<Post, Usuario> fkZeladorResponsavel;
    public static volatile SingularAttribute<Post, Instituicao> fkinstituicao;
    public static volatile CollectionAttribute<Post, Comentario> comentarioCollection;
    public static volatile SingularAttribute<Post, Usuario> fkusuario;

}