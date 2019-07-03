package com.mwcc.util.dao;


import com.mwcc.util.model.Mecanico;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public class MecanicoDAO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    private EntityManager em;

    public void salvar(Mecanico mecanico){
        em.merge(mecanico);
    }

    public List<Mecanico> buscarTodos(){
        return em.createQuery("From mecanico", Mecanico.class).getResultList();
    }
}
