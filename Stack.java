package question2;
public class Stack {
    private int size;
    private int[] numArray;
    private int top;

    public Stack(int capacity) {
        size = capacity;
        numArray = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top < size - 1) {
            numArray[++top] = value;
        } else {
            System.out.println("Stack Full");
        }
    }

    public int pop() {
        if (top >= 0) {
            return numArray[top--];
        } else {
            System.out.println("Stack Empty");
            return -1; 
        }
    }



    public static void main(String[] args) {
        Stack numStack = new Stack(5);

        numStack.push(15);
        numStack.push(25);
        numStack.push(45);
        numStack.push(55);
        numStack.push(65);
        numStack.pop();
        
        for(int i = 0; i < numStack.size; i++) {
        	System.out.println(numStack.numArray[i]);
        }
 
    }
}


