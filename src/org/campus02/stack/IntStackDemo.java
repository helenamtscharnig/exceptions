package org.campus02.stack;


import org.campus02.stack.exceptions.MyEmptyException;
import org.campus02.stack.exceptions.MyException;

public class IntStackDemo {
    public static void main(String[] args) {
        //try {
        // via Code - Surround with kann ich try/catch/finally einfügen lassen
        // vorher den entsprechenden Code-Teil markieren

        try {
            IntStack stack = new IntStack(2);
            System.out.println("push = " + 1);
            stack.push(3);
            System.out.println("stack = " + stack);

            int pop = stack.pop();
            System.out.println("pop = " + pop);
            System.out.println("stack = " + stack);

            System.out.println("push = " + 2);
            stack.push(2);
            System.out.println("stack = " + stack);

            stack.push(1);
            stack.push(2);

        } catch (MyException e) {
            e.printStackTrace();
        } catch (MyEmptyException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

       /* } catch (Exception e){
            System.out.println("Fehler wurde geworfen");
            e.getStackTrace();
        } finally {
            System.out.println("close all connections");
        }*/

        /*    try {
                IntStack sstack = new IntStack(2);
                sstack.push(3);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("close all open connections");
            }
        }*/

        /*try {
            IntStack estack = new IntStack(1);
            estack.pop();
            estack.pop();
        } catch (Exception e){
            e.printStackTrace();
        } finally{
            System.out.println("close all open connections");
        }*/

    }

}

