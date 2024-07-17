
package com.mycompany.evaluacionrecursividad;

import java.util.Scanner;

public class EvaluacionRecursividad {
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
