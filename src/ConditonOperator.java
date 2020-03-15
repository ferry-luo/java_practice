public class ConditonOperator {
    public static void main(String[] args){
        int a = 10;
        int b;
        //条件运算符
        b = (a == 1)?20:30;  // 如果 a 等于 1 成立，则设置 b 为 20，否则为 30
        System.out.println("b的值为："+b);
        b = (a == 10)?20:30;    // 如果 a 等于 10 成立，则设置 b 为 20，否则为 30
        System.out.println("b的值为："+b);
    }
}
