import java.util.*;

public class geeksforgeeks {

    // GeeksforGeeks Problem (Problem of the Day)
    class SpecialQueue {
        private Queue<Integer> queue;
        private Deque<Integer> minDeque;
        private Deque<Integer> maxDeque;

        public SpecialQueue() {
            // Define Data Structures
            queue = new LinkedList<>();
            minDeque = new LinkedList<>();
            maxDeque = new LinkedList<>();
        }

        public void enqueue(int x) {
            // Insert element into the queue
            queue.offer(x);
            while (!minDeque.isEmpty() && minDeque.peekLast() > x) {
                minDeque.pollLast();
            }
            minDeque.offer(x);
            while (!maxDeque.isEmpty() && maxDeque.peekLast() < x) {
                maxDeque.pollLast();
            }
            maxDeque.offer(x);
        }

        public void dequeue() {
            // Remove element from the queue
            int removed = queue.poll();
            if (removed == minDeque.peek()) {
                minDeque.poll();
            }
            if (removed == maxDeque.peek()) {
                maxDeque.poll();
            }
        }

        public int getFront() {
            // Get front element
            return queue.peek();
        }

        public int getMin() {
            // Get minimum element
            return minDeque.peek();
        }

        public int getMax() {
            // Get maximum element
            return maxDeque.peek();
        }
    }
}