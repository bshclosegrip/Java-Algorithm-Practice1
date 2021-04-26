import java.util.ArrayList;

public class ArrayStringDuplicationDeletion {

    public static void main(String[] args) {
		String[] arr2 = {"sdf", "sfdfsd"};
		ArrayList<String> arrayList2 = new ArrayList<>();

		for(String item2 : arr2){
            if(!arrayList2.contains(item2))
                arrayList2.add(item2);
        }
        System.out.println(arrayList2);
    }
}
