import java.util.*;
public class program
{
static void print24hours(String str)
{
    
    int h = (int)str.charAt(1) - '0';
    int h1 = (int)str.charAt(0) - '0';
    int hhh = (h1 * 10 + h % 10);
 
    
    if (str.charAt(8) == 'A'){
        if (hhh == 12){
            System.out.print("00");
            for (int i = 2; i <= 7; i++)
                System.out.print(str.charAt(i));
        }
        else{
            for (int i = 0; i <= 7; i++)
                System.out.print(str.charAt(i));
        }
    }
 
    
    else{
        if (hhh == 12){
            System.out.print("12");
            for (int i = 2; i <= 7; i++)
                System.out.print(str.charAt(i));
        }
        else{
            hhh = hhh + 12;
            System.out.print(hhh);
            for (int i = 2; i <= 7; i++)
                System.out.print(str.charAt(i));
        }
    }
} 
 

public static void main (String[] args){
    String str = "11:05:45PM";
    print24hours(str);
}
}