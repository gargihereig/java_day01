//write a program to reverse a number and string
import java.util.Scanner;

public class Reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String word=sc.nextLine();
        int rem,rev=0;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println("REVERSED NUMBER:"+rev);
        
        String revword="";
    
        for(int i=word.length()-1;i>=0;i--){
            revword+=word.charAt(i);

        }
        System.out.println("Reversed word "+revword);

    }
}