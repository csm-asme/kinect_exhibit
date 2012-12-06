package edu.mines.csci598.recycler.frontend;

import org.apache.log4j.Logger;

import edu.mines.csci598.recycler.frontend.graphics.GameScreen;
import edu.mines.csci598.recycler.frontend.graphics.Sprite;

/**
 * Created with IntelliJ IDEA.
 * User: jrramey11
 * Date: 11/30/12
 * Time: 2:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class GameOver {
    private static final Logger logger = Logger.getLogger(GameOver.class);

    private GameScreen gameScreen;
    private Sprite s;
    private boolean displayed;

    public GameOver(Side side) {
        displayed = false;
        gameScreen = GameScreen.getInstance();
        if (side == Side.LEFT) {
            s = new Sprite("src/main/resources/SpriteImages/game_over_p1.png", 0, 0);
        } else {
            s = new Sprite("src/main/resources/SpriteImages/game_over_p2.png", 0, 0);
        }
    }

    public void setGameOver(GameStatusDisplay gameStatusDisplay) {
        if (!displayed) {
            gameStatusDisplay.setGameOverState(true);
            gameScreen.addGameOverSprite(s);
            displayed = true;
        }
    }
}