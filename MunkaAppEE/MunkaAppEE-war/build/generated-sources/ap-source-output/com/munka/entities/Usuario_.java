package com.munka.entities;

import com.munka.entities.Comentario;
import com.munka.entities.InstituicaoUsuario;
import com.munka.entities.Post;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-18T15:09:10")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> telefone;
    public static volatile SingularAttribute<Usuario, Integer> idusuario;
    public static volatile SingularAttribute<Usuario, String> nomeUsuario;
    public static volatile SingularAttribute<Usuario, String> senha;
    public static volatile SingularAttribute<Usuario, String> identInternoEmpresa;
    public static volatile CollectionAttribute<Usuario, Post> postCollection;
    public static volatile SingularAttribute<Usuario, byte[]> foto;
    public static volatile SingularAttribute<Usuario, Date> dataEntrada;
    public static volatile CollectionAttribute<Usuario, InstituicaoUsuario> instituicaoUsuarioCollection;
    public static volatile SingularAttribute<Usuario, Short> tipoUsuario;
    public static volatile SingularAttribute<Usuario, String> email;
    public static volatile CollectionAttribute<Usuario, Post> postCollection1;
    public static volatile CollectionAttribute<Usuario, Comentario> comentarioCollection;

}