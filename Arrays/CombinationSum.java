import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    private void backtrack(int index, int target, int[] candidates,
                           List<Integer> current,
                           List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (index == candidates.length || target < 0) {
            return;
        }

        if (candidates[index] <= target) {
            current.add(candidates[index]);
            backtrack(index, target - candidates[index], candidates, current, result);
            current.remove(current.size() - 1);
        }

        backtrack(index + 1, target, candidates, current, result);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, target, candidates, new ArrayList<>(), result);
        return result;
    }
}
