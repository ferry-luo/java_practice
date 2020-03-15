public abstract class AbstractMethod {
    abstract void m();  //抽象方法的声明以分号结尾。有抽象方法，则该类一定要声明为抽象类。但抽象类可以不包含抽象方法.声明抽象类的唯一目的是为了将来对该类进行扩充。
    //如果你想设计这样一个类，该类包含一个特别的成员方法，该方法的具体实现由它的子类确定，那么你可以在父类中声明该方法为抽象方法。
    //
    //Abstract 关键字同样可以用来声明抽象方法，抽象方法只包含一个方法名，而没有方法体。
    //
    //抽象方法没有定义，方法名后面直接跟一个分号，而不是花括号。
}

class son extends AbstractMethod{
    void m(){
        System.out.println("m方法的具体实现由子类实现");
    }
}
