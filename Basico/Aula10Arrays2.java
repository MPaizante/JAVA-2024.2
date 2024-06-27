package Basico;

public class Aula10Arrays2 {
    public static void main(String[] args) {
        //1..12 meses
        //31,28,31,30... dias
        int [][] meses = new int[3][3];

        for (int i = 0; i < meses.length; i++) {
            for (int j = 0; j < meses[i].length; j++) {
                meses[i][j] = i+j;
            }
        }
        System.out.println(meses[2][0]);


        int [] [] arryInt= new int[3][];
        arryInt[0] = new int[]{5,6};
        arryInt[1] = new int[]{1,2,3};
        arryInt[2] = new int[]{1,2,3,4,5,6,7,8,9};
        for (int[] arrayBase:arryInt){
            System.out.println("");
            for(int num:arrayBase){
                System.out.print(num+ " ");
            }
        }

    }
}
