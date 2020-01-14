import java.util.*;
public class grade
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<Integer>();
        int x = 1;
        int grade;
        double average;
        int total =0;
        String letter;
        do
        {
            System.out.println("What did the student get on test #" +x+" (-1 to quit)");
            grade = scan.nextInt();
            x++;
            if(grade!=-1)
            {
                scores.add(grade);
                total+= grade;
                for(int i = 0; i<scores.size(); i++){
                    int each = scores.get(i);
                    System.out.println("Test #"+(i+1)+" " + each);
                }
                average = total/scores.size();
                System.out.println("Average: " +average);
                if(average >= 90)
                letter = "A";
                else if(average <90 && average >= 80)
                letter = "B";
                else if(average < 80 && average >= 70)
                letter = "C";
                else if(average <70 && average >= 60)
                letter = "D";
                else
                letter = "F";
                System.out.println("Grade: " +letter);
                System.out.println("The highest score is: "+max(scores));
                System.out.println("The lowest score is: "+min(scores));
                System.out.println("The mean is: "+mean(scores));
                System.out.println("The mode is: "+mode(scores));
            }
        }while(grade != -1);
        System.out.println("Goodbye");
    }
    public static int max(ArrayList<Integer> high)
    {
        int max = high.get(0);
        for(int x = 0; x < high.size(); x++)
        {
            if(high.get(x) > max)
                max = high.get(x);
        }
        return max;
    }
        public static int min(ArrayList<Integer> mini)
    {
        int min = mini.get(0);
        for(int x = 0; x < mini.size(); x++)
        {
            if(mini.get(x) < min)
                min = mini.get(x);
        }
        return min;
    }
    public static int mean(ArrayList<Integer> avg)
    {
        int total = 0;
        int average = 0;
        for(int x = 0; x<avg.size(); x++)
        {
            total += avg.get(x);
        }
        average = total/avg.size();
        return average;
    }
    public static int mode(ArrayList<Integer> most)
    {
        int maxCount =0, maxValue = 0;
        for(int x = 0; x< most.size();x++)
        {
            int count = 0;
            for(int i = 0; i < most.size(); i++)
            {
                if(most.get(i) == most.get(x))
                    count++;
            }
            if(count > maxCount)
            {
                maxCount = count;
                maxValue = most.get(x);
            }
        }
        return maxValue;
    }
}









 