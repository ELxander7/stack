package ru.itis.ing304.stackdz4;
import java.sql.SQLOutput;
import java.util.EmptyStackException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws EmptyElementException {
        try{
            Stack<Integer> stack = new Stack<>();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println("Size of stack: " + stack.size());
        } catch (EmptyStackException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}