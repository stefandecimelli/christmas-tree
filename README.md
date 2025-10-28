# christmas-tree

Prints out a Christmas Tree based on the size.
(Please ignore that I started this project with Quarkus).

Compile with:
```
./gradlew classes
```

Then my preferred way to run it is in JShell:
```
$ jshell --class-path build/classes/java/main
|  Welcome to JShell -- Version 25
|  For an introduction type: /help intro

jshell> import com.decimelli.christmas.ChristmasTreePrinter;

jshell> ChristmasTreePrinter printer = new ChristmasTreePrinter(5);
printer ==> com.decimelli.christmas.ChristmasTreePrinter@5197848c

jshell> printer.print(System.out);
     *
    ***
   *****
  *******
 *********
     |****
      |
```