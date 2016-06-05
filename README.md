# CalculateThis
Calculator. This is a work in progress. At present, I have the program as console-only but I'm trying to add a GUI.

Edits:

6/4/2016

- Added new function "getNumber" and recursive loop for user input. No more restart when user enters a non-numerical value.

5/26/2016

- Made variable names more descriptive.

- Removed the "You killed the program." line when a user enters anything other than the letter "r" when prompted to restart the program.
  Program now restarts (when prompted) with any key(s) entered.

- Used a Try/Catch on each input. If user attempts to enter a non-numerical value, they will receive an error message and program will restart.

5/24/2016 

- Added decimalFormat so that whole numbers are displayed as whole numbers, and fractions are displayed as decimals.

- By accident, this also took care of the dividing by zero exception (which already existed, but it crashed the program)
  When the user tries to divide by zero, the output is "?" and the option to restart the program appears.

- Fixed a bug by adjusting scannerObject.nextInt to scannerObject.nextDouble. User can now input decimals and whole numbers.

5/19/2016 

- Removed unnecessary libraries, added option to restart program.
