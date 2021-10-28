import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
class MatadorRuntimeTest {

    @Test
    void main() {
        String player1name, player2name; // for player
        int count, num1, num2, rollcounter=0;
        boolean won = false;
        Random dice = new Random();
        Random dice2 = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean player1turn, player2turn = false;// general
        boolean player1NameEqualsPlayer2Name = false;
        String title, subtitle, head;
        int player1balance = 1000, player2balance = 1000, sum; // for the bank

        //making the board
        count = 0;
        while(count<11){
            switch (count) {
                case 0 -> {
                    title = "Congratulations! you climbed there tower and earned a reward";
                    subtitle = "+250";
                }
                case 1 -> {
                    title = "your car landed in a crater. You must pay for repair";
                    subtitle = "-100";
                }
                case 2 -> {
                    title = "you entered the palace gates, and received a royal welcome gift";
                    subtitle = "+100";
                }
                case 3 -> {
                    title = "you are stranded in a cold dessert and must light up some cash to survive";
                    subtitle = "-20";
                }
                case 4 -> {
                    title = "you entered the Walled city and found some money on the road";
                    subtitle = "+180";
                }
                case 5 -> {
                    title = "you entered the monastery. This is a cash free zone";
                    subtitle = "+0";
                }
                case 6 -> {
                    title = "you are in the black cave and had to buy a torch";
                    subtitle = "-70";
                }
                case 7 -> {
                    title = "you rented out your huts in the mountain";
                    subtitle = "+60";
                }
                case 8 -> {
                    title = "you entered the werewolf wall and had to pay hospital bills";
                    subtitle = "-80 + extra throw";
                }
                case 9 -> {
                    title = "you landed in a pit and paid someone to help you out";
                    subtitle = "-50";
                }
                default -> {
                    title = "you found a goldmine! Congratulations, you're rich now";
                    subtitle = "+650";
                }
            }
            head=Integer.toString(count);
            board.setTitleText(count, head);
            board.setDescriptionText(count, title);
            board.setSubText(count, subtitle);
            count++;
        }
        //players
        player1name="tester1";
        player.addPlayer(player1name, 1000);
        player2name="tester2";
        player.addPlayer(player2name, 1000);


        int start = 1;
        player1turn= start == 1;
        while(!won){
            if(player1turn) {
                System.out.println(player1name + "'s turn");
                rollcounter++;
            }
            else {
                player2turn=true;
                System.out.println(player2name + "'s turn");
                rollcounter++;
            }
            //determines who's turn it is



            // dice
            int thrower=1;
            while(thrower!=0){
                System.out.println("enter 0 to throw dice");
                thrower=0;
            }
            num1=1+dice.nextInt(6);
            num2=1+dice2.nextInt(6);
            System.out.println("dice 1: " + num1);
            System.out.println("dice 1: " + num2);
            sum=num1+num2;
            System.out.println("The sum of your throws is:" + sum);

            // bank
            if(player1turn){

                switch (sum) {
                    case 2 -> player1balance = bank.add(player1balance, 250);
                    case 3 -> player1balance = bank.deduct(player1balance, 100);
                    case 4 -> player1balance = bank.add(player1balance, 100);
                    case 5 -> player1balance = bank.deduct(player1balance, 20);
                    case 6 -> player1balance = bank.add(player1balance, 180);
                    case 8 -> player1balance = bank.deduct(player1balance, 70);
                    case 9 -> player1balance = bank.add(player1balance, 60);
                    case 10 -> player1balance = bank.deduct(player1balance, 80);
                    case 11 -> player1balance = bank.deduct(player1balance, 50);
                    case 12 -> player1balance = bank.add(player1balance, 650);
                }
                System.out.println(board.getDescriptionText(sum-2));
                System.out.println(board.getSubText(sum-2));
                System.out.println(player1name + "'s balance is now " + player1balance);

                if(player1balance>1000000)
                    won=true;
            }
            if(!player1turn){

                switch (sum) {
                    case 2 -> player2balance = bank.add(player2balance, 250);
                    case 3 -> player2balance = bank.deduct(player2balance, 100);
                    case 4 -> player2balance = bank.add(player2balance, 100);
                    case 5 -> player2balance = bank.deduct(player2balance, 20);
                    case 6 -> player2balance = bank.add(player2balance, 180);
                    case 8 -> player2balance = bank.deduct(player2balance, 70);
                    case 9 -> player2balance = bank.add(player2balance, 70);
                    case 10 -> player2balance = bank.deduct(player2balance, 80);
                    case 11 -> player2balance = bank.deduct(player2balance, 50);
                    case 12 -> player2balance = bank.add(player2balance, 650);
                }
                System.out.println(board.getDescriptionText(sum-2));
                System.out.println(board.getSubText(sum-2));
                System.out.println(player2name + "'s balance is now " + player2balance);


            }

        }
        System.out.println("Amount of rolls in this test " + rollcounter);

        if(player1turn)
            System.out.println(player1name + " won");
        else
            System.out.println(player2name + " won");
    }


}
