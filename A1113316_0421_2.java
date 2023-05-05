import java.util.*;

public class A1113316_0421_2 {
    public static void main(String[] args) {
        String date;
        System.out.println("輸入生日年月日(YYYY/MM/DD):");
        Scanner day = new Scanner(System.in);
        date = day.next();
        if (date.matches("[0-9]{4}[/]{1}[0,1]{1}[0-9]{1}[/]{1}[0-9]{2}")||date.matches("[0,1]{1}[0-9]{1}[/]{1}[0-9]{2}[/]{1}[0-9]{4}")){
           System.out.println(date);
        }else{
            System.out.println("輸入錯誤");
        }
    }
}
