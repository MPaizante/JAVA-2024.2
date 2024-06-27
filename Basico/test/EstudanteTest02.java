package Basico.test;

import Basico.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';
        System.out.println("Nome: "+estudante.nome);
        System.out.println("Idade: "+ estudante.idade);
        System.out.println("Sexo: "+estudante.sexo);
        System.out.println("---------------------");
        estudante2.nome = "Zoro";
        estudante2.idade = 218;
        estudante2.sexo = 'F';
        System.out.println("Nome: "+estudante2.nome);
        System.out.println("Idade: "+ estudante2.idade);
        System.out.println("Sexo: "+estudante2.sexo);
    }

}
