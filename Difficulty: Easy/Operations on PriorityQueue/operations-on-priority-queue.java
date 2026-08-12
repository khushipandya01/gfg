class Geeks {

    // Function to insert k into the queue q
    static void insert(PriorityQueue<Integer> q, int k) {
        q.add(k);
    }

    // If k is in q return true else return false
    static boolean find(PriorityQueue<Integer> q, int k) {
        return q.contains(k);
    }

    // Function to delete the max element from queue
    static int delete(PriorityQueue<Integer> q) {
        return q.poll();
    }
}