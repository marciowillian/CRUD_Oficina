package com.mwcc.controller;

import com.mwcc.util.dao.MecanicoDAO;
import com.mwcc.util.model.Mecanico;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class CadastroMecanico implements Serializable {

    private static final long serialVersionUID = 1L;

    private Mecanico mecanico;
    private List<Mecanico> mecanicos;

    @Inject
    private MecanicoDAO mecanicoDAO;

    @PostConstruct
    public void init(){
        mecanico = new Mecanico();
        mecanicos = mecanicoDAO.buscarTodos();

    }

    public void salvar(){
        mecanicoDAO.salvar(mecanico);
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public List<Mecanico> getMecanicos() {
        return mecanicos;
    }
}
