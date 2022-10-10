public class Exercise10 {
    public static void main(String[] argv) {
        final char[] LETTERS =
                {'B', 'D', 'B', 'C', 'A', 'C', 'D', 'D', 'C', 'A'};
        char mode = LETTERS[0];
        int frequency =0;
        int counter;
        for (int i = 0; i < LETTERS.length; i++) {
            counter = 0;
            for (int j = 0; j < LETTERS.length; j++) {
                if (LETTERS[j] == LETTERS[i]) {
                    counter++;
                }
                if (counter > frequency) {
                    frequency = counter;
                    mode = LETTERS[i];
                }
            }
        }
        System.out.println("The mode is: " + mode);
        System.out.println("The frequency is: " + frequency);
    }
}