package Projetos;

import java.util.Scanner;

public class TerceiroDesafio {
    public static void main(String[] args) {
        //3. Escreva um programa para ler um nome digitado e mostrar a mensagem "Olá <nome-digitado>".
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva seu nome: ");
        String nome = ler.nextLine();
        System.out.println("Olá "+nome+"!");

    }
}
