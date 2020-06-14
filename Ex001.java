/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercícios;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class Ex001 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número:");
        int n = entrada.nextInt();
        //System.out.println(n%2 == 0? "Par": "Impar");
        if (n%2==0){
            System.out.println("Par!");
        }
        else{
            System.out.println("Ímpar!");
        }
    }
}
