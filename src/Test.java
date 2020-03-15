public class Test {
        public static void main(String[] args){
            //①创建ClassAnimal对象，直接调用父类ClassAnimal的eat()方法
            ClassAnimal a = new ClassAnimal("动物",00);
            a.eat();
            //②创建ClassPenguin对象，通过调用子类ClassPenguin的eat1()方法，间接地调用父类的eat()方法--因为eat1()是调用了父类的方法
            ClassPenguin b = new ClassPenguin("企鹅",11);
            b.eat1();
            //上面的①和②实际上都是运行父类对象的eat方法

            //下面这个，就是运行在子类重写过的（变成子类独特的）eat方法，并不是运行父类的eat方法
            b.eat();

            //调用子类ClassPenguin独有的方法
            ClassPenguin.watch("jie","测试工程师",9000);
            //调用子类ClassLion的方法
            ClassLion c = new ClassLion();
        }
}
