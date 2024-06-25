package Basico;

public class Aula09EstruturaRepeticao02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 ==0) {
                System.out.println(i);
            }
        }
        System.out.println("===================================");
        int max = 50;
        for (int i = 1; i < max; i++) {
            if (i < 5) {
                System.out.println(i);
            }
            else {
                break;
            }
        }
        System.out.println("==============");
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }



    }
}
