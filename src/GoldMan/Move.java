package GoldMan;

public class Move {
    public Main main;

    public Move(Main w) {
        this.main = w;
    }

//    int y = 6;
//    int x = 7;
    Array array = new Array();
//    Main main = new Main();
//    Step step = new Step();

    void step(boolean expression, int y, int x, int direction) throws Exception {
        if (expression) {
            if ("M".equals(array.data[y][x])) {
                System.out.println("Game Over :(");
                main.gameStatus = "GAME OVER! :(";
                main.gameStatus();
                return;
            } else if ("B".equals(array.data[y][x])) {
                System.out.println("You can't move");
                return;
            } else if ("E".equals(array.data[y][x])) {
                System.out.println("YOU WIN!!!!!! :)");
                main.gameStatus = "YOU WIN! :)";
                this.main.gameStatus();
            } else if ("GG".equals(array.data[y][x])) {
                main.score += 5;
                main.score();
            }
        }
        array.data[main.y][main.x] = "G";
        if (direction == 1) {
            main.y--;
        } else if (direction == 2) {
            main.y++;
        } else if (direction == 3) {
            main.x--;
        } else if (direction == 4) {
            main.x++;
        }
        array.data[main.y][main.x] = "P";
        main.countSteps -= 1;
        main.stepsAmount();
        main.drawTable();
        Thread.sleep(500);
    }

    public void move(int direction) throws Exception {
        switch (direction) {
            case 1: {
                step(main.y > 0, main.y - 1, main.x, direction);
                break;
            }
            case 2: {
                step(main.y < 12, main.y + 1, main.x, direction);
                break;
            }
            case 3: {
                step(main.x > 0, main.y, main.x - 1, direction);
                break;
            }
            case 4: {
                step(main.x < 12, main.y, main.x + 1, direction);
                break;
            }
        }
    }
}