package Projetos;

import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {
        //2. Escreva um programa para ler um número e o sistema vai mostra os números vizinhos, o anterior e o próximo número.
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva um número:");
        int n = ler.nextInt();
        int na = n-1;
        int nb = n+1;
        System.out.println("O número apresentado é: "+n);
        System.out.println(" o seu antecessor é: "+na);
        System.out.println(" e o sucessor é: "+nb);
    }
}
