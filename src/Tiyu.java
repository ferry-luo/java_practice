public class Tiyu implements tiyu2 {
    //当类实现接口的时候，类要实现接口中所有的方法。否则，类必须声明为抽象的类。
    //例如此Tiyu类实现接口tiyu2，要实现tiyu2中所有方法（共4个）
    public void basketball() {
        System.out.println("小明，1414001，18岁，喜欢打篮球");
    }

    public void football() {
        System.out.println("小刚，1414002，19岁，喜欢踢足球");
    }

    public void volleyball() {
        System.out.println("小红，1414003，17岁，喜欢打排球");
    }

    public void badminton() {
        System.out.println("小燕，1414004，19岁，喜欢打羽毛球");
    }

    public void introduce_sports_info(String name, String id, String age, String events) {
        System.out.println("介绍的体育项目参与人信息，包含：" + name + "，" + id + "，" + age + "，" + events + "。");
    }

    public static void main(String[] args) {
        Tiyu T = new Tiyu();
        T.basketball();
        T.football();
        T.volleyball();
        T.badminton();
        T.introduce_sports_info("姓名", "学号", "年龄", "球类运动");
    }
}
