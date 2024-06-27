package Basico.dominio;

public class Calculadora {
    public void somaDoisNumeros(int a, int b){
        System.out.println(a+b);
    }
    public void subDoisNumeros(int a, int b){
        System.out.println(a-b);
    }

    public void multDoisNumeros(int a,int b){
        System.out.println(a*b);
    }
    public void divideDoisNumeros(double a, double b){
        System.out.println(a/b);
    }
    public double divideDoisNumeros2(double a, double b){
        if(a == 0 || b ==0){
            return 0;
        }
        return a/b;
    }

}
