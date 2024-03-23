package com.github.hanyaeger.tutorial;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.tutorial.scenes.GameLevel;
import com.github.hanyaeger.tutorial.scenes.GameOverScene;
import com.github.hanyaeger.tutorial.scenes.TitleScene;

public class SpaceWar extends YaegerGame {
    public static void main(String[] args){
        launch(args);
    }


    private int titlscene = 0;
    private int gamescene = 1;
    private int gamaOverscene = 2;


    @Override
    public void setupGame() {
        setGameTitle("Space War");
        setSize(new Size(850, 600));
    }


    @Override
    public void setupScenes() {
        addScene(titlscene, new TitleScene(this));
        addScene(gamescene, new GameLevel(this));
        addScene(gamaOverscene, new GameOverScene(this));

    }
    public int getTitlscene() {
        return titlscene;
    }

    public int getGamescene() {
        return gamescene;
    }

    public int getGamaOverscene() {
        return gamaOverscene;
    }

}
