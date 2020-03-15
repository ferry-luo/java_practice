public class Character {
    public static void ch(char c){
        System.out.print("字符是："+c);
        System.out.print("\n");
    }
    public static void main(String[] args){
        char[] shuzu={'a','b','c'};
        for(char x:shuzu){
            ch(x);
        }
        System.out.println("输出字符完毕");
        System.out.print("如有疑问，请访问\"www.baidu.com\"");    //利用反斜杠转义，\" 表示插入双引号
    }
}
