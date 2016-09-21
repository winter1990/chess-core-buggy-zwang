package chess.pieces;

import chess.GameState;
import chess.Player;
import chess.Position;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test the knight's unusual movement patterns
 */
public class KnightTest {

    private Knight knight;
    private GameState gameState;
    private Position origin;

    @Before
    public void setUp() {
        knight = new Knight(Player.Black);
        gameState = new GameState();
        origin = new Position("d5");
        gameState.placePiece(knight, origin);
    }

    @Test
    public void testOccupiedByMe() {
        gameState.placePiece(new Pawn(Player.Black), "e7");
        assertFalse("Cannot move onto my own piece", knight.canMove(origin, new Position("e7")));
    }

    @Test
    public void testOccupiedByOther() {
        gameState.placePiece(new Pawn(Player.White), "e7");
        assertTrue("Should be able to take the other player's piece", knight.canMove(origin, new Position("e7")));
    }
}
