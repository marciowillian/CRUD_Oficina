package com.mwcc.crud.teste.servico;

import com.mwcc.util.model.Mecanico;
import com.mwcc.util.model.Servico;
import com.mwcc.util.model.Veiculo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.util.Date;

public class CadastroServico {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("oficinaPU");
        EntityManager em = emf.createEntityManager();

        //Instanciando objetos
        Servico servico = new Servico();
        Veiculo veiculo = new Veiculo();
        Mecanico mecanico = new Mecanico();

        //Buscando o mecâmico para adicionar no serviço
        mecanico = em.find(Mecanico.class, 1);

        //Buscando o veiculo para adicionar no serviço
        veiculo = em.find(Veiculo.class, 1);


        /*Setando o mecanico para realizar o serviço
           e setando o veiculo na qual o serviço será realizado
         */
        servico.setVeiculo(veiculo);
        servico.setMecanico(mecanico);

        //Setando informações do serviço
        servico.setDataServico(new Date());
        servico.setValor(new BigDecimal(150.85));
        servico.setNome("Completo");
        servico.setHora(new Date());

        /*  1: Abrindo transação
            2: Informando o Objeto do serviço que será salvo
            3: Realizando commit no banco
            4: e por ultimo fechando a transação
         */
        em.getTransaction().begin();
        em.merge(servico);
        em.getTransaction().commit();
        em.close();

        System.out.println("Serviço salvo com sucesso!");


    }
}
