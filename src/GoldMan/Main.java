package GoldMan;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main extends JPanel {
    Array array = new Array();

//    public Main(int countSteps) {
//        this.countSteps = countSteps;
//    }

    final int BF_WIDTH = 670;
    final int BF_HEIGHT = 670;

    int y = 6;
    int x = 7;

    int score = 0;
    int countSteps = 20;
    String gameStatus = "Play Game :)";
    String tooltipsActions = "1 - Вверх, 2 - Вниз, 3 - Влево, 4 - Вправо";


    public void stepsAmount() {
        while (countSteps == 0) {
            System.out.println("Your Steps is OVER!");
            gameStatus = "Your Steps is OVER!";
            gameStatus();
            break;
        }
        countSteps();
    }

//    void step(boolean expression, int y, int x, int direction) throws Exception {
//        if (expression) {
//            if ("M".equals(array.data[y][x])) {
//                System.out.println("Game Over :(");
//                gameStatus = "GAME OVER! :(";
//                gameStatus();
//                return;
//            } else if ("B".equals(array.data[y][x])) {
//                System.out.println("You can't move");
//                return;
//            } else if ("E".equals(array.data[y][x])) {
//                System.out.println("YOU WIN!!!!!! :)");
//                gameStatus = "YOU WIN! :)";
//                gameStatus();
//            } else if ("GG".equals(array.data[y][x])) {
//                score += 5;
//                score();
//            }
//        }
//        array.data[this.y][this.x] = "G";
//        if (direction == 1) {
//            this.y--;
//        } else if (direction == 2) {
//            this.y++;
//        } else if (direction == 3) {
//            this.x--;
//        } else if (direction == 4) {
//            this.x++;
//        }
//        array.data[this.y][this.x] = "P";
//        countSteps -= 1;
//        stepsAmount();
//        drawTable();
//        Thread.sleep(500);
//    }

//    void move(int direction) throws Exception {
//        switch (direction) {
//            case 1: {
//                step(y > 0, y - 1, x, direction);
//                break;
//            }
//            case 2: {
//                step(y < 12, y + 1, x, direction);
//                break;
//            }
//            case 3: {
//                step(x > 0, y, x - 1, direction);
//                break;
//            }
//            case 4: {
//                step(x < 12, y, x + 1, direction);
//                break;
//            }
//        }
//    }

//    public void runTheGame() throws Exception {
//        Move move = new Move();
//        Scanner sc = new Scanner(System.in);
//        while (countSteps != 0) {
//            int direction = sc.nextInt();
//            move.move(direction);
//        }
//    }


    public static void main(String[] args) throws Exception {
        Main main = new Main();
//        main.runTheGame();

        Move move = new Move(main);
        Scanner sc = new Scanner(System.in);
        while (main.countSteps != 0) {
            int direction = sc.nextInt();
            move.move(direction);
        }
    }

    // Не смотрите код, что написан ниже. Со временем Вы будете понимать этот код.

    JTable table;
    String[] column = new String[11];
    JLabel labelScore = new JLabel();
    JLabel labelSteps = new JLabel();
    JLabel labelGameStatus = new JLabel();
    JLabel labelTooltipsActions = new JLabel();

    public Main() {
        JFrame frame = new JFrame("Gold_Man 2020");

        table = new JTable();

        table.setTableHeader(null);
        table.setEnabled(false);
        table.setSize(new java.awt.Dimension(300, 300));
        table.setRowHeight(26);
        table.setRowSelectionAllowed(false);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        table.setUpdateSelectionOnSort(false);
        table.setVerifyInputWhenFocusTarget(false);


        for (int i = 0; i < column.length; i++) {
            column[i] = "";
        }

        drawTable();

        add(table);
        add(labelScore);
        add(labelSteps);
        add(labelGameStatus);
        add(labelTooltipsActions);
        frame.setMinimumSize(new Dimension(BF_WIDTH, BF_HEIGHT + 22));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.setVisible(true);
    }

    public void score() {
        labelScore.setText("Score: " + score);
    }

    public void countSteps() {
        labelSteps.setText("Count steps: " + countSteps);
    }

    public void gameStatus() {
        labelGameStatus.setText(gameStatus);
    }

    public void tooltipsActions() {
        labelTooltipsActions.setText(tooltipsActions);
    }

    public void drawTable() {
        table.setModel(new DefaultTableModel(array.data, column));
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(new ImageRenderer_DONT_TOUCH_THIS_FILE());
            TableColumn a = table.getColumnModel().getColumn(i);
            a.setPreferredWidth(26);
        }

        score();
        countSteps();
        gameStatus();
        tooltipsActions();
    }


    public String getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCountSteps() {
        return countSteps;
    }

    public void setCountSteps(int countSteps) {
        this.countSteps = countSteps;
    }
}