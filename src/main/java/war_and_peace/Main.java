package war_and_peace;

import java.util.HashMap;
import java.util.Scanner;

/*The program must read one line from the standard input and for each unique word in
    this line output the count of its repeated occurrence (case insensitive) in the
    "word amount" format (see the output example).

    The order of words output may be arbitrary.
    Each unique word must appear in the output only once.

    Sample Input 1:
        a aa abC aa ac abc bcd a
    Sample Output 1:
        bcd 1
        aa 2
        a 2
        abc 2
        ac 1

    Sample Input 2:
        a A a
    Sample Output 2:
        a 3
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().toLowerCase().split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String word: words){
            if (hashMap.containsKey(word)){
                hashMap.put(word, hashMap.get(word) + 1);
            } else {
                hashMap.put(word, 1);
            }
        }

        hashMap.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
