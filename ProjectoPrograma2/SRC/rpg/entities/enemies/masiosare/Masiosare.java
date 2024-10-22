package rpg.entities.enemies.masiosare;
import rpg.entities.enemies.Enemy;
import rpg.enums.Stats;
import java.util.HashMap;

/**
 * clase del verdadero enemigo
 */
public class Masiosare  extends Enemy {
    public Masiosare (String name) {
        super (name, createStats(), "Masiosare");
    }
    /**
     * Stats del Masiosare
     */
    private static HashMap<Stats, Integer> createStats() {
        HashMap<Stats, Integer> stats = new HashMap<>();
        stats.put(Stats.HP, 50);
        stats.put(Stats.MAX_HP, 50);
        stats.put(Stats.MP, 50);
        stats.put(Stats.MAX_MP, 20);
        stats.put(Stats.ATTACK, 26);
        stats.put(Stats.DEFENSE, 17);
        stats.put(Stats.EVASION, 10);
        stats.put(Stats.SPEED, 28);
        stats.put(Stats.ACCURACY, 25);
        stats.put(Stats.DEXTERITY, 7);
        stats.put(Stats.LUCK, 5);
        stats.put(Stats.CRITICAL_HIT_CHANCE, 25);
        stats.put(Stats.CRITICAL_HIT_DAMAGE, 130);
        return stats;
    }
}
