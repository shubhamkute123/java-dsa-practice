// Implementation of Stack data structure using array
public class StackUsingArray {

    int[] stack = new int[5];
    int top = -1;

    void push(int value) {
        if(top == stack.length-1) {
            System.out.println("Stack Overflow!");
            return;
        }
        stack[++top] = value;
        System.out.println(value + " pushed");
    }

    void pop() {
        if(top == -1) {
            System.out.println("Stack Underflow!");
            return;
        }
        System.out.println(stack[top--] + " popped");
    }

    void peek() {
        if(top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element: " + stack[top]);
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("\nStack elements: ");
        for(int i=top; i>=0; i--) {
            System.out.println(stack[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        StackUsingArray s = new StackUsingArray();
        
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        s.display();
        s.peek();
        s.pop();
        s.display();

    }
}

/*
Time Complexity:
Push Operation : O(1)
Pop Operation  : O(1)
Peek Operation : O(1)
Display Operation: O(n)

Space Complexity:
O(n)

Output:
10 pushed
20 pushed
30 pushed
40 pushed
50 pushed

Stack elements:
50
40
30
20
10

Top element: 50
50 popped

Stack elements:
40
30
20
10
*/
