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
public class tercero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        String s= sc.next(); 
        char[] cadena;
        cadena=s.toCharArray();
        
        int aux=0;
        for (int i = 0; i < s.length(); i++) {
            aux += cadena[i] - 'a'+1;
        }
            System.out.println(aux);
            
    }
    
}
