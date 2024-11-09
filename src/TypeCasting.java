public class TypeCasting {
    public static void main(String[] args) {
        // TODO:  widening: it is done automatically
        int x = 5;
        System.out.println("normal int value => " +x);
        double y = x;
        System.out.println("casting value in double => " +y);

        // TODO: narrowing is done manually

        double doubleValue = 10.01;
        System.out.println("value in double => " +doubleValue);

        int intValue = (int) doubleValue;
        System.out.println("value in int => " +intValue);
    }
}
