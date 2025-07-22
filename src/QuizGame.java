import java.util.Scanner;
public class QuizGame {
    public static void main(String[] args) {

        //JAVA QUIZ GAME

        String [] questons = {"what is  the main function of a router? " ,
                              "which part of computer is considered as a brain ",
                              "what year was facebook launched " ,
                             "who is known as the father of computer? "
                             ," what was the first programming language? "};

        String [][] options = {{"1. Strong files" , "2. Encrypting data" , "3.Directing Internet Traffic" , "4. Managing Password "},
                               {"1. CPU " , "2. HardDrive " , "3. RAM " , "4. GPU " },
                               {"1. 2000 " , "2. 2004 " , "3. 2006" , "4. 2008 " },
                               {"1. Steve jobs " , "2. bill gates " , "3. Alan Turning" , "4.Charles babba " },
                               {"1. COBOL" , "2. C " , "3. Fortran " , "4. Assembly " }
                                  };
        int [] Answers = {3 , 1, 2 ,4 , 3};
         int score = 0;
         int guess;

        Scanner sc = new Scanner(System.in);
        System.out.println("****************************");
        System.out.println("Welcome  to the java quiz : ");
        System.out.println("******************************");

       for(int i = 0 ; i< questons.length; i++) {
           System.out.println(questons[i]);

           for (String option : options[i]) {
               System.out.println(option);
           }

           System.out.println("enter your guess");
           guess = sc.nextInt();

           if (guess == Answers[i]) {
               System.out.println("*********");
               System.out.println("correct");
               System.out.println("**********");
               score++;
           }else{
               System.out.println("*********");
               System.out.println("wrong!!");
               System.out.println("*********");
           }
       }

        System.out.println("your final score is : " +score + " out of " +questons.length);

    }
}
