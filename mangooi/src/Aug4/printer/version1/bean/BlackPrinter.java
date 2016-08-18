package Aug4.printer.version1.bean;


/**
 * Created by Administrator on 2016/8/4.
 */
public class BlackPrinter extends Printer{
    @Override
    public void print(Object obj) {
        if (obj==null){
            return;
        }
        System.out.println("黑白打印机:"+obj);
    }
}
