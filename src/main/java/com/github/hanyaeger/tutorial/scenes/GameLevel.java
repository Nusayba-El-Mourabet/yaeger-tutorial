package com.github.hanyaeger.tutorial.scenes;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.entities.PlayerShip;
import com.github.hanyaeger.tutorial.SpaceWar;
import com.github.hanyaeger.tutorial.entities.enemy.EnemyShip;
import com.github.hanyaeger.tutorial.entities.text.HealthText;

public class GameLevel extends DynamicScene{
    private final SpaceWar spacewar;

    public GameLevel(SpaceWar spacewar) {
        this.spacewar = spacewar;

    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/waterworld.mp3");
        setBackgroundImage("backgrounds/galaxy.png");
    }

    @Override
    public void setupEntities() {
        var healthText = new HealthText(new Coordinate2D(400, 10));
        addEntity(healthText);

        var enemyship = new EnemyShip(new Coordinate2D(0, getHeight() / 2));
        addEntity(enemyship);

        var playerShip = new PlayerShip(new Coordinate2D(getWidth() / 4, getHeight() / 2), healthText, spacewar);
        addEntity(playerShip);

    }
}
