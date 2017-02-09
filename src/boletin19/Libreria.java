/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import operacions.calculos;

/**
 *
 * @author acomesanavila
 */
public class Libreria {
    
    private List<Libro> Libreria = new ArrayList<Libro>();
    
    public void engadirLibro() {
        System.out.println("Dame:\nTitulo\nAutor\nISBN\nPrezo\nUnidades");
        Libreria.add(new Libro(calculos.pedirString(), calculos.pedirString(), calculos.pedirString(), calculos.pedirFloat(), calculos.pedirInt()));
    }
    
    public void vender(String nombre, int vendidos) {
        Libro li = new Libro(nombre, "aa", "bb", 10, 9);
        for (Libro l : Libreria) {
            if (li.compareTo(l) == 0) {
                l.setUnidades(l.getUnidades()-vendidos);
            }
            else
            System.out.println("No existe");
            }
        }
        
    public void amosarLibros() {
        Collections.sort(Libreria);
        Iterator<Libro> it = Libreria.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
    public void comparar() {
        Libro li = new Libro(calculos.pedirString(), "aa", "bb", 10, 9);
        for (Libro l : Libreria) {
            if (li.compareTo(l) == 0) {
                System.out.println(l);
            }
        }
    }
    
    public void eliminar0() {
        for(int i = 0; i<Libreria.size(); i++){
            if(Libreria.get(i).getUnidades()==0){
                Libreria.remove(i);
            }
        }
        
    }
}
