import java.util.Scanner;
public class Multiply {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int n=sc.nextInt();
        System.out.println("MULTIPLICATION TABLE OF "+n);
        for(int i=1;i<=10;i++){
            System.out.println(i+" x "+n+" = "+ i*n);
        }
        sc.close();
        
    }
}
