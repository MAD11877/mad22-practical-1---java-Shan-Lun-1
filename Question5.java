import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Question5 {
  public static void main(String[] args) {
    /**
     * Prompt the user for number. This input indicates the number of integers the
     * user will be entering next.
     * Print out the mode (highest occurrence) from the set of integers.
     * e.g.
     * > 5
     * > 2
     * > 4
     * > 1
     * > 3
     * > 4
     * 4
     * 
     * e.g.
     * > 4
     * > 2
     * > 2
     * > 3
     * > 3
     * 2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

    Scanner in = new Scanner(System.in);
    int x = in.nextInt();

    int[] nums = new int[x];
    ArrayList<Integer> uniqueNums = new ArrayList<Integer>();
    ArrayList<Integer> occurences = new ArrayList<Integer>();

    for (int i = 0; i < x; i++) {
      int num = in.nextInt();
      nums[i] = num;
      if (uniqueNums.contains(num) == false) {
        uniqueNums.add(num);
      }
      int index = uniqueNums.indexOf(num);
      if (index < occurences.size()) {
        int val = occurences.get(index) + 1;
        occurences.set(index, val);
      } else {
        occurences.add(1);
      }
    }

    int maxVal = occurences.get(0);
    int maxPos = 0;
    for (int i = 1; i < occurences.size() - 1; i++) {
      if (occurences.get(i) > maxVal) {
        maxVal = occurences.get(i);
        maxPos = i;
      }
    }
    System.out.println(uniqueNums.get(maxPos));
  }
}
