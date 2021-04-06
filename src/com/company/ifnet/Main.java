package com.company.ifnet;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Aluno> aluno = new ArrayList<>();
        ArrayList<Professor> professor = new ArrayList<>();
        ArrayList<Disciplina> disciplina = new ArrayList<>();

        Scanner leitura = new Scanner(System.in);

        int opcaoPrincipal;
        String prontuario;

        do {
                limpaTela();
                menuPrincipal();
                opcaoPrincipal = Integer.parseInt(leitura.nextLine());

                switch (opcaoPrincipal) {

                    case 1:
                        limpaTela();
                        menuAdmin();
                        int opcaoAdmin = Integer.parseInt(leitura.nextLine());

                        switch (opcaoAdmin) {
                            case 1:
                                limpaTela();
                                menuCadastro();
                                int opcaoCadastro = Integer.parseInt(leitura.nextLine());
                                switch (opcaoCadastro) {
                                    case 1:
                                        limpaTela();
                                        System.out.print("Nome do Aluno: ");
                                        String nomeAluno = leitura.nextLine();
                                        System.out.print("Prontuário: ");
                                        String prontuarioAluno = leitura.nextLine();
                                        System.out.print("E-mail: ");
                                        String emailAluno = leitura.nextLine();
                                        System.out.print("Curso: ");
                                        String cursoAluno = leitura.nextLine();
                                        Aluno a = new Aluno(nomeAluno, prontuarioAluno, emailAluno, cursoAluno);
                                        aluno.add(a);
                                        System.out.println("Aluno cadastrado com sucesso!");
                                        break;
                                    case 2:
                                        limpaTela();
                                        System.out.print("Nome do Professor: ");
                                        String nomeProfessor = leitura.nextLine();
                                        System.out.print("Prontuário: ");
                                        String prontuarioProfessor = leitura.nextLine();
                                        System.out.print("Área: ");
                                        String areaProfessor = leitura.nextLine();
                                        Professor p = new Professor(nomeProfessor, prontuarioProfessor, areaProfessor);
                                        professor.add(p);
                                        System.out.println("Professor cadastrado com sucesso!");
                                        break;
                                    case 3:
                                        limpaTela();
                                        System.out.print("Nome da Disciplina: ");
                                        String nD = leitura.nextLine();
                                        System.out.print("Área: ");
                                        String aD = leitura.nextLine();
                                        Disciplina d = new Disciplina(nD, aD);
                                        disciplina.add(d);
                                        System.out.println("Disciplina cadastrada com sucesso!");
                                        break;
                                    case 0:
                                        limpaTela();
                                        break;
                                    default:
                                        limpaTela();
                                        System.err.println("Opção inválida!");
                                        break;
                                }
                                break;


                            case 2:
                                limpaTela();
                                menuExcluir();
                                int opcaoExcluir = Integer.parseInt(leitura.nextLine());
                                switch (opcaoExcluir) {
                                    case 1:
                                        limpaTela();
                                        int indexA = 0, numEscolhidoAluno;
                                        System.out.print("Informe o número do Aluno a ser excluído: \n\n");
                                        for (Aluno alunoCadastrado : aluno) {
                                            System.out.println((indexA++) + " - "
                                                    + alunoCadastrado.toString());
                                        }
                                        System.out.print("Número: ");
                                        numEscolhidoAluno = Integer.parseInt(leitura.nextLine());
                                        aluno.remove(numEscolhidoAluno);
                                        break;
                                    case 2:
                                        limpaTela();
                                        int indexP = 0, numEscolhidoProf;
                                        System.out.print("Informe o número do Professor a ser excluído: \n\n");
                                        for (Professor professorCadastrado : professor) {
                                            System.out.println((indexP++) + " - "
                                                    + professorCadastrado.toString());
                                        }
                                        System.out.print("Número: ");
                                        numEscolhidoProf = Integer.parseInt(leitura.nextLine());
                                        professor.remove(numEscolhidoProf);
                                        break;
                                    case 3:
                                        limpaTela();
                                        int indexD = 0, numEscolhidoDisc;
                                        System.out.print("Informe o número da Disciplina a ser excluída: \n\n");
                                        for (Disciplina listaDisciplina : disciplina) {
                                            System.out.println((indexD++) + " - Titulo: "
                                                    + listaDisciplina.getNome()
                                                    + " | Área: "
                                                    + listaDisciplina.getArea());
                                        }
                                        System.out.print("Número: ");
                                        numEscolhidoDisc = Integer.parseInt(leitura.nextLine());
                                        disciplina.remove(numEscolhidoDisc);
                                        break;
                                    case 0:
                                        limpaTela();
                                        break;
                                    default:
                                        limpaTela();
                                        System.err.println("Opção inválida!");
                                        break;
                                }
                                break;


                            case 3:
                                limpaTela();
                                menuListar();
                                int opcaoListar = Integer.parseInt(leitura.nextLine());
                                switch (opcaoListar) {
                                    case 1:
                                        limpaTela();
                                        System.out.println("Alunos cadastrados");
                                        int indexA = 0;
                                        for (Aluno alunoCadastrado : aluno) {
                                            System.out.println((indexA++) + " - "
                                                    + alunoCadastrado.toString());
                                        }
                                        break;
                                    case 2:
                                        limpaTela();
                                        System.out.println("Professores cadastrados");
                                        int indexP = 0;
                                        for (Professor professorCadastrado : professor) {
                                            System.out.println((indexP++) + " - "
                                                    + professorCadastrado.toString());
                                        }
                                        break;
                                    case 3:
                                        limpaTela();
                                        System.out.println("Disciplinas cadastradas");
                                        int indexD = 0;
                                        for (Disciplina disciplinaCadastrada : disciplina) {
                                            System.out.println((indexD++) + " - Titulo: "
                                                    + disciplinaCadastrada.getNome()
                                                    + " | Área: "
                                                    + disciplinaCadastrada.getArea());
                                        }
                                        break;
                                    case 0:
                                        limpaTela();
                                        break;
                                    default:
                                        limpaTela();
                                        System.err.println("Opção inválida!");
                                        break;
                                }
                                break;
                            case 0:
                                limpaTela();
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
        limpaTela();
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
        System.out.println("        ---------- Menu de Exibição ----------\n\n" +
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
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

}
