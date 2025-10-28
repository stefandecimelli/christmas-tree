# christmas-tree

Prints out a Christmas Tree based on the size.
(Please ignore that I started this project with Quarkus).

Then my preferred way to run it is in JShell:
```
$ jshell
|  Welcome to JShell -- Version 25
|  For an introduction type: /help intro

jshell> /open src/main/java/ChristmasTreePrinter.java 

jshell> ChristmasTreePrinter test = new ChristmasTreePrinter(6);
test ==> ChristmasTreePrinter@5197848c

jshell> test.print(System.out);
      *
     ***
    *****
   *******
  *********
 ***********
      |
```