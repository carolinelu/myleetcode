package leetcode;

public class CountPrimes {
    public int countPrimes(int n) {
        int num = 0;
        int primes[] = new int[n];
        for (int i = 2; i < Math.sqrt(n); i++) { //默认从4开始，123都被当作质数
            int temp = i * i;
            while (temp < n) {
                primes[temp - 1] = 1;//1-不是质数  0-是质数
                temp = temp + i;
            }
        }
        for (int i = 2; i < n; i++) { //统计的时候不统计1，从2开始直接统计
            if (primes[i-1] == 0) {
                num++;
            }
        }
        return num;
    }

    public int countPrimes2(int n) {
        int res = 0;
        boolean[] used = new boolean[n];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!used[i - 1]) {
                int temp = i * i;
                while (temp < n) {
                    used[temp - 1] = true; //true不是质数，false是质数
                    temp += i;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (!used[i-1]) {
                res++;
            }
        }
        return res;
    }

    public static void main(String args[]) {
        CountPrimes cd = new CountPrimes();
        System.out.print(cd.countPrimes(100));
    }
}
