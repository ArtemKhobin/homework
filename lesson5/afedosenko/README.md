## Lesson5

Домашнее задание:

Спроектировать и создать три класса, которые описывают отношения между школой, одной или несколькими группам и студентами (произвольное количество).
Поля классов на ваше усмотрение. Например, у каждого студента есть имя/фамилия, у группы - название, итп.

Иерархия классов должна быть следующая:

```
jelementary
      \  \_ people
       \         \_ Student
        \_ Group
         \_ School
```

Предусмотрите методы добавления новых групп в объект типа 'школа' и новых студентов в объект(ы) типа 'группа'. Каждый студент может быть в одной или более группе, например 'Java elementary' и 'English intermidiate'.

Добавьте класс 'Main', в котором создайте метод 'main', где создайте объект типа 'школа' и произвольное количество групп (минимум две) и студентов (минимум один).

Создайте файл README.md, с примером компиляции ваших классов и запуска программы через класс Main.

> Не забывайте что java файлы кладём в папку `src`, результат компиляции в папке `out`

__STDOUT:__

```sh
$ javac -d out/ -cp src/ src/Main.java && java -cp out/ Main
Vasil Pupkin, 24 years old, rating: 1
Dadya Fedor, 21 years old, rating: 2
GROUP: Jelementary, No. 12, Students:
                -> Vasil Pupkin, 24 years old, rating: 1
GROUP: Q&A, No. 13, Students:  no students.
SCHOOL: Hillel, Address: Kanatnaya str., Groups:
         GROUP: Jelementary, No. 12, Students:
                -> Vasil Pupkin, 24 years old, rating: 1
         GROUP: Q&A, No. 13, Students:  no students.
         GROUP: English intermidiate, No. 7, Students:
                -> Vasil Pupkin, 24 years old, rating: 1
                -> Dadya Fedor, 21 years old, rating: 2
SCHOOL: IT school, Address: Paustovskogo str., Groups: no groups
```
