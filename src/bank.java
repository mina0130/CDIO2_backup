public class bank {
    int current, modification, newTotal;

    public bank(int current, int modification){
        this.current=current;
        this.modification=modification;
    }
    public static int add(int current, int modification){
       int newTotal=current+modification;
        return newTotal;
    }
    public static int deduct(int current, int modification){
       int newTotal=current-modification;
       if(newTotal<0){
           newTotal=0;
       }
        return newTotal;
    }

}
