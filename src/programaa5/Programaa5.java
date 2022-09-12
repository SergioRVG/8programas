/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaa5;

/**
 *
 * @author Win 10
 */
public class Programaa5 {

   
    public static void main(String[] args) {
            int[] numeros = new int[] { 28, 50, 40, 300, 20, 44, 100, 153 };
        int mayor = numeros[0];
        for (int x = 1; x < numeros.length; x++) {
            if (numeros[x] > mayor) {
				mayor = numeros[x];
                               
                                }
		}
        System.out.println("El mayor es: " + mayor);
    }
    
}
