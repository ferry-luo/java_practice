public class AutoTypeTransform {
    public static void main(String[] args){
        char c1 = 'a';
        int i1 = c1;
        System.out.println("i1的值为："+i1);
        char c2 = 'A';
        int i2 = c2;
        int i3 = i1-i2;
        System.out.println("i2的值为："+i2);
        System.out.println("i1减去i2的值为："+i3);
    }
}
