import java.util.Scanner;

class CharFrequency{

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        int length = 0;

        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (Exception e) {}

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) uniqueCount++;
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = Integer.toString(freq[i]);
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String[][] freqResult = findFrequency(input);
        System.out.println("Character\tFrequency");
        for (int i = 0; i < freqResult.length; i++) {
            System.out.println(freqResult[i][0] + "\t\t" + freqResult[i][1]);
        }
        sc.close();
    }
}
