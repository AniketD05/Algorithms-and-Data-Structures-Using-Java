public class SecondMostFrequentCharacter {

    public static char findSecondMostFrequentCharacter(String str) {
        int[] frequency = new int[256];

        for (char ch : str.toCharArray()) {
            frequency[ch]++;
        }

        int maxFrequency = Integer.MIN_VALUE;
        int secondMaxFrequency = Integer.MIN_VALUE;
        char maxChar = '\0';
        char secondMaxChar = '\0';

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > maxFrequency) {
                secondMaxFrequency = maxFrequency;
                secondMaxChar = maxChar;
                maxFrequency = frequency[i];
                maxChar = (char) i;
            } else if (frequency[i] > secondMaxFrequency && frequency[i] != maxFrequency) {
                secondMaxFrequency = frequency[i];
                secondMaxChar = (char) i;
            }
        }

        return secondMaxChar;
    }

    public static void main(String[] args) {
        String str = "Annnnikettttttttt";
        char secondMostFrequentChar = findSecondMostFrequentCharacter(str);
        System.out.println("The second most frequent character is: " + secondMostFrequentChar);
    }
}
