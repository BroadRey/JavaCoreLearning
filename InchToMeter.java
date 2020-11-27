public class InchToMeter {

    private static double inchToMeter(double inch) {
        return inch * 0.0254;
    }

    private static double inchToFoot(double inch) {
        return inch * 0.0833333;
    }

    public static void main(String[] args) {
        double inch;

        for (inch = 1; inchToFoot(inch) < 12; inch++) {
            if (inch % 2 != 0)
                System.out.println(inchToMeter(inch));

            if (inch % 12 == 0)
                System.out.println();
        }
    }
}
