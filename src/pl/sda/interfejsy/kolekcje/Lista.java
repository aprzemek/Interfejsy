package pl.sda.interfejsy.kolekcje;

import java.util.ArrayList;
import java.util.Comparator;

public class Lista {
    private ArrayList<Integer> lista = new ArrayList<>();

    public void setLista(ArrayList<Integer> lista) {
        this.lista = lista;
    }
    public ArrayList<Integer> getLista() {

        return lista;
    }
    public void addListElement(Integer e) {
        lista.add(e);
    }
    public int podajSume() {
        int suma = 0;
        for (Integer i : lista) {
            suma += i;
        }
        return suma;
    }
    public double podajSrednia() {
        return podajSume() / lista.size();
    }
    public double podajMediane() {
        double median = 0;
        lista.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return 1;
                } else if (o2 > o1) {
                    return -1;
                }
                return 0;
            }
        });
        if(lista.size()%2==0) {
            median=(double)((lista.size()/2)+(lista.size()/2)-1)/2;
        } else {
            median=(double)(lista.size())/2;
        }
        return median;
    }
    public int podajWartoscMin() {
        int minValue = lista.get(0);
        for (Integer i : lista) {
            if(i<minValue) {
                minValue=i;
            }
        }
        return lista.indexOf(minValue);
    }
    public int podajWartoscMax() {
        int maxValue = lista.get(0);
        for (Integer i : lista) {
            if(i>maxValue) {
                maxValue=i;
            }
        }
        return lista.indexOf(maxValue);
    }
}