package dev.java10x.CadastroDeNinja;

import jakarta.persistence.*;
import mission.MissionModel;

//this transform a class to entity
@Entity//this is a anotation entity
@Table(name = "tb_Cadastro")// this is anotation table
public class NinjaModel {




    @Id// the id will be gerated altomaticly with the generate value
    @GeneratedValue(strategy = GenerationType.IDENTITY)//this is going to generate a id value number.


    private Long id;

    private String name;

    @Column (unique = true)
    private String email;

    private String age;



    //@ a ninja has only one mission
    @ManyToOne
    @JoinColumn(name = "missons_id")
    private MissionModel misson;



    public NinjaModel(String name, String email, String age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public NinjaModel() {

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;


    }
    public void setEmail(String email) {
        this.email = email;

    }
    public void setAge(String age) {
        this.age = age;

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

