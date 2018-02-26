/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JORGE
 */
@Entity
@Table(name = "jugador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jugador.findAll", query = "SELECT j FROM Jugador j")
    , @NamedQuery(name = "Jugador.findByIdJug", query = "SELECT j FROM Jugador j WHERE j.idJug = :idJug")
    , @NamedQuery(name = "Jugador.findByNombreJug", query = "SELECT j FROM Jugador j WHERE j.nombreJug = :nombreJug")
    , @NamedQuery(name = "Jugador.findByApellidoJug", query = "SELECT j FROM Jugador j WHERE j.apellidoJug = :apellidoJug")
    , @NamedQuery(name = "Jugador.findByFechaNacJug", query = "SELECT j FROM Jugador j WHERE j.fechaNacJug = :fechaNacJug")
    , @NamedQuery(name = "Jugador.findByEmail", query = "SELECT j FROM Jugador j WHERE j.email = :email")})
public class Jugador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idJug")
    private Integer idJug;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombreJug")
    private String nombreJug;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "apellidoJug")
    private String apellidoJug;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaNacJug")
    @Temporal(TemporalType.DATE)
    private Date fechaNacJug;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "email")
    private String email;
    @JoinColumn(name = "idDeporte", referencedColumnName = "idDep")
    @ManyToOne(optional = false)
    private Deporte idDeporte;

    public Jugador() {
    }

    public Jugador(Integer idJug) {
        this.idJug = idJug;
    }

    public Jugador(Integer idJug, String nombreJug, String apellidoJug, Date fechaNacJug, String email) {
        this.idJug = idJug;
        this.nombreJug = nombreJug;
        this.apellidoJug = apellidoJug;
        this.fechaNacJug = fechaNacJug;
        this.email = email;
    }

    public Integer getIdJug() {
        return idJug;
    }

    public void setIdJug(Integer idJug) {
        this.idJug = idJug;
    }

    public String getNombreJug() {
        return nombreJug;
    }

    public void setNombreJug(String nombreJug) {
        this.nombreJug = nombreJug;
    }

    public String getApellidoJug() {
        return apellidoJug;
    }

    public void setApellidoJug(String apellidoJug) {
        this.apellidoJug = apellidoJug;
    }

    public Date getFechaNacJug() {
        return fechaNacJug;
    }

    public void setFechaNacJug(Date fechaNacJug) {
        this.fechaNacJug = fechaNacJug;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Deporte getIdDeporte() {
        return idDeporte;
    }

    public void setIdDeporte(Deporte idDeporte) {
        this.idDeporte = idDeporte;
    }    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJug != null ? idJug.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jugador)) {
            return false;
        }
        Jugador other = (Jugador) object;
        if ((this.idJug == null && other.idJug != null) || (this.idJug != null && !this.idJug.equals(other.idJug))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombreJug;
    }
    
}
