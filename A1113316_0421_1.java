import java.util.*;

public class A1113316_0421_1 {
    public static void main(String[] args) {

        String email;
        System.out.println("input school email:");
        Scanner number = new Scanner(System.in);
        email = number.next();
        if(email.matches("[a,m]{1}[0-9]{7}[@]{1}[a-z]{4}[.]{1}[a-z]{3}[.]{1}[a-z]{3}[.]{1}[a-z]{2}")){
            System.out.println("Your email:" +email);
        }else{
            System.out.println("格式錯誤");
        }
                
    }
}
