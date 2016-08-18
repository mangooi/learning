package Aug4.printer.version1.bean;

/**
 * Created by Administrator on 2016/8/4.
 */
public class ColorPrinter extends Printer{
    @Override
    public void print(Object obj) {
        if (obj==null)
            return;
        System.out.println("彩色打印机:"+obj);
    }
}
