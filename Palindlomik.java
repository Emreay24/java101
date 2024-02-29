public class Palindlomik {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String word = input.nextLine();
        input.close();

        if (isPalindrome(word)) {
            System.out.println(word + " palindromiktir.");
        } else {
            System.out.println(word + " palindromik değildir.");
        }
    }
}
