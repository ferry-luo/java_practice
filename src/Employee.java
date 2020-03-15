import java.io.*;
public class Employee {
    String name;
    int age;
    String designation;
    float salary;
    //有参构造函数
    public Employee(String Name){
        name = Name;
    }
    public void empAge(int Age){
        age = Age;
    }
    public void empDesignation(String Designation){
        designation = Designation;
    }
    public void empSalary(float Salary){
        salary = Salary;
    }
    public void printemp(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("职位："+designation);
        System.out.println("薪资："+salary);
    }
}
