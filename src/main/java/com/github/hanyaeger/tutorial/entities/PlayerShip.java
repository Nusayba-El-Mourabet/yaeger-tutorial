package com.github.hanyaeger.tutorial.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.*;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.tutorial.SpaceWar;
import com.github.hanyaeger.tutorial.entities.text.HealthText;
import com.github.hanyaeger.tutorial.scenes.GameLevel;
import javafx.scene.input.KeyCode;

import java.util.Random;
import java.util.Set;

public class PlayerShip extends DynamicSpriteEntity implements SceneBorderCrossingWatcher, KeyListener, SceneBorderTouchingWatcher, Collided, Collider {
    private HealthText healthText ;
    private int health = 3;
    private SpaceWar spacewar;

    public PlayerShip(final Coordinate2D location, final HealthText healthText, final SpaceWar spacewar) {
        super("sprites/playership.png", location, new Size(80, 80), 1, 1);
        this.healthText = healthText;
        this.spacewar = spacewar;
        healthText.setHealthText(health);
    }


    @Override
    public void notifyBoundaryCrossing(SceneBorder sceneBorder) {

    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {

        if (pressedKeys.contains(KeyCode.UP)) {
            setMotion(3, 180d);
        } else if (pressedKeys.contains(KeyCode.DOWN)) {
            setMotion(3, 0d);
        } else if (pressedKeys.isEmpty()) {
            setSpeed(0);
        }
    }

    @Override
    public void notifyBoundaryTouching(SceneBorder border) {
        setSpeed(0);

        switch (border) {
            case TOP:
                setAnchorLocationY(1);
                break;
            case BOTTOM:
                setAnchorLocationY(getSceneHeight() - getHeight() - 1);
            default:
                break;
        }
    }

    @Override
    public void onCollision(Collider collidingObject) {
        if (collidingObject instanceof EnemyShip) {
            System.out.println("Collision!");
        }
        healthText.setHealthText(--health);
        if (health == 0) {
            this.spacewar.setActiveScene(2);
        } else {
            setAnchorLocation(new Coordinate2D(0, new Random().nextInt((int) (getSceneHeight() - getHeight()))));

        }
    }
}


