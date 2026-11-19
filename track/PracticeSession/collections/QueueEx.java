package track.PracticeSession.collections;

public class QueueEx {
    public static void main(String[] args) {
        /*
         * Queue<Integer> q = new ArrayDeque<Integer>();
         * q.offer(30);
         * q.offer(20);
         * q.offer(10);
         * System.out.println(q.size());
         * System.out.println(q.peek());
         * q.poll();
         * System.out.println(q.size());
         */
        int queue[] = new int[5];
        int front = 0;
        int rear = 0;
        queue[rear++] = 10;
        queue[rear++] = 20;
        queue[rear++] = 30;
        System.out.println("size: " + (rear - front)); // 3
        // remove
        front++;
        System.out.println("size: " + (rear - front)); // 2

    }

}