package Aug4.printer.version2.bean;

/**
 * Created by Administrator on 2016/8/4.
 */
public class ColorPrinter extends Printer{
    @Override
    public void print(IInfo info) {
        System.out.println("彩色打印机:"+info);
    }
}
