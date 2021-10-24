public class board {


    static String[] title= new String[12];
    static String[] subtitle= new String[12];
    static String[] Head= new String[12];


    public static void setDescriptionText(int fieldNumber, String playertitle){
        title[fieldNumber]=playertitle;
    }

    public static String getDescriptionText(int fieldNumber){
        return title[fieldNumber];
    }
    public static void setSubText(int fieldNumber, String subText){
        subtitle[fieldNumber]=subText;
    }
    public static String getSubText(int fieldNumber){
        return subtitle[fieldNumber];
    }

    public static void setTitleText(int fieldNumber, String title){
        Head[fieldNumber]=title;
    }
    public static String getTitleText(int fieldNumber){
        return Head[fieldNumber];
    }



}
