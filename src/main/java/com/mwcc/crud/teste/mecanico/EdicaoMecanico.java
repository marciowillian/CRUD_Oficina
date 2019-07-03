package com.mwcc.crud.teste.mecanico;

import com.mwcc.util.model.Mecanico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EdicaoMecanico {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("oficinaPU");
        EntityManager em = emf.createEntityManager();

        Mecanico m1 = em.find(Mecanico.class, 1);

        m1.setNome("Bombom de alho");
        m1.setEspecialidade("Vagabundagem ao extremo");
        m1.setCpf("22222222222");

        em.getTransaction().begin();
        em.merge(m1);
        em.getTransaction().commit();
        em.close();

        System.out.println("Mecanico atualizado com sucesso!");
    }
}
