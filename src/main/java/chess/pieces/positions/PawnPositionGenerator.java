package chess.pieces.positions;

import chess.Direction;
import chess.GameState;
import chess.Player;
import chess.Position;

import java.util.HashSet;
import java.util.Set;

/**
 * A position generator that is specific to the Pawn's behavior
 */
public class PawnPositionGenerator extends PiecePositionGenerator {


    public PawnPositionGenerator(Player player, GameState gameState) {
        super(player, gameState);
    }

    @Override
    public Set<Position> generate(Position origin) {
        Direction walkDir;
        Set<Direction> attackDir = new HashSet<Direction>();
        if (player.equals(Player.White)) {
            walkDir = Direction.North;
            attackDir.add(Direction.NorthEast);
            attackDir.add(Direction.NorthWest);
        } else {
            walkDir = Direction.South;
            attackDir.add(Direction.SouthEast);
            attackDir.add(Direction.SouthWest);
        }

        // Black and White players should be considered separately
        final int row = origin.getRow();
        final char col = origin.getColumn();
        int maxStepsCanTake;

        if (row == (player.equals(Player.White) ? 2 : 7)) {
            maxStepsCanTake = 2;
        } else {
            maxStepsCanTake = 1;
        }

        Set<Position> positions = new HashSet<Position>();

        // Check one & two steps forward
        Position oneStep = origin.step(walkDir);
        if (oneStep != null && isEmpty(oneStep)) {
            positions.add(oneStep);

            Position twoStep = oneStep.step(walkDir);
            if (twoStep != null && isEmpty(twoStep) && (maxStepsCanTake == 2)) {
                positions.add(twoStep);
            }
        }

        // Check if we can take any pieces
        for (Direction dir : attackDir) {
            Position attackStep = origin.step(dir);
            if (isOccupied(attackStep, player.other())) {
                positions.add(attackStep);
            }
        }

        return positions;
    }

}
