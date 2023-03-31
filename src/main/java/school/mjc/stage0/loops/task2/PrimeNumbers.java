package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i, num=1, count;

        while (num <= printToInclusive) {
            count = 0;
            i = 2;
            while (i <= num/2) {
                if (num % i == 0) {
                    count++;
                    break;
                }
                i++;
            }
            if (count == 0 && num != 1) {
                System.out.println(num);
            }
            num++;
        }

    }

}
