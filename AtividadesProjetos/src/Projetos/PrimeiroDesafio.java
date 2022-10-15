package Projetos;

import java.util.Scanner;

public class PrimeiroDesafio {
public static void main(String[] args) {
   //1. Escreva um programa para ler 2 notas, o sistema vai apresentar a média final, 
se nota maior que 7 incluir mensagem "aprovado" senão "reprovado".
    Scanner ler = new Scanner(System.in);
    System.out.println("Escreva o valor da primeira nota:");
int n1 = ler.nextInt();
System.out.println("Escreva o valor da Segunda nota:");
int n2 = ler.nextInt();
ler.close();
int media = (n1+n2)/2;
System.out.println("A sua média final foi: "+ media);
if (media>=7){
    System.out.println("Aprovado");
} if(media<7){
System.out.println("Reprovado");
}
    
}
}
