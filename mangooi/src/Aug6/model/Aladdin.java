package Aug6.model;

/**
 * Created by Administrator on 2016/8/6.
 */
public class Aladdin {
    public static void main(String[] args) {
        MagicLamp magicLamp=MagicLamp.getInstance();
        magicLamp.createBeauty("美国").greet();
        magicLamp.createBeauty("123").greet();
    }
}
