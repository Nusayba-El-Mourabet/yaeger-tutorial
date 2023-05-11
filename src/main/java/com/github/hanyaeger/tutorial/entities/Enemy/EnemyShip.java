package com.github.hanyaeger.tutorial.entities.Enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class EnemyShip extends DynamicCompositeEntity {
    protected EnemyShip(Coordinate2D initialLocation) {
        super(initialLocation);
    }

    @Override
    protected void setupEntities() {
//        var swordFishSprite = new SwordfishSprite(new Coordinate2D(0, 0));
//        addEntity(swordFishSprite);

//        var hitBox = new HitBox(new Coordinate2D(0, 40));
//        addEntity(hitBox);
//        addEntity(sword);

//        var body = new DynamicCompositeEntity(new Coordinate2D(20, 20));
//        addEntity(body);
    }
//    @Override
//    public void notifyBoundaryCrossing(final SceneBorder border) {
//        setAnchorLocationX(getSceneWidth());
//    }
}