package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power > 0) {
            System.out.println(1);
            int count = 1, temp = 1;
            while (count <= power) {
                temp = temp * 2;
                count++;
                System.out.println(temp);
            }
        } else if (power == 0) {
            System.out.println(1);
        } else {
            System.out.println("too much power");
        }
    }
}
