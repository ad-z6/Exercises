\# MiniShell Java Project

\## Project Description

This project involves building a basic command-line shell using Java. The shell will allow users to interact with the file system by executing simple commands such as changing directories, listing contents, and creating files or folders.

\## Provided Files

You will begin with two base Java files:

\- `MiniShell.java` – Contains the main loop to read user input and delegate commands.

\- `ShellCommandHandler.java` – Contains all the method definitions for the supported commands.

\## What You Need to Do

You must implement the functionality of both files so the shell works as expected. The shell should support these commands:

\- `pwd` – Display the current directory

\- `ls` – Show contents of the current folder

\- `cd [folder]` – Navigate to a different folder (`..` to go up)

\- `mkdir [folder]` – Create a new folder

\- `touch [filename]` – Create an empty file

\- `help` – Show list of available commands

\- `exit` – Close the shell

\## Implementation Guidelines

\### MiniShell.java

\- Set up a loop to receive user input via the console.

\- Parse each command and send it to the corresponding method in `ShellCommandHandler`.

\- For unknown commands, show:  

`  ``"Unknown command. Type 'help' to see available commands."`

\### ShellCommandHandler.java

\- Initialize the working directory using `System.getProperty("user.dir")`.

\- Complete each method according to the provided TODO comments.

\- Be sure to print messages exactly as described to ensure compatibility with automated testing.

\## Output Format Rules

\- Folder listings: `[DIR] folder\_name`  

\- File listings: `[FILE] file\_name`  

\- When creating directories:  

`  `- Success: `Directory created: folder\_name`  

`  `- Already exists: `Directory already exists.`  

\- When creating files:  

`  `- Success: `File created: file\_name`  

`  `- Already exists: `File already exists.`  

\- Any error messages must follow the expected wording for correct results.

\## Notes for Testing

Your solution will be tested for;

\- Correct behavior of all commands

\- Matching the required output format exactly

\- Proper handling of errors and edge cases

\## Helpful Suggestions

\- Read each comment inside the code — it includes hints.

\- Watch out for typos in output, especially for automated testing.

\- Try all commands in various situations (existing folders, missing files, etc.)

\- Use methods in the `File` class to interact with the system.

\## Submission Instructions

Complete the implementation and follow your instructor's submission process.

Make sure all your code is well-formatted and tested before submission.
