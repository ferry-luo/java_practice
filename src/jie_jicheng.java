public class jie_jicheng extends Employee1
{
    private double salary;
    //jie_jicheng类的构造函数
    public jie_jicheng(String name, String address, int number, double salary)
    {
        super(name, address, number);//有了这一句，便于调用父抽象类的方法，就不用再写一堆代码实现某某功能。例如最下面的accured_wages函数就直接调用了父类的getName方法
        setSalary(salary);//这里就是调用自己类独特的方法setSalary
    }
    //给定（设置）工资函数
    public void setSalary(double xinzi)
    {
        if(xinzi >= 0)
        {
            salary = xinzi;
        }
    }
    //获取工资函数
    public double getSalary()
    {
        return salary;
    }
    //输出工资函数
    public void accrued_wages()
    {
        System.out.println("工资应付给：" + getName());
        System.out.println("工资标准是"+getSalary());
        System.out.println("实发工资是："+(getSalary()-750));
    }
}


