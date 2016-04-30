package ua.in.codegym.lesson_024;

import java.util.Arrays;

public class MatrixTraversal {
    public static void main(String[] args) {
        int[][] ints = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}};
        System.out.println(Arrays.toString(print(ints)));
    }

    public static int[] print(int[][] input) {
        int row = input.length;
        int col = input[0].length;
        int [] result = new int[row * col];

        if(input == null || input.length == 0) return result;

        int x=0;
        int y=0;
        int z=0;

        while(row>0 && col>0){

            //if one row/column left, no circle can be formed
            if(row==1){
                for(int i=0; i<col; i++){
                    result[z] = (input[x][y++]);
                    z++;
                }
                break;
            }else if(col==1){
                for(int i=0; i<row; i++){
                    result[z] = input[x++][y];
                    z++;
                }
                break;
            }

            //below, process a circle

            //top - move right
            for(int i=0;i<col-1;i++){
                result[z] = input[x][y++];
                z++;
            }
            //right - move down
            for(int i=0;i<row-1;i++){
                result[z] = input[x++][y];
                z++;
            }
            //bottom - move left
            for(int i=0;i<col-1;i++){
                result[z] = input[x][y--];
                z++;
            }
            //left - move up
            for(int i=0;i<row-1;i++){
                result[z] = input[x--][y];
                z++;
            }
            x++;
            y++;
            row=row-2;
            col=col-2;
        }
        return result;
    }
}
