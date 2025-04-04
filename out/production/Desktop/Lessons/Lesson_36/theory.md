<details>
<summary>Lesson 36. Practice IO in Java</summary>

# Lesson 36. Practice IO in Java

## Introduction to IO in Java

### General overview of IO in Java

In Java, I/O (IO) is the process of moving data between different devices and your program. Java
provides powerful and flexible tools for working with IO through packages `java.io `and `java.nio`, allowing you to read and write
data both from files and over network connections, as well as manipulate the file system.

### The difference between byte and character streams

- **Byte streams (InputStream/OutputStream)**: These streams are used to read and write binary data. They
  they work with data at the level of individual bytes, which makes them ideal for working with files of any type, including
  images, audio and video files. Examples
  classes: `FileInputStream`, `FileOutputStream`, `BufferedInputStream`, `BufferedOutputStream'.

- **Character Streams (Reader/Writer)**: Character streams are designed to work with text data. They read and
  write data at the character level, automatically processing the conversion of bytes into characters and vice versa, taking into account
  the encoding. This makes them suitable for reading and writing text files. Examples
  classes: `FileReader`, `FileWriter`, `BufferedReader`, `BufferedWriter'.

### Blocking and non-blocking I/O

- **Blocking I/O**: With blocking IO, the program execution flow stops until
  an input or output operation is performed. This means that the application cannot continue execution until it is
  the input stream has been read or the writing to the output stream will not be completed. Most of the classes in `java.io `they work in
  blocking mode.

- **Non-blocking I/O**: Non-blocking IO allows the program to continue execution while the operation
  I/O is performed in the background. This is especially important for the development of high-performance applications such as
  like servers serving multiple clients at the same time. The 'java.nio` API is a set of non-blocking
  I/O operations using Channels and Buffers to efficiently work with data.

Using non-blocking I/O requires more complex processing, including working with selectors that
allow a single thread to control multiple I/O channels. Non-blocking IO significantly increases
the scalability and performance of applications, especially those that handle a large number of simultaneous
connections.

The introduction to the IO system in Java gives developers a deep understanding of the basics of working with data, allowing them to create more
powerful and flexible applications.

## Working with files in Java

### Assignment of the File class

The `File` class from the package `java.io ` is an abstraction used to work with files and directories on
the file system. It allows you to create, delete files and directories, check their existence, read and change
file attributes, as well as get information about files and directories, such as size, access rights and the time of last
modification.

### Basic methods of the File class

- **`boolean exists()`** - checks if a file or directory exists.
- **`String getAbsolutePath()`** - returns the absolute path to the file or directory.
- **`long length()`** - returns the file size in bytes.
- **`boolean isFile()`** - checks if the object is a file.
- **`boolean isDirectory()`** - checks whether the object is a directory.
- **`boolean createNewFile()`** - creates a new empty file if a file with the same name does not already exist.
- **`boolean delete()`** - deletes a file or directory.
- **`File[] listFiles()`** - returns an array of files and directories contained in the directory.
- **`boolean mkdir()`** - creates a directory.
- **`boolean renameTo(File dest)`** - renames a file or directory.
- **`long LastModified()`** - returns the time when the file or directory was last modified.

### Why do I need the File class?

The `File` class is needed to manage files and directories at the file system level in Java applications. It
provides methods for performing standard file system operations such as creating, deleting files and
directories, checking their existence and properties, and reading lists of files in directories. This makes the `File` class the main
tool for working with the file system when developing Java applications.

### Classes File, FileInputStream, FileOutputStream

In Java, the main classes from the package are used to work with the file system and files `java.io `.

- **The `File` class** provides an abstraction for working with files and directories. You can use it to create, delete
  files, check their existence, read and set file attributes such as access rights, and more.

- **`FileInputStream` and `FileOutputStream`** are input and output streams for working with files at the level
  bytes. `FileInputStream` reads data from a file, and `FileOutputStream` writes data to a file.

### Reading and writing files using FileInputStream and FileOutputStream

To read from a file and write to a file at the byte level, the `FileInputStream` and `FileOutputStream` classes are used
, respectively.

- **Reading a file from `FileInputStream`**:

