/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Estudiantes
 */
public class Excepciones {

    //0
    public static void mostrarArreglo(int[] a) throws ArrayIndexOutOfBoundsException {
        System.out.println(a[5]);
    }

    //1
    public static void divisionCero(int a, int b) throws ArithmeticException {
        System.out.println(a / b);
    }

    //2
    public static void stringInvalido(String a) throws NumberFormatException {
        System.out.println("Numero convertido: " + Integer.parseInt(a));
    }

    //3
    public static void stringFueraTamaño(String a) throws StringIndexOutOfBoundsException {
        char c = a.charAt(5);
        System.out.println("Caracter en posicion 5: " + c);
    }

    //4
    public static void valorNoExiste(String a) throws NullPointerException {
        System.out.println(a.length());
    }

    //5
    public static void abrirArchivo() throws FileNotFoundException {
        File archivo = new File("Test.txt");
        FileReader fr = new FileReader(archivo);
    }

    //6
    public static void arrayNegativo() throws NegativeArraySizeException {
        int A[] = new int[-2];
    }

    //7
    public static void casteoDeClase() throws ClassCastException {
        String[] strArray = new String[]{"John", "Snow"};
        ArrayList<String> strList = (ArrayList<String>) Arrays.asList(strArray);
        System.out.println("String list: " + strList);
    }

    //8
    public static void operacionInvalida() throws ArrayStoreException {
        Object A[] = new String[3];
        A[0] = new Integer(0);
    }

    //9
    public static void claseNoExiste() throws ClassNotFoundException {
        Class.forName("ClaseInvisible");
        ClassLoader.getSystemClassLoader().loadClass("ClaseInvisible");
    }
}
