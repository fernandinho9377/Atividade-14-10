package Projetos;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class QuartoDesafio {
    public static void main(String[] args) {
    //4. Escreva um programa para ler o nome, valor da hora, quantas horas trabalhadas, o sistema vai apresentar o salário.
    //<fulano> vai receber R$<00.00>
    Scanner ler = new Scanner(System.in);
    System.out.println("Nome: ");
    String nome = ler.nextLine();
    System.out.println("Valor/hora: ");
    float vh = ler.nextFloat();
    System.out.println("Horas trabalhadas(mês): ");
    int ht= ler.nextInt();
    
    float total = vh * ht;
    
    System.out.println(nome+" vai receber R$ "+total);
        
    
    }
}
