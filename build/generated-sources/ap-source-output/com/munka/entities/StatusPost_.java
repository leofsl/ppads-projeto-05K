package com.munka.entities;

import com.munka.entities.Post;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-03T16:49:29")
@StaticMetamodel(StatusPost.class)
public class StatusPost_ { 

    public static volatile CollectionAttribute<StatusPost, Post> postCollection;
    public static volatile SingularAttribute<StatusPost, Integer> idstatus;
    public static volatile SingularAttribute<StatusPost, String> nomeStatus;

}