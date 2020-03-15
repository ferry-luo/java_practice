//多态是同一个行为具有多个不同表现形式或形态的能力。
//
//多态就是同一个接口，使用不同的实例而执行不同操作
//例如：现实中，如果当前在 Flash 界面下弹出的就是 AS 3 的帮助文档；如果当前在 Word 下弹出的就是 Word 帮助；在 Windows 下弹出的就是 Windows 帮助和支持。
//多态存在需要3个必须的条件：继承、重写、父类引用指向子类对象
public class Polymorphic {
    public static void main(String[] args) {
        show(new cat());    //show方法的参数为cat()类的对象时
        show(new dog());    //show方法的参数为dog()类的对象时
        //等价于以下的细化写法
        cat x = new cat();
        show(x);
        dog y = new dog();
        show(y);
    }
    public static void show(animal a) {
        //当只有一个子类继承抽象父类animal，则不用判断，直接以如下方式调用子类中的方法
        //a.eat();
        //a.work();
        //2个及以上的子类继承抽象父类animal，则需要判断是父类animal的哪个实例（是cat还是dog)
        if (a instanceof cat) {
            cat c = (cat) a;
            c.eat();
            c.work();
        } else if (a instanceof dog) {
            dog d = (dog) a;
            d.eat();
            d.work();
        }
    }
}
//在设计时，还并不知道自己设计的类中方法要实现什么，就设计成抽象类
abstract class animal {
    abstract void eat();    //例如这里就只是个空方法，没有具体的行为表现
    abstract void work();
}

class cat extends animal {
    public void eat() {
        System.out.print("猫喜欢吃的东西：");
        System.out.println("吃鱼类");
    }

    public void work() {
        System.out.print("猫的工作：");
        System.out.println("捕捉老鼠");
    }
}

class dog extends animal {
    public void eat() {
        System.out.print("狗喜欢吃的东西：");
        System.out.println("吃肉和骨头");
    }

    public void work() {
        System.out.print("狗的工作：");
        System.out.println("看家");
    }
}






