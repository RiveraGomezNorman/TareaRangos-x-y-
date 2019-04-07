/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarearangosxy;

import java.util.Scanner;

/**
 *
 * @author NORMAN
 */
public class TareaRangosxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        int y;

        int resultado1 = 0;
        System.out.println("Introducir rangos para realizar la suma");
        System.out.println("Rango x: ");
        Scanner x1 = new Scanner(System.in);
        x = x1.nextInt();
        int resultado = x - 1;
        System.out.println("Rango y: ");
        Scanner y1 = new Scanner(System.in);
        y = y1.nextInt();
        for (int i = x; i <= y; i++) {
            resultado = (resultado + 1);
            resultado1 = resultado + (resultado1);
            System.out.println(resultado1);
        }
        System.out.println("El resultado de la suma por rango es: " + resultado1);
    }

}
