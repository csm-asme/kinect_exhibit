package edu.mines.csci598.recycler.splashscreen.playerdetector;

import edu.mines.csci598.recycler.backend.GameManager;
import edu.mines.csci598.recycler.backend.GameState;
import edu.mines.csci598.recycler.backend.OpenNIHandTrackerInputDriver;

public class TestDetectHand {
    public static void main(String[] args) {
        GameManager man = new GameManager( "TestPlayerDetector" );
        OpenNIHandTrackerInputDriver driver = new OpenNIHandTrackerInputDriver();
        driver.installInto( man );
        GameState state = man.getGameState();

        DetectHand dh = new DetectHand( 1000, man );
    }
}