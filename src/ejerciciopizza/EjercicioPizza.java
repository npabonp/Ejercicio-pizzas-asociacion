/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopizza;


/**
 *
 * @author Estudiante
 */
public class EjercicioPizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
    java.util.Scanner teclado = new java.util.Scanner(System.in);
    
    String ingredientes;
    int tamano;
    double precio;
        
    Pizza [] pizzas = new Pizza [3];
    for (int i=0; i<3; i++){
        System.out.println("Ingrese ingrediente" + (i+1));
        ingredientes = teclado.next();
        System.out.println("Ingrese tamaño" + (i+1));
        tamano = teclado.nextInt();
        System.out.println("Ingrese precio" + (i+1));
        precio = teclado.nextDouble();
        
        pizzas [i]= new Pizza (ingredientes,tamano,precio);
    }
        System.out.println(pizzas);
    }
    
}
