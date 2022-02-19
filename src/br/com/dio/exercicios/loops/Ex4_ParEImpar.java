package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeNumeros;

        System.out.println("Quantidade de números: ");
        quantidadeNumeros = scanner.nextInt();
        int quantidadePares = 0, quantidadeImpares = 0, numero;

        int counter = 0;
        while(counter < quantidadeNumeros){
            System.out.println("Digite um número");
            numero = scanner.nextInt();

            int result = numero % 2 == 0 ? quantidadePares++ : quantidadeImpares++;
            counter++;
        }

        System.out.println("A quantidade de valores pares é igual a: " + quantidadePares);
        System.out.println("A quantidade de valores ímpares é igual a: " + quantidadeImpares);
    }
}
