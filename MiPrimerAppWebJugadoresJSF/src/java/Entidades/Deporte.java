/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author JORGE
 */
@Entity
@Table(name = "deporte")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Deporte.findAll", query = "SELECT d FROM Deporte d")
    , @NamedQuery(name = "Deporte.findByIdDep", query = "SELECT d FROM Deporte d WHERE d.idDep = :idDep")
    , @NamedQuery(name = "Deporte.findByNombreDep", query = "SELECT d FROM Deporte d WHERE d.nombreDep = :nombreDep")})
public class Deporte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDep")
    private Integer idDep;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombreDep")
    private String nombreDep;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDeporte")
    private Collection<Jugador> jugadorCollection;

    public Deporte() {
    }

    public Deporte(Integer idDep) {
        this.idDep = idDep;
    }

    public Deporte(Integer idDep, String nombreDep) {
        this.idDep = idDep;
        this.nombreDep = nombreDep;
    }

    public Integer getIdDep() {
        return idDep;
    }

    public void setIdDep(Integer idDep) {
        this.idDep = idDep;
    }

    public String getNombreDep() {
        return nombreDep;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }

    @XmlTransient
    public Collection<Jugador> getJugadorCollection() {
        return jugadorCollection;
    }

    public void setJugadorCollection(Collection<Jugador> jugadorCollection) {
        this.jugadorCollection = jugadorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDep != null ? idDep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Deporte)) {
            return false;
        }
        Deporte other = (Deporte) object;
        if ((this.idDep == null && other.idDep != null) || (this.idDep != null && !this.idDep.equals(other.idDep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombreDep;
    }
    
}
