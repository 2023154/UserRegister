package dev.java10x.CadastroDeNinja;

import jakarta.persistence.OneToMany;

import java.util.List;

public class MissionModel {
    private Long id;
    private String nome;
    private String dificuldade;

    // one mission can have many ninjas
    @OneToMany
    private List<NinjaModel> ninjas;


}
