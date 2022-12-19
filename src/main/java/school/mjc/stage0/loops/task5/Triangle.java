package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        if (cathetusLength>0) {
            String result = "8";
            for (int i = 0; i < cathetusLength; i++) {
                System.out.println(result);
                result += "8";
            }
        }
    }
}
