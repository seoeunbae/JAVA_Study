package chap04;

public class Excercise03 {
    public static void main(String[] args) {
        int total =0;

        for(int i=0;i<=100;i++) {
            if (i % 3 == 0) total += i;
        }
        System.out.println("3의 배수의 합: "+total);
    }
}
