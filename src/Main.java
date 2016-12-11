import java.util.Random;

/**
 * Created by andrey on 05.12.16.
 */
public class Main {
    public static void main(String[] args) {

        LittleAlgorithm algorithm = new LittleAlgorithm();

        int[][] graph = {
                {0,5,0,0,2,0,0,6},//1
                {5,0,2,0,0,2,0,1},//2
                {0,2,0,4,2,0,0,7},//3
                {0,0,4,0,1,9,7,0},//4
                {2,0,2,1,0,3,0,0},//5
                {0,2,0,9,3,0,8,12},//6
                {0,0,0,7,0,8,0,2},//7
                {6,1,7,0,0,12,2,0}//8
        };
        //находим минимальный элемент каждой строки матрицы
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                System.out.format("%5s",graph[i][j]);
            }
            System.out.print("| min =" + algorithm.getMinRow(graph, i));
            System.out.println();
        }
        //вычитаем минимальный элемент строки из этой строки
        algorithm.incMinRowElement(graph);
        System.out.println("---------------------------------------------------");
        algorithm.showMatrix(graph);
        System.out.println("----------------------------------------------\nmin column element");

        //минимальный элемент столбца
        for(int i = 0; i < graph.length;i++){
            System.out.print(algorithm.getMinCol(graph, i) + " ");
        }
        System.out.println();
        System.out.println();
        //вычитание минимального элемента столбца
        algorithm.incMinColElement(graph);
        algorithm.showMatrix(graph);

        algorithm.coefOfNull(graph);
    }

}
