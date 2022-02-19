package br.com.dio.exercicios.arrays;

import java.util.Random;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                matriz[i][j] = random.nextInt(100);
            }
        }

        for(int[] linha: matriz){
            for(int coluna: linha){
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}