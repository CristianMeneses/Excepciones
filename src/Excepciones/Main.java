/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion = 0, eleccion = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("0.\"ArithmeticException\" \n"
                + "1.\"ArrayIndexOutOfBoundsException\" \n"
                + "2.\"NumberFormatException\" \n"
                + "3.\"StringIndexOutOfBoundsException\" \n"
                + "4.\"NullPointerException\" \n"
                + "5.\"FileNotFoundException\" \n"
                + "6.\"NegativeArraySizeException\" \n"
                + "7.\"ClassCastException\" \n"
                + "8.\"ArrayStoreException\" \n"
                + "9.\"ClassNotFoundException\" ");
        do {
            System.out.println("Ingrese la opcion que desee probar");

            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    try {
                        Excepciones.divisionCero(10, 0);
                    } catch (ArithmeticException e) {
                        System.out.println("La division entre 0 es indeterminada.");
                    }
                    break;
                case 1:
                    try {
                        int[] arreglo = {1, 2, 3, 4, 5};
                        Excepciones.mostrarArreglo(arreglo);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Indice fuera del arreglo.");
                    }
                    break;
                case 2:
                    try {
                        Excepciones.stringInvalido("ABC");
                    } catch (NumberFormatException e) {
                        System.out.println("No es posble convertir esa cadena"
                                + " a numeros.");
                    }
                    break;
                case 3:
                    try {
                        Excepciones.stringFueraTamaño("Hola");
                    } catch (StringIndexOutOfBoundsException e) {
                        System.out.println("Posisicion fuera de la cadena.");
                    }
                    break;
                case 4:
                    try {
                        Excepciones.valorNoExiste(null);
                    } catch (NullPointerException e) {
                        System.out.println("Variable vacia.");
                    }
                    break;
                case 5:
                    try {
                        Excepciones.abrirArchivo();
                    } catch (FileNotFoundException e) {
                        System.out.println("Archivo no encontrado.");
                    }
                    break;
                case 6:
                    try {
                        Excepciones.arrayNegativo();
                    } catch (NegativeArraySizeException e) {
                        System.out.println("Tamaño negativo de arreglo");
                    }
                    break;
                case 7:
                    try {
                        Excepciones.casteoDeClase();
                    } catch (ClassCastException e) {
                        System.out.println("No es posible castear");
                    }
                    break;
                case 8:
                    try {
                        Excepciones.operacionInvalida();
                    } catch (ArrayStoreException e) {
                        System.out.println("Operación invalida.");
                    }
                    break;
                case 9:
                    try {
                        Excepciones.claseNoExiste();
                    } catch (ClassNotFoundException e) {
                        System.out.println("No se ha encontrado esta clase.");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
            System.out.println("Si desea repetir el programa, oprima \"1\"");
            eleccion = sc.nextInt();
        } while (eleccion == 1);
    }

}
