public class Animals {
    private String ch_name;
    private String ch_food;
    public Animals(String name,String food){
        this.ch_name = name;
        this.ch_food = food;
    }

    public void introduce(){
        System.out.println("我是"+ch_name+"，喜欢吃的食物是"+ch_food);
    }
}




