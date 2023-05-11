package com.github.hanyaeger.tutorial.entities.buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import com.github.hanyaeger.tutorial.SpaceWar;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class QuitButton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {

    private final SpaceWar spacewar;
    public QuitButton(Coordinate2D initialPosition, SpaceWar spacewar) {
        super(initialPosition, "Quit game");
        this.spacewar = spacewar;
        setFill(Color.ORANGE);
        setFont(Font.font("Roboto", FontWeight.BOLD, 30));
    }

    @Override
    public void onMouseButtonPressed(final MouseButton button, final Coordinate2D coordinate2D) {
        spacewar.quit();
    }

    @Override
    public void onMouseEntered() {
        setFill(Color.LIGHTYELLOW);
        setCursor(Cursor.HAND);
    }

    @Override
    public void onMouseExited() {
        setFill(Color.ORANGE);
        setCursor(Cursor.DEFAULT);
    }
}
