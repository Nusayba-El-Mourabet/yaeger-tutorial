package com.github.hanyaeger.tutorial.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;

public class EnemyShip extends DynamicSpriteEntity implements SceneBorderCrossingWatcher {
    public EnemyShip(Coordinate2D location){
        super("sprites/enemy spaceship.png", location);
        setMotion(2, 270d);

    }
    @Override
    public void notifyBoundaryCrossing(SceneBorder sceneBorder) {

        setAnchorLocationX(getSceneWidth());
    }
}
