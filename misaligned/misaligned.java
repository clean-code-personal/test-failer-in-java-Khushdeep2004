public class Misaligned {
    static int printColorMap() {
        String majorColors[] = {"White", "Red", "Black", "Yellow", "Violet"};
        String minorColors[] = {"Blue", "Orange", "Green", "Brown", "Slate"};
        int i = 0, j = 0;
         int count = 0;
        for(i = 0; i < majorColors.length; i++) {
            for(j = 0; j < minorColors.length; j++) {
                int idx = i * minorColors.length + j; 
                System.out.printf("%d | %s | %s \n", idx, majorColors[i], minorColors[j]);
                 count++;
                if(count==0){
                assert(idx == 1);
                }
        }
        return count;
    }
    public static void main(String[] args) { 
        int result = printColorMap();
         // assert (result == 1);
        System.out.println("All is well (maybe!)");
    }
}
