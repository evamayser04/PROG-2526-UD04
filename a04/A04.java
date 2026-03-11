/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a04;
import java.util.Scanner;
/**
 *
 * @author evama
 */
public class A04 {
    static int maximo (int numeros []){
        int num_max = numeros[0];
        
        for(int cont = 0; cont < numeros.length; ++cont){
            num_max = numeros[cont] > num_max ? numeros[cont] : num_max;
        }
        
        return num_max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t[] = {15,10,16,9,12};
        
        System.out.println(maximo(t));
    }
 
}
