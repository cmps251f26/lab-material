# Lab 09 – Answers

Exercises 3 and 4 reuse the `Person` class from `exercise1.model`.

## Exercise 1

**Super class / subclass:** `Person` is the super class and `Employee` is the subclass.

**Error after adding `Employee(int noOfChildren)`:** Once a class declares any constructor, the compiler stops generating the default no-argument one. `new Employee()` in the test class no longer compiles, so we add `Employee()` back explicitly.

**Error after adding `Person(int id, String name)`:** Every subclass constructor implicitly calls `super()` first. `Person` no longer has a no-argument constructor, so the `Employee` constructors fail. Adding `Person()` fixes it.

**Can the 3-parameter `Employee` constructor access `id` and `name` directly?** No, they are `private` in `Person`. Either use `setId`/`setName`, or call the super class constructor: `super(id, name);`

**Can the `super(...)` call be the last statement?** No. `super(...)` (like `this(...)`) must be the first statement in the constructor.

**Output of `new Employee(124, "Ameen", 1)`:**
```
Person constructor is called now
Employee constructor is called now
```
The super class constructor always runs before the subclass constructor body. Objects are built from the top of the hierarchy down.

**After making `id` and `name` `protected`:**
- Accessible directly in `Employee`? Yes.
- Accessible from `main` through `emp2.id` / `emp2.name`? Yes, while `AppTest` is in the same package as `Person`.

**Why does `AppTest` see protected members?** `protected` means accessible to subclasses *and* to every class in the same package. `AppTest` is in the `model` package, so it has package access.

**Moving `AppTest` to the `test` package:** It is now in a different package and is not a subclass, so `emp2.id` / `emp2.name` no longer compile. It also needs `import model.Employee;` (or `import model.*;`). Fix it by importing the class and using the getters instead of the fields.

**Same name and signature in super class and subclass:** method overriding.

**Calling the super class `toString` from the subclass:** `super.toString()`

**Making `Employee.toString()` `protected`:** Compile error. An overriding method cannot reduce the visibility of the method it overrides (`Person.toString()` is `public`, inherited from `Object`). It can keep the same access level or widen it, never narrow it.

**Final state:** `toString()` is public again, `id` and `name` are private again (`Employee` uses `super(...)` and `super.toString()`), and the constructor print statements are removed.
