import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class SceneEnter {
    @FXML
    private Label InputLabel;
    public void displayName(String username)  {
        InputLabel.setText("Welcome " + username);
        ForgetPassword forgetPassword = new ForgetPassword();
        forgetPassword.changePrompText(username);

    }
}
