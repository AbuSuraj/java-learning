//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DataTypes {
    public static void main(String[] args) {
         int intNumber = 4363;
         System.out.println(intNumber);

         float floatNumber = 4363.450f;
         System.out.println(floatNumber);

         double doubleNumber = 4363.023444124;
         System.out.println(doubleNumber);

         char charVar = 'a';
         System.out.println(charVar);

         String stringVar = "Abu Bokor Suraj";
         System.out.println(stringVar);

         boolean boolVar = true;
         System.out.println(boolVar);


//         swap two variables
        String a = "This  'a' variable";
        String b = "This is 'b' variable";

        String temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("this is now store in a => "+ a);
        System.out.println("This is store in b => "+ b);
    }
}