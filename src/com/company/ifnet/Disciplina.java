package com.company.ifnet;

import java.util.Scanner;

public class Disciplina{

    private String nome, area, codigo;

    public Disciplina(String nome, String area, String codigo) {
        this.nome = nome;
        this.area = area;
        this.codigo = codigo;
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

<<<<<<< HEAD
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String area) {
        this.codigo = codigo;
    }

    public static Disciplina cadastrarDisciplina() throws CadastroException {
        Scanner leitura = new Scanner(System.in);
        //------------------------------------------
        System.out.print("Código da Disciplina: ");
        String disciplinaCodigo = leitura.nextLine();
        //------------------------------------------
=======
    public static Disciplina cadastrarDisciplina() throws CadastroException {
        Scanner leitura = new Scanner(System.in);
>>>>>>> dd6847c7d2f0507bfb16ec140a74aa1594456a69
        System.out.print("Nome da Disciplina: ");
        String nomeDisciplina = leitura.nextLine();
        if (nomeDisciplina.equals("")) {
            throw new CadastroException("Você deve digitar um Nome para a Disciplina!");
        } else {
            System.out.print("Área: ");
            String areaDisciplina = leitura.nextLine();
            if (areaDisciplina.equals("")) {
                throw new CadastroException("Você deve digitar uma Área para a Disciplina!");
            } else {
<<<<<<< HEAD
                Disciplina d = new Disciplina(nomeDisciplina, areaDisciplina, disciplinaCodigo);
=======
                Disciplina d = new Disciplina(nomeDisciplina, areaDisciplina);
>>>>>>> dd6847c7d2f0507bfb16ec140a74aa1594456a69
                System.out.println("Disciplina cadastrada com sucesso!");
                return d;
            }
        }
    }
<<<<<<< HEAD

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "  |  " + "Area: " + this.getArea() + "  |  " +
                "Código: " + this.getCodigo();
    }
=======
>>>>>>> dd6847c7d2f0507bfb16ec140a74aa1594456a69
}
