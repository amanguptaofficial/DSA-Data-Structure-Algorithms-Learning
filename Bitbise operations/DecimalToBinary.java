class DecimalToBinary {

    static int decimalToBinary(int n) {
        int ans = 0, i = 0;
        while (n > 0) {
            int x = n & 1;
            ans = ans + x * (int) Math.pow(10, i);
            n = n >> 1;
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int ans = decimalToBinary(10);
        System.out.println(ans);
    }
}