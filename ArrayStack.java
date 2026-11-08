public class ArrayStack {
    private int[] data;
    private int top;

    // Constructor with initial capacity (your assignment requires 2)
    public ArrayStack(int capacity) {
        data = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (top == data.length - 1) {
            expandCapacity();
        }
        data[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return data[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    private void expandCapacity() {
        int[] larger = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            larger[i] = data[i];
        }
        data = larger;
    }
}
