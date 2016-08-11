/**
 * Created by ekaterina on 10.08.16.
 */
public class Field {
    private static int[][] field;
    private static int size = 0;

    public Field(int size){
        field = new int[size][size];//Make field with specific size
        this.size = size;
        //Initialize field
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                field[i][j] = 0;
            }
        }
    }

    public Field(){};

    public int[][] getField(){
        return field;
    }

    public int getPoint(int i, int j){
        return field[i][j];
    }

    public void setPoint(int i, int j, int value){
        field[i][j] = value;
    }

    public int getSize(){
        return size;
    }


}
