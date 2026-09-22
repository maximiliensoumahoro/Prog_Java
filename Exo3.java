/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo3;

import java.util.Scanner;

/**
 *
 * Maximilien Soumahoro
 */
public class Exo3 {

   
    public static void main(String[] args) {//exo2
        System.out.println("Please enter the operator:");
    System.out.println("1) add");
    System.out.println("2) substract");
    System.out.println("3) multiply");
    System.out.println("4) divide");
    System.out.println("5) modulo");
    
    //exo3
    int operateur;
Scanner sc = new Scanner(System.in);
System.out.println("Entrer votre choix :");
operateur = sc.nextInt();
int operande1;
System.out.println("Operande1:");
operande1 = sc.nextInt();

int operande2;
System.out.println("Operande2:");
operande2 = sc.nextInt();

int result=0 ;

        if (operateur == 1) {
            result = operande1 + operande2;
            System.out.println("The result is : " + result);
        }
        else if (operateur == 2) {
            result = operande1 - operande2;
            System.out.println("The result is : " + result);
        }
        else if (operateur == 3) {
                
            result = operande1 * operande2;
            System.out.println("The result is : " + result);
        }
        else if (operateur == 4) {
            result = operande1 / operande2;
            System.out.println("The result is : " + result);
        }
        else if (operateur == 5) {
            result = operande1 % operande2;
            System.out.println("The result is : " + result);
        }
        else {
    System.out.println("Choisis un chiffre en un et 5");
}
    }
    
    
}
