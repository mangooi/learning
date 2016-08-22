/* http://i0.hdslb.com/group1/M00/B7/9A/oYYBAFd16ASAFbS4AAcNql6NOb8768.png
 **TestMethod.java 
 */
package NetFox;
public class TestMethod {
    private TestMethod()
    {
        try{
            SiteInfoBean bean = new SiteInfoBean("http://i0.hdslb.com/group1/M00/B7/9A/oYYBAFd16ASAFbS4AAcNql6NOb8768.png", "F:\\temp","1.png",5);
            SiteFileFetch fileFetch = new SiteFileFetch(bean);
            fileFetch.start();
        }
        catch(Exception e){e.printStackTrace ();}
    }
    public static void main(String[] args)
    {
        new TestMethod();
    }
}