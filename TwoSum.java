import java.util.HashMap;

public class TwoSum {
  public static void main(String[] args) {
    int target = 9;
    int[] numbers = {11, 15, 2, 7};
    int[] result = findTwoSum(numbers, target);

    if (result != null) {
      System.out.println("Indices found: " + result[0] + ", " + result[1]);
    } else {
      System.out.println("No solution found.");
    }
  }

  public static int[] findTwoSum(int[] numbers, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < numbers.length; i++) {
      int complement = target - numbers[i];

      if (map.containsKey(complement)) {
        return new int[] { map.get(complement), i };
      }

      map.put(numbers[i], i);
    }

    return null;
  } 
}
