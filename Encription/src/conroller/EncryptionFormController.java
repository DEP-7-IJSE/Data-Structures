package conroller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class EncryptionFormController {
    public TextField txtEntered;
    public TextField txtEncrypted;

    public void enctriptOnAction(ActionEvent actionEvent) {
        String entered = txtEntered.getText();
        int ascii=0;
        for (int i = 0; i < entered.length(); i++) {
            char c = entered.charAt(i);
        }
    }
}
