package edu.sena.tostadora.entity;

import edu.sena.tostadora.entity.Products;
import edu.sena.tostadora.entity.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-09-09T18:45:01")
@StaticMetamodel(Wishlist.class)
public class Wishlist_ { 

    public static volatile SingularAttribute<Wishlist, Date> createdAt;
    public static volatile SingularAttribute<Wishlist, Products> productId;
    public static volatile SingularAttribute<Wishlist, Integer> id;
    public static volatile SingularAttribute<Wishlist, Users> users;
    public static volatile SingularAttribute<Wishlist, Date> updatedAt;

}