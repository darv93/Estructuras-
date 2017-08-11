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
public class prueba {

    static String capitalize(String s){
		return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
	}
	public static void main(String[]args){
		Scanner cin=new Scanner(System.in);
		String a=cin.next(),b=cin.next();
		System.out.println(a.length()+b.length());
		System.out.println(a.compareTo(b)>0 ? "Yes" : "Nocas");
		System.out.println(capitalize(a)+" "+capitalize(b));
	}
    
}
