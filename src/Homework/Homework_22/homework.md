<details style="padding-top: 18px">
  <summary>Homework</summary>

### **Task 1: Enhancing the `User` class**
1. Add a method `isAdult()`, which returns `true` if the user's age is 18 or older and `false` otherwise.
2. Modify the `displayUserInfo()` method to also display whether the user is an adult.
3. Test the class by creating multiple `User` objects and calling all methods.

---

### **Task 2: Improving the `BankAccount` class**
1. Add a method `transfer(BankAccount targetAccount, double amount)`, which transfers money from the current account to another if there are sufficient funds.
2. Modify the `withdraw(double amount)` method to prevent overdrawing (display an error message if the balance is too low).
3. Test the class by creating multiple `BankAccount` objects and performing deposits, withdrawals, and transfers.

---

### **Task 3: Extending the `Product` class**
1. Add a method `applyDiscount(double percentage)`, which decreases the price of the product by the given percentage.
2. Modify the `sell(int quantity)` method to check if the quantity requested is available; if not, display a message and sell only the available amount.
3. Test by creating multiple `Product` objects and applying discounts and sales.

---

### **Task 4: Expanding the `SmartDevice` class**
1. Add a method `togglePower()`, which switches the device between on and off.
2. Modify `displayStatus()` to indicate whether the device is currently on or off.
3. Test the class by creating a `SmartDevice` object and toggling the power state multiple times.

---

### **Task 5: Improving the `Order` class**
1. Add a method `calculateFinalAmount(double taxRate, double discountPercentage)`, which returns the total order amount after applying a tax and discount.
2. Modify `displayOrder()` to include the final amount with tax and discount.
3. Test the class by creating multiple `Order` objects with different tax and discount values.

---

### **Bonus Task (Optional, for advanced students)**
Create a new class `Store`, which manages multiple products. Implement:
1. A field `products` (a list of `Product` objects).
2. A method `addProduct(Product product)`, which adds a product to the store.
3. A method `displayAllProducts()`, which prints all products.
4. A method `findMostExpensiveProduct()`, which returns the most expensive product in the store.
5. Test by creating a `Store` and adding multiple products.

</details>

--------

<details style="padding-top: 18px">
  <summary>Домашнее задание</summary>

### **Задание 1: Доработка класса `User`**
1. Добавить метод `isAdult()`, который возвращает `true`, если пользователю 18 лет или больше, и `false` в противном случае.
2. Изменить метод `displayUserInfo()`, чтобы он также отображал информацию о совершеннолетии пользователя.
3. Протестировать класс, создав несколько объектов `User` и вызвав все методы.

---

### **Задание 2: Улучшение класса `BankAccount`**
1. Добавить метод `transfer(BankAccount targetAccount, double amount)`, который переводит деньги с текущего счета на другой, если средств достаточно.
2. Изменить метод `withdraw(double amount)`, чтобы он не позволял снимать больше, чем есть на счету (выводить сообщение об ошибке).
3. Протестировать класс, создав несколько объектов `BankAccount` и выполнив операции пополнения, снятия и перевода.

---

### **Задание 3: Расширение класса `Product`**
1. Добавить метод `applyDiscount(double percentage)`, который уменьшает цену товара на заданный процент.
2. Изменить метод `sell(int quantity)`, чтобы он проверял наличие нужного количества товара; если товара недостаточно, продавать только доступное количество и выводить сообщение.
3. Протестировать класс, создав несколько объектов `Product` и применив скидки и продажи.

---

### **Задание 4: Улучшение класса `SmartDevice`**
1. Добавить метод `togglePower()`, который переключает устройство между включенным и выключенным состоянием.
2. Изменить `displayStatus()`, чтобы он показывал, включено ли устройство или нет.
3. Протестировать класс, создав объект `SmartDevice` и несколько раз переключив его состояние.

---

### **Задание 5: Улучшение класса `Order`**
1. Добавить метод `calculateFinalAmount(double taxRate, double discountPercentage)`, который возвращает итоговую сумму заказа с учетом налога и скидки.
2. Изменить `displayOrder()`, чтобы он отображал финальную сумму с учетом налога и скидки.
3. Протестировать класс, создав несколько объектов `Order` с разными налогами и скидками.

---

### **Дополнительное задание (необязательное, для продвинутых студентов)**
Создать новый класс `Store`, который управляет списком товаров (`Product`). Реализовать:
1. Поле `products` (список товаров).
2. Метод `addProduct(Product product)`, который добавляет товар в магазин.
3. Метод `displayAllProducts()`, который выводит список всех товаров.
4. Метод `findMostExpensiveProduct()`, который возвращает самый дорогой товар.
5. Протестировать, создав `Store` и добавив несколько товаров.

</details>