/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoparcial1;

import java.util.Scanner;

/**
 *
 * @author User10
 */
public class RepasoParcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
        System.out.println("ingrese numero 1");
        int num1=leer.nextInt();
        System.out.println("ingrese numero 2");
        int num2=leer.nextInt();
        int un1=num1%10;
        int un2=num2%10;
        
        if (un1==un2){
            System.out.println("las ultimas cifras son iguales");
        }else{
            System.out.println("las ultimas cifras no son iguales");
        }
        
    }
    
}
