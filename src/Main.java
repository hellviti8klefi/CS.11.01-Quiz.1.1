import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        String name;
        String food;
        System.out.println("Enter your age ");
        age = sc.nextInt();
        System.out.println("Enter your name ");
        name = sc.next();
        System.out.println("Enter your favourite food ");
        food = sc.next();

        System.out.println("\nYour age is " + age + "\nYour first name is " + name + "\nYour favourite food is " + food );

    }

}
