public class Misaligned {
    static int printColorMap() {
        String majorColors[] = {"White", "Red", "Black", "Yellow", "Violet"};
        String minorColors[] = {"Blue", "Orange", "Green", "Brown", "Slate"};
        int i = 0, j = 0;
        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                System.out.println("{0} | {1} | {2}", i * 5 + j, majorColors[i], minorColors[i]);
            }
        }
        return i * j;
    }
}
    