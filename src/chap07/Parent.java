package chap07;

public class Parent {
    public void method1(){
        System.out.println("Parent-method1()");
    }

    public void method2(){
        System.out.println("Parent-method2()");
    }
}


class Child extends Parent{

    @Override
    public void method2(){
        System.out.println("Child-method2()");
    }

    public void method3(){
        System.out.println("Child-method3()");
    }

}