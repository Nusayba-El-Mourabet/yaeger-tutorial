package com.github.hanyaeger.tutorial.entities.buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.tutorial.TitleScene;
import com.github.hanyaeger.tutorial.Waterworld;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class StartButton extends TextEntity implements MouseButtonPressedListener {

    private TitleScene titleScene;

    //    }
    public StartButton(Coordinate2D initialLocation, TitleScene titleScene){
        super(initialLocation,"Play game");
        setFill(Color.LIGHTBLUE);
        setFont(Font.font("Roboto", FontWeight.BOLD, 40));
        this.titleScene = titleScene;

    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        waterworld.setActiveScene(1); // switch to the GameLevel scene
    }
}
