import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so dong");
        int row = scanner.nextInt();
        System.out.println("Nhap vao so cot");
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("nhap vao so co hang " + (i + 1) + " cot: " + (j + 1));
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Nhap vao cot muon tinh tong");
        int id = scanner.nextInt();
        int check = id-1;
        int sum = 0;
        for(int i=0;i<row;i++){
            sum+=arr[i][check];
        }
        System.out.println(sum);


    }
}
