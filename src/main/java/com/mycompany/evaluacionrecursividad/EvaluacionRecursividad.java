
package com.mycompany.evaluacionrecursividad;

import java.util.Scanner;

public class EvaluacionRecursividad {
    
    //Ejercicio1
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        System.out.print("Cuantos elemtos tendra el arreglo: ");
        int dimension = entrada.nextInt();
        
        int[] arreglo = new int[dimension];
                   
        System.out.println("Introduzca los elementos:");
        for (int i = 0; i < dimension; i++) {
            System.out.print("Elemento:");
            arreglo[i] = entrada.nextInt();
        }

        int resultado = sumarElementosArreglo(arreglo, dimension - 1);

        System.out.println("Suma: " + resultado);

    }
    public static int sumarElementosArreglo(int[] arreglo, int indice) {
        if (indice < 0) {
            return 0;
        }
        return arreglo[indice] + sumarElementosArreglo(arreglo, indice - 1);
    }
}

/*
public class Ejercicio4 {
    
    
    public static long potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }

    public static long factorial(int entero) {
        if (entero == 0) {
            return 1;
        }
        return entero * factorial(entero - 1);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Exponent de potencia: ");
        int exponente = entrada.nextInt();

        System.out.print("Base para potencia: ");
        int base = entrada.nextInt();

        System.out.print("Entero para factorial: ");
        int entero = entrada.nextInt();
            
        
        long potencia = potencia(base, exponente);
        long factorial = factorial(entero);
        long resultadoFinal = potencia * factorial;
        System.out.println("Resultado: " + resultadoFinal);

    }
}
*/

/*

*/