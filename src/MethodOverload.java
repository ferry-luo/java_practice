//被重载的方法必须改变参数列表(参数个数或类型不一样)；
//被重载的方法可以改变返回类型；
//被重载的方法可以改变访问修饰符；
//被重载的方法可以声明新的或更广的检查异常；
//方法能够在同一个类中或者在一个子类中被重载。
//无法以返回值类型作为重载函数的区分标准。
public class MethodOverload {
    public int t(){
        System.out.println("返回的是整型");
        return 2;
    }

    //改变返回类型以及参数列表
    public void t(int a){
        System.out.println(a);
        System.out.println("不返回任何类型，void");
    }

    public char t(int a,String s){
        System.out.println("有"+a+"个苹果在"+s+"手里");
        return  'o';
    }

    public String t(String name,float salary){
        System.out.println(name+"的月薪是"+salary+"元");
        return name;    //由于name的类型和函数返回类型一样，所以可以直接返回name指向的内容
    }

    public static void main(String[] args){
        MethodOverload x = new MethodOverload();
        x.t();
        x.t(99);
        x.t(4,"bob");
        x.t("杰",9000);
    }
}
