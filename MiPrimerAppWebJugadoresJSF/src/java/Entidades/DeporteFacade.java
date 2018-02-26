/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author JORGE
 */
@Stateless
public class DeporteFacade extends AbstractFacade<Deporte> {

    @PersistenceContext(unitName = "MiPrimerAppWebJugadoresJSFPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DeporteFacade() {
        super(Deporte.class);
    }
    
}
