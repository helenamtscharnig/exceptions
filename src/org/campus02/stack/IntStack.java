package org.campus02.stack;

import org.campus02.stack.exceptions.MyEmptyException;
import org.campus02.stack.exceptions.MyException;

import java.util.Arrays;

public class IntStack {
    private int[] stack;
    private int pointer;

    public IntStack (int maxSize) {
        this.stack = new int[maxSize];
        this.pointer = -1;
    }

    public void push(int value) throws Exception {
        stack[++pointer] = value;

        if(pointer == stack.length -1){
            throw new MyException("Stack darf nicht größer als maxSize sein");
        }
    }

    public int pop() throws Exception {
        int value = stack[pointer];
        stack[pointer--] = 0;
        return value;
    }

    @Override
    public String toString() {
        return "IntStack{" +
                "stack=" + Arrays.toString(stack) +
                '}';
    }
}
