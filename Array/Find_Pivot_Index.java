class Find_Pivot_Index {

    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int ls = 0;
        int rs = 0;
        int totalsum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalsum += nums[i];
        }

        if (nums.length == 0)
            return -1;

        rs = totalsum;

        for (int i = 0; i < n; i++) {
            ls = ls + nums[i];

            if (ls == rs) {
                return i;
            }

            rs = rs - nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 7, 3, 6, 5, 6 };
        int ind = pivotIndex(arr);
        System.out.println(ind);
    }
}