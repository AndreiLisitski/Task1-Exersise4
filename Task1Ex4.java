import java.util.Scanner;

/**
 * Created by Andrei_Lisitski on 1/19/2017.
 */
public class Task1Ex4 {

    public static void main(String[] args) {
        int x, y;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter X = ");
        x = sc.nextInt();
        System.out.print("Enter Y = ");
        y = sc.nextInt();


        if((x <= 4)&&(y <= -3)){
            System.out.print("Ture");
        }else if(((x <= 2)&&(y <= 4))){
            System.out.print("Ture");
        }else if((x <= -4)&&(y <= -3)){
            System.out.print("Ture");
        }else if(((x <= -2)&&(y <= 4))){
            System.out.print("Ture");
        }else {
            System.out.print("False");
        }
        }
    }

