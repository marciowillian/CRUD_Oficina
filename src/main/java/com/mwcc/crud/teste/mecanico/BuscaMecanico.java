package com.mwcc.crud.teste.mecanico;

import com.mwcc.util.model.Mecanico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BuscaMecanico {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("oficinaPU");
        EntityManager em = emf.createEntityManager();

        Mecanico m1 = em.find(Mecanico.class, 1);

        System.out.println("Nome: " + m1.getNome());
        System.out.println("CPF" + m1.getCpf());
        System.out.println("Especialidade: " + m1.getEspecialidade());

    }
}
