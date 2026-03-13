/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a01;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author evama
 */
public class A01 {
    public static void main(String[] args) {
        
        Random random = new Random();
        //creo el objeto random
        int t[] = new int [10];
        //creo y declaro la tabla con el rango 10
        for (int n = 0; n < t.length; n++) { //recorro la tabla, empieza por el 0(primera posición) mientras se menor que 10, sigue; cada vuelta pasa a la siguiente posición
           int numeroRandom = random.nextInt(99) + 1; //genero un numero random del uno al cien
            
            t[n] = numeroRandom;//asigno el nº aleatorio generado a la posicion actual de la tabla
        }
        System.out.println(Arrays.toString(t)); //muestro toda la tabla o array
        
        int suma = 0; //declaro la variable suma y la inicio en 0 (es donde iré acumulando los valores)
        
        for(int valor: t) { //recorro la tabla usando un for-each: en cada vuelta "valor" será un elemento del array t
            System.out.println("valor:" + valor); //muestro el valor actual por pantalla
            suma += valor; //voy sumando cada valor a la variable suma (acumulación)
        }
        System.out.println("La suma da:" + suma); //muestro el resultado final de la suma de todos los valores de la tabla
    }
    
}
