package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        if (multiplyByAndToInclusive == 0) {
            System.out.print("");
        } else if (multiplyByAndToInclusive > 0) {
            while (counter <= multiplyByAndToInclusive) {
                System.out.println(counter * multiplyByAndToInclusive);
                counter++;
            }
        } else {
            while (counter >= multiplyByAndToInclusive) {
                if (counter == 0) {
                    System.out.println(counter * multiplyByAndToInclusive);
                } else {
                    System.out.print("-");
                    System.out.println(counter * multiplyByAndToInclusive);
                }
                counter--;
            }
        }
    }
}
