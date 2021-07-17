package chap07;

public class Excercise05 { //바깥의 class 는 static클래스라서 static을 붙이면 에러가 난다.//static이 아닌 클래스는 static클래스의 부모클래스가 될 수 없다
     static class Parent {//innerclass는 static class가 될수도 있고, static이 아닌 클래스일수도있다.//반드시 부모의 인스턴스가 있는 경우만 해당 inner class의 인스턴스를 만들 수 있다.는 제약 조건을 명시할 수 있다.// 그러므로 반드시 (부모의 인스턴스).new 로 생성해야 한다.
        String name;
        public Parent(String name){
            this.name = name;
        }
    }

     static class Child extends Parent{
        public int getStudentNo() {//inner static class - 부모의 인스턴스의 생성과는 상관없이 독립적인 생성이 가능하다.
            return studentNo;
        }

        private int studentNo;

        public Child(String name, int studentNo){
            super(name);
            this.studentNo = studentNo;
        }
    }

}

class executeclass{//nonstatic class는 innerclass에서만 가능하다.//내부 클래스를 선언할때는 static키워드를 붙여줘야한다. static키워드를 사용하고 싶지 않다면 내부클래스보다는 별개의 클래스를 만드는 것이 좋다.
        public static void main(String[] args) {
            Excercise05.Child child = new Excercise05.Child("서은",1);
            System.out.println(child.name);
            System.out.println(child.getStudentNo());
        }
}
