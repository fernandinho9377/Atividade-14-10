package Projetos;

import java.util.Scanner;

public class QuintoDesafio {
    /**
     * @param args
     */
    public static void main(String[] args) {
    /* 5. Escreva um programa para ler o valor de um jantar, o sistema vai apresentar 
    a taxa do garçom 10% e também o valor <valor refeição> + 10% = <final total>. */
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o valor da refeição: ");
    float ref = ler.nextFloat();
    
    float txg = (ref * 10/100);
    float vj = ref + txg;    
    
    System.out.println("Refeição: R$ "+ref);
    System.out.println("Garçon 10%: R$ "+txg);
    System.out.println("Total: R$ "+vj);
       
    }
}
