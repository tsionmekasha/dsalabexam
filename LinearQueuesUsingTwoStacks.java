package question3;
import java.util.EmptyStackException;

class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

class QueueUsingTwoStacks {
    private Stack stack1;
    private Stack stack2;

    public QueueUsingTwoStacks(int size) {
        stack1 = new Stack(size);
        stack2 = new Stack(size);
    }

    public void enqueue(int value) {
        if (stack1.isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack1.pop();
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack1.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public boolean isFull() {
        return stack1.isFull();
    }
}

 public class Main {
    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Peek: " + queue.peek()); // Outputs: Peek: 1

        System.out.println("Dequeue: " + queue.dequeue()); // Outputs: Dequeue: 1
        System.out.println("Dequeue: " + queue.dequeue()); // Outputs: Dequeue: 2

        queue.enqueue(6);

        System.out.println("Peek: " + queue.peek()); // Outputs: Peek: 3
    }
}
