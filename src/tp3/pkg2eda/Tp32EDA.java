/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3.pkg2eda;

import java.util.Stack;

/**
 *
 * @author Ivan
 */
public class Tp32EDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Stack<Integer> pila1 = new Stack<>();
        Stack<Integer> pila2 = new Stack<>();
        Stack<Integer> pilaResultante = new Stack<>();

        // Ejemplo de elementos en las pilas
        pila1.push(5);
        pila1.push(3);
        pila1.push(1);

        pila2.push(4);
        pila2.push(2);
        pila2.push(0);

        fusionarPilas(pila1, pila2, pilaResultante);

        System.out.println("Pila resultante:");
        while (!pilaResultante.isEmpty()) {
            System.out.println(pilaResultante.pop());
        }
    }

    public static void fusionarPilas(Stack<Integer> pila1, Stack<Integer> pila2, Stack<Integer> pilaResultante) {
        while (!pila1.isEmpty() && !pila2.isEmpty()) {
            if (pila1.peek() > pila2.peek()) {
                pilaResultante.push(pila1.pop());
            } else {
                pilaResultante.push(pila2.pop());
            }
        }

        // Si alguna de las pilas originales aún tiene elementos, los inserta en la pila resultante
        while (!pila1.isEmpty()) {
            pilaResultante.push(pila1.pop());
        }
        while (!pila2.isEmpty()) {
            pilaResultante.push(pila2.pop());
        }
    }
    
}
