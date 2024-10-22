package rpg.entities.enemies.elf;
import rpg.entities.enemies.Enemy;
import rpg.enums.Stats;
import java.util.HashMap;
/**
 * clase de los duendes como enemigos
 */
public class Elf extends Enemy {
    public Elf(String name) {
        super(name, createStats(), "Duende");
    }
    /**
     * stats de los duendes
     * @return
     */
    private static HashMap<Stats, Integer> createStats() {
        HashMap<Stats, Integer> stats = new HashMap<>();
        stats.put(Stats.HP, 20);
        stats.put(Stats.MAX_HP, 20);
        stats.put(Stats.MP, 20);
        stats.put(Stats.MAX_MP, 20);
        stats.put(Stats.ATTACK, 22);
        stats.put(Stats.DEFENSE, 8);
        stats.put(Stats.EVASION, 10);
        stats.put(Stats.SPEED, 18);
        stats.put(Stats.ACCURACY, 25);
        stats.put(Stats.DEXTERITY, 7);
        stats.put(Stats.LUCK, 5);
        stats.put(Stats.CRITICAL_HIT_CHANCE, 5);
        stats.put(Stats.CRITICAL_HIT_DAMAGE, 130);
        return stats;
    }
}
