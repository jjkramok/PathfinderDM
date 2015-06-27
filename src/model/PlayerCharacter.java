package model;

import java.util.HashMap;
import java.util.Map;

/**
 * This class models a PC
 * Created by Kramok on 27/6/2015.
 */
public class PlayerCharacter {

    private int health;
    private int nonLethalHealth;
    private Map<String, Integer> skillSet = new HashMap<String, Integer>();



    public PlayerCharacter() {

    }


    public Map<String, Integer> getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(Map<String, Integer> skillSet) {
        this.skillSet = skillSet;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getNonLethalHealth() {
        return nonLethalHealth;
    }

    public void setNonLethalHealth(int nonLethalHealth) {
        this.nonLethalHealth = nonLethalHealth;
    }


}
