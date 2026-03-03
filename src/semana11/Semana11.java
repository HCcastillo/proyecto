/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana11;
import java.util.Scanner;


/**
 *
 * @author HP
 */
public class Semana11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       int [][] matriz = new int[5][5];
       
       for(int i = 0; i < 5; i++){
           for(int j = 0; j < 5; j++) {
               System.out.print(" Ingrese el valor para la posicion [" + i + "][" + j + "]:");
               
               matriz[i][j] =sc.nextInt();
           }
           }
       System.out.println("\nMatriz ingresada:");
       for(int i =0; i < 5; i++){
           for(int j = 0; j < 5; j++){
               System.out.print(matriz[i][j] + "\t" );  
           }
           System.out.println();
       }
       sc.close();
       
    }
    
}