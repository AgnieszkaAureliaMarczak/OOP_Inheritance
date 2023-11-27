package inheritance;

public class StringFormatting {
    public static void main(String[] args) {
// textBlock
        String textBlock = """
                Print a Bulleted List:
                        \u2022 First Point
                           \u2022 Sub Point""";
        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);
        System.out.printf("Your age is %.2f%n", (float)age);

        for (int i = 1; i < 100000; i*=10) {
            System.out.printf("Printing %6d %n", i); //<<< setting up the width of the number
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}