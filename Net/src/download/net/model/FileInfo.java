package download.net.model;

/**1
 * 文件信息
 * Created by Administrator on 2016/8/22.
 */
public class FileInfo {
    private String mSiteURL; //Site's URL
    private String mFilePath; //Saved File's Path
    private String mFileName; //Saved File's Name
    private int mSplitter; //线程数量

    public FileInfo(String mSiteURL, String mFilePath, String mFileName, int mSplitter) {
        this.mSiteURL = mSiteURL;
        this.mFilePath = mFilePath;
        this.mFileName = mFileName;
        this.mSplitter = mSplitter;
    }

    public String getmSiteURL() {
        return mSiteURL;
    }

    public String getmFilePath() {
        return mFilePath;
    }

    public String getmFileName() {
        return mFileName;
    }

    public int getmSplitter() {
        return mSplitter;
    }
}
