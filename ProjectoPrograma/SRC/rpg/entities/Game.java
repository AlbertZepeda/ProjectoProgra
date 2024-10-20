package entities;
import enums.Stats;

import javax.swing.JOptionPane;
/**
 * indicar los personajes a interactuar
 */
public class Game {
    private Player player;
    private Enemy enemy;
    public Game(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    /**
     * empezar el juego
     */
    public void starGame() {
        JOptionPane.showMessageDialog(null, "Inicia el juego, " + player.getName() + " vs " + enemy.getName());
        /**
         * Bucle para los turnos de ataque, seguir mientras esten vivos
         */
        while (player.isAlive() && enemy.isAlive()) {
            /**
             * Turno del jugador
             */
            player.attack(enemy);
            showStatus();
            if (!enemy.isAlive()) {
                JOptionPane.showMessageDialog(null, enemy.getName() + " ha sido derrotado. ");
                break;
            }
            /**
             * Turno del enemigo
             */
            enemy.attack(player);
            showStatus();
            if (!player.isAlive()) {
                JOptionPane.showMessageDialog(null, player.getName() + " ha sido derrotado.");
                break;
            }
        }
        /**
         * Determinar el ganador
         */
        if (player.isAlive()) {
            JOptionPane.showMessageDialog(null, player.getName() + " ha ganado. ");
        } else {
            JOptionPane.showMessageDialog(null, enemy.getName() + " ha ganado. ");
        }
    }

    private void showStatus() {
        String status = player.getName() + " -HP: " + player.getStats().get(Stats.HP) + "/" + player.getStats().get(Stats.MAX_HP) + "\n" + enemy.getName() + " -HP: " + enemy.getStats().get(Stats.HP) + "/" + enemy.getStats().get(Stats.MAX_HP);
        JOptionPane.showMessageDialog(null, status, "Estado actual. ", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void main(String[] args) {
        Player player = new Player("Jugador");
        Enemy enemy = new Enemy("Enemigo");
        Game game = new Game(player, enemy);
        game.startGame();
    }
}
