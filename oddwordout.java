public class oddwordout {
    public static void main(String[] args) {
        String str = "apple banana orange grape kiwi mango pear";
        String[] words = str.split(" ");
        
        String oddWord = "";
        for (String word : words) {
            if (word.length() % 2 != 0) {
                oddWord = word;
                break;
            }
        }
        
        System.out.println("The odd word out is: " + oddWord);
    }
}
