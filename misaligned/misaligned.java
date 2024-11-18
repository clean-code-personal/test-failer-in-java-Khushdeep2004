public class Misaligned {
    static int printColorMap() {
        String majorColors[] = {"White", "Red", "Black", "Yellow", "Violet"};
        String minorColors[] = {"Blue", "Orange", "Green", "Brown", "Slate"};
        int i = 0, j = 0;
        for(i = 0; i < majorColors.length; i++) {
            for(j = 0; j < minorColors.length; j++) {
                System.out.printf("%d | %s | %s \n", i * minorColors.length + j, majorColors[i], minorColors[i]);
            }
        }
        return i * j;
    }
    public static void main(String[] args) { 
        int result = printColorMap();
        assert(result == 25);
        System.out.println("All is well (maybe!)");
    }
}
