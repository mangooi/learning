package two.test.model;

import two.test.util.Stack;

/**
 * 一月：January
 * 二月：February
 * 三月：March
 * 四月：April
 * 五月：May
 * 六月：June
 * 七月：July
 * 八月：August
 * 九月：September
 * 十月：October
 * 十一月：November
 * 十二月：December
 * 实现一个栈操作，将1~12月的英文单词压入栈中，然后再将其取出
 * Created by Administrator on 2016/8/19.
 */
public class ExOne {
    public ExOne(){
        Stack<String> stack=Stack.getInstance();
        stack.push("January");
        stack.push("February");
        stack.push("March");
        stack.push("April");
        stack.push("May");
        stack.push("June");
        stack.push("July");
        stack.push("August");
        stack.push("September");
        stack.push("October");
        stack.push("November");
        stack.push("December");

        for (int i=stack.size();i>0;i--){
            System.out.println(stack.pop());
        }
    }
}
