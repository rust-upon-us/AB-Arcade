package ArcadeControllers;

import ArcadeMain.ArcadeApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SinkTheFleetController extends ArcadeController{
    // Create the objects to access the "Field" grid
    @FXML
    private Button grid0101, grid0102, grid0103, grid0104, grid0105, grid0106, grid0107, grid0108, grid0109, grid0110, grid0111, grid0112, grid0113, grid0114, grid0115, grid0116, grid0117, grid0118, grid0119, grid0120;
    @FXML
    private Button grid0201, grid0202, grid0203, grid0204, grid0205, grid0206, grid0207, grid0208, grid0209, grid0210, grid0211, grid0212, grid0213, grid0214, grid0215, grid0216, grid0217, grid0218, grid0219, grid0220;
    @FXML
    private Button grid0301, grid0302, grid0303, grid0304, grid0305, grid0306, grid0307, grid0308, grid0309, grid0310, grid0311, grid0312, grid0313, grid0314, grid0315, grid0316, grid0317, grid0318, grid0319, grid0320;
    @FXML
    private Button grid0401, grid0402, grid0403, grid0404, grid0405, grid0406, grid0407, grid0408, grid0409, grid0410, grid0411, grid0412, grid0413, grid0414, grid0415, grid0416, grid0417, grid0418, grid0419, grid0420;
    @FXML
    private Button grid0501, grid0502, grid0503, grid0504, grid0505, grid0506, grid0507, grid0508, grid0509, grid0510, grid0511, grid0512, grid0513, grid0514, grid0515, grid0516, grid0517, grid0518, grid0519, grid0520;
    @FXML
    private Button grid0601, grid0602, grid0603, grid0604, grid0605, grid0606, grid0607, grid0608, grid0609, grid0610, grid0611, grid0612, grid0613, grid0614, grid0615, grid0616, grid0617, grid0618, grid0619, grid0620;
    @FXML
    private Button grid0701, grid0702, grid0703, grid0704, grid0705, grid0706, grid0707, grid0708, grid0709, grid0710, grid0711, grid0712, grid0713, grid0714, grid0715, grid0716, grid0717, grid0718, grid0719, grid0720;
    @FXML
    private Button grid0801, grid0802, grid0803, grid0804, grid0805, grid0806, grid0807, grid0808, grid0809, grid0810, grid0811, grid0812, grid0813, grid0814, grid0815, grid0816, grid0817, grid0818, grid0819, grid0820;
    @FXML
    private Button grid0901, grid0902, grid0903, grid0904, grid0905, grid0906, grid0907, grid0908, grid0909, grid0910, grid0911, grid0912, grid0913, grid0914, grid0915, grid0916, grid0917, grid0918, grid0919, grid0920;
    @FXML
    private Button grid1001, grid1002, grid1003, grid1004, grid1005, grid1006, grid1007, grid1008, grid1009, grid1010, grid1011, grid1012, grid1013, grid1014, grid1015, grid1016, grid1017, grid1018, grid1019, grid1020;
    @FXML
    private Button grid1101, grid1102, grid1103, grid1104, grid1105, grid1106, grid1107, grid1108, grid1109, grid1110, grid1111, grid1112, grid1113, grid1114, grid1115, grid1116, grid1117, grid1118, grid1119, grid1120;
    @FXML
    private Button grid1201, grid1202, grid1203, grid1204, grid1205, grid1206, grid1207, grid1208, grid1209, grid1210, grid1211, grid1212, grid1213, grid1214, grid1215, grid1216, grid1217, grid1218, grid1219, grid1220;
    @FXML
    private Button grid1301, grid1302, grid1303, grid1304, grid1305, grid1306, grid1307, grid1308, grid1309, grid1310, grid1311, grid1312, grid1313, grid1314, grid1315, grid1316, grid1317, grid1318, grid1319, grid1320;
    @FXML
    private Button grid1401, grid1402, grid1403, grid1404, grid1405, grid1406, grid1407, grid1408, grid1409, grid1410, grid1411, grid1412, grid1413, grid1414, grid1415, grid1416, grid1417, grid1418, grid1419, grid1420;
    @FXML
    private Button grid1501, grid1502, grid1503, grid1504, grid1505, grid1506, grid1507, grid1508, grid1509, grid1510, grid1511, grid1512, grid1513, grid1514, grid1515, grid1516, grid1517, grid1518, grid1519, grid1520;
    @FXML
    private Button grid1601, grid1602, grid1603, grid1604, grid1605, grid1606, grid1607, grid1608, grid1609, grid1610, grid1611, grid1612, grid1613, grid1614, grid1615, grid1616, grid1617, grid1618, grid1619, grid1620;
    @FXML
    private Button grid1701, grid1702, grid1703, grid1704, grid1705, grid1706, grid1707, grid1708, grid1709, grid1710, grid1711, grid1712, grid1713, grid1714, grid1715, grid1716, grid1717, grid1718, grid1719, grid1720;
    @FXML
    private Button grid1801, grid1802, grid1803, grid1804, grid1805, grid1806, grid1807, grid1808, grid1809, grid1810, grid1811, grid1812, grid1813, grid1814, grid1815, grid1816, grid1817, grid1818, grid1819, grid1820;
    @FXML
    private Button grid1901, grid1902, grid1903, grid1904, grid1905, grid1906, grid1907, grid1908, grid1909, grid1910, grid1911, grid1912, grid1913, grid1914, grid1915, grid1916, grid1917, grid1918, grid1919, grid1920;
    @FXML
    private Button grid2001, grid2002, grid2003, grid2004, grid2005, grid2006, grid2007, grid2008, grid2009, grid2010, grid2011, grid2012, grid2013, grid2014, grid2015, grid2016, grid2017, grid2018, grid2019, grid2020;
    @FXML
    private Button ship01, ship02, ship03, ship04, ship05, ship11, ship12, ship13, ship14, ship15;

    @FXML
    private Button launch;

    // Variable to store the amount of cells to be modified on runtime
    private int amount = 0;
    // Variable to store the current vector used
    private int vector = 0;
    // Variables to store the current row and cell used to optimize some functions
    private int row;
    private int cell;
    private int[] lastIteration;
    // Array to contain the values generated on runtime
    private int[][] content;
    // Array to contain the ships position in the grid and the vector they follow
    private int[][] userShipPosition;
    private int[][] npcShipPosition;
    // Variable to keep track if the game started previously
    private boolean gameStarted = false;
    // Variable to keep track if a deployment was requested
    private boolean lockedShip = false;
    // Variable to keep track if a cell was selected
    private boolean lockedCell = false;
    // Variable to keep track if the game is ready
    private boolean gameReady = false;
    private boolean lastHit = false;
    private boolean lastHitCombo = false;
    private int lastHitVector = 0;
    // Array to keep track of the deployed elements
    private boolean[] deployed;
    // Arrays to make easier the access to the fxml buttons
    private Button[][] grid;
    private Button[] userShips;
    private Button[] npcShips;
    private Button currentShip;

    @FXML
    private void switchToLanding() {
        // Restore the default values
        this.amount = 0;
        this.vector = 0;
        this.row = 0;
        this.cell = 0;
        this.lastIteration = null;
        this.userShipPosition=null;
        this.npcShipPosition=null;
        this.gameStarted = false;
        this.lockedShip = false;
        this.lockedCell = false;
        this.gameReady = false;
        this.lastHit = false;
        this.lastHitCombo = false;
        this.lastHitVector = 0;
        this.deployed = null;
        this.userShips = null;
        this.npcShips = null;
        this.currentShip = null;
        this.ship01.setDisable(true);
        this.ship02.setDisable(true);
        this.ship03.setDisable(true);
        this.ship04.setDisable(true);
        this.ship05.setDisable(true);
        this.itemHighlight(this.ship01, this.none);
        this.itemHighlight(this.ship02, this.none);
        this.itemHighlight(this.ship03, this.none);
        this.itemHighlight(this.ship04, this.none);
        this.itemHighlight(this.ship05, this.none);
        this.itemHighlight(this.ship11, this.none);
        this.itemHighlight(this.ship12, this.none);
        this.itemHighlight(this.ship13, this.none);
        this.itemHighlight(this.ship14, this.none);
        this.itemHighlight(this.ship15, this.none);
        this.content = new int[20][20];
        if(this.grid != null){
            gridRestore(0);
            gridRestore(1);
            this.gridControl(true,0);
            this.gridControl(true,1);
        }
        this.content = null;

        this.launch.setDisable(false);
        this.launch.setText("Start");

        ArcadeApplication.changeScene(ArcadeApplication.getMainScene(), "Landing");
    }

    @FXML
    private void startGame(){
        if(!gameStarted){
            // Create the arrays to handle the functions of the program
            this.grid = new Button[][]{
                    {grid0101, grid0102, grid0103, grid0104, grid0105, grid0106, grid0107, grid0108, grid0109, grid0110, grid0111, grid0112, grid0113, grid0114, grid0115, grid0116, grid0117, grid0118, grid0119, grid0120},
                    {grid0201, grid0202, grid0203, grid0204, grid0205, grid0206, grid0207, grid0208, grid0209, grid0210, grid0211, grid0212, grid0213, grid0214, grid0215, grid0216, grid0217, grid0218, grid0219, grid0220},
                    {grid0301, grid0302, grid0303, grid0304, grid0305, grid0306, grid0307, grid0308, grid0309, grid0310, grid0311, grid0312, grid0313, grid0314, grid0315, grid0316, grid0317, grid0318, grid0319, grid0320},
                    {grid0401, grid0402, grid0403, grid0404, grid0405, grid0406, grid0407, grid0408, grid0409, grid0410, grid0411, grid0412, grid0413, grid0414, grid0415, grid0416, grid0417, grid0418, grid0419, grid0420},
                    {grid0501, grid0502, grid0503, grid0504, grid0505, grid0506, grid0507, grid0508, grid0509, grid0510, grid0511, grid0512, grid0513, grid0514, grid0515, grid0516, grid0517, grid0518, grid0519, grid0520},
                    {grid0601, grid0602, grid0603, grid0604, grid0605, grid0606, grid0607, grid0608, grid0609, grid0610, grid0611, grid0612, grid0613, grid0614, grid0615, grid0616, grid0617, grid0618, grid0619, grid0620},
                    {grid0701, grid0702, grid0703, grid0704, grid0705, grid0706, grid0707, grid0708, grid0709, grid0710, grid0711, grid0712, grid0713, grid0714, grid0715, grid0716, grid0717, grid0718, grid0719, grid0720},
                    {grid0801, grid0802, grid0803, grid0804, grid0805, grid0806, grid0807, grid0808, grid0809, grid0810, grid0811, grid0812, grid0813, grid0814, grid0815, grid0816, grid0817, grid0818, grid0819, grid0820},
                    {grid0901, grid0902, grid0903, grid0904, grid0905, grid0906, grid0907, grid0908, grid0909, grid0910, grid0911, grid0912, grid0913, grid0914, grid0915, grid0916, grid0917, grid0918, grid0919, grid0920},
                    {grid1001, grid1002, grid1003, grid1004, grid1005, grid1006, grid1007, grid1008, grid1009, grid1010, grid1011, grid1012, grid1013, grid1014, grid1015, grid1016, grid1017, grid1018, grid1019, grid1020},
                    {grid1101, grid1102, grid1103, grid1104, grid1105, grid1106, grid1107, grid1108, grid1109, grid1110, grid1111, grid1112, grid1113, grid1114, grid1115, grid1116, grid1117, grid1118, grid1119, grid1120},
                    {grid1201, grid1202, grid1203, grid1204, grid1205, grid1206, grid1207, grid1208, grid1209, grid1210, grid1211, grid1212, grid1213, grid1214, grid1215, grid1216, grid1217, grid1218, grid1219, grid1220},
                    {grid1301, grid1302, grid1303, grid1304, grid1305, grid1306, grid1307, grid1308, grid1309, grid1310, grid1311, grid1312, grid1313, grid1314, grid1315, grid1316, grid1317, grid1318, grid1319, grid1320},
                    {grid1401, grid1402, grid1403, grid1404, grid1405, grid1406, grid1407, grid1408, grid1409, grid1410, grid1411, grid1412, grid1413, grid1414, grid1415, grid1416, grid1417, grid1418, grid1419, grid1420},
                    {grid1501, grid1502, grid1503, grid1504, grid1505, grid1506, grid1507, grid1508, grid1509, grid1510, grid1511, grid1512, grid1513, grid1514, grid1515, grid1516, grid1517, grid1518, grid1519, grid1520},
                    {grid1601, grid1602, grid1603, grid1604, grid1605, grid1606, grid1607, grid1608, grid1609, grid1610, grid1611, grid1612, grid1613, grid1614, grid1615, grid1616, grid1617, grid1618, grid1619, grid1620},
                    {grid1701, grid1702, grid1703, grid1704, grid1705, grid1706, grid1707, grid1708, grid1709, grid1710, grid1711, grid1712, grid1713, grid1714, grid1715, grid1716, grid1717, grid1718, grid1719, grid1720},
                    {grid1801, grid1802, grid1803, grid1804, grid1805, grid1806, grid1807, grid1808, grid1809, grid1810, grid1811, grid1812, grid1813, grid1814, grid1815, grid1816, grid1817, grid1818, grid1819, grid1820},
                    {grid1901, grid1902, grid1903, grid1904, grid1905, grid1906, grid1907, grid1908, grid1909, grid1910, grid1911, grid1912, grid1913, grid1914, grid1915, grid1916, grid1917, grid1918, grid1919, grid1920},
                    {grid2001, grid2002, grid2003, grid2004, grid2005, grid2006, grid2007, grid2008, grid2009, grid2010, grid2011, grid2012, grid2013, grid2014, grid2015, grid2016, grid2017, grid2018, grid2019, grid2020}
            };
            this.content = new int[20][20];
            this.deployed = new boolean[]{false, false, false, false, false};
            this.userShipPosition = new int[5][4];
            this.userShips = new Button[]{ship01, ship02, ship03, ship04, ship05};
            this.npcShipPosition = new int[5][4];
            this.npcShips = new Button[]{ship11, ship12, ship13, ship14, ship15};
            // Enable the use of the buttons to allow the user to proceed to the next phase of the game
            this.ship01.setDisable(false);
            this.ship02.setDisable(false);
            this.ship03.setDisable(false);
            this.ship04.setDisable(false);
            this.ship05.setDisable(false);
            // Highlight the buttons to help the user identify its next step
            this.itemHighlight(this.ship01, this.focus);
            this.itemHighlight(this.ship02, this.focus);
            this.itemHighlight(this.ship03, this.focus);
            this.itemHighlight(this.ship04, this.focus);
            this.itemHighlight(this.ship05, this.focus);
            // Disable the "Start" button until the next phase of the game
            this.launch.setDisable(true);
            // Update the value of gameStarted
            this.gameStarted = true;
        }
        else if(!gameReady){
            if(!finishedDeployment() && this.currentShip != null){
                // Loop to alter the deployed ships
                for (int ship = 0; ship < this.userShips.length; ship++) {
                    // Check which ship is currently being deployed
                    if(this.currentShip.getId().equals(this.userShips[ship].getId())){
                        // Store the deployment of the current ship
                        this.deployed[ship] = true;
                        // Alter the field to record the ship deployed
                        shipDeployment(1,true);
                        // Store the ship position
                        this.userShipPosition[ship]=new int[]{this.row, this.cell, this.vector, this.amount};
                        // Disable the current ship button
                        this.userShips[ship].setDisable(true);
                    }
                    // Enable the ships that weren't deployed yet
                    if(!this.deployed[ship]){
                        this.userShips[ship].setDisable(false);
                    }
                }
                restoreDeployment();
            } else if (finishedDeployment()) {
                // Variable to handle if the current ship is deployed
                boolean deployed = false;
                // Randomize the deployment of the npc ships
                for (int ship = 0; ship < this.npcShips.length; ship++) {
                    switch (ship){
                        case 0:
                            this.amount = 4;
                            break;
                        case 1, 2:
                            this.amount = 3;
                            break;
                        case 3, 4:
                            this.amount = 2;
                            break;
                        default:
                            this.amount = 0;
                    }
                    do{
                        // Generate random values for rows and cells
                        this.row = (int) (Math.random() * (10));
                        this.cell = (int) (Math.random() * (20));
                        // Generate random value for the vector
                        this.vector = ((int) (Math.random() * 4)) * 2;
                        // Check if the current deployment is valid
                        deployed = validDeployment(0, 10);
                    }while(!deployed);
                    // Use the obtained values to populate the grid
                    shipDeployment(0,true);
                    // Store the positions of the ships for future usage
                    this.npcShipPosition[ship] = new int[]{this.row,this.cell,this.vector,this.amount};
                }
                // Once the ships are displayed alter the launch button so the user knows how to launch the next phase
                this.launch.setText("To Battle");
                this.launch.setDisable(false);
                // Store the current state of the game
                this.gameReady = true;
            }
        }else {
            // Disable the launch button so no more calls are received
            this.launch.setDisable(true);
            // Enable the npc's grid so the user is able to select the cell to be attacked
            gridControl(false,0);
        }
    }
    @FXML
    private void startDeployment(ActionEvent event){
        if(!lockedShip){
            // Identify the element that triggered the execution of the function
            Button clickedItem = (Button) event.getSource();
            // Set the amount for future use and disable the other items
            switch (clickedItem.getId()){
                case "ship01":
                    this.amount = 2;
                    this.currentShip = this.ship01;
                    this.ship02.setDisable(true);
                    this.ship03.setDisable(true);
                    this.ship04.setDisable(true);
                    this.ship05.setDisable(true);
                    break;
                case "ship02":
                    this.amount = 2;
                    this.currentShip = this.ship02;
                    this.ship01.setDisable(true);
                    this.ship03.setDisable(true);
                    this.ship04.setDisable(true);
                    this.ship05.setDisable(true);
                    break;
                case "ship03":
                    this.amount = 3;
                    this.currentShip = this.ship03;
                    this.ship01.setDisable(true);
                    this.ship02.setDisable(true);
                    this.ship04.setDisable(true);
                    this.ship05.setDisable(true);
                    break;
                case "ship04":
                    this.amount = 3;
                    this.currentShip = this.ship04;
                    this.ship01.setDisable(true);
                    this.ship02.setDisable(true);
                    this.ship03.setDisable(true);
                    this.ship05.setDisable(true);
                    break;
                case "ship05":
                    this.amount = 4;
                    this.currentShip = this.ship05;
                    this.ship01.setDisable(true);
                    this.ship02.setDisable(true);
                    this.ship03.setDisable(true);
                    this.ship04.setDisable(true);
                    break;
            }
            this.itemHighlight(this.currentShip,this.player);
            // Enable the player's grid to deploy the current item
            gridControl(false, 1);
            // Store the current status of the deployment
            this.lockedShip = true;
        }else{
            // Re-enable the items that weren't deployed previously
            for (int deployed = 0; deployed < this.deployed.length; deployed++) {
                if(!this.deployed[deployed]){
                    this.userShips[deployed].setDisable(false);
                    // Restore the display to the previous value
                    this.itemHighlight(this.userShips[deployed], this.focus);
                }
            }
            // Restore the grid
            restoreDeployment();
        }
    }
    @FXML
    private void checkDeployment(ActionEvent event){
        // Variables to handle the execution of loops
        boolean located = false;
        // Identify the element that triggered the execution of the function
        Button clickedItem = (Button) event.getSource();
        if(!this.lockedCell){
            // Restore the values of the variables that contain the current position in the grid
            this.row = 10;
            this.cell = 0;
            // Disable the element's of the grid for the next phase
            gridControl(true,1);
            // Re-enable the clicked cell for further actions
            clickedItem.setDisable(false);
            // Get the position of the selected cell inside the grid
            do{
                for (int currentCell = 0; currentCell < 20 && !located; currentCell++) {
                    if(!this.grid[this.row][currentCell].isDisable()){
                        // Located the "enabled" cell aka selected cell
                        located=true;
                        this.cell = currentCell;
                    }
                }
                if (!located){
                    this.row++;
                }
            }while (!located);
            // row and cell values obtained proceed to check if the selected position can be used to deploy the ship
            if(validDeployment(10, 20)){
                // Request the deployment of the current element
                shipDeployment(1,false);
                // Alter the button that controls the next phase to properly display its function
                this.launch.setText("Confirm");
                this.launch.setDisable(false);
            }else{
                restoreDeployment();
            }
        }else{
            // A new vector was requested
            this.vector = this.vector + 2;
            // Check if the current vector is out of bounds
            if(this.vector >= 8){
                restoreDeployment();
            }else{
                // Request the deployment of the current element if its a valid deployment
                if(validDeployment(10, 20)){
                    // Request the deployment of the current element
                    shipDeployment(1, false);
                    // Alter the button that controls the next phase to properly display its function
                    this.launch.setText("Confirm");
                    this.launch.setDisable(false);
                }else{
                    restoreDeployment();
                }
            }
        }
    }
    @FXML
    private void fireShell(ActionEvent event){
        // Identify the element that triggered the execution of the function
        Button clickedItem = (Button) event.getSource();
        // Recover the value of the row and cell
        for (int currentRow = 0; currentRow < 10; currentRow++) {
            for (int currentCell = 0; currentCell < 20; currentCell++) {
                if(this.grid[currentRow][currentCell].getId().equals(clickedItem.getId())){
                    this.row = currentRow;
                    this.cell = currentCell;
                    // Force the variables into out of bounds to stop the loops
                    currentRow=10;
                    currentCell=20;
                }
            }
        }
        // Check the cell's assigned value and update it with the proper display
        if(this.content[this.row][this.cell] == 2){
            // A ship was hit update its display to let user know of its success
            this.itemHighlight(this.grid[this.row][this.cell],this.hit);
            // Update cell's value to store the hit
            this.content[this.row][this.cell] = 4;
        }else{
            // A ship was not hit update the display to let the user know of its miss
            this.itemHighlight(this.grid[this.row][this.cell],this.miss);
            // Update cell's value to store the miss
            this.content[this.row][this.cell] = 3;
        }
        // Disable the button for next events
        this.grid[this.row][this.cell].setDisable(true);
        // Check if ship are destroyed or the game ended for the npc
        if(shipsDestroyed(0)){
           // Game ended player is victorious
            this.launch.setText("You won");
            this.launch.setDisable(true);
            // Disable the npc's grid
            gridControl(true,0);
            // Disable the player's grid
            gridControl(true,1);
        }else{
            // Npc's turn to fire
            npcFire();
            // Check if the game ended
            if(shipsDestroyed(1)){
                // Game ended player is defeated
                this.launch.setText("You lost");
                this.launch.setDisable(true);
                // Disable the npc's grid
                gridControl(true,0);
                // Disable the player's grid
                gridControl(true,1);
            }
        }
    }

    private void npcFire(){
        if(lastHit){
            int[] shot = null;
            int loop = 0;
            // Generate the next objective
            while (loop < 4){
                // Npc achieved a hit the previous turn change the firing behaviour from random
                if(this.lastHitCombo){
                    // The npc achieved multiple hits so keep on firing with the same vector
                    this.vector = this.lastHitVector;
                }else{
                    // Select a new random vector for the next fire attempt
                    this.vector = ((int) (Math.random() * 4)) * 2;
                }
                // Obtain the new objective
                shot = ArcadeGlobal.GameActions.nextIteration(this.lastIteration[0],this.lastIteration[1],this.vector);
                // Test if the objective is valid
                if(ArcadeGlobal.GameActions.nextIterationAllowed(this.content, shot[0], shot[1],0) || ArcadeGlobal.GameActions.nextIterationAllowed(this.content, shot[0], shot[1],1)){
                    // Shot valid stop the loop in the next iteration
                    loop = 4;
                    // Check the objective's content and update it accordingly
                    if(this.content[shot[0]][shot[1]] == 1){
                        // It's a new hit
                        this.content[shot[0]][shot[1]] = 4;
                        this.itemHighlight(this.grid[shot[0]][shot[1]], this.hit);
                        this.lastHitCombo = true;
                        this.lastHitVector = this.vector;
                        this.lastIteration = shot;
                    }else{
                        // It's a miss
                        this.content[shot[0]][shot[1]] = 3;
                        this.itemHighlight(this.grid[shot[0]][shot[1]], this.miss);
                        this.lastHitCombo = false;
                    }
                }else {
                    // Shot invalid try again
                    shot = null;
                    loop++;
                }
            }
            if(shot == null){
                // A new shot wasn't possible force a new "Random" shot
                this.lastHit = false;
                npcFire();
            }
        }else {
            // Obtain the next objective
            this.row = (int) (Math.random() * (10)) + 10;
            this.cell = (int) (Math.random() * (20));
            // Generate random value for the vector
            if(this.content[this.row][this.cell] == 1){
                // It's a hit
                this.content[this.row][this.cell] = 4;
                this.itemHighlight(this.grid[this.row][this.cell], this.hit);
                this.lastHit = true;
                this.lastIteration = new int[]{this.row,this.cell};
            }else{
                // It's a miss
                this.content[this.row][this.cell] = 3;
                this.itemHighlight(this.grid[this.row][this.cell], this.miss);
                this.lastHit = false;
                this.lastIteration = null;
            }
        }

    }
    private boolean shipsDestroyed(int faction){
        boolean result = true;
        if(faction == 0){
            for (int ship = 0; ship < this.npcShipPosition.length; ship++) {
                if(!ArcadeGlobal.GameActions.vectorMovement(this.content, this.npcShipPosition[ship][0], this.npcShipPosition[ship][1], this.npcShipPosition[ship][2], 4, this.npcShipPosition[ship][3], 0, 10)){
                    result = false;
                }else{
                    this.itemHighlight(this.npcShips[ship], this.hit);
                }
            }
        }
        if(faction == 1){
            for (int ship = 0; ship < this.userShipPosition.length; ship++) {
                if(!ArcadeGlobal.GameActions.vectorMovement(this.content, this.userShipPosition[ship][0], this.userShipPosition[ship][1], this.userShipPosition[ship][2], 4, this.userShipPosition[ship][3], 0, 10)){
                    result = false;
                }
            }
        }
        return result;
    }

    private boolean validDeployment(int minRow, int maxRow){
        // Variable to handle the execution of loops
        boolean valid = false;
        // Loop to check if the selected position can be used to deploy the ship
        while (!valid){
            valid = ArcadeGlobal.GameActions.vectorMovement(this.content, this.row, this.cell, this.vector, 0, this.amount, minRow, maxRow);
            if(!valid){
                // Current vector wasn't able to deploy ship proceed to the next one
                this.vector = this.vector + 2;
            }
            if(this.vector >= 8){
                // The next iteration would have a vector of 8 that is out of bounds which causes a forced stop of the loop
                valid = true;
            }
        };
        if(this.vector >= 8){
            // Following the out-of-bounds vector set the result to "invalid"
            valid = false;
        }
        return valid;
    }
    private boolean finishedDeployment(){
        // Create a variable to control whether the deployment was finished
        boolean control = true;
        // Check if all the ships were deployed
        for (boolean content : this.deployed) {
            if (!content) {
                control = content;
            }
        }
        return control;
    }
    private void shipDeployment(int faction, boolean store){
        // Clear the previous deployment
        gridRestore(faction);
        // A deployment was possible store the results for the next phase
        this.lockedCell = true;
        // Change the display of the grid to properly reflect the results
        // Create 2 variables to handle the affected row and cell
        int[] iteration = new int[]{this.row, this.cell};
        // Begin the loop to alter x fields
        for (int loop = 0; loop < this.amount; loop++) {
            if(store){
                // store the deployment in the field
                if(faction == 1){
                    this.content[iteration[0]][iteration[1]] = 1;
                }
                if(faction == 0){
                    this.content[iteration[0]][iteration[1]] = 2;
                }
            }
            // Display the elements for the user faction
            if(faction == 1){
                // Recover the element to be altered and update its display
                this.itemHighlight(this.grid[iteration[0]][iteration[1]], this.player);
            }


            // recover the values for the next iteration
            iteration = ArcadeGlobal.GameActions.nextIteration(iteration[0],iteration[1],this.vector);
        }
    }
    private void restoreDeployment(){
        // Restore the grid
        gridControl(true,1);
        // Clear the possible styles applied to the grid
        gridRestore(1);
        // Restore the default value of vector
        this.vector = 0;
        // Restore the default value of amount
        this.amount = 0;
        // Restore the default value of row and cell
        this.row = -1;
        this.cell = -1;
        // Restore the default value of the variables
        this.currentShip = null;
        this.lockedShip = false;
        this.lockedCell = false;
        // Alter the button that controls the next phase to properly display its function
        if(!finishedDeployment()){
            this.launch.setText("Start");
            this.launch.setDisable(true);
        }else{
            this.launch.setText("Start Game");
            this.launch.setDisable(false);
        }

    }

    private void gridControl(boolean action, int faction){
        for (int row = 10 * faction; row < (10 + 10*faction); row++) {
            // Loop for each row
            for (int cell = 0; cell < 20; cell++) {
                // Loop for each cell
                if(faction == 1){
                    if(this.content[row][cell] == 0 || action){
                        // If the cell is empty allow its use for the next phase of the game
                        this.grid[row][cell].setDisable(action);
                    }
                }
                if(faction == 0){
                    this.grid[row][cell].setDisable(action);
                }

            }
        }
    }
    private void gridRestore(int faction){
        for (int row = 10 * faction; row < (10 + 10*faction); row++) {
            // Loop for each row
            for (int cell = 0; cell < 20; cell++) {
                // Loop for each cell
                if(this.content[row][cell] == 0){
                    // If the cell is empty restore its style to an "empty" style
                    this.itemHighlight(this.grid[row][cell],this.none);
                }
            }
        }
    }
}
