package com.game;

// Java Map class, used for storing game variables
import java.util.Map;

// FXGL classes
import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;

// JavaFX classes
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class App extends GameApplication {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(1500);
        settings.setHeight(750);
        settings.setTitle("100 Floors Dungeon");
        settings.setVersion("demo 0.0.1");
    }

    @Override
    protected void initGame() {

    }

    @Override
    protected void initInput() {

    }

    @Override
    protected void initUI() {
        
    }
}
