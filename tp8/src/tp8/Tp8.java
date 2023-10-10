/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User10
 */
public class Tp8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Random ran = new Random();
        int [][] m=new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j]=ran.nextInt(20);
            }
        }
        int [][] n=new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                n[i][j]=ran.nextInt(20);
            }
        }
        
        int [][] r=new int [3][3];
        int [][] s=new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                r[i][j]=m[i][j]+n[i][j];
                s[i][j]=m[i][j]+n[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+r[i][j]+"]");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+s[j][i]+"]");
            }
            System.out.println("");
        }
        boolean vof=true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (s[i][j]!=s[j][i]){
                    vof=false;
                }
            }
        }
        System.out.println(vof);
        
        int []v={1,2,3,4};
        System.out.println("ingrese numero para escalar");
        int x= leer.nextInt();
        int [] resultado= new int [v.length];
        for (int i = 0; i < v.length; i++) {
            resultado[i]=v[i]*x;
        }
        for (int i = 0; i < v.length; i++) {
            System.out.println(resultado[i]);
        }
        int sum=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            sum+=s[i][j];    
            }
        }
        System.out.println(sum);
        
        int nummayor=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(s[i][j]>nummayor){
                    nummayor=s[i][j];
                }
            }
        }
        System.out.println("el numero mayor es: "+nummayor);
        
    }
    
}
