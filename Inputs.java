import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("please write your roll number : ");
        
        int roll_no = input.nextInt();
        System.out.println("your roll number is : " + roll_no);

    }
}
