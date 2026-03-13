/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a02;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author evama
 */
public class A02 {
    public static void main(String[] args) {
        
        System.out.println("Dame 5 números decimales"); //muestro un mensaje pidiendo al usuario 5 números
       
        Scanner sc = new Scanner(System.in);
        double t[]= new double [5]; //creo y declaro la tabla con espacio para 5 números decimales
        
        for (int n = 0; n < t.length; n++) { //recorro la tabla desde la primera posición (0) hasta la última (4)
            System.out.print("Número " + (n + 1) + ": "); //muestro qué número toca introducir (1, 2, 3...)
            t[n] = sc.nextDouble(); //leo el número decimal que introduce el usuario y lo guardo en la posición actual del array
        }
        System.out.println("Has introducido: " + Arrays.toString(t)); //muestro todo con los valores introducidos
        
    }
}
