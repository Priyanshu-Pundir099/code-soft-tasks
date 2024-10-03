import java.util.*;
public class grade_calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int numSub = sc.nextInt();

        if(numSub <= 0){
            System.out.println("Enter a valid number of subjects");
            return;
        }

        int totalMarks = 0;
        int maxMarkPerSub = 100;

        for(int i=1; i<=numSub; i++){
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int marks = sc.nextInt();

            if(marks < 0 || marks > maxMarkPerSub){
                System.out.println("Marks should be in the range of 0 to 100. Enter valid marks");
                i--;
            }
            else{
                totalMarks += marks;
            }
        }

        double avgPercentage = (double) totalMarks/(numSub * maxMarkPerSub) * 100;
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average Percentage: " + avgPercentage + "%");

        String grade;
        if(avgPercentage >= 90){
            grade = "A+";
        }
        else if(avgPercentage >= 80){
            grade = "A";
        }
        else if(avgPercentage >= 70){
            grade = "B";
        }
        else if(avgPercentage >= 60){
            grade = "C";
        }
        else if(avgPercentage >= 50){
            grade = "D";
        }
        else{
            grade = "F";
        }
        System.out.println("Grade: " + grade);
    }
}