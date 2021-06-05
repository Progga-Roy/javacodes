import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int i;
        System.out.print("Enter last = ");
        int number =input.nextInt();
        for(i=1;i<=number;i++)
        {
            System.out.printf("%d\n",i);
            if(i%2==0)
            {
                System.out.printf("Even %d \n",i);
            }
              else
            {
                System.out.printf(" Odd %d \n",i);
            }
        }

    }

}
