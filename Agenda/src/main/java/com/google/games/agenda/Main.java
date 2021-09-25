/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.google.games.agenda;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * @author Marti Pérez
 */
public class Main {
    
private void generarLista() throws IOException {
        String nombre = "Edgar";
        String numero = "55123412";
        String edad = "24";
        
        PrintWriter out = null;
        
        try{
           out = new PrintWriter(new FileWriter("archivo"));

            out.printf("Nombre:%-10s Numero:%-10s Edad:%-4s", nombre, numero, edad);
            out.println();
            out.printf("Nombre:%-10s Numero:%-10s Edad:%-4s", "Ale", "45164908", "15");
            out.println();
            out.printf("Nombre:%-10s Numero:%-10s Edad:%-4s", "Alejandro", "77662314", "54");

        } finally {
            if (out!=null) {
                out.close();
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.generarLista();
    }

}
