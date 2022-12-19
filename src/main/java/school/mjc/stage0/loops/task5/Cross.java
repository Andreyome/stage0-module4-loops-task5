package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        if(sideLength>0) {
            for (int j = 0; j < (sideLength / 2); j++) {
                for (int i = 1; i <= sideLength / 2; i++) {
                    System.out.print(" ");
                }
                System.out.print("8" + "\n");
            }
            for (int i = 1; i <= sideLength; i++) {
                System.out.print("8");
            }
            System.out.print("\n");
            for (int j = 0; j < (sideLength / 2); j++) {
                for (int i = 1; i <= sideLength / 2; i++) {
                    System.out.print(" ");
                }
                System.out.print("8" + "\n");
            }
        }
    }
}
