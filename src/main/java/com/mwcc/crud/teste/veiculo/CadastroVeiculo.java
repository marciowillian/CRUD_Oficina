package com.mwcc.crud.teste.veiculo;

import com.mwcc.util.model.Veiculo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CadastroVeiculo {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("oficinaPU");
        EntityManager em = emf.createEntityManager();

        Veiculo veiculo = new Veiculo();

        veiculo.setModelo("Celta");
        veiculo.setAno("2018");
        veiculo.setFabricante("Nissan");
        veiculo.setPlaca("PTC6465");


        em.getTransaction().begin();
        em.merge(veiculo);
        em.getTransaction().commit();
        em.close();

        System.out.println("Veiculo salvo com sucesso!");
    }
}
