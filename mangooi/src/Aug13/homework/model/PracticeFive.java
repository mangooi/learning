package Aug13.homework.model;

import java.util.Comparator;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/**
 * Created by Administrator on 2016/8/13.
 */
public class PracticeFive {
    static Map<Integer,Integer> map=new TreeMap<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1>o2){
                return -1;
            }else if (o1.equals(o2)){
                return 0;
            }else {
                return 1;
            }
        }
    });
    private  static Random mRandom=new Random();
    public static int[] createIntArray(){
        int[] intArray=new int[50];
        for (int i=0;i<50;i++){
            intArray[i]=mRandom.nextInt(6)+30;
        }
        return intArray;
    }
    public static Map<Integer,Integer> count(int[] intArray){
        int count;
        for (int i=30;i<=35;i++){
            count=0;
            for (int x:intArray){
                if (x==i){
                    count++;
                }
            }
            map.put(i,count);
        }
        return map;
    }
}
