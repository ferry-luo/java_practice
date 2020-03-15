public class STRING {
    public static void main(String[] args){
        String wangzhan = "www.bilibili.com";
        String say = "我的名字是：";
        String myname = "Ferry";
        String s1 = "娱乐网站1：";
        String s2 = "娱乐网站2：";
        String s3 = "Hua";
        String s4 = "Jie";
        String s5 = "Jun";

        int len = wangzhan.length();
        System.out.print("网站的长度为："+len);
        System.out.print("\n");
        String s = say.concat(myname);
        //第一种写法，直接在输出函数中使用concat方法连接字符串
        System.out.print(say.concat(myname));
        System.out.print("\n");
        //第二种方法，先使用concat方法连接字符串，再赋给一个变量，最后输出变量
        System.out.print(s);
        System.out.print("\n");

        System.out.print("①"+s1+"www.taobao.com"+"\n"); //直接在这最后插入换行符和 System.out.print(s); 是一样的
        System.out.print("②"+s2+"www.jingdong.com"+"\n");

        System.out.printf("第一个人是："+
                "%s,第二个人是："+
                "%s,第二个人是："+
                "%s",s3,s4,s5); //printf继承了C语言中printf的一些特性，可以格式化输出
    }
}
