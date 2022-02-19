package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        int N, fatorial = 1, counter;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um inteiro a partir de 0:");
        N = scanner.nextInt();

        while(N < 0){
            System.out.println("Valor inválido. Tente novamente:");
            N = scanner.nextInt();
        }

        if(N == 0){
            System.out.println("0! = 1");
            return;
        }

        counter = N;
        while(counter > 0){
            fatorial *= counter;
            counter--;
        }

        System.out.println(N + "!= " + fatorial);
    }
}
