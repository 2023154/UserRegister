package dev.java10x.CadastroDeNinja;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//this transform a class to entity
@Entity
@Table(name = "tb_Cadastro")
public class NinjaModel {


    @Id
    @GeneratedValue

    Long id;
    String name;
    String email;
    String age;


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

