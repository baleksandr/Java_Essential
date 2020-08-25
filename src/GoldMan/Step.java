//package GoldMan;
//
//public class Step {
//    int y = 6;
//    int x = 7;
//    Main main = new Main();
//    Array array = new Array();
////    GameStatus status = new GameStatus();
//
//    void step(boolean expression, int y, int x, int direction) throws Exception {
//        if (expression) {
//            if ("M".equals(array.data[y][x])) {
//                System.out.println("Game Over :(");
//                main.gameStatus = "GAME OVER! :(";
//                main.gameStatus();
//                return;
//            } else if ("B".equals(array.data[y][x])) {
//                System.out.println("You can't move");
//                return;
//            } else if ("E".equals(array.data[y][x])) {
//                System.out.println("YOU WIN!!!!!! :)");
//                main.gameStatus = "YOU WIN! :)";
//                main.gameStatus();
//            } else if ("GG".equals(array.data[y][x])) {
//                main.score += 5;
//                main.score();
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
//        main.countSteps -= 1;
//        main.stepsAmount();
//        main.drawTable();
//        Thread.sleep(500);
//    }
//}
