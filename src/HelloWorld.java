public class HelloWorld {
    String en_name;
    public  HelloWorld(String name){
        System.out.println("你好！"+name);
    }   //System是系统类,out是标准输出对象
    public void setname(String e){
        en_name = e;
    }
    //Java 程序的 main() 方法必须设置成公有的，否则，Java 解释器将不能运行该类。
    public static void main(String[] args){ //public为修饰符，void为返回值类型，main为方法名
        HelloWorld x = new HelloWorld("世界");
    }
}
