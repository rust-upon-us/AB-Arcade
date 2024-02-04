package ArcadeControllers;

import ArcadeMain.ArcadeApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ThreeInRowController extends ArcadeController{
    @FXML
    private Button grid0101, grid0102, grid0103, grid0201, grid0202, grid0203, grid0301, grid0302, grid0303;
    @FXML
    private Label message;
    private boolean init = false;
    private int currentRow;
    private int currentCell;
    private int playerPieces;
    private int npcPieces;
    private Button[][] grid;
    private int[][] content;

    @FXML
    private void switchToLanding() {
        this.content = null;
        this.init = false;
        this.message.setText("");
        lockGrid(false);
        cleanGrid();
        ArcadeApplication.changeScene(ArcadeApplication.getMainScene(), "Landing");
    }

    @FXML
    private void selectCell(ActionEvent event){
        Button clickedItem = (Button) event.getSource();
        boolean found = false;
        boolean valid = false;
        boolean removed = false;
        if(!init){
            this.grid=new Button[][]{{this.grid0101,this.grid0102,this.grid0103},{this.grid0201,this.grid0202,this.grid0203},{this.grid0301,this.grid0302,this.grid0303}};
            this.content = new int[3][3];
            this.playerPieces = 0;
            this.npcPieces = 0;
            this.init = true;
        }
        for (int row = 0; row < this.grid.length; row++) {
            for (int cell = 0; cell < this.grid[row].length; cell++) {
                if(this.grid[row][cell].getId().equals(clickedItem.getId())){
                    this.currentRow=row;
                    this.currentCell=cell;
                    cell = this.grid[row].length;
                    found = true;
                }
            }
            if(found){
                row = this.grid.length;
            }
        }
        if(this.content[this.currentRow][this.currentCell] == 0 && this.playerPieces < 3){
            // Selected an empty cell so set it to player's possession
            this.content[this.currentRow][this.currentCell] = 1;
            this.itemHighlight(this.grid[this.currentRow][this.currentCell],this.player);
            this.playerPieces = this.playerPieces+1;
        }else if(this.content[this.currentRow][this.currentCell] == 1 && this.playerPieces == 3){
            // Selected one player piece so set it to empty and reduce the amount of player pieces
            this.content[this.currentRow][this.currentCell] = 0;
            this.itemHighlight(this.grid[this.currentRow][this.currentCell],this.none);
            this.playerPieces = this.playerPieces-1;
            removed = true;
        }
        // Player turn ended check if player managed to make 3 in a row
        if(gameEnded(1)){
            this.message.setText("You won congratulations");
            lockGrid(true);
        } else if(!removed) {
            // Player turn ended start npc turn
            if(this.npcPieces == 3){
                // Remove 1 piece from the table
                do{
                    this.currentRow = (int) (Math.random() * (3));
                    this.currentCell = (int) (Math.random() * (3));
                    if(this.content[this.currentRow][this.currentCell] == 2){
                        this.content[this.currentRow][this.currentCell] = 0;
                        this.grid[currentRow][currentCell].setDisable(false);
                        this.itemHighlight(this.grid[this.currentRow][this.currentCell],this.none);
                        this.npcPieces = this.npcPieces-1;
                        valid = true;
                    }
                }while (!valid);
                valid = false;
            }
            // Add 1 piece to the table
            do{
                this.currentRow = (int) (Math.random() * (3));
                this.currentCell = (int) (Math.random() * (3));
                if(this.content[this.currentRow][this.currentCell] == 0){
                    this.content[this.currentRow][this.currentCell] = 2;
                    this.grid[currentRow][currentCell].setDisable(true);
                    this.itemHighlight(this.grid[this.currentRow][this.currentCell],this.npc);
                    this.npcPieces = this.npcPieces+1;
                    valid = true;
                }
            }while (!valid);

            if(gameEnded(2)){
                this.message.setText("You lost better luck next time");
                lockGrid(true);
            }
        }
    }
    private boolean gameEnded(int faction){
        if(ArcadeGlobal.GameActions.vectorMovement(this.content, 0, 0, 2, faction, 3, 0, 3)){
            return true;
        } else if (ArcadeGlobal.GameActions.vectorMovement(this.content, 0, 0, 3, faction, 3, 0, 3)) {
            return true;
        } else if (ArcadeGlobal.GameActions.vectorMovement(this.content, 0, 0, 4, faction, 3, 0, 3)) {
            return true;
        } else if (ArcadeGlobal.GameActions.vectorMovement(this.content, 1, 0, 2, faction, 3, 0, 3)) {
            return true;
        } else if (ArcadeGlobal.GameActions.vectorMovement(this.content, 0, 2, 4, faction, 3, 0, 3)) {
            return true;
        }else {
            return false;
        }
    }
    private void lockGrid(boolean action){
        for (int row = 0; row < this.grid.length; row++) {
            for (int cell = 0; cell < this.grid[row].length; cell++) {
                this.grid[row][cell].setDisable(action);
            }
        }
    }
    private void cleanGrid(){
        for (int row = 0; row < this.grid.length; row++) {
            for (int cell = 0; cell < this.grid[row].length; cell++) {
                this.itemHighlight(this.grid[row][cell], this.none);
            }
        }
    }
}
