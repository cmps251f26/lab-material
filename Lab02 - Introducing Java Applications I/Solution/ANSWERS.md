# Lab02 – Answers

## Exercise 1

Output: `Hello, welcome to CMPS251`

| Change | Compiles? | Runs? | Why |
|---|---|---|---|
| Remove the first `public` (class) | Yes | Yes | The class doesn't have to be public to be launched. |
| Remove the second `public` (main) | Yes | No | The JVM needs a public `main`. |
| Remove `static` | Yes | No | The JVM calls `main` without creating an object, so it must be static. |
| Remove `void` | No | – | Every method needs a return type. |
| `int` + `return 0;` | Yes | No | `main` must return `void`. |
| `Main` instead of `main` | Yes | No | Java is case-sensitive, so the JVM can't find `main`. |
| `int args[]` | Yes | No | `main` must take a `String[]`. |
| `myArgs` instead of `args` | Yes | Yes | The parameter name can be anything. |
| `[]args` (`String []args`) | Yes | Yes | `String args[]`, `String[] args` and `String []args` are the same declaration. |

These results are for JDK 17 and 21. JDK 25 relaxes the rules for `main`, so some of the "No" rows will run there.

**Conclusion:** the entry point must be declared exactly as `public static void main(String[] args)`. Only the parameter name and the position of the brackets can change. The program can still compile when the header is wrong, but the JVM won't run it.

Name printed 6 times: see `exercise1/NameWhile.java` and `exercise1/NameDoWhile.java`.

## Exercise 2.1

```
Enter mark (an integer):
Pass        <- input 65: 65 / 20 = 3, and 3 >= 3
```
```
Enter mark (an integer):
Fail        <- input 59: 59 / 20 = 2 (integer division), and 2 < 3
```

## Exercise 3

- `"\t"` prints a tab character, which lines the two columns up.
- No. `print`/`println` print the full `double` (e.g. `-17.77777777777778`). They have no way to set the number of decimal places.
- Not with `print`/`println`. They have no field width. `printf("%10d", fahr)` right-justifies the value in 10 characters.

## Exercise 4

`i` goes 0, 1, 2, 3, 4 and `counter` goes 10, 11, 13, 16, 20. The program prints `Counter = 20`.
