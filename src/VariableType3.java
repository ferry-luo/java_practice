public class VariableType3 {
    private static double salary;
    public static final String department = "开发工程师";    //在Java中定义全局常量，通常使用public static final修饰，这样的常量只能在定义时被赋值
                                                            // （详解：一方面，fianl关键字用于常量声明，一旦被设定，就不可再改变值；另一方面，static用于类变量，类变量位置就在类中方法外。结合起来理解就为只能在定义时赋值。
                                                            //当其他类需要访问此变量则用VariableType3.department
    public static void main(String[] args){
        salary = 10000;
        System.out.println(department+"平均薪资："+salary);
    }
}

/*
Java中，可以使用访问控制符来保护对类、变量、方法和构造方法的访问。Java 支持 4 种不同的访问权限。由低到高：private→default→protected→public

default (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。

private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）

public : 对所有类可见。使用对象：类、接口、变量、方法

protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。
*/