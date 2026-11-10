# Lab11 – Answers

All programs read and write files relative to the project folder. In Eclipse that is `Lab11-Solution/`, so press F5 (Refresh) on the project to see new files. The input files for Exercises 4 and 7 are in `data/`.

## Exercise 1

- **Replace or append?** Running the program a second time **replaces** the old content. `new Formatter(file)` creates the file again, empty, each time it is opened.
- **Adding without replacing:** open the file in append mode, e.g. `new Formatter(new FileWriter("MyOutFile.txt", true))`. That is what Exercise 2 does.

## Exercise 2

- **Replace or append?** The new text is **added at the end** of the file.
- **What does `true` do?** It opens the file in append mode, so writing starts after the existing content.
- **Without it:** `new FileWriter("MyOutFile.txt")` (or `false`) truncates the file, and the old content is lost.

## Exercise 3

- **First run (Person does not implement `Serializable`):** the names are **not** printed, and nothing useful is saved. `writeObject(p1)` throws `java.io.NotSerializableException: Person`, which is caught as an `IOException`.
  - The lab's original handler printed `exception.getStackTrace()`. That only shows an array reference like `[Ljava.lang.StackTraceElement;@1b6d3586`, which hides the real cause. The solution prints the exception itself.
- **Second run (`Person implements Serializable`):** the program prints `Ahmed` and `Hind`, then `Reached end of file.`
- **Conclusion:** only objects whose class implements `Serializable` (a marker interface with no methods) can be written with `ObjectOutputStream`.
  - `readObject()` never returns `null` at the end of the file. It throws `EOFException`, and that is the normal way to stop the read loop.
