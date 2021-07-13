package chap05;

public class Excercise07 {
    public static void main(String[] args) {
        int max =0;
        int[] array = { 1,5,3,8,2 };
        max = array[0];
        for(int i=0;i<=4;i++){
            if(max<array[i]) max=array[i];
        }
        System.out.println(max);
    }
}
