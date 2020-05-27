package practice;

public class Application {
    public static void main(String[] args) throws NoSuchMethodException {
        System.out.println(Target.class.getMethod("minus", int.class, int.class));
    }
}
