package main;

import java.util.Map;
import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * @author alex.collins
 */
public class Game {
    private String name;
    private Map<String,Integer> points;
    private String[][] grid;
    private int score = 0;

    private final static Logger logger = Logger.getLogger(Game.class);

    public Game(String name, Map<String, Integer> points, String[][] grid) {
        this.name = name;
        this.points = points;
        this.grid = grid;
    }

    public void play() {
        Scanner in = new Scanner(System.in);
        logger.info("You are playing "+name+".");

        while (true) {
            logger.info("Where do you want to dig (enter x then y)?");
            int x = in.nextInt();
            int y = in.nextInt();

            logger.info("You entered x :"+x +" and y: "+y);

            if (grid[x][y] != null) {
                String treasure = grid[x][y];
                score += points.get(treasure);
                grid[x][y] = null;
                logger.info("You found " + treasure + "! Your score is " + score + ".");
            } else {
                logger.info("Sorry, nothing there!");
            }
        }
    }
}
