import java.util.Scanner;



public class GradeCalculator {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);

       System.out.println("Enter the number of subjects:");
       int Nsub=scan.nextInt(); 
       int Nmarks = 0;
       int totalMarks = 100;
       
       if(Nsub<=0)
       {
        System.out.println("Please Enter valid number of subjects");
        return;
       }

      

       for(int i=0; i< Nsub; i++)
       {
        System.out.println("Enter the marks obtained in Subject "+ (i+1));
        int marks=scan.nextInt();

        if(marks < 0 || marks > totalMarks)
        {
           System.out.println("Marks Should be in the range of 0 to 100. please enter the valid marks.");
           i--;
        }
        else{
            Nmarks = Nmarks + marks;
        }
      }

      double averagePercentage = (double) Nmarks / (Nsub + Nmarks) *100;
      System.out.println("Total Marks:" + Nmarks);
      System.out.println("Average Percentage:" + averagePercentage + "%");

      String grade;

      if(averagePercentage >= 90){
        grade = "A+";
      }
      else if(averagePercentage >= 80){
        grade = "A";
      }
      else if(averagePercentage >= 70){
        grade = "B+";
      }
      else if(averagePercentage >= 50){
       grade = "B";
      }
      else if(averagePercentage >= 40){
        grade = "C";
      }
      else{
        grade = "D";
      }

      System.out.println("Grade:"+ grade);


   }

}
