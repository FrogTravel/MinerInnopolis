
/**
 * @author ekaterina
 */
public class GameGenerator {
    private Field field;
    private int numberOfBombs = 10;

    private int bombNumber = 9;

    private int bomb;

    public GameGenerator(){
        field = new Field(10);
    }

    public void generateBombs(){
        int x, y;
        for(int i = 0; i < numberOfBombs; i++){
            x = (int)(Math.random()*field.getSize());
            y = (int)(Math.random()*field.getSize());

            field.setPoint(x, y, bombNumber);

        }
    }


    public void showField(){
        for(int i = 0; i < field.getSize(); i++){
            for(int j = 0; j < field.getSize(); j++){
                System.out.print(field.getPoint(i, j) + " ");
            }
            System.out.print("\n");
        }
    }



    public void parseField(){
        for(int i = 0; i < field.getSize(); i++){
            for(int j = 0; j < field.getSize(); j++){
                if(field.getPoint(i, j) != bombNumber) {
                    try {
                        if (field.getPoint(i, j - 1) == bombNumber) {
                            field.setPoint(i, j, field.getPoint(i, j) + 1);
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {

                    }

                    try {
                        if (field.getPoint(i - 1, j - 1) == bombNumber) {
                            field.setPoint(i, j, field.getPoint(i, j) + 1);
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {

                    }
                    try {
                        if (field.getPoint(i - 1, j) == bombNumber) {
                            field.setPoint(i, j, field.getPoint(i, j) + 1);
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {

                    }
                    try {
                        if (field.getPoint(i - 1, j + 1) == bombNumber) {
                            field.setPoint(i, j, field.getPoint(i, j) + 1);
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {

                    }
                    try {
                        if (field.getPoint(i, j + 1) == bombNumber) {
                            field.setPoint(i, j, field.getPoint(i, j) + 1);
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {

                    }
                    try {
                        if (field.getPoint(i + 1, j + 1) == bombNumber) {
                            field.setPoint(i, j, field.getPoint(i, j) + 1);
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {

                    }
                    try {
                        if (field.getPoint(i + 1, j) == bombNumber) {
                            field.setPoint(i, j, field.getPoint(i, j) + 1);
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {

                    }
                    try {
                        if (field.getPoint(i + 1, j - 1) == bombNumber) {
                            field.setPoint(i, j, field.getPoint(i, j) + 1);
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {

                    }
                }
            }
        }
    }
}
