# CalculateThis
Calculator. This is a work in progress. At present, I have the program as console-only but I'm trying to add a GUI.

Edits:

5/26/2016

- Made variable names more descriptive.

- Removed the "You killed the program." line when a user enters anything other than the letter "r" when prompted to restart the program.
  Program now restarts (when prompted) with any key(s) entered.



5/24/2016 

- Added decimalFormat so that whole numbers are displayed as whole numbers, and fractions are displayed as decimals.

- By accident, this also took care of the dividing by zero exception (which already existed, but it crashed the program)
  When the user tries to divide by zero, the output is "?" and the option to restart the program appears.

- Fixed a bug by adjusting scannerObject.nextInt to scannerObject.nextDouble. User can now input decimals and whole numbers.

5/19/2016 

- Removed unnecessary libraries, added option to restart program.
