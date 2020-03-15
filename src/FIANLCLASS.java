//在访问修饰符后面接final，则任何其他类无法继承此类。从final字面意思可理解为最终类
public  final class FIANLCLASS {
    String name;
    double wages;
    public FIANLCLASS(String en_name,double salary){
        //this代表当前类（或者说对象自身），与python中的self含义一致
        this.name = en_name;    //例如这里this.name就等价于FIANLCLASS.name
        this.wages = salary;
    }
}
