public class IntroduceQiaobiluo extends Introduce{
    protected String hobby;
    public IntroduceQiaobiluo(String ch_name,int age,double weight,String hobby){
        super(ch_name,age,weight);
        set_hobby(hobby);
    }
    public String get_hobby(){
        return hobby;
    }
    public void set_hobby(String Hobby){
        hobby = Hobby;
    }
    public void say(){
        System.out.print("大家好，我是练习时长两年半的个人练习生"+get_ch_name()+"，年龄"+get_age()+"岁，"+"体重："+get_weight()+"kg。");
        System.out.println("我的爱好是"+get_hobby()+"。");
    }
    public static void main(String[] args){
        IntroduceQiaobiluo i = new IntroduceQiaobiluo("乔碧萝",40,100,"骗小哥哥的礼物");
        i.say();
    }
}