public class IntroduceJie extends Introduce{
    protected String appearence;
    protected String hobby;
    public IntroduceJie(String ch_name,int age,double weight,String appearence,String hobby){
        super(ch_name,age,weight);
        set_appearence(appearence);
        set_hobby(hobby);
    }
    public String get_appearence(){
        return appearence;
    }
    public void set_appearence(String Appearence){
        appearence = Appearence;
    }
    public String get_hobby(){
        return hobby;
    }
    public void set_hobby(String Hobby){
        hobby = Hobby;
    }
    public void say(){
        System.out.println("大家好，我的英文名是"+get_ch_name()+"，今年"+get_age()+"岁，"+"体重"+get_weight()+"kg，我看起来很"+get_appearence()+"，我的爱好是"+get_hobby());
    }
    public static void main(String[] args){
        IntroduceJie i = new IntroduceJie("JiegaoLiu",24,50,"瘦小","到处看靓女。");
        i.say();
    }
}
