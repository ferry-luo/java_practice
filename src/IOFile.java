import java.io.File;
public class IOFile {
    public static void main(String[] args){
        String dirname = "H:\\java_test_file";  //这里用两个反斜杠才能表示一个反斜杠的意思。另外，用一个正斜杠也能表示路径分隔符
        File d = new File(dirname); //创建一个文件对象
        d.mkdirs(); //调用mkdir（）方法创建目录

        if(d.isDirectory()){
            System.out.println("现在的目录是："+dirname);
            String a[] = d.list();  //目录下面肯定是若干文件、文件夹这么一个清单（或者理解成列表）,这清单是字符串类型
            for(int i=0;i<a.length;i++){
                File f = new File(dirname+"\\"+a[i]);
                if(f.isDirectory()){
                    System.out.println(a[i]+"是一个目录");
                }
                else{
                    System.out.println(a[i]+"是一个文件");
                }
            }
        }
        else{
            System.out.println(dirname+"这里不是一个目录");
        }
        //调用删除方法
        File x = new File("H:/java供测试删除的文件夹");
        deletefile(x);
    }
    //如何删除一个文件夹或文件  ps:前提下该目录下没有文件、文件夹——也就是删除空目录
    //构造删除方法
    public static void deletefile(File folder){
        File[] files = folder.listFiles();  //获取要操作的目录下的文件、文件夹 清单
        //第一步：判断这个目录下清单（也就是所有目录）是不是空的。是空的就直接delete
        if(files!=null){
            //第二步：利用加强for循环再嵌套if判断清单中的每个元素。元素存在（也就是存在文件夹），就再调用这个删除函数，此元素作为函数中新的参数。——也就是一层一层检查，直到所有的内容都被删除。最后方可删掉操作者需要删的目录
            for(File f:files){
                //意思是例如H盘下的java_test目录作为删除函数的参数，它非空，其下面有若干文件夹（假设是叫 文件夹1、文件夹2、文件夹3）。对清单中每一个元素（名称1、名称2、名称3）检查，名称1、名称2、名称3 是目录，所以就再调用删除函数；
                if(f.isDirectory()){
                    deletefile(f);
                }
                //否则（例如名称1不是文件夹，显然就直接删除），则delete
                else{
                    f.delete();
                }
            }
        }
        folder.delete();

    }
}
