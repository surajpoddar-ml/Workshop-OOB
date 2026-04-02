package Week4;

class Parent5 {
    private String privateVar = "I am Private";
    protected String protectedVar = "I am Protected";
    public String publicVar = "I am Public";

    void showPrivate() {
        System.out.println("Accessing from Parent: " + privateVar);
    }
}

class Child5 extends Parent5 {
    void testAccess() {
      
        System.out.println("Accessing Protected: " + protectedVar);
        System.out.println("Accessing Public: " + publicVar);
        System.out.println("Data entry by: Suraj");
    }
}

public class Question5 {

    public static void main(String[] args) {
        Child5 obj = new Child5();
        
        System.out.println("Subclass Access Test");
        obj.testAccess();
        
        System.out.println(" Parent Access Test");
        obj.showPrivate(); 
    }

}