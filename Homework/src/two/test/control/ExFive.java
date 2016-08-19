package two.test.control;

/**
 * Created by Administrator on 2016/8/19.
 */
public class ExFive {
    public static void main(String[] args) {
        String str1="32fdsfd8fds0fdsf9323k32k";
        for (int i=0;i<str1.length();i++){
            int sign=(int)str1.charAt(i);
            if (sign>47&&sign<58)
                System.out.println((char) sign);
        }
    }
}
