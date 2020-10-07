import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter operator  ");
        char operator = sc.next().charAt(0);

        int c;

        switch(operator)
        {
            case '+':
               c=a+b;
       break;

            case '-':
           c=a-b;
             break;

            case '*':
              c=a*b;
                break;

            case '/':
           c=a/b;
              break;

            
            default:
                System.out.printf("not correct");
                return;
        }

        System.out.println(c);
    }
}
