public class Main {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Greetings to the viewers");
        System.out.println("");
        System.out.println("Learning about variable types in Java");
        System.out.println("int, String, double, boolean");

        // "int" receives an example value, e.g.: = 2

        int length = 50;
        int width = 20;
        int height = 20;
        int perimeter = (height + length + width);

        System.out.println("int = " + perimeter + " cm");

        // Writing here about the String variable

        String firstName = "anderson";
        String lastName1 = "Pereira";
        String lastName2 = "Da Silva";

        System.out.println("String = " + " " + firstName + " " + lastName1 + " " + lastName2);

        // Writing here about the double variable

        double realNumber = 7;
        double divisor = 2;
        System.out.println("Real Number = " + realNumber / divisor);

        // Writing here about the boolean variable

        boolean workOnWeekdays = true;
        boolean workOnWeekends = false;

        System.out.println("I work on weekdays = " + workOnWeekdays);
        System.out.println("I work on weekends = " + workOnWeekends);
    }
}
