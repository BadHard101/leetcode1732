class Main {
    public static int largestAltitude(int[] gain) {
        int max = 0;
        int temp = 0;
        for (int j : gain) {
            temp += j;
            if (temp > max) max = temp;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int[] gain1 = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }
}