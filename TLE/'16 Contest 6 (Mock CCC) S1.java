import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedHashMap;

	public class chem {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		 LinkedHashMap<String, ArrayList<Integer>> map = 
                 new LinkedHashMap<String, ArrayList<Integer>>();
                 
        // loop through question types
        int numQuestionTypes = Integer.parseInt(scan.nextLine());   
        for (int i = 1; i <= numQuestionTypes; i++) {
            String questionType = scan.nextLine();
            map.put(questionType, new ArrayList<Integer>());
        }
        
        // loop through questions
        int numQuestions = Integer.parseInt(scan.nextLine());   
        for (int i = 1; i <= numQuestions ; i++) {
            String question = scan.nextLine(); 
            // Do stuff
            ArrayList<Integer> questionList = map.get(question); 
            questionList.add(i);
        }
        
        for (ArrayList<Integer> questionList : map.values()) {
            for (int questionNum : questionList) {
            	System.out.println(questionNum);
            }
        }
        
	}
	
	}
