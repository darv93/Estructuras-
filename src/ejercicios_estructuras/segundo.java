/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_estructuras;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class segundo {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();

                int[] n1= new int[n];

                for (int j = 0; j < n; j++) {
                    n1[j]=sc.nextInt();
                }

                boolean inversa = true;

                for (int j = 0; j < n; j++) {
                    if(n1[n1[j]-1] != j +1){
                    inversa = false;
                    break;
                    }
                }

                if (inversa){
                    System.out.println("inverse");
                }else{
                    System.out.println("not inverse");
                }

                }

            }

        
    

}
