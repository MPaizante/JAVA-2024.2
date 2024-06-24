package Basico;

public class Aula08EstruturaCondicionaisSwitch {
    public static void main(String[] args) {
        byte dia = 2;
        switch (dia){
            case 1:
                System.out.println("Domingo!");
                break;
            case 2:
                System.out.println("segunda!");
                break;
            case 3:
                System.out.println("terça!");
                break;
            case 4:
                System.out.println("quarta!");
                break;
            case 5:
                System.out.println("quinta!");
                break;
            case 6:
                System.out.println("sexta!");
                break;
            case 7:
                System.out.println("sabado!");
                break;
            default:
                System.out.println("Dia nenhum!");
        }

        byte d = 1;
        if(d == 7 || d == 1){
            System.out.println("Não é dia util");
            if(d == 1){
                System.out.println("Domingo!");
            }else {
                System.out.println("Sabado!");
            }
        } else if (d >1 && d<7) {
            System.out.println("Dia util");

        }else {
            System.out.println("ERRO");
        }

    }
}
