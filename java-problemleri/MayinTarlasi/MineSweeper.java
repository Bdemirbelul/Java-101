import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private final int rows;
    private final int cols;
    private final int mineCount;
    private final String[][] mineMap;
    private final String[][] playerMap;
    private final boolean[][] opened;
    private final Scanner input;

    public MineSweeper(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.mineCount = (rows * cols) / 4;
        this.mineMap = new String[rows][cols];
        this.playerMap = new String[rows][cols];
        this.opened = new boolean[rows][cols];
        this.input = new Scanner(System.in);

        initializeMaps();
        placeMines();
    }

    private void initializeMaps() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mineMap[i][j] = "-";
                playerMap[i][j] = "-";
                opened[i][j] = false;
            }
        }
    }

    private void placeMines() {
        Random random = new Random();
        int placed = 0;

        while (placed < mineCount) {
            int r = random.nextInt(rows);
            int c = random.nextInt(cols);

            if (!mineMap[r][c].equals("*")) {
                mineMap[r][c] = "*";
                placed++;
            }
        }
    }

    private void printMap(String[][] map) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean isInBounds(int r, int c) {
        return r >= 0 && r < rows && c >= 0 && c < cols;
    }

    private int countNeighborMines(int r, int c) {
        int count = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }

                int nr = r + i;
                int nc = c + j;

                if (isInBounds(nr, nc) && mineMap[nr][nc].equals("*")) {
                    count++;
                }
            }
        }

        return count;
    }

    public void run() {
        int safeCellsToOpen = (rows * cols) - mineCount;
        int openedSafeCells = 0;

        System.out.println("Mayinlarin Konumu");
        printMap(mineMap);
        System.out.println("===========================");
        System.out.println("Mayin Tarlasi Oyuna Hosgeldiniz !");

        while (true) {
            printMap(playerMap);
            System.out.print("Satir Giriniz : ");
            int r = input.nextInt();
            System.out.print("Sutun Giriniz : ");
            int c = input.nextInt();

            if (!isInBounds(r, c)) {
                System.out.println("Gecersiz koordinat, lutfen tekrar giriniz.");
                continue;
            }

            if (opened[r][c]) {
                System.out.println("Bu koordinat daha once secildi, baska bir koordinat girin.");
                continue;
            }

            if (mineMap[r][c].equals("*")) {
                System.out.println("Game Over!!");
                System.out.println("===========================");
                break;
            }

            int neighborMineCount = countNeighborMines(r, c);
            playerMap[r][c] = String.valueOf(neighborMineCount);
            opened[r][c] = true;
            openedSafeCells++;

            System.out.println("===========================");

            if (openedSafeCells == safeCellsToOpen) {
                System.out.println("Oyunu Kazandiniz !");
                printMap(playerMap);
                System.out.println("===========================");
                break;
            }
        }
    }
}
