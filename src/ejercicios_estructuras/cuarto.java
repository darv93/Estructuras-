/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_estructuras;

import java.util.Scanner;



public class cuarto {

    public static String Gxy(int x,int y){
        String result;
        
        if(x%y==0){
            String a="1";
            String b="";
            for (int i = 0; i < x-1; i++) {
                b = b +"0";
            }
            result = a+b;
        }else{
            
                     
            String s1 = S_infinity(Gxy(y,(x%y)),x);
            result = s1.substring(0,x);
        }
                
        return result;
    
    }
    
    public static String S_infinity(String s,int n){
        String result=s;
        int cantidad =n;
         
        while(s.length()<n){
            for (int i = 0; i < cantidad; i++) {
                result = result + result;
            }
        }
        
        return result;
    }
    
    public static int f(int x, int y){
        int decimal = 0;
        int binario;
        
        	binario = Integer.parseInt(Gxy(x,y));
    	
        
        int exponente = 0;
 
        while (binario != 0) {
            int UltimoDigit = binario % 10;
            decimal += UltimoDigit * Math.pow(2, exponente);
            exponente++;
            binario = binario / 10;
        }
        return decimal%(1000000007);
    }
    
    
    
    
    
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        int n = sc.nextInt();
//        sc.nextLine();
//        int[][] v1 = new int[n][2];
//        
//        for (int i = 0; i < n; i++) {
//               
//            for (int j = 0; j < 2; j++) {
//                v1[i][j] = sc.nextInt();
//                
//            }
//        }
//        
//        for (int i = 0; i < v1.length; i++) {
//            
//            int f = f(v1[i][0],v1[i][1]);
//            System.out.println(f);
//            
//        }
//        
         
        System.out.println(S_infinity("1",34));
        
    }
    
}
