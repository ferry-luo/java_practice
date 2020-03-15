//类使用implements关键字实现接口。在类声明中，Implements关键字放在class声明后面。语法：...implements 接口名称[, 其他接口名称, 其他接口名称..., ...]

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
