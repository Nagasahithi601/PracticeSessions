package Patterns;

public class Diamond {
    public static void main(String[] args) {
        int i, j, k;
        int rows =5;
        for(i = 1; i<=rows; i++){
            for(j=1; j<=rows -i; j++){
                System.out.print(" ");
            }
            for(k=1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        rows = rows-1;
        for(i = rows; i >= 1; i--) {
            for (j = rows; j >=i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("Appu bava your diamond pattern");
    }
}
