package com.company.ifnet;

import java.util.ArrayList;
import java.util.Scanner;

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

    public static Aluno cadastrarAluno() throws CadastroException{
        Scanner leitura = new Scanner(System.in);

        System.out.print("Nome do Aluno: ");
        String nomeAluno = leitura.nextLine();
        if (nomeAluno.equals(""))
            throw new CadastroException("Você deve digitar um Nome!");
        System.out.print("Prontuário: ");
        String prontuarioAluno = leitura.nextLine();
        if (prontuarioAluno.equals(""))
            throw new CadastroException("Você deve digitar um Prontuário!");
        System.out.print("E-mail: ");
        String emailAluno = leitura.nextLine();
        if (emailAluno.equals(""))
            throw new CadastroException("Você deve digitar um E-mail!");
        System.out.print("Curso: ");
        String cursoAluno = leitura.nextLine();
        if (cursoAluno.equals(""))
            throw new CadastroException("Você deve digitar um Nome!");

        Aluno a = new Aluno(nomeAluno, prontuarioAluno, emailAluno, cursoAluno);

        System.out.println("Aluno cadastrado com sucesso!");

        return a;

    }
}


