package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        int N;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 10:");
        N = scanner.nextInt();

        while(N < 0 || N > 10){
            System.out.println("Valor inválido. Tente novamente:");
            N = scanner.nextInt();
        }

        for(int i = 1; i < 11; i++){
            System.out.println(N + " x " + i + "= " + N * i);
        }
    }
}
