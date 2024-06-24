package Basico;

public class Aula06EstruturaCondicionais {
    public static void main(String[] args) {
        // idade for menor que 15 infatil
        // idade >= 15 e idade < 18 juvenil
        // idade >= 18 adulto
        int idade = 18;
        if(idade >=18){
            System.out.println("Adulto");
        }else {
            if(idade>=15){
                System.out.println("Juvenil");
            }else{
                System.out.println("Infatil");
            }
        }
        // ou
        if(idade > 17) {
            System.out.println("Adutlo!");
        }else if(idade <=17 && idade >=15){
            System.out.println("Juvenil");
        } else if (idade <15) {
            System.out.println("Intatil");
        }


    }
}
