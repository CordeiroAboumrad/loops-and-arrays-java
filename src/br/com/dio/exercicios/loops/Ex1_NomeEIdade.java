package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args){
        String nome;
        int idade;
        int continuar = 1;
        Scanner scanner = new Scanner(System.in);

        while(continuar != 2){
            System.out.println("Nome: \n");
            nome = scanner.next();
            System.out.println("Nome: " + nome);

            System.out.println("Idade: \n");
            idade = scanner.nextInt();
            System.out.println("Idade: " + idade);

            System.out.println("Continuar? (1 - Sim; 2 - Não)\n");
            continuar = scanner.nextInt();
        }


    }
}
