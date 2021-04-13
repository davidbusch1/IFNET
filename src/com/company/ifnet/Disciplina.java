package com.company.ifnet;

import java.util.Scanner;

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

    public static Disciplina cadastrarDisciplina() throws CadastroException{
        Scanner leitura = new Scanner(System.in);

        System.out.print("Nome da Disciplina: ");
        String nomeDisciplina = leitura.nextLine();
        if (nomeDisciplina.equals(""))
            throw new CadastroException("Você deve digitar um Nome para a Disciplina!");
        System.out.print("Área: ");
        String areaDisciplina = leitura.nextLine();
        if (areaDisciplina.equals(""))
            throw new CadastroException("Você deve digitar uma Área para a Disciplina!");
        Disciplina d = new Disciplina(nomeDisciplina, areaDisciplina);

        System.out.println("Disciplina cadastrada com sucesso!");

        return d;

    }
}
