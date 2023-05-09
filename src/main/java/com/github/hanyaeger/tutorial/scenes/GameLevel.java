package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.entities.EnemyShip;
import com.github.hanyaeger.tutorial.entities.PlayerShip;
import com.github.hanyaeger.tutorial.entities.buttons.StartButton;

public class GameLevel extends DynamicScene {
    @Override
    public void setupScene() {
        setBackgroundAudio("audio/waterworld.mp3");
        setBackgroundImage("backgrounds/galaxy.png");
    }

    @Override
    public void setupEntities() {
        var enemyship = new EnemyShip(new Coordinate2D(getWidth() / 2, getHeight() / 2));
        addEntity(enemyship);
        var playership = new PlayerShip(new Coordinate2D(0, getHeight() / 2));
        addEntity(playership);
    }
}
