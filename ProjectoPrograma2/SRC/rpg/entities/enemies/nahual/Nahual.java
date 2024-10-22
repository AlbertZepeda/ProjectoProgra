package rpg.entities.enemies.nahual;
import rpg.entities.enemies.Enemy;
import rpg.enums.Stats;
import java.util.HashMap;

/**
 * Clase de los nahuales
 */
public class Nahual extends Enemy {
    public Nahual (String name){
        super (name, createStats(), "Nahual");
    }
    /**
     * Stats de los nahuales
     */
    private static HashMap<Stats, Integer> createStats() {
        HashMap<Stats, Integer> stats = new HashMap<>();
        stats.put(Stats.HP, 20);
        stats.put(Stats.MAX_HP, 20);
        stats.put(Stats.MP, 20);
        stats.put(Stats.MAX_MP, 20);
        stats.put(Stats.ATTACK, 30);
        stats.put(Stats.DEFENSE, 10);
        stats.put(Stats.EVASION, 10);
        stats.put(Stats.SPEED, 10);
        stats.put(Stats.ACCURACY, 25);
        stats.put(Stats.DEXTERITY, 7);
        stats.put(Stats.LUCK, 8);
        stats.put(Stats.CRITICAL_HIT_CHANCE, 8);
        stats.put(Stats.CRITICAL_HIT_DAMAGE, 150);
        return stats;
    }
}
