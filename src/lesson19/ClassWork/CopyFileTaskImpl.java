package lesson19.ClassWork;

import lesson19.FileCopyFailedException;
import lesson19.FileCopyUtils;

public class CopyFileTaskImpl extends TaskImpl implements CopyFileTask {
    private String fileFrom;
    private String fileTo;
    private FileCopyUtils copyUtils;

    public CopyFileTaskImpl() {

    }

    public CopyFileTaskImpl(String fileFrom, String fileTo) {
        this.fileFrom = fileFrom;
        this.fileTo = fileTo;
    }

    @Override
    public void setFileCopyUtils(FileCopyUtils copyUtils) {
        this.copyUtils = copyUtils;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        try {
            this.copyUtils.copyFile(fileFrom, fileTo);
        } catch (FileCopyFailedException e) {
           throw new TaskExecutionFailedException("Не копируется");
        }
    }
}
