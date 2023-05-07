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

    private SpaceWar spacewar;

    public TitleScene(SpaceWar spacewar){
        this.spacewar = spacewar;
    }

    @Override
    public void setupScene(){
        setBackgroundAudio("audio/ocean.mp3");
        setBackgroundImage("backgrounds/start page galaxy.png");

    }

    @Override
    public void setupEntities() {
        var spacewarText = new TextEntity(
                new Coordinate2D(getWidth() / 2, getHeight() / 2),
                "Space War"
        );
        spacewarText.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        spacewarText.setFill(Color.LIGHTBLUE);
        spacewarText.setFont(Font.font("Roboto", FontWeight.BOLD, 80));
        addEntity(spacewarText);

        var startButton = new StartButton(
                new Coordinate2D(getWidth() / 2, getHeight() / 4*2.5), spacewar);
        addEntity(startButton);
    }
}
