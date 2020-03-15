import java.util.Scanner;
public class SCANNER {
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("next方式接收如下：");
        if(s1.hasNext()){
            String str1 = s1.next();
            System.out.println("您输入的数据为："+str1);
        }

        Scanner s2 = new Scanner(System.in);
        System.out.println("nextLine方式接收如下：");
        if(s2.hasNextLine()){
            String str2 = s2.nextLine();
            System.out.println("您输入的数据为："+str2);
        }
        //Scanner类还支持int、float类型的数据
        Scanner s3 = new Scanner(System.in);
        System.out.println("请输入数字：");
        if(s3.hasNextInt()){
            int i1 = s3.nextInt();
            System.out.println("您输入的数字为："+i1);
        }
        else if(s3.hasNextFloat()){
            float f1 = s3.nextFloat();
            System.out.println("您输入的数字为："+f1);
        }
        else{
            System.out.println("您输入的既不是整数，也不是浮点型数字");
        }

        //利用while循环判断多个数字是否输入完毕
        Scanner d1 = new Scanner(System.in);
        System.out.println("请输入数字：");
        double sum = 0;
        int c = 0;
        while(d1.hasNextDouble()){
            double x = d1.nextDouble();
            c++;
            sum += x;
        }
        System.out.println("您输入的"+c+"个数的和为："+sum);
        System.out.println("您输入的"+c+"个数的平均值为："+sum/c);
    }
}
//next():
//1、一定要读取到有效字符后才可以结束输入。
//2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
//3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
//4、next() 不能得到带有空格的字符串。
//
//nextLine()：
//1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
//2、可以获得空白。
