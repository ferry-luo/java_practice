public class VariableType2 {
    String name;    //静态变量
    private String salary;  //私有变量，仅在该类可见。其他类不能直接得到和设置该变量的值。为了使其他类能够操作该变量，定义了一个 public 方法（也就是setSalary方法）
    private int age;
    //在构造器中对name赋值
    public VariableType2(String ming){
        name = ming;
    }
    //构造函数对salary赋值
    public void setSalary(String Salary){
        salary = Salary;
    }
    //构造函数返回年龄
    public int getAge(int Age){
        return this.age = Age;
    }
    //构造输出函数
    public void printemp(){
        System.out.println("姓名："+name);
        System.out.println("薪资："+salary);
        System.out.println("平均年龄："+age);
    }
    //主函数
    public static void main(String[] args){
        VariableType2 x = new VariableType2("林");   //Java中使用 new关键字 加上 构造方法，来创建一个对象
        x.setSalary("一百万");
        x.getAge(26);
        x.printemp();
    }
}
