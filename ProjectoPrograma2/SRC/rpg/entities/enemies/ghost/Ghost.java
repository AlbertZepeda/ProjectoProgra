package rpg.entities.enemies.ghost;
import rpg.entities.enemies.Enemy;
import rpg.enums.Stats;
import java.util.HashMap;

/**
 * desarrollando a los fantasmas
 */
public class Ghost extends Enemy {
    public Ghost (String name) {
        super (name, createStats(), "Fantasma");
    }
    /**
     * Caracteristicas de los fontasmas
     */
    private static HashMap<Stats, Integer> createStats() {
        HashMap<Stats, Integer> stats = new HashMap<>();
        stats.put(Stats.HP, 15);
        stats.put(Stats.MAX_HP, 15);
        stats.put(Stats.MP, 20);
        stats.put(Stats.MAX_MP, 20);
        stats.put(Stats.ATTACK, 22);
        stats.put(Stats.DEFENSE, 10);
        stats.put(Stats.EVASION, 10);
        stats.put(Stats.SPEED, 10);
        stats.put(Stats.ACCURACY, 25);
        stats.put(Stats.DEXTERITY, 7);
        stats.put(Stats.LUCK, 5);
        stats.put(Stats.CRITICAL_HIT_CHANCE, 3);
        stats.put(Stats.CRITICAL_HIT_DAMAGE, 150);
        return stats;
    }
}

