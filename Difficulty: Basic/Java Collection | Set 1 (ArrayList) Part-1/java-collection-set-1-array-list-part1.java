class Solution {
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q,
                             ArrayList<Integer> Query) {

        if (Q == 1) {
            int p = Query.get(0);
            int r = Query.get(1);

            A.add(p, r);
        }
        
        else if (Q == 2) {
            int p = Query.get(0);

            for (int i = A.size() - 1; i >= 0; i--) {
                if (A.get(i) == p) {
                    ArrayList<Integer> result = new ArrayList<>();
                    result.add(i);
                    return result;
                }
            }

            ArrayList<Integer> result = new ArrayList<>();
            result.add(-1);
            return result;
        }

        return A;
    }
}