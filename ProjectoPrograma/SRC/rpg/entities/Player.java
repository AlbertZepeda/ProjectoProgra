package entities;
import javax.swing.JOptionPane;
import enums.Stats;
import java.util.HashMap;
/**
 * creando clase del jugador
 */
public class Player {
    private String name;
    private HashMap<Stats, Integer> stats;
    /**
     * caracteristicas del jugador
     */
    public Player(String name){
        this.name = name;
        this.stats = new HashMap<>();
        stats.put(Stats.HP, 100);
        stats.put(Stats.MAX_HP, 100);
        stats.put(Stats.MP, 50);
        stats.put(Stats.MAX_MP, 50);
        stats.put(Stats.ATTACK, 15);
        stats.put(Stats.DEFENSE, 20);
        stats.put(Stats.EVASION, 8);
        stats.put(Stats.SPEED, 22);
        stats.put(Stats.ACCURACY, 50);
        stats.put(Stats.DEXTERITY, 10);
        stats.put(Stats.LUCK, 8);
        stats.put(Stats.CRITICAL_HIT_CHANCE, 15);
        stats.put(Stats.CRITICAL_HIT_DAMAGE, 120);
    }
    public String getName(){
        return name;
    }
    public HashMap<Stats, Integer> getStats() {
        return stats;
    }
    public boolean isAlive(){
        return stats.get(Stats.HP) > 0;
    }
    /**
     * Método para atacar al enemigo
     * @param enemy
     */
    public void attack(Enemy enemy){
        int attackValue = stats.get(Stats.ATTACK);
        int defenseValue = enemy.getStats().get(Stats.DEFENSE);
        int damage = Math.max(0, attackValue - defenseValue);
        /**
         * HP del enemigo despues del daño
         */
        int newHp = Math.max(0, enemy.getStats().get(Stats.HP) - damage);
        enemy.getStats().put(Stats.HP, newHp);
        /**
         * ventama del juego
         */
        JOptionPane.showMessageDialog(null,name + " ataca a " + enemy.getName() + " haciendo " + damage + " puntos de danio. ");
    }
}
