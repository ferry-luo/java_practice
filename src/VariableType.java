public class VariableType {
    static int a = 0;   //类变量(也称为静态变量)：声明在某个类中，独立于方法之外，用static修饰。无论一个类创建了多少个对象，类只拥有类变量的一份拷贝。
                        // 可以通过：类名.变量名的方式访问。
                        //类变量名称一般建议使用大写字母。如果静态变量不是public和final类型，其命名方式与实例变量以及局部变量的命名方式一致。
    int b;  //实例变量：声明在某个类中，独立于方法之外，没有static修饰。实例变量具有默认值。数值型变量的默认值是0，布尔型变量的默认值是false，引用类型变量的默认值是null。变量的值可以在声明时指定，也可以在构造方法中指定；实例变量可以直接通过变量名访问。但在静态方法以及其他类中，就应该使用完全限定名：ObejectReference.VariableName。
    public void pupAge(){
        int age = 0;    //局部变量，必须声明时进行初始化
        age = age + 7;
        System.out.println("他的年龄是："+age+"岁");
    }
    public static void main(String[] args){
        VariableType x = new VariableType();    //创建对象
        x.pupAge();
    }
}
