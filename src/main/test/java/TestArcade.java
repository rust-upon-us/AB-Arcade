import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestArcade {
    @Test
    @DisplayName("Test next iteration valid")
    void testNextIterationValid(){
        int row = 0;
        int col = 0;
        int vector = 3;
        int[] expected = new int[]{1,1};
        int[] returned = ArcadeGlobal.GameActions.nextIteration(row,col,vector);
        assertArrayEquals(expected,returned);
    }
    @Test
    @DisplayName("Test next iteration invalid")
    void testNextIterationInvalid(){
        int row = 11;
        int col = 10;
        int vector = 9;
        int[] expected = new int[]{-1,-1};
        int[] returned = ArcadeGlobal.GameActions.nextIteration(row,col,vector);
        assertArrayEquals(expected,returned);
    }
    @Test
    @DisplayName("Test iteration allowed")
    void testNestIterationAllowedTrue(){
        assertTrue(ArcadeGlobal.GameActions.nextIterationAllowed(new int[4][4], 0, 0, 0));
    }
    @Test
    @DisplayName("Test iteration not allowed")
    void testNestIterationAllowedFalse(){
        assertFalse(ArcadeGlobal.GameActions.nextIterationAllowed(new int[4][4], 0, 0, 1));
    }
    @Test
    @DisplayName("Test vector allowed")
    void testValidVector(){
        assertTrue(ArcadeGlobal.GameActions.validVector(new int[][]{{1,0,0},{0,1,0},{0,0,1}}, 0,0,1,1,0,3));
    }
    @Test
    @DisplayName("Test vector not allowed")
    void testInvalidVector(){
        assertFalse(ArcadeGlobal.GameActions.validVector(new int[][]{{1,0,0},{0,1,0},{0,0,1}}, 0,0,0,2,0,3));
    }
}
