package com.company.ifnet;

public class Aluno extends Usuario{

    private String email, curso;

    public Aluno(String nome, String prontuario, String email, String curso) {
        super(nome, prontuario);
        this.curso = curso;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
