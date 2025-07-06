class TaskController {

  constructor(model, view) {
    this.model = model;
    this.view = view;

    document
        .querySelector('button')
        .onclick = () => this.addTask();

    this.view
        .render(this.model.getAll(), (i) => this.removeTask(i));
  }

  addTask() {
    const task = this.view.getInputValue();
    if (task) {
      this.model.add(task);
      this.view.clearInput();
      this.view.render(this.model.getAll(), (i) => this.removeTask(i));
    }
  }

  removeTask(index) {
    this.model.remove(index);
    this.view.render(this.model.getAll(), (i) => this.removeTask(i));
  }
}
