# AsyncThread
AsyncThread is non-blocking asynchronise library for java for creating threads asyncronysly in a class.
In the common Thread defining you just restridcted into a method <b>run()</b> like as follows:
~~Mistaken text.~~
<code>
<b>
public class ThreadClass extends Thread {
    @Overrid
    public void run() {
        //TODO staffs
    }
}
</b>
</code>

As you can see we can just define the <b>run() </b> method and change a variable or update a variable's value.
In AsyncThread library you can define multiple methods and name it whatever you like and set priority to each 
method to run. Also it is possible to run methods in <b>chain-mode</b>, like each method is depended to another
methos's executing.
In AsyncThread library is possible to define callbacks. Callbacks can be defined to warn event-based programming,
or non-blocking manner of programming.

In below we define a Class for asyncronisly defining methods in parallel mode.
~~Mistaken text.~~
<code>
public class AsyncThreadClass {
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AsyncThreadClass newMain = new AsyncThreadClass();
        AsyncThread<NewMain> at = new AsyncThread<>(newMain);
        at.execute();//excecute all methods with @async annotations
    }
    
    @Async
    public void method1() {
        System.out.println("Method1");
    }

    @Async
    public void method2() {
        System.out.println("Method2");
    }
    
    @Async
    public void method3() {
        System.out.println("method3");
    }
}
</code>
