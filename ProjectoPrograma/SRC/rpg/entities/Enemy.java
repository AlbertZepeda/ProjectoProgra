package entities;
import javax.swing.JOptionPane;
import enums.Stats;
import java.util.HashMap;
/**
 * Clase del enemigo
 */
public class Enemy {
    public String name;
    public HashMap<Stats, Integer> stats;
    /**
     * construyendo las características del enemigo
     */
    public Enemy(String name) {
        this.name = name;
        this.stats = new HashMap<>();
        stats.put(Stats.HP, 70);
        stats.put(Stats.MAX_HP, 70);
        stats.put(Stats.MP, 35);
        stats.put(Stats.MAX_MP, 35);
        stats.put(Stats.ATTACK, 17);
        stats.put(Stats.DEFENSE, 15);
        stats.put(Stats.EVASION, 7);
        stats.put(Stats.SPEED, 15);
        stats.put(Stats.ACCURACY, 30);
        stats.put(Stats.DEXTERITY, 10);
        stats.put(Stats.LUCK, 3);
        stats.put(Stats.CRITICAL_HIT_CHANCE, 5);
        stats.put(Stats.CRITICAL_HIT_DAMAGE, 140);
    }
    public String getName(){
        return name;
    }
    public HashMap<Stats, Integer> getStats() {
        return stats;
    }
    public boolean isAlive (){
        return stats.get(Stats.HP) > 0;
    }
    /**
     * método para que el enemigo ataque al jugador
     * @param player
     */
    public void attack(Player player){
        int attackValue = stats.get(Stats.ATTACK);
        int defenseValue = player.getStats().get(Stats.DEFENSE);
        /**
         * indicar que el daño no puede ser negativo
         */
        int damage = Math.max(0, attackValue - defenseValue);
        /**
         * nuevo valor de HP del jugador despues del daño
         */
        int newHP = Math.max(0, player.getStats().get(Stats.HP) - damage);
        player.getStats().put(Stats.HP, newHP);
        /**
         * ventana de juego
         */
        JOptionPane.showMessageDialog(null,name + " ataca a " + player.getName() + " haciendo " + damage + " puntos de danio. ");
    }
}