package model;

import java.util.Random;

/**
 * This class models a die with a default amount of sides of six
 * Created by Kramok on 27/6/2015.
 */
public class Die {

    private int sides = 6;

    public Die (int sides) {
        this.sides = sides;
    }

    public int roll() {
        return (new Random()).nextInt(this.getSides()) + 1;
    }



    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return this.sides;
    }
}
