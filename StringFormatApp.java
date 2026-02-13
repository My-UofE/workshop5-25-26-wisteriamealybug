public class StringFormatApp {
    public static void main(String[] args) {
        String name = args[1];
        int age = Integer.parseInt(args[1]);
        float height = Float.parseFloat(args[2]);
        System.out.printf("Name: %-20s Age: %3d Height: %4.2fm%n", name, age, height);
        double spaceHeight = height * 1.023;
        System.out.printf("My space height would be %.1fcm%n", spaceHeight);
        double marsAge = age / 1.88;
        System.out.printf("On Mars I would be approximately %d years old.%n", Math.round(marsAge));
    }
}
