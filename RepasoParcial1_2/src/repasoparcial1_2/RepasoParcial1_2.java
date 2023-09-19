/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoparcial1_2;

import java.util.Scanner;

/**
 *
 * @author User10
 */
public class RepasoParcial1_2 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.println("ingrese numeero de 3 cifras");
        int num = sca.nextInt();
        if (num > 99 && num < 1000) {
            int u = num % 10;
            int c = num/100;
            System.out.println(c+","+u);
            if (u==c){
                System.out.println("es capicua");
            }else{
                System.out.println("no es capicua");
            }
        }else{
            System.out.println("no es un numero de 3 cifras");
        }
    }

}
