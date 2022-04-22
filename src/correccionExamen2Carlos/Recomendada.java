/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccionExamen2Carlos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author carlosroco
 */
public class Recomendada {

    private static List<Visionado> lista = new LinkedList<>();

    private Pelicula peliRecomendada;

    public Recomendada(Pelicula peliRecomendada) {
        this.peliRecomendada = peliRecomendada;
    }

    public int puntuacion() {
        int puntos = 0;
        for (Visionado V : lista) {
            if (V.getPeliculaVista().getDirector().equals(this.peliRecomendada.getDirector())) {
                if (V.haGustado()) {
                    puntos += 3;
                } else {
                    puntos -= 3;
                }
            }
            for (String A : V.getPeliculaVista().getActores()) {
                if (this.peliRecomendada.getActores().contains(A)) {
                    if (V.haGustado()) {
                        puntos += 1;
                    } else {
                        puntos -= 1;
                    }
                }
            }
        }
        return puntos;
    }

    public static void registrarVisionada(Visionado peliVista) {
        boolean visto = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getPeliculaVista().getTítulo().equals(peliVista.getPeliculaVista().getTítulo())) {
                if (peliVista.getTiempo() > lista.get(i).getTiempo()) {
                    lista.set(i, peliVista);
                }
                visto = true;
                break;
            }
        }
        if (!visto) {
            lista.add(peliVista);
        }
    }

    public static void mostrarVistas() {
        for (Visionado V : lista) {
            System.out.println(V.getPeliculaVista().getTítulo() + " se ha visto " + V.getTiempo());
        }
    }

    public String mostrar() {
        return "PeliRecomendada: " + peliRecomendada + "\n"
                + "Puntuacion: " + puntuacion();
    }

    public int compareTo(Recomendada recom) {
        return this.puntuacion() - recom.puntuacion();
    }

    public void pelisOrdenadas(List<Recomendada> lista) {
        List<Recomendada> aux = new LinkedList<>(lista);
        Recomendada actual;
        while (!aux.isEmpty()) {
            actual = aux.get(0);
            for (Recomendada R : aux) {
                if (actual.compareTo(R) < 0) {
                    actual = R;
                }
            }
            System.out.println(actual.mostrar());
            aux.remove(actual);
        }
    }

    public void borrar(String actor) {
        Iterator<Visionado> it = lista.iterator();
        while (it.hasNext()) {
            Visionado visionado = it.next();
            if (visionado.getPeliculaVista().getActores().contains(actor)) {
                it.remove();
                break;
            }
        }
    }
}
