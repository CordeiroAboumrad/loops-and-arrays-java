package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int maior = (int)Double.NEGATIVE_INFINITY;

        int count = 0;
        do{
            System.out.println("Digite o número");
            numero = scanner.nextInt();
            if(numero > maior){
                maior = numero;
            }
            count += 1;
        } while(count < 5);

        System.out.println("O maior número é igual a " + maior + ".");
    }
}
