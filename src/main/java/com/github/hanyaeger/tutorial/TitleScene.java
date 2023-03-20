package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.entities.buttons.StartButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class TitleScene extends StaticScene {

    private Waterworld waterworld;

    public TitleScene(Waterworld waterworld){
        this.waterworld = waterworld;
    }

    @Override
    public void setupScene(){
        setBackgroundAudio("audio/ocean.mp3");
        setBackgroundImage("backgrounds/background1.jpg");
    }

    @Override
    public void setupEntities() {
        var waterworldText = new TextEntity(
                new Coordinate2D(getWidth() / 2, getHeight() / 2),
                "Waterworld"
        );
        waterworldText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        waterworldText.setFill(Color.LIGHTBLUE);
        waterworldText.setFont(Font.font("Roboto", FontWeight.BOLD, 80));
        addEntity(waterworldText);

        var startButton = new StartButton(
                new Coordinate2D(getWidth() / 2, getHeight() / 4*2.5), waterworld);
        addEntity(startButton);
    }
}
