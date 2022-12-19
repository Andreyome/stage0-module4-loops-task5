package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        if (sideLength>0) {
            for (int i = 0; i < sideLength; i++) {
                System.out.print("8");
            }
            System.out.print("\n");
            for (int i = 2; i < sideLength; i++) {
                System.out.print("8");
                for (int j = 2; j < sideLength; j++) {
                    System.out.print(" ");
                }
                System.out.print("8");
                System.out.print("\n");
            }
            for (int i = 0; i < sideLength; i++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
