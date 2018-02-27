package Entidades;

import Entidades.Jugador;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-02-27T08:03:02")
@StaticMetamodel(Deporte.class)
public class Deporte_ { 

    public static volatile SingularAttribute<Deporte, Integer> idDep;
    public static volatile CollectionAttribute<Deporte, Jugador> jugadorCollection;
    public static volatile SingularAttribute<Deporte, String> nombreDep;

}