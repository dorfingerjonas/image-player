package imageplayer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public ImageView imageView;

    @FXML
    public ProgressBar progressBar;

    @FXML
    public Label statusLabel;

    @FXML
    public Button startButton;

    @FXML
    public Button loadButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        statusLabel.setText("application started ...");
    }

    @FXML
    public void onStartPressed(ActionEvent actionEvent) {
        statusLabel.setText("on start button pressed ...");
    }

    @FXML
    public void onLoadButtonPressed(ActionEvent actionEvent) {
        statusLabel.setText("on load button pressed ...");
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("selectImage");
        fileChooser.setInitialDirectory(new File("."));
        FileChooser.ExtensionFilter extensionFilter = new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.png", "*.JPG", "*.PNG", "*.JPEG", "*.jpeg");
        fileChooser.getExtensionFilters().add(extensionFilter);
        File imageFile = fileChooser.showOpenDialog(null);
    }
}