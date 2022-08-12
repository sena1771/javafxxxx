import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
public class Controller {
    @FXML
    private AnchorPane scenePane;
    @FXML
    private TextField enter;
    @FXML
   private TextField password;
    @FXML
    private Parent root;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Label errorMessage;
    public void shutDown(ActionEvent event) {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("logout");
        alert.setHeaderText("You are about to log out!!!");
        alert.setContentText("Are you sure that you want to exit???");
        if(alert.showAndWait().get()== ButtonType.OK){
            Stage stage = (Stage) scenePane.getScene().getWindow();
            System.out.println("Successfully logged out");
            stage.close();
        } }
    public void enterInput(ActionEvent event2) throws IOException {
        String username=enter.getText();
        String passwordText=password.getText();
        if(username.equals("sena")&&passwordText.equals("sena123")) {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("sceneEnter.fxml"));
            root = loader.load();
            SceneEnter dataController = loader.getController(); //communication between two controller
            dataController.displayName(username); //communications continue
        }
        else {
            errorMessage.setText("Wrong username or password email entered");

        }
        stage=(Stage)((Node)event2.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void  ChangeScene(ActionEvent event3) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("forgetPassword.fxml"));
        stage=(Stage)((Node)event3.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
