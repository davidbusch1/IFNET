package com.company.ifnet;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Aluno> aluno = new ArrayList<>();
        ArrayList<Professor> professor = new ArrayList<>();
        ArrayList<Disciplina> disciplina = new ArrayList<>();

        Scanner leitura = new Scanner(System.in);

        int opcao;

        do {
            //MENU PRINCIPAL
            System.out.println( "---------- Informe um número do Menu ----------\n\n" +
                    "1) Cadastro\n" +
                    "2) Deletar\n" +
                    "3) Lista de Cadastro\n" +
                    "0) Sair\n");

            System.out.print("Informe um número: ");
            opcao = Integer.parseInt(leitura.nextLine());

            switch (opcao) {
                //CASE DO MENU PRINCIPAL
                case 1:
                    LimpaTela.limpatela();
                    //MENU PARA CADASTRAR OBJETOS NAS RESPECTIVAS ARRAYLIST'S
                    System.out.println("---------- Menu de Cadastro ----------\n\n" +
                            "1) Cadastro de Aluno\n" +
                            "2) Cadastro de Professor\n" +
                            "3) Cadastro de Disciplina\n" +
                            "0) Retornar ao Menu Anterior\n");
                    System.out.print("Informe um número: ");
                    int opcao1 = Integer.parseInt(leitura.nextLine());

                    //SWITCH DE ESCOLHA DO MENU DE CADASTRO
                    switch (opcao1){
                        case 1:
                            LimpaTela.limpatela();
                            System.out.print("Nome do Aluno: ");
                            String nA = leitura.nextLine();
                            System.out.print("Prontuário: ");
                            String pA = leitura.nextLine();
                            System.out.print("E-mail: ");
                            String eA = leitura.nextLine();
                            System.out.print("Curso: ");
                            String cA = leitura.nextLine();
                            Aluno a = new Aluno(nA, pA, eA, cA);
                            aluno.add(a);
                            System.out.println("Aluno cadastrado com sucesso!");
                            break;
                        case 2:
                            LimpaTela.limpatela();
                            System.out.print("Nome do Professor: ");
                            String nP = leitura.nextLine();
                            System.out.print("Prontuário: ");
                            String pP = leitura.nextLine();
                            System.out.print("Área: ");
                            String aP = leitura.nextLine();
                            Professor p = new Professor(nP, pP, aP);
                            professor.add(p);
                            System.out.println("Professor cadastrado com sucesso!");
                            break;
                        case 3:
                            LimpaTela.limpatela();
                            System.out.print("Nome da Disciplina: ");
                            String nD = leitura.nextLine();
                            System.out.print("Área: ");
                            String aD = leitura.nextLine();
                            Disciplina d = new Disciplina(nD, aD);
                            disciplina.add(d);
                            System.out.println("Disciplina cadastrada com sucesso!");
                            break;
                        case 0:
                            LimpaTela.limpatela();
                            break;
                        default:
                            LimpaTela.limpatela();
                            System.err.println("Opção inválida!");
                            break;
                    }
                    break;

                //CASE DO MENU PRINCIPAL
                case 2:
                    LimpaTela.limpatela();
                    //MENU PARA EXCLUIR OBJETOS DAS RESPECTIVAS ARRAYLIST'S
                    System.out.println("---------- Menu de Exclusão ----------\n\n" +
                            "1) Deletar Aluno\n" +
                            "2) Deletar Professor\n" +
                            "3) Deletar Disciplina\n" +
                            "0) Retornar ao Menu Anterior\n");
                    System.out.print("Informe um número: ");
                    int opcao2 = Integer.parseInt(leitura.nextLine());

                    //SWITCH DE ESCOLHA DO MENU DE EXCLUSÃO
                    switch (opcao2){
                        case 1:
                            LimpaTela.limpatela();
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
                            break;
                        case 2:
                            LimpaTela.limpatela();
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
                            break;
                        case 3:
                            LimpaTela.limpatela();
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
                            break;
                        case 0:
                            LimpaTela.limpatela();
                            break;
                        default:
                            LimpaTela.limpatela();
                            System.err.println("Opção inválida!");
                            break;
                    }
                    break;

                //CASE DO MENU PRINCIPAL
                case 3:
                    LimpaTela.limpatela();
                    //MENU PARA EXIBIR OBJETOS DAS RESPECTIVAS ARRAYLIST'S
                    System.out.println("---------- Menu de Exibição ----------\n\n" +
                            "1) Listar Aluno(s)\n" +
                            "2) Listar Professor(es)\n" +
                            "3) Listar Disciplina(s)\n" +
                            "0) Retornar ao Menu Anterior\n");
                    System.out.print("Informe um número: ");
                    int opcao3 = Integer.parseInt(leitura.nextLine());

                    //SWITCH DE ESCOLHA DO MENU DE EXIBIÇÃO
                    switch (opcao3){
                        case 1:
                            LimpaTela.limpatela();
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
                        case 2:
                            LimpaTela.limpatela();
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
                        case 3:
                            LimpaTela.limpatela();
                            System.out.println("Disciplinas cadastradas");
                            int indexD = 0;
                            for(Disciplina disciplinaCadastrada : disciplina) {
                                System.out.println((indexD++) + " - Titulo: "
                                        + disciplinaCadastrada.getNome()
                                        + " | Área: "
                                        + disciplinaCadastrada.getArea());
                            }
                            break;
                        case 0:
                            LimpaTela.limpatela();
                            break;
                        default:
                            LimpaTela.limpatela();
                            System.err.println("Opção inválida!");
                            break;
                    }
                    break;
                case 0:
                    LimpaTela.limpatela();
                    break;
                default:
                    LimpaTela.limpatela();
                    System.err.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);

        leitura.close();


    }
}
