## Lesson3

###Домашнее задание:
###1-я часть
Побитовые операции используя bitwise operators - https://en.wikipedia.org/wiki/Bitwise_operation

Заполнить таблицу истинности для операторов & (AND), | (OR), ^ (XOR) и ~ (NOT). Скопируйте таблицу из этого файла, в README.md вашей директории с ДЗ для 3го урока

| Left | Op | Right | Result |
| :---:  | :---:  | :---:  | :---:  |
| AND |  |  |  |
| 0 | & | 0 | 0 |
| 0 | & | 1 | 0 |
| 1 | & | 0 | 0 |
| 1 | & | 1 | 1 |
| OR |  |  |  |
| 0 | \| | 0 | 0 |
| 0 | \| | 1 | 1 |
| 1 | \| | 0 | 1 |
| 1 | \| | 1 | 1 |
| XOR |  |  |  |
| 0 | ^ | 0 | 0 |
| 0 | ^ | 1 | 1 |
| 1 | ^ | 0 | 1 |
| 1 | ^ | 1 | 0 |
| NOT |  |  |  |
| n/a  | ~ | 0 | 1 |
| n/a  | ~ | 1 | 0 |

###2-я часть
Напишите класс `BitwiseCalc` и реализуйте следующие методы:
```java
public String and(String binaryLeft, String binaryRight)
public String or(String binaryLeft, String binaryRight)
public String xor(String binaryLeft, String binaryRight)
public String not(String binary)
```
Напишите несколько примеров каждого метода использования в методе main.
Вы можете создать класс `BitwiseCalc`, добавить в него метод `main`, в котором можно будет получить инстанс `BitwiseCalc` используя оператор `new`.

```sh
$ javac -d out src/pack/lessons/BitwiseCalc.java  && java -cp out pack.lessons.BitwiseCalc
Bitwise AND: 1 & 0 = 0
Bitwise AND: 1101 & 1000 = 1000
Another way for static AND: 1110010101 & 110011 = 10001
Bitwise OR: 1 | 0 = 1
Bitwise OR: 1101 | 1000 = 1101
Bitwise OR: 1110010101 | 110011 = 1110110111
Bitwise XOR: 1 | 0 = 1
Bitwise XOR: 1101 | 1000 = 101
Bitwise XOR: 1110010101 | 110011 = 1110100110
Bitwise NOT: ~0 = 1
Bitwise NOT: ~1011 = 0100
```

###3-я часть
Напишите класс `FieldDefaultValuesExample` в отдельном классе, создайте в нем члены классов всех известных вам primitive типов при этом не инициализируя их. Добавьте и реализуйте метод `toString()` в котором выведите значения всех членов класса.
В методе `main` создайте инстанс этого класса и выведите его содержимое используя `System.out.println()`

```sh
$ javac -d out/ src/pack/lessons/FieldValues.java && java -cp out/ pack.lessons.FieldValues
--- Lesson3. Task 3. DefaultValues.
--Default Values of primitive variables on class members:
boolean: false
char:
byte: 0
short: 0
int: 0
long: 0
float: 0.0
double: 0.0

--Set values of primitive variables on class members:
boolean: true
char: A
byte: 10
short: 13
int: 12223
long: 12312546
float: 0.13
double: 15.1121212
```

###4-я часть
Напишите класс `ArraysCopier` с конструктором, который принимает массив целых чисел в качестве параметра. Добавьте и реализуйте следующие методы:

```java
public int[] copyOf(int newLength) // возвращает новый массив указанной длины.
public int[] copyOfRange(int from, int to) // возвращает новый массив начиная с элемента from до элемента to
public int[] fill(int value) // возвращает новый массив заполненный значением параметра value
```

В случае неверных значений параметров, возвращайте `null`.
Напишите несколько примеров каждого метода использования в методе main.

> Используйте циклы для копирования массива.

> Используйте метод `Arrays.toString(int[] a)` для вывода полученного массива в методе `main`.

> Обратите внимание на то, что данный класс является `immutable`, так как ни один из его методов не меняет внутреннего состояния объекта

```sh
javac -d out/ src/pack/lessons/ArraysCopier.java && java -cp out/ pack.lessons.ArraysCopier
--- Lesson3. Task 4. Arrays.
-- copyOf(int newLength) method:
copyOf(10) = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
copyOf(5) = [1, 2, 3, 4, 5]
copyOf(0) = null
copyOf(-3) = null
-- copyOfRange(int from, int to) method:
copyOfRange(0, 9) = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
copyOfRange(2, 7) = [3, 4, 5, 6, 7, 8]
copyOfRange(9, 9) = [10]
copyOfRange(1, 10) = null
copyOfRange(-2, 6) = null
copyOfRange(5, 2) = null
-- fill(int value) method:
fill(1) = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
fill(13) = [13, 13, 13, 13, 13, 13, 13, 13, 13, 13]

```
