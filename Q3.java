class Q3 {
    void implement(){
        Runnable task2 = () -> { System.out.println("Task #2 is running"); };
        new Thread(task2).start();
    }
}