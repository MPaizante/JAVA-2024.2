package Basico.test;

import Basico.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';
        System.out.println("Nome: "+estudante.nome);
        System.out.println("Idade: "+ estudante.idade);
        System.out.println("Sexo: "+estudante.sexo);
        System.out.println(estudante);

    }
}
