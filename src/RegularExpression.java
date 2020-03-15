import java.util.regex.*;   /*java.util.regex 包主要包括以下三个类：

Pattern 类：
pattern 对象是一个正则表达式的编译表示。Pattern 类没有公共构造方法。要创建一个 Pattern 对象，你必须首先调用其公共静态编译方法，它返回一个 Pattern 对象。该方法接受一个正则表达式作为它的第一个参数。

Matcher 类：
Matcher 对象是对输入字符串进行解释和匹配操作的引擎。与Pattern 类一样，Matcher 也没有公共构造方法。你需要调用 Pattern 对象的 matcher 方法来获得一个 Matcher 对象。

PatternSyntaxException：
PatternSyntaxException 是一个非强制异常类，它表示一个正则表达式模式中的语法错误。
在 Java 中，\\ 表示：我要插入一个正则表达式的反斜线，所以其后的字符具有特殊的意义。
所以，在其他的语言中（如Perl），一个反斜杠 \ 就足以具有转义的作用，而在 Java 中正则表达式中则需要有两个反斜杠才能被解析为其他语言中的转义作用。也可以简单的理解在 Java 的正则表达式中，两个 \\ 代表其他语言中的一个 \，这也就是为什么表示一位数字的正则表达式是 \\d，而表示一个普通的反斜杠是 \\\\。
*/
public class RegularExpression {
    public static void main(String[] args){
        String s = "I am ferry,"+"come from China.";
        String p = ".*China.*";     //*（星号）零次或多次匹配其签名的字符或者表达式
        String k = "I*.*from.*";   //  .（点号）匹配任何一个字符
        boolean ismatch1 = Pattern.matches(p,s); //注意：正则表达式判断匹配是会区分大小写的
        boolean ismatch2 = Pattern.matches(k,s);
        System.out.println("字符串s包含了字符串p："+ismatch1);
        System.out.println("字符串s包含了字符串k："+ismatch2);
    }
}
