# Lab 05 – Answers

## Exercise 3: Using static methods

- **The method returns:** the number of digits in `x`.
- **Compilation error?** Yes. `n` is a `double`, but the method returns `int`, so `return n;` is a possible lossy conversion. Declare `n` as `int` instead.
- **Error when calling `digits` from `main`?** Yes: *Cannot make a static reference to the non-static method digits(int) from the type IntNumbers.* `main` is static and `digits` is an instance method, so there is no object to call it on.
- **Why does `Math.sqrt` work?** `sqrt` is declared `static` in class `Math`, so it belongs to the class and can be called without creating a `Math` object.
- **Conclusion:** static methods (like `main`) can only call other static methods (and use static variables) directly. To call an instance method they need an object.
- **Does it matter if `digits` is before or after `main`?** No. The order of methods in a class does not matter.
- **How can `n` be defined twice?** Each `n` is a local variable. Its scope is limited to the method it is declared in, so the `n` in `main` and the `n` in `digits` are two separate variables.
- **After moving `main` to `IntNumbersTest`, can we still call `digits`?** Yes, as long as it is `public static`, by qualifying it with the class name.
- **Recommended way:** `System.out.println(IntNumbers.digits(n));`
- **Eclipse warning when using `num.digits(n)`:** *The static method digits(int) from the type IntNumbers should be accessed in a static way.*
- **Three ways to call a method:**
  1. By the method name alone, from another method of the same class: `digits(n)`
  2. Through a reference to an object, for instance methods: `num.digits(n)`
  3. Through the class name, for static methods: `IntNumbers.digits(n)`

## Exercise 4: Simple GUI input/output

- **`showInputDialog` returns:** a `String`.
- **To convert a String to an integer:** `Integer.parseInt()`.
- **Static methods and constants used:** `JOptionPane.showInputDialog`, `JOptionPane.showMessageDialog`, `JOptionPane.showConfirmDialog`, `Integer.parseInt` and the constant `JOptionPane.YES_OPTION`.
- **Class or instance?** The class. No `JOptionPane` or `Integer` object was created.
- **Yes/No buttons only:** pass `JOptionPane.YES_NO_OPTION` as the fourth argument of `showConfirmDialog` (see `Ex4.java`).
