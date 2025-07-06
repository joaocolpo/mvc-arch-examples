class TaskView {

  constructor() {
    this.input = document.getElementById('task-input');
    this.list = document.getElementById('task-list');
  }

  getInputValue() {
    return this.input.value.trim();
  }

  clearInput() {
    this.input.value = '';
  }

  render(todos, onDelete) {
    this.list.innerHTML = '';
    todos.forEach((todo, index) => {
      const li = document.createElement('li');
      li.textContent = todo;
      li.onclick = () => onDelete(index);
      this.list.appendChild(li);
    });
  }
}
