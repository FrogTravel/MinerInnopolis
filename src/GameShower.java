/**
 * Created by ekaterina on 11.08.16.
 */
public class GameShower {
    private Field field;
    private String[][] userField;
    private int gameState;
    private int numberOfFlags = 0;

    public GameShower(){
        field = new Field();
        userField = new String[field.getSize()][field.getSize()];
        for(int i = 0; i < field.getSize(); i++){
            for(int j = 0; j < field.getSize(); j++){
                userField[i][j] = "C";
            }
        }
    }

    public void showGameField(){
        for(int i = 0; i < field.getSize(); i++){
            for(int j = 0; j < field.getSize(); j++){
                if(userField[i][j].equals("C"))
                    System.out.print(userField[i][j] + " ");
                else if(userField[i][j].equals("F")){
                    System.out.print(userField[i][j] + " ");
                }else
                    System.out.print(field.getPoint(i,j) + " ");
            }
            System.out.print("\n");
        }
    }


    public void onUserClick(int x, int y) throws BombException {
        userField[x][y] = "O";
        if(isBomb(x,y)){
            gameState = 1;
            throw new BombException();
        }
    }

    public void onSetFlag(int x, int y){
        userField[x][y] = "F";
        numberOfFlags++;
    }

    public boolean isAllOpen(){
        boolean flag = false;
        for(int i = 0; i < field.getSize(); i++){
            for(int j = 0; j < field.getSize(); j++){
                if(userField[i][j].equals("C"))
                    return false;
            }
        }
        return true;
    }


    public boolean isBomb(int i, int j){
        return field.getPoint(i, j) == 9;
    }

    public int getGameState(){
        return gameState;
    }

    public void setGameEnd() {
        gameState = 1;
    }
}
