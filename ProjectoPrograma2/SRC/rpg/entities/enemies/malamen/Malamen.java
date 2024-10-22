package rpg.entities.enemies.malamen;
import rpg.entities.enemies.Enemy;
import rpg.enums.Stats;
import java.util.HashMap;

/**
 * clase del malamen
 */
public class Malamen extends Enemy {
    public Malamen (String name) {
        super(name, createStats(), "Malamen");
    }
    /**
     * stats del Malamen
     */
    private static HashMap<Stats, Integer> createStats() {
        HashMap<Stats, Integer> stats = new HashMap<>();
        stats.put(Stats.HP, 50);
        stats.put(Stats.MAX_HP, 50);
        stats.put(Stats.MP, 50);
        stats.put(Stats.MAX_MP, 20);
        stats.put(Stats.ATTACK, 25);
        stats.put(Stats.DEFENSE, 12);
        stats.put(Stats.EVASION, 10);
        stats.put(Stats.SPEED, 18);
        stats.put(Stats.ACCURACY, 25);
        stats.put(Stats.DEXTERITY, 7);
        stats.put(Stats.LUCK, 5);
        stats.put(Stats.CRITICAL_HIT_CHANCE, 25);
        stats.put(Stats.CRITICAL_HIT_DAMAGE, 130);
        return stats;
    }
}
