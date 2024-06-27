package Basico.test;

import Basico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro2.nome = "A";
        carro2.modelo = "AB";
        carro2.ano = 2000;

        carro1.nome = "B";
        carro1.modelo = "BA";
        carro1.ano = 2001;


    }
}
