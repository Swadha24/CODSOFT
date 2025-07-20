import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Subjects : ");
        int n=sc.nextInt();
        int sub[]=new int[n];
        int sum=0;
        
        
        for(int i=0;i<n;i++){
            System.out.print("Subject "+(i+1) + "= ");
            sub[i]=sc.nextInt();
        }

        System.out.println("----Results----");

        for(int i=0;i<n;i++){
            System.out.println("Subject "+(i+1) + " = "+ sub[i]);
        }

        for(int i=0;i<n;i++){
            sum=sum+sub[i];
        }
        float average = (float)sum / n;
        System.out.println("Average = " + average);

        if(average>=90 && average<=100){
            System.out.println("Grade = A");
        }
        else if(average>=75 && average<90){
            System.out.println("Grade = B");
        }
        else if(average>=60 && average<75){
            System.out.println("Grade = C");
        }
        else if(average>=40 && average<60){
            System.out.println("Grade = D");
        }
        else{
            System.out.println("Failed");
        }


        sc.close();
    }
    
}