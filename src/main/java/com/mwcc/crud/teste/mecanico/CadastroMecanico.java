package com.mwcc.crud.teste.mecanico;

import com.mwcc.util.model.Mecanico;
import com.mwcc.util.model.Servico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CadastroMecanico  {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("oficinaPU");
        EntityManager em = emf.createEntityManager();

        Mecanico m1 = new Mecanico();

        m1.setNome("Marcio Willian");
        m1.setEspecialidade("Lanternagem");
        m1.setCpf("27351721041");

        em.getTransaction().begin();
        em.persist(m1);
        em.getTransaction().commit();
        em.close();

        System.out.println("Mecanico salvo com sucesso");
    }
}
