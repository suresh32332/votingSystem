import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.*;
public class VotingSystem {
        static Map<String, Integer> candidate = new HashMap<>();
        static Set<String> voted = new HashSet<>();
         static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int select;
        do {
            System.out.println("---------Voting System---------");
            System.out.println("1.Register candidate");
            System.out.println("2.Vote");
            System.out.println("3.Show Result");
            System.out.println("4.Exit");
            System.out.println("Enter your Option : ");
            select = sc.nextInt();
            sc.nextLine();
            switch (select) {
                case 1:
                    registerCandidate();
                    break;
                case 2:
                    vote();
                    break;
                case 3:
                    showResult();
                    break;
                case 4:
                    System.out.println("Thank you voting ");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (select != 4);
        }
    private static void registerCandidate() {
         System.out.println("Enter your name : ");
         String candidateName=sc.nextLine();
         if(candidate.containsKey(candidateName)){
            System.out.println("already registered!");
         }
         else {
            candidate.put(candidateName,0);
            System.out.println("Register Success ");
         }
    }
    private static void vote() {

        System.out.println("Enter voter name : ");
        String name = sc.nextLine();
         
        if (candidate.containsKey(name)){
            System.out.println("voted success");
        }
        else{
            System.out.println("register first after voting ...");
        }
    }
    private static void showResult() {
        System.out.println("voting result");
        for(Map.Entry<String, Integer> result : candidate.entrySet()){
            String name = result.getKey();
            int voter = result.getValue();
            System.out.println(name+ " : " + voter );
        }

    }
}