import java.util.Scanner;
class HelloWorld
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min_num = Math.min(a,b);
        min_num = Math.min(min_num,c);

        int max_num = Math.max(a,b);
        max_num = Math.max(max_num,c);

        int sum_nums = max_num + min_num;

        System.out.println("Sum of number is " + sum_nums);


    }
};
