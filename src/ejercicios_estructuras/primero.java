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
public class primero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int N = teclado.nextInt();
        teclado.nextLine();
       
        
        String numeros = teclado.nextLine();
        
        String[] num = numeros.split("\\s+");

//         for (String stringSeparado : num) {
//            System.out.println(stringSeparado);
//        }
        
//        System.out.println("1");       
        int Q = teclado.nextInt();
        teclado.nextLine();
//        System.out.println("2");  
//        
        String[] num2 = new String[Q];
        for (int i = 0; i < num2.length; i++) {
            num2[i] = teclado.nextLine();
        }
        
        for(int i=0;i<num2.length;i++){
            
            String n = num2[i];
            
            int aux=0;
            for (int j = 0; j < num.length; j++) {
                
//                System.out.println("numero a buscar: " + n);
//                System.out.println("numero en la posicion" + j +  ": " + num[j]);
                if(n.equals(num[j])){
                aux=aux+1;
                }
            
            }
            if(aux==0){
                System.out.println("NOT PRESENT");
            }else{
                System.out.println(aux);
            }
        }
        
        
        
        
    }

    
    
}
