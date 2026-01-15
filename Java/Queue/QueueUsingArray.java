// Implementation of Queue data structure using array
public class QueueUsingArray {
    
    int[] queue = new int[5];
    int front = 0;
    int rear = -1;
    int size = 0;

    void enqueue(int value) {
        if (size == queue.length) {
            System.out.println("Queue Overflow!");
            return;
        }
        queue[++rear] = value;
        size++;
        System.out.println(value + " enqueued");
    }

    void dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow!");
            return;
        }
        System.out.println(queue[front] + " dequeued");
        front++;
        size--;
    }

    void peek() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front element: " + queue[front]);
    }

    void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("\nQueue elements:");
        for(int i=front; i<=rear; i++) {
            System.out.print(queue[i]  + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
      
        QueueUsingArray q = new QueueUsingArray();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();
        q.peek();
        q.dequeue();
        q.display();

    }
}

/*
Time Complexity:
Enqueue Operation : O(1)
Dequeue Operation : O(1)
Front Operation   : O(1)
Display Operation : O(n)

Space Complexity:
O(n)

Output:
10 enqueued
20 enqueued
30 enqueued
40 enqueued
50 enqueued

Queue elements:
10 20 30 40 50
Front element: 10
10 dequeued

Queue elements:
20 30 40 50
*/
