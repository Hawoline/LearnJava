import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    int[] nums = new int[] {1, 2, 3};
    List list = new ArrayList<>();
    list.add(nums[0]);
    list.add(nums[2]);
    list.set(1, nums[1]);
    list.remove(0);
    System.out.println(list);
  }
}