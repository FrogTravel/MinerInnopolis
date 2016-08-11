import java.util.Scanner;

/**
 * Created by ekaterina on 11.08.16.
 */
public class Main {
    public static void main(String[] args) {
        GameGenerator gameGenerator = new GameGenerator();
        gameGenerator.generateBombs();
        gameGenerator.parseField();

        GameShower gameShower = new GameShower();
        Scanner scanner = new Scanner(System.in);

        while(gameShower.getGameState() == 0){
            String str = "";
            try {
                str = scanner.nextLine();
            }catch (NumberFormatException e){

            }

            String[] inputArray = str.split(" ");

            String flag = inputArray[0];
            int x = Integer.parseInt(inputArray[1]), y = Integer.parseInt(inputArray[2]);
            if(flag.equals("o")) {//If open
                try {
                    gameShower.onUserClick(y, x);
                } catch (BombException e) {
                }
            }else{//If flag
                gameShower.onSetFlag(y, x);
            }
            gameShower.showGameField();
            if(gameShower.isAllOpen()){
                System.out.println("GAME OVER");
                gameShower.setGameEnd();
            }
            System.out.println("=================================");
        }
    }
}
