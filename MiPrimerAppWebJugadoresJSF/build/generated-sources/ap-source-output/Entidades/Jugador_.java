package Entidades;

import Entidades.Deporte;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-02-25T11:03:04")
@StaticMetamodel(Jugador.class)
public class Jugador_ { 

    public static volatile SingularAttribute<Jugador, String> nombreJug;
    public static volatile SingularAttribute<Jugador, String> apellidoJug;
    public static volatile SingularAttribute<Jugador, Integer> idJug;
    public static volatile SingularAttribute<Jugador, Date> fechaNacJug;
    public static volatile SingularAttribute<Jugador, String> email;
    public static volatile SingularAttribute<Jugador, Deporte> idDeporte;

}