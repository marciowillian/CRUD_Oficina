package com.mwcc.util.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity(name = "veiculo")
public class Veiculo {

    private int id;
    private String modelo;
    private String fabricante;
    private String placa;
    private String ano;
    private List<Servico> servico;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    @Column(length = 60)
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @NotNull
    @Column(length = 60)
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String facbricante) {
        this.fabricante = facbricante;
    }

    @NotNull
    @Column(length = 7)
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @NotNull
    @Column(length = 4)
    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    @OneToMany(mappedBy = "veiculo",cascade = CascadeType.ALL)
    public List<Servico> getServico() {
        return servico;
    }

    public void setServico(List<Servico> servico) {
        this.servico = servico;
    }
}
