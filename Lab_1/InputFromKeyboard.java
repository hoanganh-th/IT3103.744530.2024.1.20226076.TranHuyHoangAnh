import java.util.Scanner;
public class InputFromKeyboard 
{
    public static void main(String args[]) 
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What's your name?");
        String strname = keyboard.nextLine();
        System.out.println("Hoang Anh - 6076. How old are you?");
        int iage = keyboard.nextInt();
        System.out.println("Hoang Anh - 6076. How tall are you (m)?");
        double dheight = keyboard.nextDouble();
        System.out.println("Mr/Ms. " + strname + ", " + iage + " years old. Your height is " + dheight + ".");
    }
}