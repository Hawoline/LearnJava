package lection1;

public class Programmer extends Employee {
  public Programmer(TaskProgressCallback callback, String name) {
    super(callback, name, Task.Status.READY_TO_DO);
  }

  @Override protected Task getTaskWhenDone(Task task) {
    return new Task(task.getId(),
        Task.Status.READY_FOR_TESTING,
        task.getDescription(),
        task.getDesignLink(),
        task.getTestCase(),
        getBuildLinkForTask(task.getId())
        );
  }

  @Override protected String getDetails(Task task) {
    return " with taskId" + task.getId() +
        " and designLink" + task.getDesignLink() +
        "\nand testCase" + task.getTestCase();
  }

  private String getBuildLinkForTask(int taskId) {
    return "https://bitbucket/project/link_for_build_with_task_id_" + taskId;
  }
}
