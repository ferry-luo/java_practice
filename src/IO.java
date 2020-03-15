//Java.io 包几乎包含了所有操作输入、输出需要的类。所有这些流类代表了输入源和输出目标。
//
//Java.io 包中的流支持很多种格式，比如：基本类型、对象、本地化字符集等等。
//
//一个流可以理解为一个数据的序列。输入流表示从一个源读取数据，输出流表示向一个目标写数据。
//
//Java 为 I/O 提供了强大的而灵活的支持，使其更广泛地应用到文件传输和网络编程中。
import java.io.*;
public class IO {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a;
        System.out.println("输入字符串完毕后按回车键，当输入end则结束");
        do{
            a = br.readLine();
            System.out.println(a);
        }while(!a.equals("end"));

        char c;
        System.out.println("输入字符按回车键，当输入q则结束");
        do{
            c = (char) br.read();
            System.out.print(c);
        }while(c!='q');
        System.out.print('\n');
        //控制台的输出由 print( ) 和 println() 完成。这些方法都由类 PrintStream 定义，System.out 是该类对象的一个引用。
        //
        //PrintStream 继承了 OutputStream类，并且实现了方法 write()。System.out.write() 就可以用来往控制台写操作。
        char b;
        b = 'A';
        System.out.write(b);
        System.out.write('\n'); //System.out.write(b);和System.out.write('\n');等价于System.out.println(b)

        BufferedWriter br2 = new BufferedWriter(new OutputStreamWriter(System.out));
        char x = '完';
        System.out.println("下面将会写入字符");
        br2.write(x);
        System.out.println(x);
        }
    }

