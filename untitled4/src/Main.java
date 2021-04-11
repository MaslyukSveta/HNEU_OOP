import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] arr = new int [25][25];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++){
                arr[i][j] = 0;
            }
        }

        System.out.println(CountOfRoutes(1,1, N, M, arr));
    }

    static int CountOfRoutes(int x, int y, final int fieldRows, final int fieldCols, int[][] arr)
    {

        if (x > fieldRows) return 0;
        if (y > fieldCols) return 0;

        if (x < 1) return 0;
        if (y < 1) return 0;

        if (x == fieldCols && y == fieldRows)
            return 1;

        if (arr[x - 1][y - 1] > 0) return arr[x - 1][y - 1];
        if (arr[x - 1][y - 1] < 0) return 0;

        int L = CountOfRoutes(x + 2, y + 1, fieldRows, fieldCols, arr) + CountOfRoutes(x + 1, y + 2, fieldRows, fieldCols, arr) + CountOfRoutes(x -1, y + 2, fieldRows, fieldCols, arr)+CountOfRoutes(x +2, y -1, fieldRows, fieldCols, arr);

        if (L == -1) {
            arr[x - 1][y - 1] = -1;
        }
        else arr[x - 1][y - 1] = L;
            return L;
    }
}