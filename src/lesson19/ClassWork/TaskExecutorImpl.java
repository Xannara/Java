package lesson19.ClassWork;

public class TaskExecutorImpl extends Thread implements TaskExecutor {
    private TasksStorage storage;

    @Override
    public void setStorage(TasksStorage storage) throws NullPointerException {
        this.storage = storage;
    }

    @Override
    public TasksStorage getStorage() {
        return this.storage;
    }

    @Override
    public void run() {
        while (true) {
            Task task = storage.get();
            if (task == null) {
                System.out.println(Thread.currentThread().getName() + " задач не обнаружил, завершаю работу");
                break;
            }
            try {
                System.out.println(Thread.currentThread().getName() + " начал выполнять задачу: " + task);
                task.execute();
                System.out.println(Thread.currentThread().getName() + " задача выполнена успешно " + task);
            } catch (TaskExecutionFailedException e) {
                System.out.println(Thread.currentThread().getName() + " не возможно выполнить задачу " + task);
                if (task.getTryCount() < 5) {
                    task.incTryCount();
                    storage.add(task);
                } else {
                    System.out.println(Thread.currentThread().getName() + " удаляю задачу: " + task);
                }
            }
        }
    }
}
