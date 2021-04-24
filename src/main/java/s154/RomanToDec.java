package s154;

/*
    The program converts a number from Roman system into the decimal one
*/

public class RomanToDec {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String[] letters = scanner.nextLine().split("");
        int currentLettersMeaning = 0;
        int prevLettersMeaning = 0;
        int equalsLetters = 0;
        int result = 0;

        for (int i = 0; i < letters.length; i++ ){
            switch (letters[i]){
                case "I":
                    currentLettersMeaning = 1;
                    break;
                case "V":
                    currentLettersMeaning = 5;
                    break;
                case "X":
                    currentLettersMeaning = 10;
                    break;
                case "L":
                    currentLettersMeaning = 50;
                    break;
                case "C":
                    currentLettersMeaning = 100;
                    break;
                case "D":
                    currentLettersMeaning = 500;
                    break;
                case "M":
                    currentLettersMeaning = 1000;
                    break;
            }
           if ( i == 0 ) {
               result += currentLettersMeaning;
           } else {
               if(currentLettersMeaning < prevLettersMeaning){
                   result += currentLettersMeaning;
                   equalsLetters = 0;
               }else if(currentLettersMeaning == prevLettersMeaning){
                   result += currentLettersMeaning;
                   equalsLetters += equalsLetters == 0 ?  2 * currentLettersMeaning  :   currentLettersMeaning;
               }else if(currentLettersMeaning > prevLettersMeaning){
                   result += currentLettersMeaning;
                   result -= 2 * prevLettersMeaning + equalsLetters;
                   equalsLetters = 0;
               }
           }
//            System.out.println(letters[i]);
//            System.out.println(result);
            prevLettersMeaning = currentLettersMeaning;
        }
        System.out.println(result);
    }
}
