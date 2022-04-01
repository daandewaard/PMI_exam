package Matrix;

import java.util.ArrayList;

public class Matrix {

    public static int[] indexOfFirstNonZero(int[][] matrix){
        int[] nonZeroLocation = new int[]{0, 0};
        boolean nonZeroFound = false;
        for(int i = 0; i < matrix.length; i++){
            if(!nonZeroFound){
                for(int j = 0; j < matrix[i].length; j++){
                    if(!nonZeroFound){
                        if(matrix[i][j] != 0){
                            nonZeroLocation[0] = i;
                            nonZeroLocation[1] = j;
                            nonZeroFound = true;
                        }
                    }
                }
            }
        }
        return nonZeroLocation;
    }

    public static ArrayList<Integer> getMinimumOfRows(int[][] matrix) {
        ArrayList<Integer> lowestInEachRow = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            int lowest = matrix[i][0];
            for(int j = 1; j < matrix[i].length; j++){
                if(matrix[i][j] < lowest){
                    lowest = matrix[i][j];
                }
            }
            lowestInEachRow.add(lowest);
        }
        return lowestInEachRow;
    }
}
