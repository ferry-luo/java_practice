package animals;

public class Test_interface_Animal implements Animal {
    public void eat(){
        System.out.println("动物在进食");
    }
    public void sleep(){
        System.out.println("动物在休息");
    }
    public static void main(String[] args){
        Test_interface_Animal t = new Test_interface_Animal();
        t.eat();
        t.sleep();
    }
}