package string;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

/**
 * 测试正则，及正则作为条件匹配替换字符串
 *
 */
public class StringRegex {
    public static void main(String[] args) {
        String regex = "[\\d+]+[\\w+]+[\\d+]";
        String str1 = "123abd12340";
        /**
         * matches 返回布尔值，用于完全匹配字符串
         */
        Boolean str1out = str1.matches(regex);
        //System.out.println(str1out);
        /**
         * 下面的方式是一个替换字符串的方法，案例可以用于网站去掉不文明语言等
         */
        String regex1 = "(cnm|nmb|cnnn|rnm)";
        String str2 = "你个猪头，我cnm";
        String str2new = str2.replaceAll(regex1,"****");
        System.out.println(str2new);
    }

}
