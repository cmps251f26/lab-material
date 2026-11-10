# Lab01 – Answers

## Part 1

`package1/FirstClass.java` prints `Welcome to Java Language`.

## Exercise 2

Input `Ali Hassan Omar` on one line, using `FullName` (which calls `next()`):

```
Full name: Ali Hassan
```

**Can `next()` read a String that includes spaces?** No. `next()` reads one token and stops at whitespace. The first call gets `Ali`, the second gets `Hassan`, and `Omar` is never read.

With `nextLine()` (`FullNameLine`):

```
Full name: Ali Hassan Omar
```

**Conclusion:** use `next()` for a single word and `nextLine()` when the input can contain spaces.

## Exercise 5

For a = 10, b = 9.85, c = 10.5: s = 15.175, so area ≈ **44.22**.
