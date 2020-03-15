public interface Sports {
    public void basketball();
    public void football();
}

interface tiyu1 extends Sports{
    public void volleyball();
    public void badminton();
        }

//tiyu1接口自己声明了2个方法，从Sports接口继承了2个方法，这样，实现tiyu1接口的类必须要实现4个方法
