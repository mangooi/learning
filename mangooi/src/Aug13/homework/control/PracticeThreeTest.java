package Aug13.homework.control;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2016/8/13.
 */
public class PracticeThreeTest {
    public static void main(String[] args) {
        HashMap<String ,Integer> hashMap=new HashMap();
        String[] strings=new String[]{"chenhao","zhangsan",
                                      "zhangsan","chenhao",
                                      "lisi","wangwu","zhaoliu",
                                      "xiaoqiang","haha"};
        //下面这段可以抽取出来
        for (int i=0;i<strings.length;i++){
            if (hashMap.containsKey(strings[i])){
                hashMap.put(strings[i],hashMap.get(strings[i])+1);
            }else {
                hashMap.put(strings[i],1);
            }
        }
        Set<Map.Entry<String,Integer>> set=hashMap.entrySet();
        for (Map.Entry entry:set){
            System.out.println(entry);
        }

    }


}
