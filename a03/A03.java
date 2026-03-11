/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a03;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author evama
 */
public class A03 {
    public static void main(String[] args) {
        
        System.out.println("Cuantos números desea introducir?");
       
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int t[] = new int [num]; //creo y declaro la tabla con el tamaño indicado por el usuario
        
        for (int n = 0; n < t.length; n++) { //recorro la tabla desde la primera posición (0) hasta la última
            System.out.print("Número " + (n + 1) + ": ");
            t[n] = sc.nextInt(); //leo un número entero que introduce el usuario y lo guardo en la posición actual
        }
        
        for (int n = t.length - 1; n >= 0; n--) { //recorro la tabla al revés, empiezo en la última posición y voy hacia atrás
            System.out.println("Has introducido: " + t[n]);
        }
    }
}
    