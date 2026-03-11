/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a17;
import java.util.Arrays;
/**
 *
 * @author evama
 */
public class A17 {
    public static void main(String[] args) {
        int tabla [][];
        tabla = new int [5][5]; //declaro la tabla y le doy valor de fila 5 y columna 5
        
        for(int filas = 0; filas < tabla.length; filas++){ //recorro la fila
            
            for(int columnas = 0; columnas < tabla[0].length; columnas++){ //recorro la columna se pone tabla[0]
                
                tabla[filas][columnas] = (10 * filas) + columnas; //recorro y doy valor a cada celda cada vez que se ejecute el bucle
            }
            
        }
            
            //System.out.println(Arrays.deepToString(tabla)); //pinta la tabla
        for (int[] fila : tabla) {
            System.out.println(Arrays.toString(fila)); //pinta la tabla
            }
    }
}
