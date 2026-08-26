// for special award, avg greater than 95
// for distinction all marks greater than 90
//otherwise just pass or just fail

//variables used: name,sub1,sub2,sub3,total,avg
//data types: int, double, string
//Java class libraries: java.util 


import java.util.Scanner;
public class StudentResultAnalyser {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.nextLine();
        System.out.println("Enter marks of MATH:");
        int math=sc.nextInt();
        System.out.println("Enter marks of ENGLISH:");
        int eng=sc.nextInt();
        System.out.println("Enter marks of SCIENCE:");
        int sci=sc.nextInt();

        int total=math+eng+sci;
        double avg=total/3.0;//calc average(IMPLICIT TYPE CASTING)
        System.out.println("------------STUDENT DETAILS------------");
        System.out.println("Name: "+name);
        System.out.println("Marks scored in each subject");
        System.out.println("Math: "+math);
        System.out.println("English: "+eng);
        System.out.println("Science: "+sci);
        System.out.println("Average mark scored: "+avg);
        System.out.println("------------MARKS STATUS------------");
        if(math<=35||eng<=35||sci<=35){
            System.out.println("We regret to inform you that you have failed"); 
        } 
        else {
            System.out.println("Congratulations! "+name+", You have passed!");
            if(avg>=95){
                System.out.println("Also, you have achieved a Special award!");
            }
            else if(math>=90 && eng>=90 && sci>=90){
                System.out.println("Distinction");
            }
    }
    sc.close();
}
}