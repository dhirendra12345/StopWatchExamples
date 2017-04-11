import org.springframework.util.StopWatch;
public class StopWatchex1 {

	public static void main(String[] args) 
	{
		StopWatch s= new StopWatch("simple title");
		s.start("task-1");
		
		for(int i=1;i<=10;i++){  
	        System.out.println(i);  
	    }  
		s.stop();
		
		s.start("task-2");
		
		for(int i=1;i<=15;i++){  
	        System.out.println(i);  
	    }  
		s.stop();
		
		s.start("task-3");
		
		for(int i=1;i<=30;i++){  
	        System.out.println(i);  
	    }  
		s.stop();
		
		System.out.println(s.prettyPrint());
}
}
