package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.DownloadData;

public class Controller {
    private final ObservableList<DownloadData> data = FXCollections.observableArrayList();
    public Controller() {
        ObservableList<String> observableList = tableView.getColumns();
    }

    @FXML
    private TableView tableView;
    @FXML
    private TableColumn fileName;
    @FXML
    private TableColumn status;

}