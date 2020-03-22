package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import java.util.Random;

public class Tube {
    public static final int FLUCTUATION = 130; // колебание
    public static final int TUBE_GAP = 100; // расстояние между трубами по вертикали
    public static final int LOWEST_OPENING = 120; // мин. расстояние между трубами по гориз.

    private Texture topTube, bottomTube;
    private Vector2 posTopTube, posBotTube;
    private Random rand;

    public Tube (float x){
        topTube = new Texture("topTube.png");
        bottomTube = new Texture("bottom.png");
        rand = new Random();

        posTopTube = new Vector2(x, rand.nextInt(FLUCTUATION) + TUBE_GAP);
    }
}
