package com.company.ifnet;

import java.util.ArrayList;
import java.util.Iterator;
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

        label105:
        do {
                menuPrincipal();
                opcaoPrincipal = Integer.parseInt(leitura.nextLine());
                //DECLARAÇÃO DE VARIÁVEIS
                int numEscolhidoAluno;
                int numEscolhidoProf;
                Iterator var12;
                int var10001;
                Iterator var19;
                Aluno alunoCadastrado;
                switch (opcaoPrincipal) {

                    case 1:
                        limpaTela();
                        menuAdmin();
                        int opcaoAdmin = Integer.parseInt(leitura.nextLine());

                        switch (opcaoAdmin) {
                            case 0:
                                limpaTela();
                                continue;
                            //MENU DE CADASTRO DO ADMIN
                            case 1:
                                limpaTela();
                                menuCadastro();
                                int opcaoCadastro = Integer.parseInt(leitura.nextLine());
                                switch (opcaoCadastro) {
                                    case 0:
                                        limpaTela();
                                        continue;
                                    //CADASTRO DE ALUNOS
                                    case 1:
                                        limpaTela();
                                        try {
                                            aluno.add(Aluno.cadastrarAluno());
                                        } catch (CadastroException var18) {
                                            System.out.println(var18.getMessage());
                                        }
                                        continue;
                                    //CADASTRO DE PROFESSORES
                                    case 2:
                                        limpaTela();
                                        try {
                                            professor.add(Professor.cadastrarProfessor());
                                        } catch (CadastroException var17) {
                                            System.out.println(var17.getMessage());
                                        }
                                        continue;
                                    //CADASTRO DE DISCIPLINAS
                                    case 3:
                                        limpaTela();
                                        try {
                                            disciplina.add(Disciplina.cadastrarDisciplina());
                                        } catch (CadastroException var16) {
                                            System.out.println(var16.getMessage());
                                        }
                                        continue;
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
                                        continue;
                                    //EXCLUSÃO DE ALUNO
                                    case 1:
                                        limpaTela();
                                        int indexA = 0;
                                        System.out.print("Informe o número do Aluno a ser excluído: \n\n");
                                        var19 = aluno.iterator();

                                        while(var19.hasNext()) {
                                            alunoCadastrado = (Aluno)var19.next();
                                            var10001 = indexA++;
                                            System.out.println(var10001 + " - Nome: " + alunoCadastrado.getNome() + " | Prontuário: " + alunoCadastrado.getProntuario() + " | E-mail: " + alunoCadastrado.getEmail() + " | Curso: " + alunoCadastrado.getCurso());
                                        }

                                        System.out.print("Número: ");
                                        numEscolhidoAluno = Integer.parseInt(leitura.nextLine());
                                        aluno.remove(numEscolhidoAluno);
                                        System.out.println("Aluno excluído com sucesso!");
                                        continue;
                                    //EXCLUSÃO DE PROFESSOR
                                    case 2:
                                        limpaTela();
                                        int indexP = 0;
                                        System.out.print("Informe o número do Professor a ser excluído: \n\n");
                                        var12 = professor.iterator();

                                        while(var12.hasNext()) {
                                            Professor listaProfessor = (Professor)var12.next();
                                            var10001 = indexP++;
                                            System.out.println(var10001 + " - Nome: " + listaProfessor.getNome() + " | Prontuário: " + listaProfessor.getProntuario() + " | Área: " + listaProfessor.getArea());
                                        }

                                        System.out.print("Número: ");
                                        numEscolhidoProf = Integer.parseInt(leitura.nextLine());
                                        professor.remove(numEscolhidoProf);
                                        System.out.println("Professor excluído com sucesso!");
                                        continue;
                                    //EXCLUSÃO DE DISCIPLINA
                                    case 3:
                                        limpaTela();
                                        int indexD = 0;
                                        System.out.print("Informe o número da Disciplina a ser excluída: \n\n");
                                        Iterator var14 = disciplina.iterator();

                                        while(var14.hasNext()) {
                                            Disciplina listaDisciplina = (Disciplina)var14.next();
                                            var10001 = indexD++;
                                            System.out.println(var10001 + " - Titulo: " + listaDisciplina.getNome() + " | Área: " + listaDisciplina.getArea());
                                        }

                                        System.out.print("Número: ");
                                        int numEscolhidoDisc = Integer.parseInt(leitura.nextLine());
                                        disciplina.remove(numEscolhidoDisc);
                                        System.out.println("Disciplina excluída com sucesso!");
                                        continue;
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
                                        continue;
                                    //EXIBIÇÃO DA LISTA DE ALUNOS
                                    case 1:
                                        limpaTela();
                                        System.out.println("Alunos cadastrados");
                                        numEscolhidoAluno = 0;
                                        var19 = aluno.iterator();

                                        while(true) {
                                            if (!var19.hasNext()) {
                                                continue label105;
                                            }

                                            alunoCadastrado = (Aluno)var19.next();
                                            var10001 = numEscolhidoAluno++;
                                            System.out.println(var10001 + " - Nome: " + alunoCadastrado.getNome() + " | Prontuário: " + alunoCadastrado.getProntuario() + " | E-mail: " + alunoCadastrado.getEmail() + " | Curso: " + alunoCadastrado.getCurso());
                                        }
                                    //EXIBIÇÃO DA LISTA DE PROFESSORES
                                    case 2:
                                        limpaTela();
                                        System.out.println("Professores cadastrados");
                                        int indexP = 0;
                                        Iterator var20 = professor.iterator();

                                        while(true) {
                                            if (!var20.hasNext()) {
                                                continue label105;
                                            }

                                            Professor professorCadastrado = (Professor)var20.next();
                                            var10001 = indexP++;
                                            System.out.println(var10001 + " - Nome: " + professorCadastrado.getNome() + " | Prontuário: " + professorCadastrado.getProntuario() + " | Área: " + professorCadastrado.getArea());
                                        }
                                    //EXIBIÇÃO DA LISTA DE DISCIPLINAS
                                    case 3:
                                        limpaTela();
                                        System.out.println("Disciplinas cadastradas");
                                        numEscolhidoProf = 0;
                                        var12 = disciplina.iterator();

                                        while(true) {
                                            if (!var12.hasNext()) {
                                                continue label105;
                                            }

                                            Disciplina disciplinaCadastrada = (Disciplina)var12.next();
                                            var10001 = numEscolhidoProf++;
                                            System.out.println(var10001 + " - Titulo: " + disciplinaCadastrada.getNome() + " | Área: " + disciplinaCadastrada.getArea());
                                        }
                                    default:
                                        limpaTela();
                                        System.err.println("Opção inválida!");
                                        continue;
                                }
                            default:
                                limpaTela();
                                System.err.println("Opção inválida!");
                                continue;
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
