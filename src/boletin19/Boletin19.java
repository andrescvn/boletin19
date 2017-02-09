/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import javax.swing.JOptionPane;
import operacions.calculos;

/**
 *
 * @author acomesanavila
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libreria li = new Libreria();
        int p;
        do {
            p = Integer.parseInt(JOptionPane.showInputDialog("OPCIONES:\n1)Crear libro\n2) Comparo\n3) Amosar\n4)Borrar libro\n5) ELiminar 0\n6) Salir"));
            switch (p) {
                case 1:
                    li.engadirLibro();
                    break;
                case 2:
                    li.comparar();
                    break;
                case 3:
                    li.amosarLibros();
                    break;
                case 4:
                    String libro=JOptionPane.showInputDialog("Nombre del libro");
                    int unidades=Integer.parseInt(JOptionPane.showInputDialog("unidades"));
                    li.vender(libro, unidades);
                    break;
                case 5:
                    li.eliminar0();
                    break;          

            }
        } while (p != 6);

    }

}
