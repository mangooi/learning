package Aug4.printer.version2.bean;

/**
 * Created by Administrator on 2016/8/4.
 */
public class BlackPrinter extends Printer {
    @Override
    public void print(IInfo info) {
        System.out.println("黑白打印机:"+info);
    }
}
