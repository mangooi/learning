package Aug4.printer.version2.bean;

/**
 * Created by Administrator on 2016/8/4.
 */
public abstract class Printer implements IPrinter{
    @Override
    public abstract void print(IInfo info);
}
