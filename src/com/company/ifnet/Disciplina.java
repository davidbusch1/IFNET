package com.company.ifnet;

public class Disciplina{

    private String nome, area;

    public Disciplina(String nome, String area) {
        this.nome = nome;
        this.area = area;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
