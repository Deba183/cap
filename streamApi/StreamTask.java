package streamApi;
import java.util.*;
public class StreamTask {
	public static void main(String[] args) {
		 List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);

	        double avg = nums.stream().mapToInt(Integer::intValue).average().orElse(0.0);
	                                
	        System.out.println("Average: " + avg);
	}

}
