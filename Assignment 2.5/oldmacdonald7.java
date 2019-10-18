import java.util.Scanner;
class oldmacdonald7{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int dice = 0;
        int sides = 0;
        int sum = 0;
        for(String ans = "y"; ans.equals("y");){
            System.out.println("How many dice do you want");
            dice = sc.nextInt();

            System.out.println("How many sides do you want");
            sides = sc.nextInt();

            rollDie(0, sides, dice);


            System.out.println ("again? [y,n]");
            ans = sc.next();

        }
        System.out.print("thanks");
    }

    public static void rollDie(int b, int a, int c){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(b=0; b<c; b++){
            int x = 0;
            x =(int) ((Math.random()*a) + 1);
            System.out.print (x+" ");
            sum = sum + x;

        }

            System.out.println ();
            System.out.println ("your sum is " + sum);
    }
}

