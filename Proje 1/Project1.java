
package Project;

import java.util.Scanner;
public class Project1 {
    public static void main(String[] args) {
        System.out.println("DART GAME!");
        System.out.print("Enter the number of darts to be thrown: ");

        Scanner scn =new Scanner(System.in);
        int num = scn.nextInt();
        System.out.println();

        double statistics = 100.0 / num;

        double x;
        double y;

        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countE = 0;
        int countF = 0;
        int countG = 0;
        int countUndecided = 0;

        for(int i=1; i<=num; i++){

            x = ((int)(Math.random() * 100 - 50)) / 10.0;
            y = ((int)(Math.random() * 100 - 50)) / 10.0;

            System.out.println("Dart " + i + ":");

            System.out.println("Coordinates: ("+ x + ", " + y +")");

            if(x > 0 && y > 0){
                if(x+y < 5){
                    System.out.println("Region: A");
                    countA++;
                }
                else if(x+y > 5){
                    System.out.println("Region: B");
                    countB++;
                }
                else{
                    System.out.println("Region: Undecided.");
                    countUndecided++;
                }
            }

            else if (x > 0 && y < 0){
                System.out.println("Region: F");
                countF++;
            }

            else if(x<0 && y<0){
                if (x<y) {
                    System.out.println("Region: D");
                    countD++;
                }
                else if(x>y){
                    System.out.println("Region : E");
                    countE++;
                }
                else{
                    System.out.println("Region: Undecided.");
                    countUndecided++;
                }
            }

            else if (x<0 && y>0){
                if((x+3)*(x+3)+(y-3)*(y-3)<1){
                    System.out.println("Region : C");
                    countC++;
                }
                else if((x+3)*(x+3)+(y-3)*(y-3)>1){
                    System.out.println("Region: G");
                    countG++;
                }
                else{
                    System.out.println("Region: Undecided.");
                    countUndecided++;
                }
            }

            else{
                System.out.println("Region: Undecided.");
                countUndecided++;
            }
            System.out.println();
        }

        System.out.println("Region statistics:");

        String letterS;

        letterS = (countA > 1) ? "darts" : "dart";
        System.out.println("A: " + countA + " " + letterS + " (" + statistics * countA + "%)");

        letterS = (countB > 1) ? "darts" : "dart";
        System.out.println("B: " + countB + " " + letterS + " (" + statistics * countB + "%)");

        letterS = (countC > 1) ? "darts" : "dart";
        System.out.println("C: " + countC + " " + letterS + " (" + statistics * countC + "%)");

        letterS = (countD > 1) ? "darts" : "dart";
        System.out.println("D: " + countD + " " + letterS + " (" + statistics * countD + "%)");

        letterS = (countE > 1) ? "darts" : "dart";
        System.out.println("E: " + countE + " " + letterS + " (" + statistics * countE + "%)");

        letterS = (countF > 1) ? "darts" : "dart";
        System.out.println("F: " + countF + " " + letterS + " (" + statistics * countF + "%)");

        letterS = (countG > 1) ? "darts" : "dart";
        System.out.println("G: " + countG + " " + letterS + " (" + statistics * countG + "%)");

        letterS = (countUndecided > 1) ? "darts" : "dart";
        System.out.println("Undecided: "+ countUndecided + " " + letterS + "(" + statistics * countUndecided + "%)");
    }
}

