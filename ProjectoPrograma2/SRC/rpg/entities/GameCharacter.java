package rpg.entities;
import rpg.enums.Stats;
import java.util.HashMap;
/**
 * herencia con protected para cada personaje
 */
public class GameCharacter {
    protected String name;
    protected HashMap<Stats, Integer> stats;
    protected String enemyType;
    /**
     * Atributosd e la clase GameCharacter
     * @param name
     * @param stats
     * @param enemyType
     */
    public GameCharacter(String name, HashMap<Stats, Integer> stats, String enemyType) {
        this.name = name;
        this.stats = stats;
        this.enemyType = enemyType;
    }
    public String getName() {
        return name;
    }
    public HashMap<Stats, Integer> getStats() {
        return stats;
    }
    public String getEnemyType() {
        return enemyType;
    }
    public boolean isAlive() {
        return stats.get(Stats.HP) > 0;
    }
    public void takeDamage(int damage){
        int newHP = Math.max(0, stats.get(Stats.HP) - damage);
        stats.put(Stats.HP, newHP);
    }
}