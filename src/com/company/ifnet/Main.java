package com.company.ifnet;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ArrayList<Aluno> aluno = new ArrayList<>();
        ArrayList<Professor> professor = new ArrayList<>();
        ArrayList<Disciplina> disciplina = new ArrayList<>();

        Aluno aluno1 = new Aluno("João", "123456", "joao@email.com", "ADS");
        Aluno aluno2 = new Aluno("Ana", "123457", "ana@email.com", "Matemática");
        Aluno aluno3 = new Aluno("Maria", "123458", "maria@email.com", "Engenharia");
        Aluno aluno4 = new Aluno("Carlos", "123459", "carlos@email.com", "ADS");
        Aluno aluno5 = new Aluno("Pedro", "123460", "pedro@email.com", "Matemática");
        aluno.add(aluno1);
        aluno.add(aluno2);
        aluno.add(aluno3);
        aluno.add(aluno4);
        aluno.add(aluno5);

        Professor professor1 = new Professor("Rosalvo", "654321", "Tecnologia");
        Professor professor2 = new Professor("Flávio", "654320", "Tecnologia");
        Professor professor3 = new Professor("Emílio", "654319", "Tecnologia");
        Professor professor4 = new Professor("Eliane", "654318", "Humanas");
        Professor professor5 = new Professor("Guemael", "654317", "Exatas");
        professor.add(professor1);
        professor.add(professor2);
        professor.add(professor3);
        professor.add(professor4);
        professor.add(professor5);

        Scanner leitura = new Scanner(System.in);

        int opcaoPrincipal;
        String prontuario;

        do {
                menuPrincipal();
                opcaoPrincipal = Integer.parseInt(leitura.nextLine());

                switch (opcaoPrincipal) {

                    case 1:
                        limpaTela();
                        menuAdmin();
                        int opcaoAdmin = Integer.parseInt(leitura.nextLine());

                        switch (opcaoAdmin) {
                            case 0:
                                limpaTela();
                                break;
                            //MENU DE CADASTRO DO ADMIN
                            case 1:
                                limpaTela();
                                menuCadastro();
                                int opcaoCadastro = Integer.parseInt(leitura.nextLine());
                                switch (opcaoCadastro) {
                                    case 0:
                                        limpaTela();
                                        break;
                                    //CADASTRO DE ALUNOS
                                    case 1:
                                        limpaTela();
                                        try{
                                            aluno.add(Aluno.cadastrarAluno());
                                        }catch (CadastroException e){
                                            System.out.println(e.getMessage());
                                        }
                                        break;
                                    //CADASTRO DE PROFESSORES
                                    case 2:
                                        limpaTela();
                                        try{
                                            professor.add(Professor.cadastrarProfessor());
                                        }catch (CadastroException e){
                                            System.out.println(e.getMessage());
                                        }
                                        break;
                                    //CADASTRO DE DISCIPLINAS
                                    case 3:
                                        limpaTela();
                                        try {
                                            disciplina.add(Disciplina.cadastrarDisciplina());
                                        }catch (CadastroException e){
                                            System.out.println(e.getMessage());
                                        }
                                        break;
                                    default:
                                        limpaTela();
                                        System.err.println("Opção inválida!");
                                        break;
                                }
                                break;

                            //MENU DE EXCLUSÃO DO ADMIN
                            case 2:
                                limpaTela();
                                menuExcluir();
                                int opcaoExcluir = Integer.parseInt(leitura.nextLine());
                                switch (opcaoExcluir) {
                                    case 0:
                                        limpaTela();
                                        break;
                                    //EXCLUSÃO DE ALUNO
                                    case 1:
                                        limpaTela();
                                        int indexA = 0, numEscolhidoAluno;
                                        System.out.print("Informe o número do Aluno a ser excluído: \n\n");
                                        for(Aluno listaAluno : aluno) {
                                            System.out.println((indexA++) + " - Nome: "
                                                    + listaAluno.getNome()
                                                    + " | Prontuário: "
                                                    + listaAluno.getProntuario()
                                                    + " | E-mail: "
                                                    + listaAluno.getEmail()
                                                    + " | Curso: "
                                                    + listaAluno.getCurso());
                                        }
                                        System.out.print("Número: ");
                                        numEscolhidoAluno = Integer.parseInt(leitura.nextLine());
                                        aluno.remove(numEscolhidoAluno);
                                        System.out.println("Aluno excluído com sucesso!");
                                        break;
                                    //EXCLUSÃO DE PROFESSOR
                                    case 2:
                                        limpaTela();
                                        int indexP = 0, numEscolhidoProf;
                                        System.out.print("Informe o número do Professor a ser excluído: \n\n");
                                        for(Professor listaProfessor : professor) {
                                            System.out.println((indexP++) + " - Nome: "
                                                    + listaProfessor.getNome()
                                                    + " | Prontuário: "
                                                    + listaProfessor.getProntuario()
                                                    + " | Área: "
                                                    + listaProfessor.getArea());
                                        }
                                        System.out.print("Número: ");
                                        numEscolhidoProf = Integer.parseInt(leitura.nextLine());
                                        professor.remove(numEscolhidoProf);
                                        System.out.println("Professor excluído com sucesso!");
                                        break;
                                    //EXCLUSÃO DE DISCIPLINA
                                    case 3:
                                        limpaTela();
                                        int indexD = 0, numEscolhidoDisc;
                                        System.out.print("Informe o número da Disciplina a ser excluída: \n\n");
                                        for(Disciplina listaDisciplina : disciplina) {
                                            System.out.println((indexD++) + " - Titulo: "
                                                    + listaDisciplina.getNome()
                                                    + " | Área: "
                                                    + listaDisciplina.getArea());
                                        }
                                        System.out.print("Número: ");
                                        numEscolhidoDisc = Integer.parseInt(leitura.nextLine());
                                        disciplina.remove(numEscolhidoDisc);
                                        System.out.println("Disciplina excluída com sucesso!");
                                        break;
                                    default:
                                        limpaTela();
                                        System.err.println("Opção inválida!");
                                        break;
                                }
                                break;

                            //MENU DE EXIBIÇÃO DO ADMIN
                            case 3:
                                limpaTela();
                                menuListar();
                                int opcaoListar = Integer.parseInt(leitura.nextLine());
                                switch (opcaoListar) {
                                    case 0:
                                        limpaTela();
                                        break;
                                    //EXIBIÇÃO DA LISTA DE ALUNOS
                                    case 1:
                                        limpaTela();
                                        System.out.println("Alunos cadastrados");
                                        int indexA = 0;
                                        for(Aluno alunoCadastrado : aluno) {
                                            System.out.println((indexA++) + " - Nome: "
                                                    + alunoCadastrado.getNome()
                                                    + " | Prontuário: "
                                                    + alunoCadastrado.getProntuario()
                                                    + " | E-mail: "
                                                    + alunoCadastrado.getEmail()
                                                    + " | Curso: "
                                                    + alunoCadastrado.getCurso());
                                        }
                                        break;
                                    //EXIBIÇÃO DA LISTA DE PROFESSORES
                                    case 2:
                                        limpaTela();
                                        System.out.println("Professores cadastrados");
                                        int indexP = 0;
                                        for(Professor professorCadastrado : professor) {
                                            System.out.println((indexP++) + " - Nome: "
                                                    + professorCadastrado.getNome()
                                                    + " | Prontuário: "
                                                    + professorCadastrado.getProntuario()
                                                    + " | Área: "
                                                    + professorCadastrado.getArea());
                                        }
                                        break;
                                    //EXIBIÇÃO DA LISTA DE DISCIPLINAS
                                    case 3:
                                        limpaTela();
                                        System.out.println("Disciplinas cadastradas");
                                        int indexD = 0;
                                        for(Disciplina disciplinaCadastrada : disciplina) {
                                            System.out.println((indexD++) + " - Titulo: "
                                                    + disciplinaCadastrada.getNome()
                                                    + " | Área: "
                                                    + disciplinaCadastrada.getArea());
                                        }
                                        break;
                                    default:
                                        limpaTela();
                                        System.err.println("Opção inválida!");
                                        break;
                                }
                                break;
                            default:
                                limpaTela();
                                System.err.println("Opção inválida!");
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("Escreva seu prontuário");
                        prontuario = leitura.nextLine();
                        // Inserir Logica para saber qual aluno será usado
                        limpaTela();
                        menuAluno();
                        int opcaoAluno = Integer.parseInt(leitura.nextLine());
                        switch (opcaoAluno) {
                            case 1:
                                System.out.println("Caso 1");
                                break;
                            case 2:
                                System.out.println("Caso 2");
                                break;
                            case 3:
                                System.out.println("Caso 3");
                                break;
                            case 4:
                                System.out.println("Caso 4");
                                break;
                        }
                        break;

                    case 3:
                        System.out.println("Escreva seu prontuário");
                        prontuario = leitura.nextLine();
                        // Inserir Logica para saber qual Professor será usado
                        limpaTela();
                        menuProfessor();
                        int opcaoProfessor = Integer.parseInt(leitura.nextLine());
                        switch (opcaoProfessor) {
                            case 1:
                                System.out.println("Caso 1");
                                break;
                            case 2:
                                System.out.println("Caso 2");
                                break;
                            case 3:
                                System.out.println("Caso 3");
                                break;
                            case 4:
                                System.out.println("Caso 4");
                                break;
                        }
                        break;
                }

        } while (opcaoPrincipal != 0);

        leitura.close();
    }

    public static void menuPrincipal() {
        //limpaTela();
        System.out.println( "---------- Informe um número do Menu ----------\n\n" +
                "1) Admin\n" +
                "2) Aluno\n" +
                "3) Professor\n" );
        System.out.print("Informe um número: ");
    }

    public static void menuAdmin() {
        limpaTela();
        System.out.println( "        ---------- Menu Admin ----------\n\n"+
                "---------- Informe um número do Menu ----------\n\n" +
                "1) Cadastro\n" +
                "2) Deletar\n" +
                "3) Lista de Cadastro\n" +
                "0) Sair\n");

        System.out.print("Informe um número: ");
    }

    public static void menuCadastro() {
        limpaTela();
        //MENU PARA CADASTRAR OBJETOS NAS RESPECTIVAS ARRAYLIST'S
        System.out.println("    ---------- Menu de Cadastro ----------\n\n" +
                "---------- Informe um número do Menu ----------\n\n" +
                "1) Cadastro de Aluno\n" +
                "2) Cadastro de Professor\n" +
                "3) Cadastro de Disciplina\n" +
                "0) Retornar ao Menu Anterior\n");
            System.out.print("Informe um número: ");
    }

    public static void menuExcluir() {
        limpaTela();
        //MENU PARA EXCLUIR OBJETOS DAS RESPECTIVAS ARRAYLIST'S
        System.out.println("   ---------- Menu de Exclusão ----------\n\n" +
                "---------- Informe um número do Menu ----------\n\n" +
                "1) Deletar Aluno\n" +
                "2) Deletar Professor\n" +
                "3) Deletar Disciplina\n" +
                "0) Retornar ao Menu Anterior\n");
        System.out.print("Informe um número: ");
    }

    public static void menuListar() {
        limpaTela();
        //MENU PARA EXIBIR OBJETOS DAS RESPECTIVAS ARRAYLIST'S
        System.out.println("   ---------- Menu de Exibição ----------\n\n" +
                "---------- Informe um número do Menu ----------\n\n" +
                "1) Listar Aluno(s)\n" +
                "2) Listar Professor(es)\n" +
                "3) Listar Disciplina(s)\n" +
                "0) Retornar ao Menu Anterior\n");
        System.out.print("Informe um número: ");
    }

    public static void menuAluno() {
        limpaTela();
        System.out.println("    ---------- Menu do Aluno ----------\n\n" +
                "---------- Informe um número do Menu ----------\n\n" +
                "1) Adicionar disciplina cursada\n" +
                "2) Adicionar disciplina que está sendo cursada atualmente\n" +
                "3) Adicionar conteúdo\n" +
                "4) Adicionar conteúdo\n" +
                "0) Sair\n");
        System.out.print("Informe um número: ");
    }
    public static void menuProfessor() {
        limpaTela();
        System.out.println("   ---------- Menu de Professor ----------\n\n" +
                "---------- Informe um número do Menu ----------\n\n" +
                "1) Criar grupo\n" +
                "2) Adicionar disciplinas ministradas\n" +
                "3) Listar Aluno(s)\n" +
                "4) Criar conteúdo(s)\n" +
                "0) Sair\n");
        System.out.print("Informe um número: ");
    }
    public static void limpaTela(){
        System.out.println("\n\n\n");
    }

}
