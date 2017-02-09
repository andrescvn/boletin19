/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import java.util.Objects;

/**
 *
 * @author acomesanavila
 */
public class Libro implements Comparable {

    private String titulo, autor, ISBN;
    private float prezo;
    private int unidades;

    public Libro() {
    }

    public Libro(String titulo, String autor, String ISBN, float prezo, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.unidades = unidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int compareTo(Object o) {
        Libro li = (Libro) o;
        if (this.titulo.compareToIgnoreCase(li.titulo) == 0) {
            return 0;
        } else if (this.titulo.compareToIgnoreCase(li.titulo) > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public int compareTo2(Object o) {
        Libro li = (Libro) o;
        if (this.ISBN.compareToIgnoreCase(li.ISBN) == 0) {
            return 0;
        } else if (this.ISBN.compareToIgnoreCase(li.ISBN) > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", prezo=" + prezo + ", unidades=" + unidades + '}';
    }

}
