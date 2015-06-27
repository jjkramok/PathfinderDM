package controller;

import model.Die;

import java.util.HashMap;
import java.util.Map;

/**
 * This class handles multiple dice or throws a single die multiple times
 * Created by Kramok on 27/6/2015.
 */
public class DiceHandler {

    private Map<Integer, Die> dicePouch = new HashMap<Integer, Die>();

    /**
     * Creates a DiceHandler object with a default dicePouch (d2, d3, d4, d6, d8, d10, d12, d20, d100)
     */
    public DiceHandler() {
        for (Integer i : new Integer[]{2, 3, 4, 6, 8, 10, 12, 20, 100}) {
            dicePouch.put(i, new Die(i));
        }
    }

    /**
     * This method keeps rolling a die and returns all results and adds a total to the end
     * @param times amount of times the die will be rolled
     * @param sides amount of sides the die should have
     * @return array with all results and a total at the end
     */
    public Integer[] roll(int times, int sides) {
        Die die = this.dicePouch.get(sides);
        Integer[] result = new Integer[times+1];
        for (int i = 0; i < times; i++) {
            int res = die.roll();
            result[i] = res;
            result[result.length-1] += res;
        }
        return result;
    }
}
