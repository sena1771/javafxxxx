import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class ForgetPassword {
@FXML
private TextField textField;
@FXML
private TextField prompText;
public void changePrompText(String username) {
textField.setPromptText(username);
}
}
