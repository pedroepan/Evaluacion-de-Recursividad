
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
//Ejercicio 4
public class EvaluacionRecursividad {
    
    
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
//Ejercicio 2
public class EvaluacionRecursividad {

    static class Nodo {
        String dato;
        Nodo siguiente;

        Nodo(String dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    static class Lista {
        private Nodo tope;

        public Lista() {
            tope = null;
        }

        public void nuevo(String elemento) {
            Nodo nuevo = new Nodo(elemento);
            if (tope == null) {
                tope = nuevo;
                nuevo.siguiente = tope;
            } else {
                Nodo temp = tope;
                while (temp.siguiente != tope) {
                    temp = temp.siguiente;
                }
                temp.siguiente = nuevo;
                nuevo.siguiente = tope;
            }
        }

        public String concatenarElementos(Nodo nodo, Nodo inicio, boolean primer) {
            if (nodo == null || (nodo == inicio && !primer)) {
                return "";
            }
            String espacio = " ";
            
            String cadenaFinalDeElementos = concatenarElementos(nodo.siguiente, inicio, false);
            if (primer) {
                return nodo.dato + espacio + cadenaFinalDeElementos;
            } else {
                return nodo.dato + espacio + cadenaFinalDeElementos;
            }
        }

        public String concatenar() {
            if (tope == null) return "";
            return concatenarElementos(tope, tope, true);
        }
    }

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.nuevo("the");
        lista.nuevo("one");
        lista.nuevo("piece");
        lista.nuevo("is");
        lista.nuevo("real");
        lista.nuevo("!");
        lista.nuevo("!");

        String cadenaFinalDeElementos = lista.concatenar();
        System.out.println("Cadena concatenada: " + cadenaFinalDeElementos);
    }
}
*/

/*
//Ejercicio 3
public class Ejercicio3 {
    //Solo se pueden ingresar numeros en la pila

    static class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int elemento) {
            this.dato = elemento;
            this.siguiente = null;
        }
    }

    static class Pila {
        private Nodo tope;

        public Pila() {
            this.tope = null;
        }

        public int pafuera() {
            if (tope == null) {
                System.out.println("Pila vacia.");
                return 0;
            }
            int elemento = tope.dato;
            tope = tope.siguiente;
            return elemento;
        }
        
        public void padentro(int elemento) {
            Nodo nuevo = new Nodo(elemento);
            nuevo.siguiente = tope;
            tope = nuevo;
        }

        public boolean sinElementos() {
            return tope == null;
        }
    }

    public static void sacarDePilaAlReves(Pila pila) {
        if (!pila.sinElementos()) {
            int elemento = pila.pafuera();
            sacarDePilaAlReves(pila);
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pila pila = new Pila();

        System.out.println("Para finalizar la lista ponga -69:");
        while (true) {
            int elemento = entrada.nextInt();
            if (elemento == -69) {
                break;
            }
            pila.padentro(elemento);
        }

        System.out.println("Elementos de la pila al reves (o sea en el orden en que ingresaron, pero"
                + "al reves de como se guardaron):");
        sacarDePilaAlReves(pila);
    }
}

*/