public class MatrisTranspozBulma {
    public static void main(String[] args) {
        int[][] matris = {
                {2, 3, 4},
                {5, 6, 4}
        };

        int satir = matris.length;
        int sutun = matris[0].length;

        int[][] transpoz = new int[sutun][satir];

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris : ");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Transpoze : ");
        for (int i = 0; i < transpoz.length; i++) {
            for (int j = 0; j < transpoz[i].length; j++) {
                System.out.print(transpoz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
