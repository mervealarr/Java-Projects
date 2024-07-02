
package Project;

import java.util.Scanner;


public class Project2 {
        
    public static boolean trackTime(long start, int time){
        boolean b = true;
        
        long startTime = (int) start / 1000;
        
        long currentTime = (System.currentTimeMillis()/1000);

        if (currentTime > (startTime + time)) {
            b = false;
        }
        return b;
    }
    
    public static void getIntroduction(){
        System.out.println("Welcome to Arithmetic's Exercise Program");
        System.out.println("──────────────────────────");
        System.out.println("You have 90 seconds to answer as many questions as possible.");
        System.out.println("You will get 5 seconds bonus if you answer 5 questions in a row.");
        System.out.println("Use java arithmetic precedence rules to find answers!");
        System.out.println("Press 'q' to quit or any key to start…");
    }
    
    
    public static void starPattern(int n){
        int space = 2*n-1;
        
        for (int i = 0; i < n+1 ; i++) {
            
            if (i == 0 ) {
                
                if (n == 3) {
                    
                    for (int m = 0; m < n; m++) {
                        System.out.print("* ");
                    }
                   
                    for (int m = 0; m < 1; m++) {
                        System.out.print(" ");
                    }
                    
                    System.out.print("good");
                    
                    for (int m = 0; m < 2; m++) {
                        System.out.print(" ");
                    }
                    
                    for (int m = 0; m < n; m++) {
                        System.out.print(" *");
                    }
                    
                    System.out.println("");
                
                } else if (n == 6) {
                    
                    for (int m = 0; m < n; m++) {
                        System.out.print("* ");
                    }
                    
                    for (int m = 0; m < 21; m++) {
                        System.out.print(" ");
                    }
                    
                    System.out.print("very good");
                    
                    for (int m = 0; m < 22; m++) {
                        System.out.print(" ");
                    }
                    
                    for (int m = 0; m < n; m++) {
                        System.out.print(" *");
                    }
                    
                    System.out.println("");
                
                } else if (n == 9) {
                    
                    for (int m = 0; m < n; m++) {
                        System.out.print("* ");
                    }
                    
                    for (int m = 0; m < 63; m++) {
                        System.out.print(" ");
                    }
                    
                    System.out.print("perfect");
                    
                    for (int m = 0; m < 63; m++) {
                        System.out.print(" ");
                    }
                    
                    for (int m = 0; m < n; m++) {
                        System.out.print(" *");
                    }
                    
                    System.out.println("");
                }
            }
            
            for (int l = 0; l < n; l++) {
                
                for (int j = n; j < i+n; j++) {
                    System.out.print(" ");
                }
                
                for (int k = 0; k <= space ; k++) {
                    if (k%2 == 0) {
                        System.out.print("*");
                    }
                    else
                        System.out.print(" ");
                }
                
                for (int j = n; j < i + n + 1; j++) {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
            space-=2;
        }
        //System.out.println("");
    }
    
    
    public static boolean firstLevel(){
        Scanner scn = new Scanner(System.in);

        int firstOperand = (int)(Math.random() * 100);
        int secondOperand = (int)(Math.random() * 100);
        int operation = (int)(Math.random() * 4);
        int correctAnswer = 0;
        int userAnswer = 0;
        
        switch (operation){
            case 0:                 
                correctAnswer = firstOperand + secondOperand;
                System.out.print(firstOperand + " + " + secondOperand + " = ");
                break;
            case 1:
                correctAnswer = firstOperand - secondOperand;
                System.out.print(firstOperand + " - " + secondOperand + " = ");
                break;
            case 2: 
                correctAnswer = firstOperand / secondOperand;
                System.out.print(firstOperand + " / " + secondOperand + " = ");
                break;
            case 3: 
                correctAnswer = firstOperand * secondOperand;
                System.out.print(firstOperand + " * " + secondOperand + " = ");
                break;
        }
        
        userAnswer = scn.nextInt();
        if (userAnswer == correctAnswer) {
            System.out.println("Correct");
            System.out.println("");
            return true;
        }else {
            System.out.println("Wrong");
            System.out.println("");
            return false;
        }
    }
    
        
        
    public static boolean secondLevel(){
        Scanner scn = new Scanner(System.in);

        int firstOperand = (int)(Math.random() * 100);
        int secondOperand = (int)(Math.random() * 100);
        int thirdOperand = (int)(Math.random() * 100);
        int firstOperation = (int)(Math.random() * 4);
        int secondOperation = (int)(Math.random() * 4);
        int correctAnswer = 0;
        int userAnswer = 0;
        
        switch(firstOperation){
            case 0:
                switch(secondOperation){
                    case 0:
                        correctAnswer=firstOperand+secondOperand+thirdOperand;
                        System.out.println(firstOperand +"+"+secondOperand+"+"+thirdOperand+"=");
                        break;
                    case 1:
                        correctAnswer=firstOperand+secondOperand-thirdOperand;
                        System.out.println(firstOperand+"+"+secondOperand+"-"+thirdOperand+"=");
                        break;
                    case 2:
                        correctAnswer=firstOperand+secondOperand/thirdOperand;
                        System.out.println(firstOperand+"+"+secondOperand+"/"+thirdOperand+"=");
                        break;
                    case 3:
                        correctAnswer=firstOperand+secondOperand*thirdOperand;
                        System.out.println(firstOperand+"+"+secondOperand+"*"+thirdOperand+"=");
                        break;
                }
                
                break;
            case 1:
                switch(secondOperation){
                    case 0:
                        correctAnswer=firstOperand-secondOperand+thirdOperand;
                        System.out.println(firstOperand +"-"+secondOperand+"+"+thirdOperand+"=");
                        break;
                    case 1:
                        correctAnswer=firstOperand-secondOperand-thirdOperand;
                        System.out.println(firstOperand+"-"+secondOperand+"-"+thirdOperand+"=");
                        break;
                    case 2:
                        correctAnswer=firstOperand-secondOperand/thirdOperand;
                        System.out.println(firstOperand+"-"+secondOperand+"/"+thirdOperand+"=");
                        break;
                    case 3:
                        correctAnswer=firstOperand-secondOperand*thirdOperand;
                        System.out.println(firstOperand+"-"+secondOperand+"*"+thirdOperand+"=");
                        break;
                }
                
                break;
            case 2:
                switch(secondOperation){
                    case 0:
                        correctAnswer=firstOperand/secondOperand+thirdOperand;
                        System.out.println(firstOperand +"/"+secondOperand+"+"+thirdOperand+"=");
                        break;
                    case 1:
                        correctAnswer=firstOperand/secondOperand-thirdOperand;
                        System.out.println(firstOperand+"/"+secondOperand+"-"+thirdOperand+"=");
                        break;
                    case 2:
                        correctAnswer=firstOperand/secondOperand/thirdOperand;
                        System.out.println(firstOperand+"/"+secondOperand+"/"+thirdOperand+"=");
                        break;
                    case 3:
                        correctAnswer=firstOperand/secondOperand*thirdOperand;
                        System.out.println(firstOperand+"/"+secondOperand+"*"+thirdOperand+"=");
                        break;
                }
               
                break;
            case 3:
                switch(secondOperation){
                    case 0:
                        correctAnswer=firstOperand*secondOperand+thirdOperand;
                        System.out.println(firstOperand +"*"+secondOperand+"+"+thirdOperand+"=");
                        break;
                    case 1:
                        correctAnswer=firstOperand*secondOperand-thirdOperand;
                        System.out.println(firstOperand+"*"+secondOperand+"-"+thirdOperand+"=");
                        break;
                    case 2:
                        correctAnswer=firstOperand*secondOperand/thirdOperand;
                        System.out.println(firstOperand+"*"+secondOperand+"/"+thirdOperand+"=");
                        break;
                    case 3:
                        correctAnswer=firstOperand*secondOperand*thirdOperand;
                        System.out.println(firstOperand+"*"+secondOperand+"*"+thirdOperand+"=");
                        break;
                }
               
                break;
        }
        userAnswer = scn.nextInt();
        if (userAnswer == correctAnswer) {
            System.out.println("Correct");
            System.out.println("");
            return true;
        }else{
            System.out.println("Wrong");
            System.out.println("");
            return false;
        }
    }
    
    
    
    public static int askQuestions(String whichLevel){
        long startTime = System.currentTimeMillis();
       
        int numberOfRepetitions = 0;
        int numberOfCorrectAnswers = 0;
        int index = 1;
        int time = 90;
                
        while (trackTime(startTime, time)) {
            System.out.print("Q" + index + "       ");
            switch (whichLevel) {
                
                case "first":
                    if (firstLevel()) {
                        numberOfCorrectAnswers++;
                        numberOfRepetitions++;
                    }else{
                        numberOfRepetitions = 0;
                    }
                    break;
                
                case "second":
                    if (secondLevel()) {
                        numberOfCorrectAnswers++;
                        numberOfRepetitions++;
                    }else{
                        numberOfRepetitions = 0;
                    }
                    break;
            }
            
            if (numberOfRepetitions == 3 || numberOfRepetitions == 6 || numberOfRepetitions == 9) {
                starPattern(numberOfRepetitions);
            }
            
            if (numberOfRepetitions % 5 == 0 && numberOfRepetitions != 0) {
                System.out.println("You won 5 seconds :)");
                time += 5;
                System.out.println("");
            }
            index++;
        }
        
        System.out.println("TIME IS UP!");
        System.out.println("");
        System.out.println("You are as fast as a turtle!");
        System.out.println("Correct Answers: " + numberOfCorrectAnswers);
        System.out.println("Total Questions: " + index);
        System.out.println("Total Time: " + ((System.currentTimeMillis()/1000) - (startTime/1000)));
        
        return numberOfCorrectAnswers;
    }
   
    
    
    
    public static void main(String[] args) {
        getIntroduction();
        Scanner scn=new Scanner(System.in);
        
        char key=scn.next().charAt(0);
        System.out.println("");
        if (key == 'q') {
            System.out.println("End of the arithmetic's exercise program.");
        }else{
            
            
            
        if (askQuestions("first") > 10) {
            System.out.println("Do you want to repeat the level or advance to the next level?");
            System.out.println("A -> Repeat the level.");
            System.out.println("B -> Advance to the next level.");
            String choice = scn.next();
            switch (choice){
                case "A":
                    askQuestions("first");
                    break;
                case "B":
                    askQuestions("second");
                    break;
            }
        }else{
                System.out.println("Sorry, you cannot advance to the next level!");
                System.out.println("First level is being repeating...");
                System.out.println("");
                askQuestions("first");
        }
        }
    }
}

