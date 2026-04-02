package Week4;

final class FinalClass {
    void show() {
        System.out.println("I am a final class and cannot be extended.");
    }
}



class Parent6 {
    final void finalMethod() {
        System.out.println("This is a final method and cannot be overridden.");
    }
}

class Child6 extends Parent6 {
    void display() {
        System.out.println("Child can use the final method, but cannot change it.");
        finalMethod();
        System.out.println("Verified by: Suraj");
    }
}

public class Question6 {

    public static void main(String[] args) {
        Child6 obj = new Child6();
        obj.display();
        
        FinalClass fc = new FinalClass();
        fc.show();
    }

}