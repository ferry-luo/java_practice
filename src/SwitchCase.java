public class SwitchCase {
    public static void main(String[] args){
        char grade = 'D';
        int i = 1;
        short j = 5;
        switch(grade){
            case 'A':
                System.out.println("你的等级是优秀");
                break;
            case 'B':
                System.out.println("你的等级是良好");
                break;
            case 'C':
                System.out.println("你的等级是一般");
                break;
            case 'D':
                System.out.println("你的等级是及格");
                break;
            default:
                System.out.println("你的等级是不及格");
        }
        System.out.println("你的水平在"+grade);
        switch(i){
            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");    //这里匹配成功，从此case开始，后面case的值都会输出
            case 2:
                System.out.println("2");
            default:
                System.out.println("默认");
        }
        switch(j){
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            default:
                System.out.println("默认");
        }
    }
}
