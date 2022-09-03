public class Karatsuba {
    
    /**
     * Uses Karatsuba algorithm for multiplying two numbers
     * 
     * @param x integer to multiply
     * @param y integer to multiply
     * @return product of x and y
     */
    public static long karatsuba(long x, long y) {
        // Base Case
        if (x < 10 && y < 10) {
            return x * y;
        }

        // Get the max size of the numbers (max number of digits)
        int xSize = getNumDigits(x);
        int ySize = getNumDigits(y);
        int n = xSize > ySize ? xSize : ySize;

        // Half the size rounded up
        int halfN = (n / 2) + (n % 2);
        long divisor = (long) Math.pow(10, halfN);

        long a = x / divisor;
        long b = x % divisor;
        long c = y / divisor;
        long d = y % divisor;
        
        long ac = karatsuba(a, c);
        long bd = karatsuba(b, d);
        long pq = karatsuba(a+b, c+d);
        long adbc = pq - ac - bd;

        return (long) Math.pow(10, halfN*2) * ac + (long) Math.pow(10, halfN) * adbc + bd;
    }

    /**
     * Gets the number of digits in an integer
     * 
     * @param num integer to get size of
     * @return size of num
     */
    public static int getNumDigits(long num) {
        int count = 0;

        while (num > 0) {
            num /= 10;
            count++;
        }

        return count;
    }

}
