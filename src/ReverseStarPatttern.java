public class ReverseStarPatttern {
    public static void main(String[] args) {
        int rows=4;
        int  spaces=0;
        int stars=rows;
        for(int i=1;i<=rows;i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
        }
        for(int k=1;k<=stars;k++){
            System.out.print("*");
        }
        System.out.println();
        stars++;
        rows--;
    }

}
