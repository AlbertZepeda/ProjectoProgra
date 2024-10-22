package rpg;

import javax.swing.JOptionPane;
import rpg.entities.Player;
import rpg.entities.enemies.Enemy;
import rpg.entities.enemies.elf.Elf;
import rpg.entities.enemies.ghost.Ghost;
import rpg.entities.enemies.malamen.Malamen;
import rpg.entities.enemies.masiosare.Masiosare;
import rpg.entities.enemies.nahual.Nahual;

import java.util.Random;

/**
 * Características del juego y generador de enemigos aleatorios
 */
public class Game {
    private Player player;
    private Enemy enemy;
    public Game() {
        this.player = new Player("Jugador");
        this.enemy = generateRandomEnemy();
    }

    /**
     * Genera un enemigo aleatorio
     * @return Un objeto Enemy
     */
    private Enemy generateRandomEnemy() {
        Random random = new Random();
        int enemyType = random.nextInt(5); // 5 tipos de enemigos
/**
 * bucle de enemigos a combatir
 */
        switch (enemyType) {
            case 0:
                return new Elf("Duende");
            case 1:
                return new Ghost("Fantasma");
            case 2:
                return new Malamen("Malamen");
            case 3:
                return new Masiosare("Masiosare");
            case 4:
                return new Nahual("Nahual");
            default:
                /**
                 * el duende oscuro es el enemigo base
                 */
                return new Elf("Duende Oscuro");
        }
    }

    /**
     * Inicia el juego
     */
    public void startGame() {
        JOptionPane.showMessageDialog(null, "¡La batalla entre " + player.getName() + " y " + enemy.getName() + " comienza!");
        /**
         * bucle de turnos para atacar
         */
        while (player.isAlive() && enemy.isAlive()) {
            int choice = JOptionPane.showOptionDialog(null,
                    "Es tu turno, elige una acción",
                    "RPG Game",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    new String[]{"Atacar"},
                    "Atacar");

            if (choice == 0) {
                player.attack(enemy);
                if (!enemy.isAlive()) {
                    JOptionPane.showMessageDialog(null, "¡El enemigo ha sido derrotado!");
                    break;
                }
                enemyTurn();
            }

            if (!player.isAlive()) {
                JOptionPane.showMessageDialog(null, "¡Has sido derrotado!");
                break;
            }
        }
        determineWinner();
    }

    /**
     * Turno del enemigo
     */
    private void enemyTurn() {
        JOptionPane.showMessageDialog(null, "El enemigo ataca...");
        enemy.attack(player);
    }
    /**
     * Indicar al vencedor
     */
    private void determineWinner() {
        if (player.isAlive()) {
            JOptionPane.showMessageDialog(null, player.getName() + " ha ganado la batalla.");
        } else {
            JOptionPane.showMessageDialog(null, enemy.getName() + " ha ganado la batalla.");
        }
    }
    /**
     * Ejecución del juego
     * @param args
     */
    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }
}
