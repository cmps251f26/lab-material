# Lab04 – Answers

## Exercise 1 (package `exercise1`)

**Do we need an import for `Account`?** No. `Account` and `AccountTest` are in the same package, and classes in the same package can see each other without an import.

**Is `this` necessary in `setName`?** Yes. The parameter is also called `name`, so it hides the field. `this.name` means the field and `name` means the parameter. Without `this`, the statement `name = name;` assigns the parameter to itself. If the parameter had a different name, `this` would be optional.

**Default values of instance variables:**

| Type | Default |
|---|---|
| `int` | `0` |
| `double` / `float` | `0.0` |
| `boolean` | `false` |
| Object (any reference) | `null` |

Before a constructor is added, `AccountTest` prints `null` for the name.

After a constructor `Account(String name)` is added, `new Account()` no longer compiles. The test has to pass a name.

**True or false:**
1. If a class defines no constructors, the compiler provides a no-argument default constructor. **True**
2. A class that declares a constructor has no default constructor. **True**
3. A class can have only one constructor. **False**: constructors can be overloaded.

## Exercise 2 (package `exercise2`): errors fixed

| Line | Problem | Fix |
|---|---|---|
| `public void Person(...)` | Has a return type, so it is a method, not a constructor | `public Person(...)` |
| `if (years < 0) age = years;` | Logic error: only negative ages were kept | `if (years > 0)` |
| `getFirstName(String FirstName)` | A getter takes no parameter | `getFirstName()` |
| `public setFirstName(...)` | Missing return type | `public void setFirstName(...)` |
| `return;` in `getLastName` | Must return a String | `return lastName;` |
| `return years;` in `getAge` | `years` doesn't exist in this method | `return age;` |
| `Person person = Person(...)` | Missing `new` | `new Person(...)` |
| `getFirstName(), getLastName(), getAge()` | Called with no object | `person.getFirstName()` etc. |
| `person.setAge = ...` | `setAge` is a method, not a field | `person.setAge(person.getAge() + 1);` |

## Exercise 3 (package `exercise3`)

Two constructors with the same name and different parameter lists is **constructor overloading**, a form of **method overloading**.

BMI = weight (kg) / height² (m²). `getBMI()` returns 0.0 when weight or height is not positive.
