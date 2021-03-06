package com.mwcc.crud.teste.mecanico;

import com.mwcc.util.model.Mecanico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ExclusaoMecanico {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("oficinaPU");
        EntityManager em = emf.createEntityManager();

        Mecanico m1 = em.find(Mecanico.class, 1);

        em.getTransaction().begin();
        em.remove(m1);
        em.getTransaction().commit();
        em.close();

        System.out.println("Mecanico excluido com sucesso!");
    }
}
