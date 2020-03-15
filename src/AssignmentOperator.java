public class AssignmentOperator {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = a + b;
        //赋值运算符
        c += a;
        System.out.println("c+=a:"+c);
        c -= a;
        System.out.println("c-=a:"+c);
        c *= a;
        System.out.println("c*=a:"+c);
        c /= a;
        System.out.println("c/=a:"+c);
        c %= a;
        System.out.println("c%=a:"+c);
        c <<= 2;
        System.out.println("c<<=2:"+c);
        c >>= 2;
        System.out.println("c>>=2:"+c);
        c &= a;
        System.out.println("c&=a:"+c);
        c ^= a;
        System.out.println("c^=a:"+c);
        c |= a;
        System.out.println("c|=a:"+c);
    }
}
