<details style="padding-top: 18px">
  <summary>Homework</summary>

### **Task 1: Improving the `AudioTrack` class**
1. Add a new method `isLongTrack()` that returns `true` if the track duration is longer than 300 seconds (5 minutes) and `false` otherwise.
2. Modify the `displayTrackInfo()` method to also display the result of `isLongTrack()`.
3. Test the class by creating multiple `AudioTrack` objects and calling all methods.

---

### **Task 2: Enhancing the `Message` class**
1. Add a new method `isFrom(String username)` that checks whether the message was sent by the specified user.
2. Add a method `shortPreview(int maxLength)`, which returns the first `maxLength` characters of the message followed by `"..."` if it exceeds the limit.
3. Create multiple `Message` objects and test the new functionality.

---

### **Task 3: Extending the `Task` class**
1. Add a `priority` field (integer) to indicate the task priority (the smaller the number, the higher the priority).
2. Implement the method `isHighPriority()`, which returns `true` if the task priority is less than 3 and `false` otherwise.
3. Modify the `displayTask()` method to show the priority and classify it as "High", "Medium", or "Low".
4. Test the code with multiple tasks.

---

### **Bonus Task (Optional, for advanced students)**
Create a new class `Notebook` that stores a list of tasks (`Task`). Implement:
1. A `tasks` field (a list of tasks).
2. A method `addTask(Task task)` to add a task to the list.
3. A method `showAllTasks()` to display all tasks.
4. A method `showHighPriorityTasks()` to display only high-priority tasks.
5. Test by creating a `Notebook` and adding multiple tasks.

</details>

-----------
<details style="padding-top: 18px">
  <summary>Домашнее задание</summary>

### **Задание 1: Доработка класса `AudioTrack`**
1. Добавить новый метод `isLongTrack()`, который возвращает `true`, если длительность трека больше 300 секунд (5 минут), и `false` в противном случае.
2. Изменить метод `displayTrackInfo()`, чтобы он также выводил результат метода `isLongTrack()`.
3. Протестировать класс, создав несколько объектов `AudioTrack` и вызвав все методы.

---

### **Задание 2: Улучшение класса `Message`**
1. Добавить новый метод `isFrom(String username)`, который проверяет, отправлено ли сообщение указанным пользователем.
2. Добавить метод `shortPreview(int maxLength)`, который возвращает первые `maxLength` символов сообщения + `"..."`, если оно длиннее указанного лимита.
3. Создать несколько объектов `Message` и протестировать новый функционал.

---

### **Задание 3: Расширение класса `Task`**
1. Добавить поле `priority` (целое число), которое обозначает приоритет задачи (чем меньше число, тем выше приоритет).
2. Реализовать метод `isHighPriority()`, который возвращает `true`, если приоритет задачи меньше 3, и `false` в противном случае.
3. В методе `displayTask()` добавить вывод приоритета и его классификацию (например, "Высокий", "Средний", "Низкий").
4. Протестировать код создав несколько задач.

---

### **Дополнительное задание (необязательное, для продвинутых студентов)**
Создать новый класс `Notebook`, который будет хранить список задач (`Task`). Реализовать:
1. Поле `tasks` (список задач).
2. Метод `addTask(Task task)`, который добавляет задачу в список.
3. Метод `showAllTasks()`, который выводит все задачи.
4. Метод `showHighPriorityTasks()`, который выводит только задачи с высоким приоритетом.
5. Протестировать, создав `Notebook` и несколько задач.

</details>