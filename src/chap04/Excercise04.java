package chap04;

public class Excercise04 {
    public static void main(String[] args){
        double J1 = 1;
        double J2 = 1;

        while(J1 + J2 != 5){
            J1 = (int)(Math.random() * 6)+1;
            J2 = (int)(Math.random() * 6)+1;

        }
        System.out.println(J1);
        System.out.println(J2);
    }
}
