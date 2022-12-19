package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height>0) {
            int eights = 8;
            String Space = "";
            int divider = 0;
            if (height % 2 == 0) {
                divider = (height / 2 - 1);
            } else {
                divider = (height / 2);
            }
            for (int i = 1; i < height; i++) {
                eights = eights * 10 + 8;
            }
            System.out.println(eights);
            for (int j = 0; j < divider; j++) {
                eights = eights / 100;
                Space += " ";
                System.out.println(Space + eights);

            }
            for (int i = 0; i < divider; i++) {
                eights = eights * 10 + 8;
                eights = eights * 10 + 8;
                Space = Space.substring(0, Space.length() - 1);
                System.out.println(Space + eights);
            }
        }
    }
}
