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

  ### Daemon and User Threads

  **On the basis of surface of execution, threads can be of two types**

  - Daemon Threads
  - User Threads

  \*_When a java program starts the main thread (main() method thread) starts running immediately. We can start child threads from the main thread. The main thread is the last thread to finish execution in normal circumstances, because it has to perform various shutdown operations._

  \*_Daemon threads are intended to be helper threads which can run in background and are of low priority. Eg GC thread_

  \*_Daemon threads are terminated by the JVM when all other user threads are terminated (done with their execution)_

  \*_So, under normal circumstances, user threads are allowed to terminate once they are done with execution, however, the daemon threads are shutdown by JVM once the other threads are done executing._

### Thread Priority

- Let's say there are 10 threads in runnable state, however, there is one avaliable CPU, so only one thread can execute at a given time and others will have to wait. So who decides which thread gets to run on the CPU.This component is called as Thread Scheduler.

- Each thread has certain priority and under normal circumstances the thread with higher priority gets to run on the CPU

- Priority value from 1 to 10 can be assigned to any thread. 1 priority is represented as MIN_PRIORITY and 10 priority is represented as MAX_PRIORITY. By default, the priority of a thread is 5, it's represented as NORM_PRIORITY.

- Threads of the same Priority value are executed in FIFO manner. The thread scheduler stores the thread in a queue.
