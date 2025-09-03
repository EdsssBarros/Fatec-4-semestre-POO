/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edson.barros
 */

import java.util.Scanner;

public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        Aluno objAluno;

        objAluno = new Aluno();

        int opcao;

        System.out.print("Digite o RA do aluno: ");
        objAluno.setRA(sc.nextInt());

        System.out.print("Digite a nota da prova 1: ");
        objAluno.setNtPrv1(sc.nextDouble());

        System.out.print("Digite a nota da prova 2: ");
        objAluno.setNtPrv2(sc.nextDouble());

        System.out.print("Digite a nota do trabalho 1: ");
        objAluno.setNtTrab1(sc.nextDouble());

        System.out.print("Digite a nota do trabalho 2: ");
        objAluno.setNtTrab2(sc.nextDouble());

        do{

        System.out.println("1 - Exibir Nota das Provas/Trabalhos");
        System.out.println("2 - Exibir Média dos Trabalhos/Provas");
        System.out.println("3 - Exibir Média Final");
        System.out.println("4 - Sair");
        System.out.print("Digite uma opção: ");

        opcao = sc.nextInt();

        switch (opcao){

            case 1:
                System.out.println("Nota das provas e trabalhos: " + "prova 1: " + objAluno.getNtPrv1() + ", prova 2: " + objAluno.getNtPrv2() + ", Trabalho 1: " + objAluno.getNtTrab1() + ", Nota do trabalho 2: " + objAluno.getNtTrab2());
                break;
            
            case 2:
                System.out.println("Média das provas/trabalhos: " + "prova: " + objAluno.calcMediaProva() + ", trabalhos: " + objAluno.calcMediaTrab());
                break;
            
            case 3:
                System.out.println("Média final: " + objAluno.calcMediaFinal());
                break;
            
            case 4:
                System.out.println("saindo...");
            }
        }        
        while (opcao != 4);
    }
}