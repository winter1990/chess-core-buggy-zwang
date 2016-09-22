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

    // test normal movements
    @Test
    public void testOccupiedByOtherNorthEast() {
        gameState.placePiece(new Pawn(Player.White), "e7");
        assertTrue("Should be able to take the other player's piece", knight.canMove(origin, new Position("e7")));
    }
    @Test
    public void testOccupiedByOtherNorthWest() {
        gameState.placePiece(new Pawn(Player.White), "c7");
        assertTrue("Should be able to take the other player's piece", knight.canMove(origin, new Position("c7")));
    }
    @Test
    public void testOccupiedByOtherSouthEast() {
        gameState.placePiece(new Pawn(Player.White), "e3");
        assertTrue("Should be able to take the other player's piece", knight.canMove(origin, new Position("e3")));
    }
    @Test
    public void testOccupiedByOtherSouthWest() {
        gameState.placePiece(new Pawn(Player.White), "c3");
        assertTrue("Should be able to take the other player's piece", knight.canMove(origin, new Position("c7")));
    }
    @Test
    public void testOccupiedByOtherEastNoth() {
        gameState.placePiece(new Pawn(Player.White), "f6");
        assertTrue("Should be able to take the other player's piece", knight.canMove(origin, new Position("f6")));
    }
    @Test
    public void testOccupiedByOtherEastSouth() {
        gameState.placePiece(new Pawn(Player.White), "f4");
        assertTrue("Should be able to take the other player's piece", knight.canMove(origin, new Position("f4")));
    }
    @Test
    public void testOccupiedByOtherWestNorth() {
        gameState.placePiece(new Pawn(Player.White), "b6");
        assertTrue("Should be able to take the other player's piece", knight.canMove(origin, new Position("b6")));
    }
    @Test
    public void testOccupiedByOtherWestSouth() {
        gameState.placePiece(new Pawn(Player.White), "b4");
        assertTrue("Should be able to take the other player's piece", knight.canMove(origin, new Position("b4")));
    }
}
