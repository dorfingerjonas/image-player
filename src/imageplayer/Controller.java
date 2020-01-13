package imageplayer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public ImageView imageView;

    @FXML
    public ProgressBar progressBar;

    @FXML
    public Label statusLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        statusLabel.setText("application started ...");
    }

    public void onStartPressed(ActionEvent actionEvent) {
        
    }

    public void onLoadButtonPressed(ActionEvent actionEvent) {

    }
}