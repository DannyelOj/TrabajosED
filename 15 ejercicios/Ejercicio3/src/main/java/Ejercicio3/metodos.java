/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author VEL-USER
 */
public class metodos {
    Scanner entrada;
    int [][] matriz;
    
    public metodos (int _n, int _m) {
        entrada = new Scanner(System.in);
        matriz = new int [_n][_m];
    }
    
    public void llenarMatriz () { 
        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) {
                System.out.print("["+i+"] ["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
    }
    
    public void presentarMatriz () {
        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) {
                System.out.print("["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }
    }
    
    public int sumaPares(){
        int conp = 0;
        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) {
               if (matriz[i][j]%2==0) {
                conp++;
                } 
            }            
        }
        return conp;
    }
    
    public int sumaImpares(){
        int coni = 0;
        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) {
                if (matriz[i][j]%2!=0) {
                coni++;
                }
            }            
        }
        return coni;
    }
    
    @Override
    public String toString () {
        String cadena = String.format("Hay %d números impares \nHay"
                + " %d números pares\n",sumaImpares(),sumaPares());
        return cadena;
    }
}
