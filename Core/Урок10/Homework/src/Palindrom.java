public class Palindrom {
    public static void palindromFinder(String word){
        if(word.length()==5) {
            String reverseWord = "";
            int length = word.length();
            for (int i = length - 1; i >= 0; i--) {
                reverseWord = reverseWord + word.charAt(i);
            }
            if (word.equalsIgnoreCase(reverseWord)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("Word length isn't equal 5");
        }
    }
}
