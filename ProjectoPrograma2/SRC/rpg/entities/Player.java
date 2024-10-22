package rpg.entities;
import javax.swing.JOptionPane;

import rpg.entities.enemies.Enemy;
import rpg.enums.Stats;
import java.util.HashMap;
/**
 * creando clase del jugador
 */
public class Player  extends GameCharacter {
    public Player (String name) {
        super(name, createStats(), "Jugador");
    }
    /**
     * caracteristicas del jugador
     */
    private static HashMap<Stats, Integer> createStats(){
        HashMap<Stats, Integer> stats = new HashMap<>();
        stats.put(Stats.HP, 65);
        stats.put(Stats.MAX_HP, 65);
        stats.put(Stats.MP, 50);
        stats.put(Stats.MAX_MP, 50);
        stats.put(Stats.ATTACK, 20);
        stats.put(Stats.DEFENSE, 20);
        stats.put(Stats.EVASION, 15);
        stats.put(Stats.SPEED, 25);
        stats.put(Stats.ACCURACY, 50);
        stats.put(Stats.DEXTERITY, 10);
        stats.put(Stats.LUCK, 8);
        stats.put(Stats.CRITICAL_HIT_CHANCE, 15);
        stats.put(Stats.CRITICAL_HIT_DAMAGE, 120);
        return stats;
    }
    public void takeDamage(int damage){
        int newHP = Math.max(0,stats.get(Stats.HP) - damage);
        stats.put(Stats.HP, newHP);
        JOptionPane.showMessageDialog(null, getName() + " recibe " + damage + " puntos de danio.");
    }
    /**
     * Método para atacar al enemigo
     * @param enemy
     */
    public void attack(Enemy enemy){
        int attackValue = stats.get(Stats.ATTACK);
        int defenseValue = enemy.getStats().get(Stats.DEFENSE);
        int damage = Math.max(0, attackValue - defenseValue);
        enemy.takeDamage(damage);
        /**
         * ventama del juego
         */
        JOptionPane.showMessageDialog(null,name + " ataca a " + enemy.getName() + " haciendo " + damage + " puntos de danio. ");
    }
}
