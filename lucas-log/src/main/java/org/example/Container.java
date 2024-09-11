package org.example;

public class Container implements Transportador {
    String modelo;
    double capacidade;

    @Override
    public void transportar() {
        System.out.println("container");
    }
}
