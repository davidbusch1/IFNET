package com.company.ifnet;

public class Professor extends Usuario{

    private String area;

    public Professor(String nome, String prontuario, String area) {
        super(nome, prontuario);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
