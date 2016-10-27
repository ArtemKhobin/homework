Татьяна@ASUS-S551 MINGW64 /d/HillelCourse/homework/lesson4/tpomaz (master)  
$ javac -d out -cp src src/Main.java && java -cp out Main  
Part 1.  
Pascal's triangle.  
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
Replacing the even numbers of triangle on the character '..'.  
1  
1 1  
1 .. 1  
1 3 3 1  
1 .. .. .. 1  
1 5 .. .. 5 1  
1 .. 15 .. 15 .. 1  
1 7 21 35 35 21 7 1  
1 .. .. .. .. .. .. .. 1  
1 9 .. .. .. .. .. .. 9 1  
Replacing the odd numbers of triangle on the character '..'.  
..  
.. ..  
.. 2 ..  
.. .. .. ..  
.. 4 6 4 ..  
.. .. 10 10 .. ..  
.. 6 .. 20 .. 6 ..  
.. .. .. .. .. .. .. ..  
.. 8 28 56 70 56 28 8 ..  
.. .. 36 84 126 126 84 36 .. ..  
  
Two-dimensional arrays.  
Arrays are equal.  
  
[2, 8, 1, 5, 5, 8, 1, 2, 6, 1, 5]  
  
1 2 3 4 5  
18 19 20 21 6  
17 28 29 22 7  
16 27 30 23 8  
15 26 25 24 9  
14 13 12 11 10  
  
1 2  
3 4  
5 6  
  
1 3 5  
2 4 6  
  
Part 2.  
-lasses "Book" and "Author".  
The author's name Kathy Sierra. E-mail : ksierra@gmail.com  
The author's name Bert Bates. E-mail : bbates@gmail.com  
objects aren't equal.  
Head First Java, Kathy Sierra, Bert Bates, O'REILY, 2nd Edition, 2013  
The author's name Bruce Eckel. E-mail : beckel@gmail.com  
Thinking in Java, Bruce Eckel, President, MindView, Inc., 4th edition, 2014  
objects aren't equal.  
objects are equal.  
