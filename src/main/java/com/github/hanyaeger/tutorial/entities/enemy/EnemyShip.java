package com.github.hanyaeger.tutorial.entities.enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.scenes.SceneBorder;

public class EnemyShip extends DynamicCompositeEntity implements SceneBorderCrossingWatcher {
    public EnemyShip(Coordinate2D initialLocation) {
        super(initialLocation);
    }

    @Override
    protected void setupEntities() {
        var enemyshipsprite = new EnemyshipSprite(new Coordinate2D(0, 0));
        addEntity(enemyshipsprite);

        var hitBox = new HitBox(new Coordinate2D(0, 40));
        addEntity(hitBox);


    }
    @Override
    public void notifyBoundaryCrossing(final SceneBorder border) {
        setAnchorLocationX(getSceneWidth());
    }
}