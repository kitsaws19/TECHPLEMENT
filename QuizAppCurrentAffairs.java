package Task1.QuizGenerator;
import java.util.Random;
import java.util.Scanner;
public class QuizAppCurrentAffairs {
    

	public static void main(String[] args) {  	 	
		System.out.println("Generate Topic Based Question...");
		System.out.println("You will randomly get a topic! So enjoy the quiz!");
		
		final String[] category = {"economics", "sports", "politics","freewill"};
		Random random = new Random();
		int index = random.nextInt(category.length);
		String selected_Category=category[index];
		
		switch(selected_Category)
		{
		case "economics":
				Scanner sc=new Scanner(System.in); 
				
				String[] arr= {"a","e","g"};
			 	int count=0; 
			 	
			 	String[] Question1 = {"What is India's current GDP?", "a.3.42 Lakh crores", "b.2.14 Lakh Crores","c.1.69 Lakh Crores"};
			 	
			 	for(int i=0; i<Question1.length; i++) {
			 		System.out.println(Question1[i]);
			 	}
			 	
			 	 
			 	String ans1=sc.nextLine(); 
			  	 	 
			 	switch(ans1) {
			 	case "a":  	 	 	
			 		for(int i=0;i<arr.length;i++)
			 		{
			 		if(arr[i]=="a") {
			 		count=count+1; 
			 		}
			 		} 
			 	 	break;  
			 	 	case "b":  	 	 	
			 	 		
				 		count=count+0; 
				 		
			 	 	break;  	 	
			 	 	case "c": 
			 	 		
				 		count=count+0; 
				 		
			 	    break; 
			 	} 
		        String[] Question2 = {"What is India's Top MNC name", "d.Reliance", "e.Tata Groups","f.Adani Group"};
			 	
			 	for(int i=0; i<Question2.length; i++) {
			 		System.out.println(Question2[i]);
			 	}
			 	
			 	 
			 	String ans2=sc.nextLine(); 
			 	 
			 	switch(ans2) {  	 	
			 	case "d":  	 	 	
			 		
			 		count=count+0; 
			 			 	 	
			 		break;  	 	
			 		case "e":  	 	 	
			 			for(int i=0;i<arr.length;i++)
				 		{
				 		if(arr[i]=="e") {
				 		count=count+1; 
				 		}
				 		}  	 	 	
			 			break;  	 	
			 		case "f":  	 	 	
			 			
				 		count=count+0; 
				 		 	 	
			 			break; 
			 	} 
			 	 String[] Question3 = {"In which year foreign direct Investment was introduced in india", "g.1991", "h.1992","i.1998"};   
				 	
				 	for(int i=0; i<Question3.length; i++) {
				 		System.out.println(Question3[i]);
				 	}
			 	
			 	 
			 	String ans3=sc.nextLine(); 
			 	 
			 	switch(ans3) {
			 	case "g":
			 		for(int i=0;i<arr.length;i++)
			 		{
			 		if(arr[i]=="g") {
			 		count=count+1; 
			 		}
			 		}
			 	 	break;  	 	
			 	 	case "h":  	 	 	
			 	 		
				 		count=count+0; 
				 		
			 	 	break;  	 	
			 	 	case "i":  	 	 	
			 	 		
				 		count=count+0; 
				 		
			 	 	break; 
			 	} 
			 	 
		
			 	System.out.println("Your score is:" ); 
			 	System.out.println(count); 
		
			 	System.out.println("Correct answers are: "); 
			 	System.out.println(" a "+" e "+" g "); 
				
			 	break;
	 	
		case "sports":
						Scanner sc2=new Scanner(System.in); 
						
						String[] arr2= {"a2","e2","g2"};
					 	int count2=0; 
					 	
					 	String[] Question12 = {"How many cricket world cups won by India till now?", "a2.2 World Cups",
					 			"b2.3 World Cups","c2.4 World Cups"};
					 	
					 	for(int i=0; i<Question12.length; i++) {
					 		System.out.println(Question12[i]);
					 	}
					 	
					 	 
					 	String ans12=sc2.nextLine(); 
					  	 	 
					 	switch(ans12) {
					 	case "a2":  	 	 	
					 		for(int i=0;i<arr2.length;i++)
					 		{
					 		if(arr2[i]=="a2") {
					 		count2=count2+1; 
					 		}
					 		} 
					 	 	break;  
					 	 	case "b2":  	 	 	
					 	 		
						 		count2=count2+0; 
						 		
					 	 	break;  	 	
					 	 	case "c2": 
					 	 		
						 		count2=count2+0; 
						 		
					 	    break; 
					 	} 
				        String[] Question22 = {"India won which team game in in Paris Olympics", "d2.Cricket", "e2.Hockey","f2.Volleyball"};
					 	
					 	for(int i=0; i<Question22.length; i++) {
					 		System.out.println(Question22[i]);
					 	}
					 	
					 	 
					 	String ans22=sc2.nextLine(); 
					 	 
					 	switch(ans22) {  	 	
					 	case "d2":  	 	 	
					 		
					 		count2=count2+0; 
					 		 	 	
					 		break;  	 	
					 		case "e2":  	 	 	
					 			for(int i=0;i<arr2.length;i++)
						 		{
						 		if(arr2[i]=="e2") {
						 		count2=count2+1; 
						 		}
						 		}  	 	 	
					 			break;  	 	
					 		case "f2":  	 	 	
					 			
						 		count2=count2+0; 
						 		 	 	
					 			break; 
					 	} 
					 	 String[] Question32 = {"Country with highest medals in Olympics", "g2.China", "h2.India","i2.Pakistan"};   
						 	
						 	for(int i=0; i<Question32.length; i++) {
						 		System.out.println(Question32[i]);
						 	}
					 	
					 	 
					 	String ans32=sc2.nextLine(); 
					 	 
					 	switch(ans32) {
					 	case "g2":
					 		for(int i=0;i<arr2.length;i++)
					 		{
					 		if(arr2[i]=="g2") {
					 		count2=count2+1; 
					 		}
					 		}
					 	 	break;  	 	
					 	 	case "h2":  	 	 	
					 	 		
						 		count2=count2+0; 
						 		
					 	 	break;  	 	
					 	 	case "i2":  	 	 	
					 	 		
						 		count2=count2+0; 
						 		
					 	 	break; 
					 	} 
					 	 
			
					 	System.out.println("Your score is:" ); 
					 	System.out.println(count2); 
			
					 	System.out.println("Correct answers are: "); 
					 	System.out.println(" a2 "+" e2 "+" g2 "); 
						
					 	break;
					 	
					 	
		case "politics":
			
			Scanner sc3=new Scanner(System.in); 
			
			String[] arr3= {"a3","e3","g3"};
		 	int count3=0; 
		 	
		 	String[] Question13 = {"Who is the chief minister of Maharashtra?", "a3.Eknath Shinde", "b3.Devendra Fadanvis","c3.Yogi Adityanath"};
		 	
		 	for(int i=0; i<Question13.length; i++) {
		 		System.out.println(Question13[i]);
		 	}
		 	
		 	 
		 	String ans13=sc3.nextLine(); 
		  	 	 
		 	switch(ans13) {
		 	case "a3":  	 	 	
		 		for(int i=0;i<arr3.length;i++)
		 		{
		 		if(arr3[i]=="a3") {
		 		count3=count3+1; 
		 		}
		 		} 
		 	 	break;  
		 	 	case "b3":  	 	 	
		 	 		
			 		count3=count3+0; 
			 		
		 	 	break;  	 	
		 	 	case "c3": 
		 	 		
			 		count3=count3+0; 
			 		
		 	    break; 
		 	} 
	        String[] Question23 = {"In which year Ladaki bahin Yojana was introduced?", "d3.2023", "e3.2024","f3.2021"};
		 	
		 	for(int i=0; i<Question23.length; i++) {
		 		System.out.println(Question23[i]);
		 	}
		 	
		 	 
		 	String ans23=sc3.nextLine(); 
		 	 
		 	switch(ans23) {  	 	
		 	case "d3":  	 	 	
		 		
		 		
		 		count3=count3+0; 
		 		 	 	
		 		break;  	 	
		 		case "e3":  	 	 	
		 			for(int i=0;i<arr3.length;i++)
			 		{
			 		if(arr3[i]=="e3") {
			 		count3=count3+1; 
			 		}
			 		}  	 	 	
		 			break;  	 	
		 		case "f3":  	 	 	
		 			
			 		count3=count3+0; 
			 		 	 	 	
		 			break; 
		 	} 
		 	 String[] Question33 = {"What are the minimum seats required for a party to win in Lok Sabha", "g3.272", "h3.543","i3.273"};   
			 	
			 	for(int i=0; i<Question33.length; i++) {
			 		System.out.println(Question33[i]);
			 	}
		 	
		 	 
		 	String ans33=sc3.nextLine(); 
		 	 
		 	switch(ans33) {
		 	case "g3":
		 		for(int i=0;i<arr3.length;i++)
		 		{
		 		if(arr3[i]=="g3") {
		 		count3=count3+1; 
		 		}
		 		}
		 	 	break;  	 	
		 	 	case "h3":  	 	 	
		 	 		
			 		count3=count3+0; 
			 		
		 	 	break;  	 	
		 	 	case "i3":  	 	 	
		 	 		
			 		count3=count3+0; 
			 		
		 	 	break; 
		 	} 
		 	 

		 	System.out.println("Your score is:" ); 
		 	System.out.println(count3); 

		 	System.out.println("Correct answers are: "); 
		 	System.out.println(" a3 "+" e3 "+" g3 "); 
			
		 	break;	
		 	
		 	     
		case "freewill":
            System.out.println("<<Create one quiz question of your choice>>");
			
			Scanner sc4=new Scanner(System.in); 
			
            String[] Question14 = new String[4];
            
            System.out.println("Enter first element as a question and remaining three as options (a4,b4 and c4) ");
		 	
		 	for(int i=0; i<Question14.length; i++) {
		 	       Question14[i]=sc4.nextLine();
		 	}
			
			System.out.println("include correct option by suffixing it by * at the end");
			//String[] arr4= {"a4","e4","g4"};
			String[] arr4=new String[3];
			for(int i=0; i<arr4.length;i++) {
				arr4[i]=sc4.nextLine();
			}
			
			System.out.println("Hide the upper scrollings from viewer of your question");
			
			for(int i=0; i<Question14.length;i++) {
				System.out.println(Question14[i]);
			}  
			
		 	int count4=0; 

		 	 
		 	String ans14=sc4.nextLine(); 
		  	 	 
		 	switch(ans14) {
		 	case "a4":  	 	 	
		 		for(int i=0;i<arr4.length;i++) {
		 		if(arr4[i].contains("*")) {
		 		count4=count4+1; 
		 		}else {
		 			count4=count4+0;
		 		}
		 		}
		 	 	break;  
		 	 	case "b4":  	 	 	
		 	 		for(int i=0;i<arr4.length;i++) {
			 		if(arr4[i].contains("*")) {
			 		count4=count4+1; 
			 		}else {
			 		count4=count4+0;
			 		}
		 	 		}
		 	 	break;  	 	
		 	 	case "c4": 
		 	 		for(int i=0;i<arr4.length;i++) {
			 		if(arr4[i].contains("*")) {
			 		count4=count4+1; 
			 		}else {
			 		count4=count4+0;	
			 		}
		 	 		} 
		 	    break; 
		 	} 
	        
		 	System.out.println("Your score is:" ); 
		 	if(count4==1) {
		 		System.out.println("Hurray! It's correct. ");
		 	}else {
		 		System.out.println("Better luck next time!");
		 	}
			
		 	break;	
			
		}
		
		}		
}