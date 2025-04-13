package Lessons.Lesson_40.src.practice;

import java.util.List;

public interface MyLinkedList {

    // добавляет элемент в конец списка
    // a->b->c->d->e  add(f) -> a->b->c->d->e->f
    boolean add(String data);

    // добавляет элемент по индексу
    // a->b->c->d->e  add(2, f) -> a->b->f->c->d->e
    boolean add(int index, String data) throws IndexOutOfBoundsException;

    // вставляет (заменяет существующий) элемент по индексу
    // a->b->c->d->e  set(2, f) -> a->b->f->d->e
    boolean set(int index, String data) throws IndexOutOfBoundsException;

    // добавляет элемент в начало списка
    // a->b->c->d->e  addFirst(f) -> f->a->b->c->d->e
    boolean addFirst(String data);

    // добавляет элемент в конец списка
    // a->b->c->d->e  addLast(f) -> a->b->c->d->e->f
    boolean addLast(String data);

    // добавляет все элементы листа в конец списка
    // a->b->c->d->e    addAll(<f, g, h>)  a->b->c->d->e->f->g->h
    boolean addAll(List<String> list);

    // проверяет наличие данного элемента в списке
    // a->b->c->d->e    contains(g) -  false; contains(b) - true;
    boolean contains(String data);

    // возвращает данные ноды по конкретному индексу
    // a->b->c->d->e get(3) -d; get(8) - exception
    String get(int index) throws IndexOutOfBoundsException;

    // возвращает данные первой ноды
    // a->b->c->d->e getFirst() ->  a;
    String getFirst();

    // возвращает данные последней ноды
    // a->b->c->d->e getLast() -> e
    String getLast();

    // возвращает количество элементов
    // a->b->c->d->e size() -> 5;
    int size();

    // возвращает индекс первого вхождения данных, либо -1, если такого нет
    // a->b->c->d->e indexOf(c) -> 2
    int indexOf(String data);

    // возвращает индекс первого вхождения данных, либо -1, если такого нет
    // a->b->c->d->e->a firstIndexOf(a) -> 0   firstIndexOf(g) - -1
    int firstIndexOf(String data);

    // возвращает индекс последнего вхождения данных, либо -1, если такого нет
    // a->b->c->d->e->a lastIndexOf(a) -> 5   lastIndexOf(g) - -1
    int lastIndexOf(String data);
}
