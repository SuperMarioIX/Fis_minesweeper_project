import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;
import lombok.experimental.ExtensionMethod;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.ApplicationTest;

import java.awt.*;
import java.util.Objects;

import static org.junit.Assert.*;


public class RegistrationTest extends ApplicationTest {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("fxmlFiles/MainPage.fxml")));
        primaryStage.setTitle("Main Page");
        primaryStage.setScene(new Scene(root, 744, 607));
        primaryStage.show();
        primaryStage.getOnCloseRequest();
    }
    @Before
    public void setUP()throws Exception {
    }
    @After
    public void tearDown() throws Exception{
        FxToolkit.hideStage();
        release(new KeyCode[]{});
        release(new MouseButton[]{});
    }
    @Test
    public void testClickData1(){

    }

}