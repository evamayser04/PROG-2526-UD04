/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author evama
 */
public class A05 {
    public static int[] rellenaPares(int longitud, int fin){
        Random random = new Random();
        
        int t [] = new int[longitud];
        
        int cont = 0;
        
        while(cont < t.length){
            
           int numeroRandom = random.nextInt(fin);
           
            if(numeroRandom % 2 == 0 && numeroRandom != 0){
                t[cont] = numeroRandom;
                cont++;
            }          
        }
       Arrays.sort(t);
       return (t);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame la longitud");
        int longitud = sc.nextInt();
        
        System.out.println("Dame el rango máximo de números");
        int fin = sc.nextInt();
        
        int[] t = rellenaPares(longitud, fin);
        System.out.println(Arrays.toString(t));
    }
}
