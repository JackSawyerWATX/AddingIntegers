import java.util.Scanner;

class add2small {
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("Enter two integers, seperated by one space, to calculate their sum:");
        Scanner in = new Scanner(System.in);
        x = in.nextInt ();
        y = in.nextInt ();
        z = x + y;
        System.out.println("Sum of entered integers is: " +z);
    }
}
