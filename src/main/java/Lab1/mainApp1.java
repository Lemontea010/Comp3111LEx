package Lab1;

public class mainApp1 {
    public static void main(String[] args) {
        int b=2;
        int n=11;
        System.out.println("Welcome to Scientific Calculator!");
        System.out.println("Program started ...");
        System.out.println("This is the 3rd line of message");
        System.out.println(b+" tp power "+n+" = "+ myLibrary.Power(b,n));
        System.out.println(n+"!="+myLibrary.factorial(n));
    }
}
