package br.com.dio.exercicios.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vetor = new String[6];
        int quantidadeConsoantes = 0;
        String[] vogais = {"a","e","i","o","u"};

        int count = 0;
        while(count < vetor.length){
            System.out.println("Insira uma letra no vetor: ");
            vetor[count] = scanner.nextLine();
            count++;
        }

        for(int i = 0; i< vetor.length; i++) {
            int checagem = Arrays.asList(vogais).contains(vetor[i]) ? 0: quantidadeConsoantes++;
        }

        System.out.println("A quantidade total de consoantes do vetor é igual a " + quantidadeConsoantes);

    }
}
