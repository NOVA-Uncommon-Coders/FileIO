package sample;

import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.web.WebView;

import javax.swing.event.ChangeListener;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable, javafx.beans.value.ChangeListener{

    @FXML
    TextField addressBar;

    @FXML
    WebView webView;

    public void goToURL() {
        // System.out.println("GoToURL");
        String url = addressBar.getText();
        if (!url.startsWith("http")) {
            url = "http://" + url;

        }
        webView.getEngine().load(url);
    }

    public void goBack(){
       //System.out.println("goBack");
        try {
            webView.getEngine().getHistory().go(-1);
        } catch (Exception e) {

        }


    }

    public void goFoward(){
       // System.out.println("goFoward");
        try {
            webView.getEngine().getHistory().go(1);
        } catch (Exception e) {
        }
    }
    public void onKeyPressed(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            goToURL();


         }
    }

        @Override
        public void initialize(URL location, ResourceBundle resources) {

            Worker worker = webView.getEngine().getLoadWorker();
            worker.stateProperty().addListener(this);

        }

        @Override
        public void changed(ObservableValue observable, Object oldValue, Object newValue) {
              addressBar.setText(webView.getEngine().getLocation());
    }
}










