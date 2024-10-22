package rpg.entities.enemies;
import javax.swing.JOptionPane;
import java.util.HashMap;

import rpg.entities.GameCharacter;
import rpg.entities.Player;
import rpg.enums.Stats;
/**
 * Clase de los enemigos
 */
public class Enemy extends GameCharacter {
    public Enemy (String name, HashMap<Stats, Integer> stats, String enemyType){
        super(name, stats, enemyType);
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
        player.takeDamage(damage);
        /**
         * ventana de juego
         */
        JOptionPane.showMessageDialog(null,name + " ataca a " + player.getName() + " haciendo " + damage + " puntos de danio. ");
    }
}