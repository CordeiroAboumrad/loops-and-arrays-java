package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int vetor[] = new int[6];
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while(i < 6){
            System.out.println("Digite um valor inteiro:");
            vetor[i] = scanner.nextInt();
            i++;
        }

        String stringVetor = "Vetor: ";
        for(int j = 0; j < vetor.length; j++){
            stringVetor += vetor[j] + " ";
        }
        System.out.println(stringVetor);

        String stringVetorInvertido = "Vetor Invertido: ";
        for(int k = vetor.length - 1; k > -1; k--){
            stringVetorInvertido += vetor[k] + " ";
        }
        System.out.println(stringVetorInvertido);

    }
}
