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
        String [] nomes = new String[4];
        nomes[0] = "A";
        nomes[1] = "B";
        nomes[2] = "C";
        nomes[3] = "D";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        System.out.println("=============================================");
        int [] n = new int[3];
        int [] n2 = {1,2,3,4,5};
        int [] n3 = new int[]{6,7,8,9,10};

        for (int i = 0; i < n3.length; i++) {
            System.out.println(n3[i]);

        }
        
}
}
