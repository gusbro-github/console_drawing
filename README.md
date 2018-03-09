# console_drawing
Simple console drawing

To run de program:

java -cp <JARFILE> com.gusbro.drawing.Drawing

The program does various checks to the input.

After every command entered the canvas will be shown on screen.

Commands are not case-sensitive (for example: c 10 5 and C 10 5 are both accepted).

The number of arguments for each command is checked and an error message is shown if less or more argument than needed are provided.

For the line command, an error is shown when the parameters are not for a straight line.

An error will also be shown if any point given is outside the boundaries of the canvas.

When a comand is not recognized a message will be shown indicating it.
