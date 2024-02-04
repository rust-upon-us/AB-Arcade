package ArcadeGlobal;

public class GameActions {
    // Create a class to handle the check of possible movements inside a given array with a vector given as a parameter
    public static boolean vectorMovement(int[][] field, int currentRow, int currentColumn, int vector, int format, int amount, int minRow, int maxRow){
        // Create a variable to handle the loop
        int loop = 0;
        // Create a variable to store the current iteration
        int[] iteration = {currentRow, currentColumn};
        // Start the loop that checks if the requested action is possible
        while (loop < amount){
            if(loop == 0){
                if(field[currentRow][currentColumn]!=format){
                    return false;
                }
                loop++;
            }else{
                // Check if the next iteration follows the requirements
                if(vectorMovement(field, iteration[0], iteration[1], vector, format, minRow, maxRow)){
                    // Recover the next iteration for the next loop
                    iteration = nextIteration(iteration[0], iteration[1], vector);
                    // raise the value of the variable that handles the loop
                    loop++;
                }else{
                    // the requested action isn't possible
                    return false;
                }
            }

        }
        // The loop ended without returning false, the action is possible
        return true;
    }
    public static boolean vectorMovement(int[][] field, int currentRow, int currentColumn, int vector, int format, int minRow, int maxRow){
        int[] nextIteration;
        // Recover the next iteration inside the array after following the given vector
        nextIteration = nextIteration(currentRow,currentColumn,vector);
        // Check the returned values for the event of unhandled parameters
        if(nextIteration[0] != -1 && nextIteration[1] != -1){
            // Check if the next iteration is a valid one
            if(validVector(field, currentRow,currentColumn,nextIteration[0],nextIteration[1], minRow, maxRow)){
                // Check if the next iteration follows the given format
                return nextIterationAllowed(field, nextIteration[0], nextIteration[1], format);
            }else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int[] nextIteration(int row, int column, int vector){
        int [] result = new int[2];
        // With the given vector return the proper values;
        switch (vector){
            case 0:
                // Movement requested upwards
                result[0]= row - 1;
                result[1]= column;
                break;
            case 1:
                // Movement requested upwards and right
                result[0]= row - 1;
                result[1]= column + 1;
                break;
            case 2:
                // Movement requested right
                result[0]= row;
                result[1]= column + 1;
                break;
            case 3:
                // Movement requested downwards and right
                result[0]= row + 1;
                result[1]= column + 1;
                break;
            case 4:
                // Movement requested downwards
                result[0]= row + 1;
                result[1]= column;
                break;
            case 5:
                // Movement requested downwards and left
                result[0]= row + 1;
                result[1]= column - 1;
                break;
            case 6:
                // Movement requested left
                result[0]= row;
                result[1]= column - 1;
                break;
            case 7:
                // Movement requested upwards and left
                result[0]= row - 1;
                result[1]= column - 1;
                break;
            default:
                // Request not valid
                result[0]= -1;
                result[1]= -1;
        }
        return result;
    }
    public static boolean nextIterationAllowed(int[][] field, int requestedRow, int requestedColumn, int format){
        return switch (format) {
            case 0 ->
                // Check if the requested cell is empty
                    field[requestedRow][requestedColumn] == 0;
            case 1 ->
                // Check if the requested cell belongs to the user
                    field[requestedRow][requestedColumn] == 1;
            case 2 ->
                // Check if the requested cell belongs to the system
                    field[requestedRow][requestedColumn] == 2;
            case 3 ->
                // Check if the requested cell's content is "miss" (used in sink the fleet)
                    field[requestedRow][requestedColumn] == 3;
            case 4 ->
                // Check if the requested cell's content is "hit" (used in sink the fleet)
                    field[requestedRow][requestedColumn] == 4;
            default ->
                // Unhandled format
                    false;
        };
    }
    public static boolean validVector(int[][] field, int currentRow, int currentColumn, int requestedRow, int requestedColumn, int minRow, int maxRow){
        boolean result = true;
        // Check if the requested movement is possible inside the given array
        result = (requestedRow >= minRow && requestedColumn >= 0) && (requestedRow < maxRow && requestedColumn < field[requestedRow].length);
        if(result){
            // Check if the requested movement is inside the current or one of the adjacent rows
            result = (requestedRow-currentRow == 0) || (requestedRow-currentRow == 1) || (requestedRow-currentRow == -1);
            if(result){
                // Check if the requested movement is for an adjacent cell and not the current one
                result = (requestedRow == currentRow && (requestedColumn - currentColumn == 1 || requestedColumn - currentColumn == -1)) || (requestedRow != currentRow && (requestedColumn == currentColumn || requestedColumn - currentColumn == 1 || requestedColumn - currentColumn == -1));
            }
        }
        return result;
    }
}