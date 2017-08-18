import java.util.*;

public class StringPermutations {
    public static void main(String[] args) { 
        Scanner console = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = console.nextLine();
        ArrayList<String> list = new ArrayList<String>();
        permutation("", str, list); 
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
       

    }

private static ArrayList<String> permutation(String prefix, String str, ArrayList<String> list) {
    int n = str.length();
    if (n == 0) {
        if(!list.contains(prefix)) {
            list.add(prefix);
        }
    }
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), list);

    }
return list;
}
    
}