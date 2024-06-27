package Basico.test;

import Basico.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros(1,2);
        calculadora.subDoisNumeros(1,2);
        calculadora.multDoisNumeros(1,2);
        calculadora.divideDoisNumeros(2,3);
        double res = calculadora.divideDoisNumeros2(2,2);
        System.out.println(res);
    }

}
