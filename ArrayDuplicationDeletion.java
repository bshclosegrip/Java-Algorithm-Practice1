import java.util.ArrayList;

public class ArrayDuplicationDeletion {

    public static void main(String[] args) {

		int[] arr = {1,1,3,3,0,1,1};
		ArrayList<Integer> arrayList = new ArrayList<>();

        for(int item : arr){
            if(!arrayList.contains(item))
                arrayList.add(item);
        }

        System.out.println(arrayList);
    }
}
