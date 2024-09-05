//Check for Palindrome

import java.util.Scanner;

class Palindrome{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your reversed string: ");
        String str = input.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed));
    }
}