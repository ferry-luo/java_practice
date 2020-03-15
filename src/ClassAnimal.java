class ClassAnimal {
    public String name;
    public int id;
    public ClassAnimal(String myname, int myid) {
        name = myname;
        id = myid;
    }
    public ClassAnimal(){
        System.out.println("父类的无参构造器");
    }


    public void eat() {
        System.out.println(name + "正在吃东西");
    }

    public void sleep() {
        System.out.println(name + "正在睡觉");
    }

    public void introduction() {
        System.out.println("大家好，我的编号是" + id + "，姓名是" + name + "。");
    }
}
//子类拥有父类非 private 的属性、方法。
//
//子类可以拥有自己的属性和方法，即子类可以对父类进行扩展。
//
//子类可以用自己的方式实现父类的方法。
//
//Java 的继承是单继承，需要注意的是 Java 不支持多继承(也就是例如C类继承B类还继承A类），但是可以多重继承，单继承就是一个子类只能继承一个父类，多重继承就是，例如 A 类继承 B 类，B 类继承 C 类，所以按照关系就是 C 类是 B 类的父类，B 类是 A 类的父类，这是 Java 继承区别于 C++ 继承的一个特性。
//
//提高了类之间的耦合性（继承的缺点，耦合度高就会造成代码之间的联系越紧密，代码独立性越差）。

class ClassPenguin extends ClassAnimal{
    ClassPenguin(String name,int id){
        super(name,id);
    }
    //重写是子类对父类的允许访问的方法的实现过程进行重新编写, 返回值和形参都不能改变。即外壳不变，核心重写！
    //
    //重写的好处在于子类可以根据需要，定义特定于自己的行为。 也就是说子类能够根据需要实现父类的方法。
    //
    //重写方法不能抛出新的检查异常或者比被重写方法申明更加宽泛的异常。例如： 父类的一个方法申明了一个检查异常 IOException，但是在重写这个方法的时候不能抛出 Exception 异常，因为 Exception 是 IOException 的父类，只能抛出 IOException 的子类异常。
    //以下eat方法就进行了重写
    public void eat(){
        System.out.println(name+"正在吃的是中餐");
    }
    //以下eat1是原封不动地调用父类的eat方法，通过使用super关键字
    public void eat1(){
        super.eat();
    }
    //在其他地方主函数（主函数用到了修饰符static）要调用这个类的watch方法，这里修饰符必须为static，否则会提示无法调用非静态方法
    static void watch(String ename,String depart,int salary){
        System.out.println(ename+"正在看电视,"+"他的职位是"+depart+",月薪是"+salary);
        }
    }
//子类是不继承父类的构造器（构造方法或者构造函数）的，它只是调用（隐式或显式）。如果父类的构造器带有参数，则必须在子类的构造器中显式地通过 super 关键字调用父类的构造器并配以适当的参数列表。
//
//如果父类构造器没有参数，则在子类的构造器中不需要使用 super 关键字调用父类构造器，系统会自动调用父类的无参构造器。
class ClassLion extends ClassAnimal{
    ClassLion(){
        System.out.println("确定在打印这句之前有打印“父类的无参构造器”");
    }
}

