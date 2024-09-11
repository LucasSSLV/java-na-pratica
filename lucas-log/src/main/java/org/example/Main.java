package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
    Carro carro01 = new Carro("ANA0P23", 2018, "gasolina");

    carro01.adicionaAbastecimento("posto1", "cleiton", 158.68);
    carro01.getAbastecimentos();
    carro01.getFullInfos();
    }
}