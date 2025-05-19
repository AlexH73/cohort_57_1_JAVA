package Lessons.Lesson_47.practice.repositories;


import Lessons.Lesson_47.practice.interfaces.AuthorRepository;
import Lessons.Lesson_47.practice.models.Author;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthorRepositoryImpl implements AuthorRepository {
    private String repoFilePath;

    public AuthorRepositoryImpl(String repoPath) throws IOException {
        this.repoFilePath = repoPath;
        initializeFileAndDirectory();
    }

    private void initializeFileAndDirectory() throws IOException {
        File file = new File(repoFilePath);
        File parentDir = file.getParentFile();

        if (parentDir != null && !parentDir.exists()) {
            if (!parentDir.mkdirs()) {
                throw new IOException("Не удалось создать директорию: " + parentDir);
            }
        }

        if (!file.exists()) {
            if (!file.createNewFile()) {
                throw new IOException("Не удалось создать файл: " + repoFilePath);
            }
        }
    }

    @Override
    public void addAuthor(Author author) {
        // serialize
        // write

        try (FileWriter fw = new FileWriter(this.repoFilePath, true)) {
            fw.write(author.serialize());
        } catch (IOException e) {
            System.err.println("Не удалось сохранить автора: " + author + " [" + e + "]");
        }
    }

    @Override
    public List<Author> findAllAuthors() {
        List<Author> authors = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileReader(this.repoFilePath))) {
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                if (str.isBlank()) {
                    continue;
                }
                authors.add(Author.deserialize(str));
            }
        } catch (IOException e) {
            System.err.println("Не удалось прочитать авторов [" + e + "]");
        }

        // read
        // deserialize
        return authors;
    }
}

