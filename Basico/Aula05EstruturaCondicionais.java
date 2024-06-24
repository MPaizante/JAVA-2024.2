package Basico;

public class Aula05EstruturaCondicionais {
    public static void main(String[] args) {
        int idade = 18;
        boolean autorizado = idade >=18;
        if (autorizado){
            System.out.println("Autorizado!");
        }
        else {
            System.out.println("Não autorizado");
        }
        boolean c = false;
        if(c){
            System.out.println("Dentro de algo que nuna deve ser feito!");
        }
        System.out.println("Fora do if");
    }
}