```java
public class ReaderClass {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt")) {
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

This code demonstrates reading a file one byte at a time and outputting its contents to the console.

- **Writing to a file with `FileOutputStream`**:

```java
public class WriterClass {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            String data = "Hello, Java!";
            fos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Here we write a string to a file, converting the string into an array of bytes.

### Working with FileReader and FileWriter to read and write text files

To work with text files, Java provides the `FileReader` and `FileWriter` classes, which work at
the character level, which makes it easier to read and write text.

- Reading a text file from the `FileReader`:

```java
public class ReaderClass {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("input.txt");
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Here the `BufferedReader` is used to efficiently read lines from a file.

- Writing to a text file with `FileWriter`:

```java
public class WriterClass {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("output.txt");
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Hello, Java!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

## A comparative table of similar classes for working with files in Java

| Functionality | Byte streams | Character streams |
|--------------------------|----------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------|
| **Main class** | `InputStream`/`OutputStream`                                                                                   | `Reader`/`Writer`                                                                                           |
| **Reading the file**         | `FileInputStream`                                                                                              | `FileReader`                                                                                                |
| **Writing to a file**        | `FileOutputStream`                                                                                             | `FileWriter`                                                                                                |
| **Buffering** | `BufferedInputStream`/`BufferedOutputStream`                                                                   | `BufferedReader`/`BufferedWriter`                                                                           |
| **Text reading/writing** | Are used to read/write binary data, byte conversion to text and back is performed manually | Natively support working with text, automatically processing character conversion to bytes and vice versa |
| **Performance** | High for binary data | High for text data |
| **Usage**        | Ideal for working with images, audio, video files and any other types of binary data | Ideal for reading and writing text files such as text documents, CSV, XML, etc.      |

## Buffering in Java

### Understanding buffered streams

Buffering in Java IO is used to improve the efficiency of reading and writing data by minimizing access to
physical storage media such as a hard drive or network connection. Buffered streams read or
write "chunks" of data, reducing the number of I/O operations.

### BufferedInputStream, BufferedOutputStream, BufferedReader, BufferedWriter classes

Java provides classes for buffering both byte and character streams:

- **`BufferedInputStream` and `BufferedOutputStream`** are used for buffered reading and writing of byte
  streams. These classes wrap other I/O streams such as 'FileInputStream` and `FileOutputStream`,
  by providing buffering to increase performance.

- **`BufferedReader` and `BufferedWriter'** are designed for buffered reading and writing of character streams. They
  are convenient for working with text data, as they provide efficient line reading and text writing using
  a buffer.

### Examples of using buffered streams to improve performance

- **Reading a file from `BufferedInputStream`**:

```java
public class ReaderClass {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("input.bin"))) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
// Processing of read data
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Here BufferedInputStream reads data in large blocks, which reduces the number of read operations.

- **Writing to a file with `BufferedOutputStream`**:

```java
public class WriterClass {
    public static void main(String[] args) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.bin"))) {
            byte[] data = // initializing data for writing;
                    bos.write(data);
// Writing is performed efficiently, using a buffer to collect data before writing it to disk.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

- **Reading a text file from the `BufferedReader`:**

```java
public class ReaderClass {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

The `BufferedReader` allows you to read entire lines, which is especially convenient for text data.

- **Writing to a text file with `BufferedWriter`**:

```java
public class WriterClass {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write("Example of a string to write \n");
            // `BufferedWriter` collects text in the buffer before writing it, which reduces the number of disk accesses.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

The use of buffered streams significantly increases the performance of I/O operations due to
reducing the number of calls to slow storage devices. This makes buffered streams
the preferred choice for many data reading and writing tasks.

## Object serialization in Java

### The concept of serialization and deserialization of objects

Object serialization is the process of converting the state of an object into a sequence of bytes so that it can be
stored in a file or transmitted over the network. Deserialization is a reverse process in which
the initial state of an object is restored from a sequence of bytes.

### ObjectOutputStream and ObjectInputStream classes

Java uses two main classes for serialization and deserialization of objects: 'ObjectOutputStream`
and `ObjectInputStream'.

- **`ObjectOutputStream`** writes serialized objects to the output stream.
- **`ObjectInputStream`** reads and restores objects from the input stream.

### Examples of serialization and deserialization of objects

- **Serializing an object with an `ObjectOutputStream`**:

```java
public class WriterClass {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.dat"))) {
            MyClass object = new MyClass();
            // Initializing the MyClass object
            oos.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

In this example, the `MyClass' object is serialized and written to the `object.dat` file.

- **Deserializing an object with an `ObjectInputStream`**:

```java
public class ReaderClass {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.dat"))) {
            MyClass object = (MyClass) ois.readObject();
            // Using a deserialized object
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

Here the `MyClass` object is restored from the `object.dat` file.

### Important points in serialization

- The object class must implement the `Serializable` interface. This is a token interface that does not require implementation
  methods,
  but it indicates to the JVM that an object of this class can be serialized.
- Not all objects can be serialized. Objects of classes that do not implement `Serializable', as well as some system classes
  not
  subject to serialization.
- When an object is serialized, all the objects it references are serialized if they are also serializable. It may
  result in the serialization of an entire graph of objects.
- Static fields and fields marked as `transient` are not serialized.
- Serialization and deserialization are powerful mechanisms for preserving the state of objects and their subsequent restoration,
  which
  It is widely used in Java to work with data, transfer objects over the network and save application states.

## Working with ZIP archives in Java

### ZipInputStream and ZipOutputStream classes

Java offers powerful tools for working with ZIP archives through a package `java.util.zip `, in which the key classes
are `ZipInputStream` for reading from ZIP files and `ZipOutputStream` for creating ZIP files.

- **`ZipInputStream`** allows you to read data from a ZIP file. It reads sequentially incoming ZIP elements (files and
  directories in the archive), allowing you to extract the data of each element.

- **`ZipOutputStream`** is used to create a ZIP file. You can use it to add new items to the archive,
  specifying the file name (in the archive) and the contents for each.

### Creating a ZIP archive using ZipOutputStream

To create a ZIP archive, you need to create an instance of `ZipOutputStream` by passing the `FileOutputStream` object to its constructor,
pointing to the file that will be created as a ZIP archive. Then, using the `putNextEntry` method, you can add
new files to the archive, and use the `write` recording methods to add the contents of the files.

```java
public class Example {
    public static void main(String[] args) {
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("archive.zip"))) {
            ZipEntry entry = new ZipEntry("file1.txt");
            zos.putNextEntry(entry);
            zos.write("Content of file1".getBytes());
            zos.closeEntry();
            // Repeat for other files
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Unpacking a ZIP archive using ZipInputStream

To unpack the ZIP archive, a `ZipInputStream` is used, which reads the ZIP file and allows you to extract it sequentially
the elements included in it. For each element (the `ZipEntry` object), you can extract its contents and save them to the
file
system.

```java
public class Example {
    public static void main(String[] args) {
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream("archive.zip"))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
// Creating a file from ZipEntry
                try (FileOutputStream fos = new FileOutputStream(entry.getName())) {
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = zis.read(buffer)) > 0) {
                        fos.write(buffer, 0, length);
                    }
                    zis.closeEntry();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Application
Working with ZIP archives in Java finds application in many areas, including software distribution,
data archiving, file sharing, and many others. Using `ZipInputStream` and `ZipOutputStream` provides efficient
processing of archived data in Java applications.

</details>


------------------------

<details>
<summary>Урок 36. Практика IO в Java</summary>

# Урок 36. Практика IO в Java

## Введение в IO в Java

### Общий обзор IO в Java

В Java ввод-вывод (IO) - это процесс перемещения данных между различными устройствами и вашей программой. Java
предоставляет мощные и гибкие средства для работы с IO через пакеты `java.io` и `java.nio`, позволяя читать и писать
данные как из файлов, так и через сетевые соединения, а также манипулировать файловой системой.

### Различие между байтовыми и символьными потоками

- **Байтовые потоки (InputStream/OutputStream)**: Эти потоки используются для чтения и записи двоичных данных. Они
  работают с данными на уровне отдельных байтов, что делает их идеальными для работы с файлами любого типа, включая
  изображения, аудио и видео файлы. Примеры
  классов: `FileInputStream`, `FileOutputStream`, `BufferedInputStream`, `BufferedOutputStream`.

- **Символьные потоки (Reader/Writer)**: Символьные потоки предназначены для работы с текстовыми данными. Они читают и
  записывают данные на уровне символов, автоматически обрабатывая преобразование байтов в символы и наоборот, с учетом
  кодировки. Это делает их подходящими для чтения и записи текстовых файлов. Примеры
  классов: `FileReader`, `FileWriter`, `BufferedReader`, `BufferedWriter`.

### Блокирующий и неблокирующий ввод-вывод

- **Блокирующий ввод-вывод**: При блокирующем IO поток выполнения программы останавливается до тех пор, пока не будет
  выполнена операция ввода или вывода. Это означает, что приложение не может продолжить выполнение, пока не будет
  прочитан входной поток или не будет завершена запись в выходной поток. Большинство классов в `java.io` работают в
  блокирующем режиме.

- **Неблокирующий ввод-вывод**: Неблокирующий IO позволяет программе продолжать выполнение, в то время как операция
  ввода-вывода выполняется в фоновом режиме. Это особенно важно для разработки высокопроизводительных приложений, таких
  как серверы, обслуживающие множество клиентов одновременно. API `java.nio` представляет собой набор неблокирующих
  операций ввода-вывода, используя каналы (Channels) и буферы (Buffers) для эффективной работы с данными.

Использование неблокирующего ввода-вывода требует более сложной обработки, включая работу с селекторами, которые
позволяют одному потоку контролировать множество каналов ввода-вывода. Неблокирующий IO значительно увеличивает
масштабируемость и производительность приложений, особенно тех, которые обрабатывают большое количество одновременных
соединений.

Введение в систему IO в Java дает разработчикам глубокое понимание основ работы с данными, позволяя создавать более
мощные и гибкие приложения.

## Работа с файлами в Java

### Назначение класса File

Класс `File` из пакета `java.io` представляет собой абстракцию, используемую для работы с файлами и директориями на
файловой системе. Он позволяет создавать, удалять файлы и каталоги, проверять их существование, читать и изменять
атрибуты файлов, а также получать информацию о файлах и директориях, такую как размер, права доступа и время последнего
изменения.

### Основные методы класса File

- **`boolean exists()`** - проверяет, существует ли файл или директория.
- **`String getAbsolutePath()`** - возвращает абсолютный путь к файлу или директории.
- **`long length()`** - возвращает размер файла в байтах.
- **`boolean isFile()`** - проверяет, является ли объект файлом.
- **`boolean isDirectory()`** - проверяет, является ли объект директорией.
- **`boolean createNewFile()`** - создает новый пустой файл, если файл с таким именем еще не существует.
- **`boolean delete()`** - удаляет файл или директорию.
- **`File[] listFiles()`** - возвращает массив файлов и директорий, содержащихся в директории.
- **`boolean mkdir()`** - создает директорию.
- **`boolean renameTo(File dest)`** - переименовывает файл или директорию.
- **`long lastModified()`** - возвращает время последнего изменения файла или директории.

### Зачем нужен класс File

Класс `File` необходим для управления файлами и директориями на уровне файловой системы в Java-приложениях. Он
предоставляет методы для выполнения стандартных операций файловой системы, таких как создание, удаление файлов и
директорий, проверка их существования и свойств, чтение списков файлов в директориях. Это делает класс `File` основным
инструментом для работы с файловой системой при разработке Java-приложений.

### Классы File, FileInputStream, FileOutputStream

В Java для работы с файловой системой и файлами используются основные классы из пакета `java.io`.

- **Класс `File`** предоставляет абстракцию для работы с файлами и каталогами. С его помощью можно создавать, удалять
  файлы, проверять их существование, читать и устанавливать атрибуты файлов, такие как права доступа, и многое другое.

- **`FileInputStream` и `FileOutputStream`** являются потоками ввода и вывода для работы с файлами на уровне
  байтов. `FileInputStream` читает данные из файла, а `FileOutputStream` записывает данные в файл.

### Чтение и запись файлов с помощью FileInputStream и FileOutputStream

Для чтения из файла и записи в файл на уровне байтов используются классы `FileInputStream` и `FileOutputStream`
соответственно.

- **Чтение файла с `FileInputStream`**:

```java
public class ReaderClass {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt")) {
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Этот код демонстрирует чтение файла по одному байту за раз и вывод его содержимого в консоль.

- **Запись в файл с `FileOutputStream`**:

```java
public class WriterClass {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            String data = "Hello, Java!";
            fos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Здесь мы записываем строку в файл, преобразуя строку в массив байтов.

### Работа с FileReader и FileWriter для чтения и записи текстовых файлов

Для работы с текстовыми файлами в Java предусмотрены классы `FileReader` и `FileWriter`, которые работают на уровне
символов, что упрощает чтение и запись текста.

- Чтение текстового файла с `FileReader`:

```java
public class ReaderClass {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("input.txt");
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Здесь используется `BufferedReader` для эффективного чтения строк из файла.

- Запись в текстовый файл с `FileWriter`:

```java
public class WriterClass {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("output.txt");
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Hello, Java!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

## Сравнительная таблица аналогичных классов для работы с файлами в Java

| Функционал               | Байтовые потоки                                                                                                | Символьные потоки                                                                                           |
|--------------------------|----------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------|
| **Основной класс**       | `InputStream`/`OutputStream`                                                                                   | `Reader`/`Writer`                                                                                           |
| **Чтение файла**         | `FileInputStream`                                                                                              | `FileReader`                                                                                                |
| **Запись в файл**        | `FileOutputStream`                                                                                             | `FileWriter`                                                                                                |
| **Буферизация**          | `BufferedInputStream`/`BufferedOutputStream`                                                                   | `BufferedReader`/`BufferedWriter`                                                                           |
| **Чтение/запись текста** | Используются для чтения/записи бинарных данных, преобразование байтов в текст и обратно осуществляется вручную | Нативно поддерживают работу с текстом, автоматически обрабатывая преобразование символов в байты и наоборот |
| **Производительность**   | Высокая для бинарных данных                                                                                    | Высокая для текстовых данных                                                                                |
| **Использование**        | Идеально подходит для работы с изображениями, аудио, видео файлами и любыми другими типами бинарных данных     | Идеально подходит для чтения и записи текстовых файлов, таких как текстовые документы, CSV, XML и т.д.      |

## Буферизация в Java

### Понимание буферизированных потоков

Буферизация в Java IO используется для повышения эффективности чтения и записи данных за счет минимизации обращений к
физическому носителю данных, такому как жесткий диск или сетевое соединение. Буферизированные потоки считывают или
записывают "порции" данных, уменьшая количество операций ввода-вывода.

### Классы BufferedInputStream, BufferedOutputStream, BufferedReader, BufferedWriter

Java предоставляет классы для буферизации как байтовых, так и символьных потоков:

- **`BufferedInputStream` и `BufferedOutputStream`** используются для буферизированного чтения и записи байтовых
  потоков. Эти классы обертывают другие потоки ввода-вывода, такие как `FileInputStream` и `FileOutputStream`,
  предоставляя буферизацию для увеличения производительности.

- **`BufferedReader` и `BufferedWriter`** предназначены для буферизированного чтения и записи символьных потоков. Они
  удобны для работы с текстовыми данными, так как обеспечивают эффективное чтение строк и запись текста с использованием
  буфера.

### Примеры использования буферизированных потоков для повышения производительности

- **Чтение файла с `BufferedInputStream`**:

```java
public class ReaderClass {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("input.bin"))) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
// Обработка прочитанных данных
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Здесь BufferedInputStream читает данные большими блоками, что уменьшает количество операций чтения.

- **Запись в файл с `BufferedOutputStream`**:

```java
public class WriterClass {
    public static void main(String[] args) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.bin"))) {
            byte[] data = // инициализация данных для записи;
                    bos.write(data);
// Запись выполняется эффективно, используя буфер для сбора данных перед их записью на диск.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

- **Чтение текстового файла с `BufferedReader`:**

```java
public class ReaderClass {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

`BufferedReader` позволяет читать строки целиком, что особенно удобно для текстовых данных.

- **Запись в текстовый файл с `BufferedWriter`**:

```java
public class WriterClass {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write("Пример строки для записи\n");
            // `BufferedWriter` собирает текст в буфере перед его записью, что снижает количество обращений к диску.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Использование буферизированных потоков значительно увеличивает производительность операций ввода-вывода за счет
уменьшения количества обращений к медленным устройствам хранения данных. Это делает буферизированные потоки
предпочтительным выбором для многих задач чтения и записи данных.

## Сериализация объектов в Java

### Понятие сериализации и десериализации объектов

Сериализация объектов - это процесс преобразования состояния объекта в последовательность байтов, чтобы его можно было
сохранить в файле или передать по сети. Десериализация - обратный процесс, при котором из последовательности байтов
восстанавливается исходное состояние объекта.

### Классы ObjectOutputStream и ObjectInputStream

Для сериализации и десериализации объектов в Java используются два основных класса: `ObjectOutputStream`
и `ObjectInputStream`.

- **`ObjectOutputStream`** записывает сериализованные объекты в выходной поток.
- **`ObjectInputStream`** читает и восстанавливает объекты из входного потока.

### Примеры сериализации и десериализации объектов

- **Сериализация объекта с `ObjectOutputStream`**:

```java
public class WriterClass {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.dat"))) {
            MyClass object = new MyClass();
            // Инициализация объекта MyClass
            oos.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

В этом примере объект `MyClass` сериализуется и записывается в файл `object.dat`.

- **Десериализация объекта с `ObjectInputStream`**:

```java
public class ReaderClass {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.dat"))) {
            MyClass object = (MyClass) ois.readObject();
            // Использование десериализованного объекта
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

Здесь объект `MyClass` восстанавливается из файла `object.dat`.

### Важные моменты при сериализации

- Класс объекта должен реализовать интерфейс `Serializable`. Это маркерный интерфейс, который не требует реализации
  методов,
  но указывает JVM, что объект этого класса можно сериализовать.
- Не все объекты можно сериализовать. Объекты классов, не реализующих `Serializable`, а также некоторые системные классы
  не
  подлежат сериализации.
- При сериализации объекта сериализуются все объекты, на которые он ссылается, если они также сериализуемы. Это может
  привести к сериализации целого графа объектов.
- Статические поля и поля, помеченные как `transient`, не сериализуются.
- Сериализация и десериализация - мощные механизмы для сохранения состояния объектов и их последующего восстановления,
  что
  широко используется в Java для работы с данными, передачи объектов по сети и сохранения состояний приложений.

## Работа с ZIP архивами в Java

### Классы ZipInputStream и ZipOutputStream

Java предлагает мощные средства для работы с ZIP архивами через пакет `java.util.zip`, в котором ключевыми классами
являются `ZipInputStream` для чтения из ZIP файлов и `ZipOutputStream` для создания ZIP файлов.

- **`ZipInputStream`** позволяет читать данные из ZIP файла. Он читает последовательно входящие ZIP-элементы (файлы и
  директории в архиве), позволяя извлекать данные каждого элемента.

- **`ZipOutputStream`** используется для создания ZIP файла. С его помощью можно добавлять в архив новые элементы,
  указывая для каждого имя файла (в архиве) и содержимое.

### Создание ZIP архива с использованием ZipOutputStream

Для создания ZIP архива нужно создать экземпляр `ZipOutputStream`, передав в его конструктор объект `FileOutputStream`,
указывающий на файл, который будет создан как ZIP архив. Затем, используя метод `putNextEntry`, можно добавлять в архив
новые файлы, а с помощью методов записи `write` добавлять содержимое файлов.

```java
public class Example {
    public static void main(String[] args) {
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("archive.zip"))) {
            ZipEntry entry = new ZipEntry("file1.txt");
            zos.putNextEntry(entry);
            zos.write("Content of file1".getBytes());
            zos.closeEntry();
            // Повторить для других файлов
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Распаковка ZIP архива с использованием ZipInputStream

Для распаковки ZIP архива используется `ZipInputStream`, который читает ZIP файл и позволяет последовательно извлекать
входящие в него элементы. Для каждого элемента (объекта `ZipEntry`) можно извлекать его содержимое и сохранять в
файловой
системе.

```java
public class Example {
    public static void main(String[] args) {
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream("archive.zip"))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                // Создание файла из ZipEntry
                try (FileOutputStream fos = new FileOutputStream(entry.getName())) {
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = zis.read(buffer)) > 0) {
                        fos.write(buffer, 0, length);
                    }
                    zis.closeEntry();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Применение
Работа с ZIP архивами в Java находит применение во многих областях, включая распространение программного обеспечения,
архивацию данных, обмен файлами и многие другие. Использование `ZipInputStream` и `ZipOutputStream` обеспечивает эффективную
обработку архивированных данных в Java-приложениях.

</details>