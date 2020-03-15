public class Panda extends Animals{
    int age;
    String looks;
    public Panda(String name,String food,int age,String looks){
        super(name,food);
        set_looks(looks);
        set_age(age);
    }
    public void set_looks(String face){
            looks = face;
    }
    public void set_age(int Age){
        age = Age;
    }
    public String get_looks(){
        return looks;
    }
    public int get_age(){
        return age;
    }
    public void display(){
        System.out.println("非常地"+get_looks());
        System.out.println("现在"+get_age()+"岁");
    }
}