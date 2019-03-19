package main_window;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainWindowController {
    @FXML
    private Button addButton;

    @FXML
    private Button searchButton;

    @FXML
    private Button quitButton;

    @FXML
    private void initialize() {
            addButton.setOnAction(this::onAddButton);
            searchButton.setOnAction(this::onSearchButton);
            quitButton.setOnAction(this::onQuitButton);
    }

    private void onAddButton(ActionEvent e) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../add_edit_window/AddEditWindow.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) addButton.getScene().getWindow();
            stage.setScene(scene);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private void onSearchButton(ActionEvent e) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../search_window/SearchWindow.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) searchButton.getScene().getWindow();
            stage.setScene(scene);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private void onQuitButton(ActionEvent e) {
        Stage stage = (Stage) quitButton.getScene().getWindow();
        stage.close();
    }
}
