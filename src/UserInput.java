import java.util.Scanner;

public  class UserInput {
    public  static void  main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter your name ");
        String name = src.next(); //it takes only a word, if find space then stop taking input.
        String fullName = src.nextLine(); // it takes full line as an input, if find a new line then stop taking input.

        System.out.print("Enter your age ");
        int age = src.nextInt();

        // Character input
        char c = src.next().charAt(0);

        System.out.println("Your name is " +name+ " and age is " +age+ "  "+c);
    }
}