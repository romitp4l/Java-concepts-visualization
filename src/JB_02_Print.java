public class JB_02_Print {

   public static void main(String[] args) {
      System.out.print("this is simple print statement");
      System.out.println("this prints in new line ");
      System.out.print("this prints in the same line ");
      System.out.println("-----------------");
      System.out.printf("this prints the string in format basis like c language : " + "Name: %s , Age : %d ", "Romit" , 21);

   }






}

//
//In Java, `printf`, `print`, and `println` are all methods used to display output to the console. They are part of the `PrintStream` class, which is a subclass of `OutputStream` and provides various methods to write data to the standard output stream.
//
//Here's a brief explanation of each:
//
//        1. **printf**: This method is used to format output according to a format string, similar to the C language's `printf` function. It allows you to specify placeholders in the format string, which are then replaced by the corresponding values passed as arguments. The format string may contain format specifiers such as `%s` for strings, `%d` for integers, `%f` for floating-point numbers, etc.
//
//        ```java
//   System.out.printf("Name: %s, Age: %d", "John", 30);
//   ```
//
//           2. **print**: This method is used to print the given data to the console without appending a newline character at the end. It simply outputs the provided data as is.
//
//        ```java
//   System.out.print("Hello, ");
//   System.out.print("world!");
//   ```
//
//Output:
//        ```
//Hello, world!
//        ```
//
//        3. **println**: This method is similar to `print`, but it appends a newline character (`\n`) at the end of the output. It's commonly used to print a line of text and move the cursor to the next line.
//
//        ```java
//   System.out.println("Hello, world!");
//   ```
//
//Output:
//        ```
//Hello, world!
//        ```
//
//Here's a comparison of their usage:
//
//        - Use `printf` when you need to format the output according to specific patterns.
//- Use `print` when you want to output text without moving to the next line.
//        - Use `println` when you want to output text and move to the next line afterward.
//
//All three methods are part of the standard Java API and are commonly used for various output tasks in Java programming.
