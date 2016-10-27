
Домашнее задание:

1-я часть

- Создайте класс для работы с "Треугольником Паскаля" высотой {n}, где n - задается через конструктор, при создании класса.
Класс должен содержать следующие методы:
```java
public void print() // печатает в консоль треугольник Паскаля
public void print(String filter) // где переменная filter может быть "EVEN" или "ODD". Печатает треугольник Паскаля, заменяет четные или нечетные числа символами на ваше усмотрение, например пробел или `..`
```


```sh
javac -d out/ -cp src/ src/MainProgramm.java  && java -cp out/ MainProgramm
--- Andrey Fedosenko. Homework. Lesson 4.
-- Part 1. Pascal`s triangle.
TrianglePascal Class. Height = 10
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
1 6 15 20 15 6 1
1 7 21 35 35 21 7 1
1 8 28 56 70 56 28 8 1
1 9 36 84 126 126 84 36 9 1
1
1 1
1 * 1
1 3 3 1
1 * * * 1
1 5 * * 5 1
1 * 15 * 15 * 1
1 7 21 35 35 21 7 1
1 * * * * * * * 1
1 9 * * * * * * 9 1
```

> Подробнее о Треугольнике Паскаля http://www.mathsisfun.com/pascals-triangle.html

- Создайте класс для работы с двумерными массивами. Назовите его `ArraysUtils` со следующими методами:
```java
public static boolean areEqual(int[][] arr1, int[][] arr2) // возвращает true если двумерные массивы одинаковы.
public static int[] linearize(int[][] arr) // "Распрямляет" двумерный массив. Например из {{1, 2}, {1, 2}} делает {1, 2, 1, 2}
public static int[][] createSpiral(int n, int m) // создает и заполняет двумерный массив размерности [n][m] по спирали
public static int[][] transpose(int[][] arr) // Если представить двумерный массив как матрицу из R столбцов и C строк, то результатом будет "матрица" [C][R]
public static void print(int[][] arr) // печатает двумерный массив в консоль
```

> Подробнее о transpose https://en.wikipedia.org/wiki/Transpose

> Заполненный по "спирали" двумерный массив выглядит так (для размерности 4 на 4)
```java
[[1, 2, 3, 4],
 [12,13,14,5],
 [11,16,15,6],
 [10,9, 8, 7]]
```

```sh
-- Part 1. ArraysUtils.
1 2 3
4 5 6

1 2 3
4 5 6
Input arrays are EQUAL
-- Part 1. ArraysUtils. Linearize.
[1, 2, 3, 4, 5, 6, 7, 8, 9]
-- Part 1. ArraysUtils. Transpose.
1 2 3
4 5 6
7 8 9

1 4 7
2 5 8
3 6 9
-- Part 1. ArraysUtils. Spiral.
1 2 3 4 5 6 7 8 9
30 31 32 33 34 35 36 37 10
29 52 53 54 55 56 57 38 11
28 51 66 67 68 69 58 39 12
27 50 65 72 71 70 59 40 13
26 49 64 63 62 61 60 41 14
25 48 47 46 45 44 43 42 15
24 23 22 21 20 19 18 17 16
```

2-я часть

- Придумайте и создайте два класса: `Book` и `Author` для "книжного магазина". Поля классов на ваше усмотрение. К примеру это может быть название и цена книги, имя и имейл автора. При создании класса `Book` учтите ситуацию, когда авторов книги может быть несколько.

- Напишите методы `equals` и `toString` для классов `Book` и `Author`.

- Создайте класс Main, в котором будет метод main(String ...args). Cоздайте несколько экземпляров книг, авторов. Напишите примеры использования методов `equals` и `toString`.


####Запуск программы с параметрами (можно добавлять книги с несколькими авторами парой параметров АВТОР(пробел)EMAIL):

```sh
$ javac -d out/ -cp src/ src/Main.java  && java -cp out/ Main "Osudy dobrého vojáka Švejka za světové války" 1921 "Jaroslav Hašek" jaroslav@writers.cz
--- Andrey Fedosenko. Homework. Lesson 4.
-- Part 2. Books and Authors.
Ilya Ilf liya@writers.su
Eugene Petrov eugene@writers.su
The authors: Ilya Ilf liya@writers.su AND Eugene Petrov eugene@writers.su are not EQUAL.
The authors: Eugene Petrov eugene@writers.su AND Eugene Petrov eugene@writers.su are EQUAL.
BOOK: "The Little Golden Calf" YEAR: 1931 AUTHORS: Ilya Ilf liya@writers.su Eugene Petrov eugene@writers.su
BOOK: "Odessa tales" YEAR: 1931 AUTHORS: Issaak Babel isaak@writers.su
BOOK: "Osudy dobreho vojaka Svejka za svetove valky" YEAR: 1921 AUTHORS: Jaroslav Hasek jaroslav@writers.cz
Book1 and Book2 are NOT EQUAL
Book2 and Book4 are EQUAL
```
