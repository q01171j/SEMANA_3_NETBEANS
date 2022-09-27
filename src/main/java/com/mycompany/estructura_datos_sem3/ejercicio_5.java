/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura_datos_sem3;

import java.util.Arrays;

/**
 *
 * @author Adriano
 */
public class ejercicio_5 {
    public static void main(String[] args) {
        int [][] matriz = new int[7][7];
        int f;
        //Relleno la diagonal principal con 1
        //Solo tengo que recorrer las casillas en las que el numero de filas es
        //igual que el numero de columna : matriz[0][0]=matriz[1][1]...=matriz[6][6]=1
        for(f=0;f <matriz.length;f++){
            matriz[f][f] = 1;
        }
        
        //muestro las filas de la matriz haciendo uso de la libreria "Arrays"
        for(f=0; f < matriz.length;f++){
            System.out.println(Arrays.toString(matriz[f]));
        }       
    }
}
