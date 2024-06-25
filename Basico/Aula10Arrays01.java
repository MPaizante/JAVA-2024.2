package Basico;

public class Aula10Arrays01 {
    public static void main(String[] args) {
        int [] idades = new int[10];
        for (int i = 0; i < idades.length; i++) {
            idades[i] = i;
        }
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
    }
}
