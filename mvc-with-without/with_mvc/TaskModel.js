class TaskModel {

  constructor() {
    this.tarefas = [];
  }

  add(todo) {
    this.tarefas.push(todo);
  }

  remove(index) {
    this.tarefas.splice(index, 1);
  }

  getAll() {
    return this.tarefas;
  }
}
