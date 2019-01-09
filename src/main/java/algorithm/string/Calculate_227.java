package algorithm.string;

import java.util.Stack;

/**
 * @author Search
 * @date 2019/1/10
 * 227. 基本计算器 II
 */
public class Calculate_227 {


    public static void main(String args[]){

        String str="3+5 / 2";
        String oldstr="3+5/2";
        str.replace(" ","");

        System.out.println( str.replace(" ",""));
        System.out.println( str.length());
        System.out.println( oldstr);
        System.out.println( oldstr.length());
    }

    /**
     * stack
     * @param s
     * @return
     */
    public int calculate(String s) {
        Stack<Integer> num = new Stack<Integer>();
        int res = 0;
        int temp=0;
        //当前数字前的运算符。
        char sign = '+';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                temp = temp *10 +s.charAt(i) -'0';
            }

            if((s.charAt(i)<'0'||s.charAt(i)>'9')&&' '!=s.charAt(i) || i==s.length()-1){
                if(sign == '-'){
                    num.push(-temp);
                }else if(sign == '+'){
                    num.push(temp);
                }else if(sign == '*'){
                    num.push(num.pop()*temp);
                }else if(sign == '/'){
                    num.push(num.pop()/temp);
                }
                sign = s.charAt(i);
                temp = 0;
            }
        }
        for(int i:num){
            res+=i;
        }
        return res;
    }


}
