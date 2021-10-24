public class Matador {
    public static void main (String[] args){
      String player1name, player2name; // for player
      int count; // general
      String title, subtitle, head;
      int [] fieldNumber= new int[11];// for board
      int player1balance=0, player2balance=0, bankModification, sum=0; // for the bank



      //making the board
        count=0;
        while(count<=10){
            switch(count){
                case 0: title="Congratulations! you climbed there tower and earned a reward";
                subtitle="+250";
                break;
                case 1: title="your car landed in a crater. You must pay for repair";
                subtitle="-100";
                break;
                case 2: title="you entered the palace gates, and received a royal welcome gift";
                subtitle="+100";
                break;
                case 3: title="you are stranded in a cold dessert and must light up somr cash to survive";
                subtitle="-20";
                break;
                case 4: title="you entered the Walled city and found some money on the road";
                subtitle="+180";
                break;
                case 5: title="you entered the monastery. This is a cash free zone";
                subtitle="0";
                break;
                case 6: title="you are in the black cave and had to buy a torch";
                subtitle="-70";
                break;
                case 7: title="you rented out your huts in the mountain";
                subtitle="you rented out your huts in the mountain";
                break;
                case 8: title="you entered the werewolf wall and had to pay hospital bills";
                subtitle="-80";
                break;
                case 9: title="you landed in a pit and paid someone to help you out";
                subtitle="-80";
                break;
                case 10: title="you found a goldmine! Congratulations, you're rich now";
                subtitle="+650";
                default: title="error";
                subtitle="error";
            }
            head=Integer.toString(count);
            board.setDescriptionText(count+1, title);
            board.setSubText(count+1, subtitle);
            count++;

        }


        // bank
        switch(sum){
            case 2: bank.add(player1balance, 250);
            break;
            case 3: bank.deduct(player1balance, 100);
            break;
            case 4: bank.add(player1balance, 100);
            break;
            case 5: bank.deduct(player1balance, 20);
            break;
            case 6: bank.add(player1balance, 180);
            break;
            case 7:
        }

    }




}
