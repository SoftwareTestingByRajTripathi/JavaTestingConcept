import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatecalueinlist {
	public static void main(String[] args) {
		
		//input list with duplicate//
		List<Integer> list= new ArrayList<>(Arrays.asList(1,2,2,2,4,5,6,7,89));
		//Print element with duplicate value//
		System.out.println("Print list with duplicates Value:"+list);
		
		List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
		//Print the ArrayList with duplicates removed 
        System.out.println("ArrayList with duplicates removed: "
                           + newList); 
		
		
	}

}
