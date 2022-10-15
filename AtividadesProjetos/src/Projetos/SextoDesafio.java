package Projetos;

import java.util.Scanner;

public class SextoDesafio {
    public static void main(String[] args) {
        /*6. Escreva um programa para ler o valor de uma conta e quantas pessoas 
        vão dividir a conta, o sistema vai apresentar quanto cada pessoa vai pagar.*/
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor da conta: ");
        float conta = ler.nextInt();
        System.out.println("Digite em quantas partes a conta será dividida");
        int quantidade = ler.nextInt();
        float valorPartes = conta/quantidade;

        //System.out.println("Cada pessoa irá pagar: R$ "+valorPartes);
        System.out.println("Cada uma das "+ quantidade+" pessoa(s) irá pagar: R$ " + String.format("%.2f", valorPartes));
        
    


    }
}
