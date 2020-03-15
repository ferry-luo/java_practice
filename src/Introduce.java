public abstract class Introduce {
    protected String ch_name;
    protected int age;
    protected double weight;
    public Introduce(String Name,int Age,double Weight){
        this.ch_name = Name;
        this.age = Age;
        this.weight = Weight;
    }
    public String get_ch_name(){
        return ch_name;
    }
    public int get_age(){
        return age;
    }
    public double get_weight(){
        return weight;
    }
}
