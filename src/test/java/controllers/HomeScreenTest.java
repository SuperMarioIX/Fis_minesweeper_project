package controllers;

import javafx.embed.swing.JFXPanel;
import javafx.scene.control.Button;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.junit.Before;
import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomeScreenTest extends ApplicationTest {
    HomeScreen controller;

    @Before
    public void setUp() throws Exception {
        controller = new HomeScreen();
        JFXPanel panel = new JFXPanel();
        controller.Login = new Button();
    }

    @Test
    public void Test_Login() throws IOException, ParseException {
        assertTrue(controller.handleLoginAction());
    }

    @Test
    public void Read_emptyFile() {
        JSONArray expectedArray = new JSONArray();
        JSONArray resultedArray = controller.readFile("src/test/resources/empty.json");
        assertEquals(expectedArray, resultedArray);
    }

    @Test
    public void Read_userFile(){
        JSONArray resultedArray = controller.readFile("src/test/resources/users.json");
        assertEquals(5, resultedArray.size());
    }

    @Test
    public void Read_File(){
        JSONArray resultedArray = controller.readFile("src/test/resources/file.json");
        assertEquals(20, resultedArray.size());
    }
}
