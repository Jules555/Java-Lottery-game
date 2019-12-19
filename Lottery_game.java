import java.util.Scanner;

public class Lottery {
    public static void main(String[] args){
        //you will be given 6 chances to enter a number and if you are lucky you will win a gift

        // creating lottery number

        int[] lot = new int[6];

        int k =0;
        do{

           lot[k]=(int)(Math.random()*10);

           k++;

       }while(k<lot.length);



        int number1;
        Scanner input = new Scanner(System.in);
        System.out.println("\nIn order to winn lottery enter a number between 1 and 49 \n" +
                "And remember that u can only enter each number once \n\n Let's start enter a number to win! ");

        number1 = input.nextInt();

        if (number1==lot[0]){
            System.out.println("you are so lucky you have won lottery on the first try !");
            System.exit(0);
        }

        else
            System.out.println("you are not lucky enough try again! \n Enter another number");

        int number2 = input.nextInt();

        if (number2!=number1){
            if (number2==lot[1]){
                System.out.println("you have won lottery!");
                System.exit(0);
            }

            else
                System.out.println("you are not lucky enough try again! \n Enter another number");
        }
        else {
            System.out.println("You have already entered that number try another one");

        }

        int number3=input.nextInt();
        if(number3!=number1&&number3!=number2){
            if(number3==lot[2]){
                System.out.println("You have won lottery!");
                System.exit(0);
            }
            else
                System.out.println("you are not lucky enough try again! \n Enter another number");

        }
        else {
            System.out.println("You have already entered that number try another one");
        }

        int number4=input.nextInt();

        if(number4!=number1&&number4!=number2&&number4!=number3){
            if(number4==lot[3]){
                System.out.println("You have won lottery!");
                System.exit(0);
            }
            else
                System.out.println("you are not lucky enough try again! \n Enter another number");
        }

        else {
            System.out.println("You have already entered that number try another one");
        }

        int number5= input.nextInt();

        if(number5!=number1&&number5!=number2&&number5!=number3&&number5!=number4){
            if(number5==lot[4]){
                System.out.println("You have won lottery!");
                System.exit(0);
            }
            else
                System.out.println("you are not lucky enough , but you have one chance left try again! \n Enter another number");
        }

        else {
            System.out.println("You have already entered that number try another one \n And remember you have one chance left");
        }

        int number6=input.nextInt();

        if(number6!=number1&&number6!=number2&&number6!=number3&&number6!=number4&&number6!=number5){

            if(number6==lot[5]){
                System.out.println("What a chance, at last try  You have won lottery!");
                System.exit(0);
            }
            else
                System.out.println("\n Sorry you have already tried six times, may be it's not your day! Bye bye");
        }

        else {
            System.out.println(" Sorry you have already tried six times, may be it's not your day! Bye bye");
        }


    }
}
