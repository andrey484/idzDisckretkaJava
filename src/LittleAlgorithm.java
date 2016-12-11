import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by andrey on 05.12.16.
 */
class LittleAlgorithm {

    ArrayList<Integer> lisOfValue = new ArrayList<>();

    int matrixSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    int getMinRow(int[][] arr, int i) {
        int min;
        int temp = matrixSum(arr);
        for (int k = 0; k < arr[i].length; k++) {
            if (arr[i][k] == 0)
                continue;
            if (arr[i][k] < temp)
                temp = arr[i][k];
        }
        min = temp;
        return min;
    }

    int[][] incMinRowElement(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = getMinRow(arr, i);
            for (int j = 0; j < arr.length; j++)
                if (arr[i][j] != 0)
                    arr[i][j] = arr[i][j] - temp;

        }
        return arr;
    }

    void showMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.format("%5s", arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    int getMinCol(int[][] arr, int i) {
        int min;
        int temp = arr[i][0];
        for (int k = 0; k < arr[i].length; k++) {
            if (arr[k][i] < temp)
                temp = arr[k][i];
        }
        min = temp;
        return min;
    }

    int[][] incMinColElement(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = getMinCol(arr, i);
            if (temp != 0) {
                for (int k = 0; k < arr[i].length; k++) {
                    if (arr[k][i] != 0)
                        arr[k][i] = arr[k][i] - temp;
                }
            }
        }
        return arr;
    }

    private int getMinCoefForNullRow(int[][] arr, int i) {
        int min;
        int temp = matrixSum(arr);
        for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] == 0)
                continue;
            if (arr[i][j] < temp)
                temp = arr[i][j];
        }
        min = temp;
        return min;
    }


    private int getMinCoefForNullCol(int[][] arr, int i) {
        int min;
        int temp = matrixSum(arr);
        for (int j = 0; j < arr[i].length; j++) {
            if (arr[j][i] == 0)
                continue;
            if (arr[j][i] < temp)
                temp = arr[j][i];
        }
        min = temp;
        return min;
    }

    void coefOfNull(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 0) {

                }
            }
        }


    }


}

