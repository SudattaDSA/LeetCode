class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();

        int d = Integer.MAX_VALUE;
        // get the min first
        for (int i = 0; i < arr.length - 1; ++i) {
            int val = arr[i + 1] - arr[i];
            if (val < d)
                d = val;
        }

        // add pairs in the list

        for (int i = 0; i < arr.length - 1; ++i) {

            if (arr[i + 1] - arr[i] == d) {

                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                result.add(pair);
                System.out.println(pair);
            }
        }
        return result;
    }
}