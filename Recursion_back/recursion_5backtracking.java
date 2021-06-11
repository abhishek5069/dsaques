import java.io.*;
import java.util.*;

// floodfill
/*
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "",new boolean[n][m]);
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf,boolean arrv[][]) {
        if(sr==maze.length-1&&sc==maze[0].length-1){
            System.out.println(asf);
            return;
        }
        if(sr<0||sc<0||sr>=maze.length||sc>=maze[0].length||arrv[sr][sc]==true||maze[sr][sc]==1){
            return;
        }
        arrv[sr][sc]=true;
        floodfill(maze,sr-1,sc,asf+"t",arrv);
        floodfill(maze,sr,sc-1,asf+"l",arrv);
        floodfill(maze,sr+1,sc,asf+"d",arrv);
        floodfill(maze,sr,sc+1,asf+"r",arrv);
        arrv[sr][sc]=false;
    }
}  */

//N QUEENS
/*
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        printNQueens(new int[n][n],"",0);
    }
    public static boolean isSafe(int chess[][],int row,int col){
        for(int i=row-1,j=col;i>=0;i--){
            if(chess[i][j]==1){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(chess[i][j]==1){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0&&j<chess[0].length;i--,j++){
            if(chess[i][j]==1){
                return false;
            }
        }
        return true;
    }
    public static void printNQueens(int[][] chess, String qsf, int row) {
        if(row==chess.length){
            System.out.println(qsf+".");
            return;
        }
        for(int j=0;j<chess[0].length;j++){
            if(isSafe(chess,row,j)){
                chess[row][j]=1;
                printNQueens(chess,qsf+row+"-"+j+", ",row+1);
                chess[row][j]=0;
            }
        }
    }
}*/
 //KNIGHT TOUR
/*
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int row=scn.nextInt();
        int col=scn.nextInt();
        printKnightsTour(new int[n][n],row,col,1);
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        if(r<0||c<0||r>=chess.length||c>=chess[0].length||chess[r][c]!=0){
            return;
        }
        if(upcomingMove==chess.length*chess[0].length){
            chess[r][c]=upcomingMove;
            displayBoard(chess);
            chess[r][c]=0;
            return;
        }
        chess[r][c]=upcomingMove;
        printKnightsTour(chess,r-2,c+1,upcomingMove+1);
        printKnightsTour(chess,r-1,c+2,upcomingMove+1);
        printKnightsTour(chess,r+1,c+2,upcomingMove+1);
        printKnightsTour(chess,r+2,c+1,upcomingMove+1);
        printKnightsTour(chess,r+2,c-1,upcomingMove+1);
        printKnightsTour(chess,r+1,c-2,upcomingMove+1);
        printKnightsTour(chess,r-1,c-2,upcomingMove+1);
        printKnightsTour(chess,r-2,c-1,upcomingMove+1);
        chess[r][c]=0;
        
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}*/