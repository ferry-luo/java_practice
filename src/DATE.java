import java.util.Date;  //要导入了才能用
import java.text.*;
public class DATE {
    public static void main(String[] args){
        Date shijian = new Date();
        System.out.println(shijian);
        SimpleDateFormat t = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   //大写的HH表示24小时制。
                                                    // SimpleDateFormat 允许你选择任何用户自定义日期时间格式来运行。
        System.out.println(t.format(shijian));
        //printf 方法可以很轻松地格式化时间和日期，以%t开头，以转换符（c、F、D、r、T、R）结尾
        //c的使用
        System.out.printf("全部日期和时间信息：%tc\n",shijian);   //JAVA的printf函数，用\n和%n都能进行换行
        //F的使用
        System.out.printf("年-月-日格式：%tF%n",shijian);
        //D的使用
        System.out.printf("月/日/年格式：%tD%n",shijian);
        //r的使用
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",shijian);
        //T的使用
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n",shijian);
        //R的使用
        System.out.printf("HH:MM格式（24时制）：%tR",shijian);
    }
}
