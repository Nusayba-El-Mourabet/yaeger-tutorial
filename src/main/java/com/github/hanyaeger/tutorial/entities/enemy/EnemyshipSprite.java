package com.github.hanyaeger.tutorial.entities.enemy;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class EnemyshipSprite extends SpriteEntity {
    public EnemyshipSprite(final Coordinate2D location) {
        super("sprites/enemy spaceship.png", location);
    }
}
