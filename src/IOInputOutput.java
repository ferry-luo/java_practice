import java.io.*;
public class IOInputOutput {
    public static void main(String[] args){
        try{
            byte[] swrite = {'F','e','r','r','y',1,2,3};    //一个英文字母占一个字节，一个汉字占2个字节，如果数组中有汉字，则会出错
            OutputStream o = new FileOutputStream("H:/java_test_io.txt");   //FileOutputStream类用来创建一个文件并向文件中写数据。
            for(int i=0;i<swrite.length;i++){
                o.write(swrite[i]);
            }
            o.close();  //关闭此文件输入流并释放与此流有关的所有系统资源。

            FileInputStream in = new FileInputStream("H:/java_test_io.txt");    //创建一个输入流对象来读取文件
            int size = in.available();  //available()方法返回下一次对此输入流调用的方法可以不受阻塞地从此输入流读取的字节数。返回一个整数值。
            for(int j=0;j<size;j++){
                char br = (char) in.read();
                System.out.print(br);
            }
            in.close();
        }catch (IOException e){
            System.out.println("异常");
        }
        //以上代码由于是二进制写入，可能存在乱码，可以使用以下代码实例来解决乱码问题：
        try{
            FileOutputStream ou = new FileOutputStream("H:/java_test2_io.txt");
            OutputStreamWriter f = new OutputStreamWriter(ou,"gbk");
            f.append("嗨喽，小哥哥`");
            f.append("我是关注你很久了的小姐姐。");
            f.close();

            FileInputStream IN = new FileInputStream("H:/java_test2_io.txt");
            InputStreamReader r = new InputStreamReader(IN,"gbk");
            int size = IN.available();
            for(int j=0;j<size;j++) {
                char sb = (char) r.read();
                StringBuffer ss = new StringBuffer();   //使用构造方法进行初始化，先创一个空的对象
                ss.append(sb);  //在这个for中，把读取到的文件中每个字符从第一个到最后一个加入到ss中
                System.out.print(ss.toString());
            }
            IN.close();
        }catch(IOException e){
            System.out.println("异常");
        }
    }
}
//附：StringBuffer和String属于不同的类型，也不能直接进行强制类型转换，下面的代码都是错误的：
//
//StringBuffer s = "abc"; //赋值类型不匹配
//StringBuffer s = (StringBuffer)"abc"; //不存在继承关系，无法进行强制类型转换
//
//StringBuffer对象和String对象之间的互转的方式如下：
//方法一：
//String s = "abc";
//StringBuffer sb1 = new StringBuffer(s); //String转换为StringBuffer
//方法二:其实也就是省略一行代码而已
//StringBuffer sb1 = new StringBuffer("abc");
//最后进行转换
//String ss = sb1.toString(); //StringBuffer转换为String
//println(ss)
