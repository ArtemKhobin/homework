Part 1

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


Part 2  

Work@programist MINGW32 /d/Prog/HillelCourse/homework/lesson3/tpomaz (master)  
$ javac src/BitwiseCalc.java -d out && java -cp out BitwiseCalc  
BITWISE AND :  
0 & 0 = 0  
0 & 1 = 0  
1 & 0 = 0  
1 & 1 = 1  
1101 & 1001 = 1001  
10101 & 01101 = 101  
11010110 & 10110101 = 10010100  

BITWISE OR :  
0 | 0 = 0  
0 | 1 = 1  
1 | 0 = 1  
1 | 1 = 1  
1101 | 1001 = 1101  
10101 | 01101 = 11101  
11010110 | 10110101 = 11110111  

BITWISE XOR :  
0 ^ 0 = 0  
0 ^ 1 = 1  
1 ^ 0 = 1  
1 ^ 1 = 0  
1101 ^ 1001 = 100  
10101 ^ 01101 = 11000  
11010110 ^ 10110101 = 1100011  

BITWISE NOT :  
~ 0 = 1  
~ 1 = 0  
~ 1101 = 0010  
~ 10101 = 01010  
~ 11010110 = 00101001  


Part 3  

Work@programist MINGW32 /d/Prog/HillelCourse/homework/lesson3/tpomaz (master)  
$ javac src/FieldDefaultValues.java -d out && java -cp out FieldDefaultValues  
Default values of primitive :  
byte = 0  
short = 0  
int = 0  
long = 0  
char =  
float = 0.0  
double = 0.0  
boolean = false  


Part 4  

Work@programist MINGW32 /d/Prog/HillelCourse/homework/lesson3/tpomaz (master)  
$ javac src/ArraysCopier.java -d out && java -cp out ArraysCopier  
copyOf(int newLength) {}  
[5, 3, 10, 1, 2, 8, 7, 0, 0, 0]  
[5, 3, 10, 1, 2, 8, 7]  
[5, 3, 10, 1]  
[]  
null  

copyOfRange(int from, int to) {}  
[10, 1, 2]  
[1, 2, 8, 7]  
[5, 3, 10]  
null  

fill(int value) {}  
[15, 15, 15, 15, 15, 15, 15]  
[-4, -4, -4, -4, -4, -4, -4]  
[2, 2, 2, 2, 2, 2, 2]  
[6, 6, 6, 6, 6, 6, 6]  



