### Extend vs Runnable

- Which approach is better ?

  - if we extend thread then we can't extend any other class which is usually a big disadvantage

  - However a class may implement more than one interface, so while using implement Runnable approach, there is no restriction to extension of class now or in the future.

  ### What is .join() in java ?

  **Main thread as the parent thread**

  - When we start a program, usually the execution begins with main() method. This method runs on the main thread. This can be undertood as the parent thread since it spawns the other thread.

  **Indepenedent execution of threads**

  - When you create and start other threads, they run concurrently with the main thread unless instructed otherwise. So under normal circumstances, all threads independent of each other. More explicitly, no thread waits for the other thread.

  **What is join()**

  - Imagine threads to be lines of execution. So, when we call .join() on a certain thread, it means the parent thread, the main thread in this case (could be any thread which created the thread on which .join() is being called) is saying _Hey thread, once you are done executing your task, join my flow of execution._ It's like the parent thread waits for the completion of the child thread and then continues with its execution.

  (M-Thread) ---------->
  (O-Thread) ----->
  (T-Thread) --------->

  - The join keyword might not always be the better intuitive at first for this kind of operation it's doing. Somewhat better terms could have been .waitForcompletion() or .completeThenContinue().
