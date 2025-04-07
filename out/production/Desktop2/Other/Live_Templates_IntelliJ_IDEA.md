# Живые шаблоны IntelliJ IDEA (Live Templates)

## **1. Java**

### **Общие конструкции**

- `psvm` или `main` → Создает метод `main()`

    ```java
    public static void main(String[] args) { }
    ```

- `sout` → Вывод в консоль

    ```java
    System.out.println($END$);
    ```

- `soutv` → Вывод переменной в консоль

    ```java
    System.out.println("$EXPR$ = " + $EXPR$);
    ```

- `soutp` → Вывод параметра метода в консоль

    ```java
    System.out.println("$PARAM$ = " + $PARAM$);
    ```

- `soutm` → Вывод информации о текущем методе

    ```java
    System.out.println("$CLASS$.$METHOD$");
    ```


### **Циклы и условия**

- `fori` → Обычный `for` цикл

    ```java
    for (int i = 0; i < $LIMIT$; i++) { $END$ }
    ```

- `iter` → `for-each` цикл

    ```java
    for ($TYPE$ $VAR$ : $ITERABLE$) { $END$ }
    ```

- `itar` → Итерация по массиву с конца

    ```java
    for (int i = $ARRAY$.length - 1; i >= 0; i--) { $END$ }
    ```

- `ifn` → Проверка на `null`

    ```java
    if ($VAR$ == null) { $END$ }
    ```

- `inn` → Проверка на `not null`

    ```java
    if ($VAR$ != null) { $END$ }
    ```


### **Логирование**

- `log` → Создание логгера

    ```java
    private static final Logger LOGGER = LoggerFactory.getLogger($CLASS$.class);
    ```

- `logd` → Логирование уровня `DEBUG`

    ```java
    LOGGER.debug("$MESSAGE$");
    ```

- `logi` → Логирование уровня `INFO`

    ```java
    LOGGER.info("$MESSAGE$");
    ```

- `loge` → Логирование ошибки

    ```java
    LOGGER.error("$MESSAGE$", $EXCEPTION$);
    ```


---

## **2. Kotlin**

- `main` → Функция `main()`

    ```kotlin
    fun main() { $END$ }
    ```

- `sout` → Вывод в консоль

    ```kotlin
    println($END$)
    ```

- `fori` → Цикл `for`

    ```kotlin
    for (i in 0 until $LIMIT$) { $END$ }
    ```

- `iter` → `for-each` цикл

    ```kotlin
    for ($VAR$ in $ITERABLE$) { $END$ }
    ```

- `ifn` → Проверка на `null`

    ```kotlin
    if ($VAR$ == null) { $END$ }
    ```


---

## **3. HTML**

- `html` → Базовая HTML-структура

    ```html
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>$TITLE$</title>
    </head>
    <body>
        $END$
    </body>
    </html>
    ```

- `div` → Создание `<div>` блока

    ```html
    <div>$END$</div>
    ```

- `a` → Создание ссылки

    ```html
    <a href="$URL$">$TEXT$</a>
    ```


---

## **4. SQL**

- `sel` → Запрос `SELECT`

    ```sql
    SELECT * FROM $TABLE$ WHERE $CONDITION$;
    ```

- `ins` → Запрос `INSERT`

    ```sql
    INSERT INTO $TABLE$ ($COLUMNS$) VALUES ($VALUES$);
    ```

- `upd` → Запрос `UPDATE`

    ```sql
    UPDATE $TABLE$ SET $COLUMN$ = $VALUE$ WHERE $CONDITION$;
    ```

- `del` → Запрос `DELETE`

    ```sql
    DELETE FROM $TABLE$ WHERE $CONDITION$;
    ```


---

## **5. XML**

- `xml` → Структура XML-документа

    ```xml
    <?xml version="1.0" encoding="UTF-8"?>
    ```

- `tag` → Создание XML-тега

    ```xml
    <$TAG$>$END$</$TAG$>
    ```


---

## **6. Markdown**

- `h1` → Заголовок первого уровня

    ```markdown
    # $TITLE$
    ```

- `h2` → Заголовок второго уровня

    ```markdown
    ## $TITLE$
    ```

- `h3` → Заголовок третьего уровня

    ```markdown
    ### $TITLE$
    ```

- `link` → Создание ссылки

    ```markdown
    [$TEXT$]($URL$)
    ```


---

## Как использовать живые шаблоны

1. Начните вводить сокращение шаблона в вашем коде.
2. Когда IntelliJ IDEA предложит вам автодополнение, нажмите `Tab` или `Enter` для вставки развернутого кода.

## Настройка живых шаблонов

Вы можете настроить существующие живые шаблоны или создать свои собственные:

1. Откройте настройки: `File -> Settings` (Windows/Linux) или `IntelliJ IDEA -> Preferences` (Mac).
2. Перейдите к разделу `Editor -> Live Templates`.
3. Здесь вы можете добавлять, изменять или удалять шаблоны по своему усмотрению.