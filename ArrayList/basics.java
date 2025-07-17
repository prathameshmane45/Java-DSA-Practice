import java.util.ArrayList;
import java.util.Collections;
public class basics{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        // Add elements in arraylist 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // Get element using its index number from arraylist 
        int element = list.get(4);
        System.out.println(element);
        System.out.println(list.get(2));

        // remove element from arraylist 
        list.remove(3);
        System.out.println(list);

        // Add element in the arraylist at exiting index 
        list.add(1, 10);
        System.out.println(list);

        // Size of an arraylist
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


        //Sorting an arrayList 
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(22);
        list2.add(30);
        list2.add(18);
        list2.add(52);
        list2.add(32);
        list2.add(63);
        list2.add(9);
        list2.add(91);
        System.out.println(list2);

        // Ascending order 
        Collections.sort(list2);
        System.out.println(list2);

        // Descending order 
        Collections.sort(list2,Collections.reverseOrder());
        System.out.println(list2);



    }
}