package inheritance;

public class StringMethods {
    public static void main(String[] args) {
        // String Inspection Methods
        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("second index of l = %d %n", helloWorld.indexOf('l',3));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l', 8));

        String date = String.join("/", "25", "11", "1982");
        System.out.println("date = " + date);

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));
    }
    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length = %d %n", length);
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length-1));
    }
}
