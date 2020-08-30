package string;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Arrays;

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
        /**
         * 在此刚才进行字符串通过split()分割成字符串，形成Arrays的数组，问题是数组直接输出的方案；
         * 得出两个要点：1.操作什么对象就要用什么类型；如果需要简单知道数组分割的是否正确，可以直接.length()输出长度;
         */
        System.out.println(Arrays.toString(str2.split("，")));
        ;
    }

}
