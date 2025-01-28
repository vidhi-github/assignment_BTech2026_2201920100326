import java.util.*;

public class Solution1 {

    static Iterator func(ArrayList mylist) {
        Iterator it = mylist.iterator();
        while (it.hasNext()) {
            Object element = it.next();

            // Break the loop when we encounter a String
            if (element instanceof String)
                break;
        }
        return it;
    }

    @SuppressWarnings({ "unchecked" })
    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of integers
        int m = sc.nextInt(); // Number of strings

        // Adding integers to the list
        for (int i = 0; i < n; i++) {
            mylist.add(sc.nextInt());
        }

        // Adding delimiter and strings to the list
        mylist.add("###");
        for (int i = 0; i < m; i++) {
            mylist.add(sc.next());
        }

        // Retrieve the iterator starting from the first String
        Iterator it = func(mylist);

        // Print all strings from the iterator
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }

        sc.close();
    }
}
