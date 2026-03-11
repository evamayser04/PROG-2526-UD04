/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a16;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author evama
 */
public class A16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Longitud de la combinación: ");
        int longitud = sc.nextInt();
        //dos arrays: uno para la combinación secreta y otro para la del jugador
        int combSecreta[] = new int[longitud];
        int combJugador[] = new int[longitud];
        
        //se genera la combinación secreta aleatoria
        generaCombinacion(combSecreta);
        
        // pide la primera combinación al jugador
        System.out.println("Escriba una combinación");
        leeTabla(combJugador);
        
        //bucle mientras las combinaciones no sean iguales
        while (!Arrays.equals(combSecreta, combJugador)) {
            //pistas: mayor / menor / igual
            muestraPistas(combSecreta, combJugador);
            //pide una nueva combinación
            System.out.println("Escriba una combinación: ");
            leeTabla(combJugador);
        }
        //sale del bucle: acertó
        System.out.println("¡La cámara está abierta!");
    }
    //llena el array con números aleatorios
    static void generaCombinacion(int t[]) {
        Random r = new Random(); 
        final int MAX = 5; //rango: 1 a 5
        for (int i = 0; i < t.length; i++) {
            t[i] = r.nextInt(MAX) + 1;
        }
    }
    //lee desde teclado los números que introduce el jugador
    static void leeTabla(int t[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }
    }
    //indica si cada número es mayor, menor o igual
    static void muestraPistas(int secret[], int jug[]) {
        System.out.println("Pistas:");
        for (int i = 0; i < jug.length; i++) {
            //número introducido por el jugador
            System.out.print(jug[i] + " ");
            
            //compara con el número secreto en esa posición
            if (secret[i] > jug[i]) {
                System.out.println(" mayor");
            } else if (secret[i] < jug[i]) {
                System.out.println(" menor");
            } else {
                System.out.println(" igual");
            }
        }
    }
}
