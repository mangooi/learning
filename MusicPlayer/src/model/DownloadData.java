package model;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by Administrator on 2016/8/23.
 */
public class DownloadData {
    private final SimpleStringProperty fileName = new SimpleStringProperty();
    private final SimpleStringProperty status = new SimpleStringProperty();


    public DownloadData(String filename,String status) {
        setFileName(filename);
        setStatus(status);
    }

    public String getFileName() {
        return fileName.get();
    }

    public SimpleStringProperty fileNameProperty() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName.set(fileName);
    }

    public String getStatus() {
        return status.get();
    }

    public SimpleStringProperty statusProperty() {
        return status;
    }

    public void setStatus(String status) {
        this.status.set(status);
    }
}
