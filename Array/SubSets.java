import java.lang.Character.Subset;
import java.util.ArrayList;
import java.util.List;

//leecode 78

class SubSets {

    public static List<List<Integer>> Subset(int nums[]) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList()); // adding the []

        for (int num : nums) {
            int n = res.size();

            for (int i = 0; i < n; i++) {
                // copy the list
                // add list num
                // res sub add

                List<Integer> temp = new ArrayList<>(res.get(i));
                temp.add(num);
                res.add(temp);

            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        List<List<Integer>> res = Subset(arr);
        res.forEach(values -> {
            System.out.println(values);
        });
    }
}