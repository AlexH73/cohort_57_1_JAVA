<details style="padding-top: 18px">
  <summary><b>Homework: Polymorphism in a Payment System</b></summary>

## **Task: Implementing Polymorphism in a Payment System**

🔹 In this task, you will create a system that supports multiple payment methods.  
🔹 **Step 1:** Implement a base class `PaymentMethod` with common properties and a `pay()` method.  
🔹 **Step 2:** Create subclasses `CreditCardPayment`, `PayPalPayment`, and `CryptoPayment`, overriding `pay()`.  
🔹 **Step 3:** Use polymorphism to process different payment types in a unified way.

---

### **Step 1: Create the Base Class `PaymentMethod`**
✔ Define fields for `amount` and `currency`.  
✔ Implement a method `pay()`, which will later be overridden by subclasses.

---

### **Step 2: Create Subclasses for Different Payment Methods**
✔ `CreditCardPayment` – Implements `pay()` to simulate a credit card transaction.  
✔ `PayPalPayment` – Implements `pay()` to simulate a PayPal transaction.  
✔ `CryptoPayment` – Implements `pay()` to simulate a cryptocurrency transaction.

Each subclass should **implement its own version of `pay()`**.

---

### **Step 3: Use Polymorphism in the `Main` Class**
✔ Create an array or list of `PaymentMethod` objects, each holding a different type of payment.  
✔ Iterate through the collection and call `pay()` on each payment method.  
✔ Observe how Java dynamically calls the correct `pay()` method depending on the object type.

---

🚀 **Bonus Task:**  
✔ Add a method `refund()` in `PaymentMethod`, which can be overridden in subclasses to simulate refunds.  
✔ Implement method overloading for `pay()`, allowing additional details (e.g., `transactionId`) to be passed.

</details>

------

<details style="padding-top: 18px">
  <summary><b>Домашнее задание: Полиморфизм в системе платежей</b></summary>

## **Задание: Реализация полиморфизма в системе платежей**

🔹 В этом задании вам нужно создать систему, поддерживающую разные способы оплаты.  
🔹 **Шаг 1:** Реализовать базовый класс `PaymentMethod` с общими свойствами и методом `pay()`.  
🔹 **Шаг 2:** Создать подклассы `CreditCardPayment`, `PayPalPayment` и `CryptoPayment`, переопределяя `pay()`.  
🔹 **Шаг 3:** Использовать полиморфизм для обработки различных типов платежей единым способом.

---

### **Шаг 1: Создание базового класса `PaymentMethod`**
✔ Определите поля `amount` (сумма) и `currency` (валюта).  
✔ Реализуйте метод `pay()`, который позже будет переопределён в подклассах.

---

### **Шаг 2: Создание подклассов для различных способов оплаты**
✔ `CreditCardPayment` – реализует `pay()`, имитируя оплату кредитной картой.  
✔ `PayPalPayment` – реализует `pay()`, имитируя оплату через PayPal.  
✔ `CryptoPayment` – реализует `pay()`, имитируя оплату криптовалютой.

Каждый подкласс должен **по-своему реализовать метод `pay()`**.

---

### **Шаг 3: Использование полиморфизма в классе `Main`**
✔ Создайте массив или список объектов `PaymentMethod`, содержащий разные способы оплаты.  
✔ Проитерируйте коллекцию и вызовите `pay()` для каждого платежа.  
✔ Обратите внимание, как Java автоматически вызывает нужную версию метода `pay()` в зависимости от типа объекта.

---

🚀 **Дополнительное задание:**  
✔ Добавьте в `PaymentMethod` метод `refund()`, который можно переопределить в подклассах для имитации возврата платежа.  
✔ Реализуйте перегрузку метода `pay()`, чтобы можно было передавать дополнительные детали (например, `transactionId`).

</details>