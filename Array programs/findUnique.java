class findUnique {
    public static void main(String[] args) {
        int ans = 0;
        int[] arr = { 1, 2, 4, 2, 5, 1, 4, 5, 100 };
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        System.out.println(ans);
    }
}