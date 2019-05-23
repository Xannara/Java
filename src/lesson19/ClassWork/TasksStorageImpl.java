package lesson19.ClassWork;

import java.util.ArrayList;

public class TasksStorageImpl implements TasksStorage {
    private ArrayList<Task> tasks = new ArrayList<>();

    @Override
    public synchronized void add(Task task) throws NullPointerException {
        tasks.add(task);
    }

    @Override
    public synchronized Task get() {
        if (tasks.size() > 0) {
            return tasks.remove(0);
        }
        return null;
    }

    @Override
    public synchronized int count() {
        return tasks.size();
    }
}
