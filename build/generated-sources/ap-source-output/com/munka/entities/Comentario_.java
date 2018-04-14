package com.munka.entities;

import com.munka.entities.Post;
import com.munka.entities.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-03T16:49:29")
@StaticMetamodel(Comentario.class)
public class Comentario_ { 

    public static volatile SingularAttribute<Comentario, String> texto;
    public static volatile SingularAttribute<Comentario, Post> fkpost;
    public static volatile SingularAttribute<Comentario, Date> dataComentario;
    public static volatile SingularAttribute<Comentario, Integer> idcomentario;
    public static volatile SingularAttribute<Comentario, Usuario> fkusuario;

}