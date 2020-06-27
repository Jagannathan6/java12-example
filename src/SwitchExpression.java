public class SwitchExpression {

    public static void main(String args[]) {
        int x =103;
        switch(x) {
            case 12, 15, 18 -> System.err.println("In Case 12, 15 and 18");
            case 1,2, 3 -> System.err.println("In Case 1, 2 and 3");
            default -> {
                if (x ==100) {
                    System.err.println("Case is 100");
                } else {
                    System.err.println("Not matching any of the values");
                }
            }

        }
    }
}
