public class Puppy {
    int puppyAge;/*这是一个成员变量*/
    public Puppy(String name){
        // 这个构造器仅有一个参数：name
        System.out.println("小狗的名字是 : " + name );
    }

    public void setAge( int age ){
        puppyAge = age;
    }

    public int getAge( ){
        System.out.println("小狗的年龄为 : " + puppyAge );
        return puppyAge;
    }

    public static void main(String[] args){
        /* 创建对象 */
        Puppy x = new Puppy("tommy" );
        /* 调用setAge方法来设定age ，于是puppyage指向的内容就是设定的那个值*/
        x.setAge( 2 );
        /*访问成员变量 */
        System.out.println("年龄为: " + x.puppyAge );
        /* 调用getAge方法获取age */
        x.getAge( );
    }
}
