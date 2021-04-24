package s125;

public class StarPrinter {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int size = scanner.nextInt();
        int middle = size / 2;

        String[][] array = new String[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i == j || j == size - 1 - i || i == middle || j == middle){
                    array[i][j] = "*";
                }else{
                    array[i][j] = ".";
                }
            }

        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j]);
                if( j != size - 1){
                    System.out.print(" ");
                }else if(i != size - 1){
                    System.out.println();
                }
            }

        }

    }
}
