import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class LC216 {

    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<Integer>(), k, n, 1);
        System.out.println(list);
        return list;
    }
    
    private static void backtrack(List<List<Integer>> list, List<Integer> temp, int k, int n, int begin) {
        if(temp.size() > k) return; /** no solution */
        else if(temp.size() == k && n == 0) list.add(new ArrayList<>(temp));
        else{
            for (int i = begin; i <= 9; i++) {
                temp.add(i);
                backtrack(list, temp, k, n-i, i+1);
                temp.remove(temp.size() - 1);
            }
        }
    }

public static void main(String[] args){
int k=3,n=9;
    combinationSum3(k,n);
} 

}
