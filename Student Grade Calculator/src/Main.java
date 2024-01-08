import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the marks of subject");

        Scanner Eng = new Scanner(System.in);
        System.out.println("1) English");
        int English =  Eng.nextInt();
        System.out.println("English Marks (out of 100) = "+ English);
        System.out.println();

        System.out.println("2) Mathematics");
        Scanner Math = new Scanner(System.in);
        int Mathematics = Math.nextInt();
        System.out.println("Mathematics Marks (Out of 100) = "+ Mathematics);
        System.out.println();

        System.out.println("3) Science");
        Scanner Sci = new Scanner(System.in);
        int Science = Sci.nextInt();
        System.out.println("Science Marks (Out of 100) = "+ Science);
        System.out.println();

        System.out.println("4) Geography");
        Scanner Geo = new Scanner(System.in);
        int Geography = Geo.nextInt();
        System.out.println("Geography Marks (Out of 100) = "+ Geography);
        System.out.println();

        System.out.println("5) Computer Science");
        Scanner CS = new Scanner(System.in);
        int ComputerScience = CS.nextInt();
        System.out.println("Computer Science Marks (Out of 100) = "+ ComputerScience);
        System.out.println();


        //Sum of total obtained marks in all subject is
        int sum = English+Mathematics+Science+Geography+ComputerScience;



        //Average Percentage
        int Percentage = sum/5;



        //Showing Result
        System.out.println("Result - ");
        System.out.println("Sum of total obtained marks in all subject is = "+sum);
        System.out.println("Average percentage achieved = "+Percentage + "%");
        int Grade;
        if(Percentage==100 & Percentage>=81){
            System.out.println("Grade = A");
        } else if (Percentage>=61) {
            System.out.println("Grade = B");
        } else if (Percentage>=41) {
            System.out.println("Grade = C");
        } else if (Percentage>=21) {
            System.out.println("Grade = D");
        } else if (Percentage>=0) {
            System.out.println("Grade = E");
        }



    }
}