# CMPS251 Object-Oriented Programming – Lab Material (Fall 2026)

| Lab | Topic |
|---|---|
| [Lab01](Lab01%20-%20Getting%20Started%20with%20Java%20Using%20Eclipse) | Getting Started with Java Using Eclipse |
| [Lab02](Lab02%20-%20Introducing%20Java%20Applications%20I) | Introducing Java Applications I |
| [Lab03](Lab03%20-%20Introducing%20Java%20Applications%20II) | Introducing Java Applications II |
| [Lab04](Lab04%20-%20Introduction%20to%20Classes%20%26%20Objects) | Introduction to Classes & Objects |
| [Lab05](Lab05%20-%20Classes%20and%20Objects%20-%20A%20Deeper%20Look%20I) | Classes and Objects – A Deeper Look I |
| [Lab06](Lab06%20-%20Version%20Control) | Version Control |
| [Lab07](Lab07%20-%20Arrays%2C%20Lists%20and%20Exception%20Handling) | Arrays, Lists and Exception Handling |
| [Lab08](Lab08%20-%20Composition) | Composition |
| [Lab09](Lab09%20-%20Inheritance) | Inheritance |
| [Lab10](Lab10%20-%20Polymorphism%2C%20Interfaces%20and%20Abstraction) | Polymorphism, Interfaces and Abstraction |
| [Lab11](Lab11%20-%20Files%2C%20Streams%2C%20and%20Object%20Serialization) | Files, Streams, and Object Serialization |
| [Lab12](Lab12%20-%20Graphical%20User%20Interface%20using%20JavaFX) | Graphical User Interface using JavaFX (Parts 1 & 2) |

Each lab folder contains the lab sheet (PDF) and a `Solution` folder. Each exercise is in its own package (`exercise1`, `exercise2`, …). Written answers, where the lab has them, are in `Solution/ANSWERS.md`.

## Opening a solution in Eclipse

1. Clone or download this repository.
2. In Eclipse: **File → Import → General → Existing Projects into Workspace**.
3. Choose the repository folder as the root directory. Eclipse lists every `LabXX-Solution` project, and you can import one or all of them.
4. Right-click a class with a `main` method → **Run As → Java Application**.

The projects target Java 17, so any JDK 17 or newer works.

**Lab12 (JavaFX):** the project uses the Eclipse user library named **JavaFX**, the one you set up in the lab (Build Path → Add Library → User Library). If Eclipse shows a missing-library error after import, create a user library with that exact name pointing to the `lib` folder of your JavaFX SDK. If running fails with `Module javafx.controls not found`, set the JavaFX SDK path in Window → Preferences → JavaFX, as described in the lab sheet.

Try each exercise yourself before you look at the solution.
