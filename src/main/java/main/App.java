package main;

import org.apache.log4j.Logger;

/**
 * @author alex.collins
 */
public class App {

    final static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) throws Exception {

        Game game = new GameFactory().createGame(App.class.getResourceAsStream("/example.field"));
        logger.info("The game object created off of text: "+game.toString());
        game.play();
    }
}
