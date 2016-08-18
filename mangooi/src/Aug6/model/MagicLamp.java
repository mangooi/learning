package Aug6.model;

/**
 * Created by Administrator on 2016/8/6.
 */
public class MagicLamp extends AbstractBeautyFactory {
    private MagicLamp(){}
    private static MagicLamp magicLamp=null;
    public static MagicLamp getInstance(){
            if (magicLamp==null){
                magicLamp=new MagicLamp();
            }
        return magicLamp;
    }
    @Override
    public Beauty createBeauty(String msg) {
        Beauty beauty=null;
        if (msg==null||msg.length()==0){
            return null;
        }
        switch (msg){
            case "日本":
                beauty=new JapanBeauty();
                break;
            case "英国":
                beauty=new EnBeauty();
                break;
            case "美国":
                beauty=new USBeauty();
                break;
            case "俄罗斯":
                beauty=new RussiaBeauty();
                break;
            default:
                beauty=new None();
                break;
        }
        return beauty;
    }
}
