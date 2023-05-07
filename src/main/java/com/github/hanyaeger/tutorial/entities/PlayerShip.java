package com.github.hanyaeger.tutorial.entities;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
public class PlayerShip {
    public PlayerShip(Coordinate2D location){
        super("sprites/player spaceship.png",location);
    }
}
