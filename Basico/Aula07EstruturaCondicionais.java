package Basico;

public class Aula07EstruturaCondicionais {
    public static void main(String[] args) {
        double salario = 1000;
        String mensagemDoar = "Doar 500 reais";
        String mensagemNaoDoar = "Sem grana";
        if( salario > 5*1000){
            System.out.println(mensagemDoar);
        }else {
            System.out.println(mensagemNaoDoar);
        }
        // operador ternario |variavel = (condição) ? verdadiro:falso;|

        String resultado = salario > 5000 ? "Doar!":"Não Doar!";
        System.out.println(resultado);

    }
}
