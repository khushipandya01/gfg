class Solution {
    public ArrayList<Integer> queueTraversal(Queue<Integer> q) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        while (!q.isEmpty()) {
            result.add(q.poll());
        }
        
        return result;
    }
}