import java.lang.reflect.Array;

class StackImpl implements Stack{

    private int size;
    Object[] stack;
    private int space;

    StackImpl(int value){
        space = value;
        stack = new Object[value];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void push(Object o) throws StackException {
        if (size +1 > space) {
            throw new StackException("Stack is full");
        }
        stack[size++] = o;
    }

    public Object pop() throws StackException {
        if (size == 0) throw new StackException("Stack is empty");
        return stack[--size] = "_";
    }

    public void clear() {
        for(int i = 0; i < stack.length; i++ ) stack[i] = '_';
        size = 0;
    }

    public void print() {
        for (Object aStack : stack) {
            System.out.print(" " + aStack);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "StackImpl " + "size: " + size;
    }
}


