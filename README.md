# ATM-Function
here is my project, in which I'll created a ATM machine that perform all function which is used in real ATM by using Core Java.

An ATM (Automated Teller Machine) simulation project using Core Java is a console-based application that mimics the basic functionalities of an ATM system. This project allows users to perform operations like checking account balance, withdrawing money, depositing money, and viewing transaction history. It is a great way to understand Core Java concepts such as object-oriented programming, exception handling, and basic I/O operations.

1. Project Overview
The ATM Machine project simulates an ATM's core functionalities without any graphical user interface or database integration. Instead, it uses simple Java concepts and data structures (like arrays or lists) to manage user accounts and transactions. The goal is to demonstrate how an ATM system can be implemented using basic programming techniques.

2. Key Features of the System
The basic functionalities included in this ATM Machine simulation are:

User Authentication: The system prompts the user to enter an account number and a PIN to access the account.
Check Account Balance: Displays the current balance of the user's account.
Deposit Money: Allows the user to deposit money into the account, updating the account balance accordingly.
Withdraw Money: Allows the user to withdraw money from the account, if there are sufficient funds.
View Transaction History: Displays the history of recent transactions (e.g., deposits, withdrawals).
Exit: Allows the user to exit the application.
3. System Design
To design this ATM Machine simulation, the project can be divided into the following components:

Account Class: Represents an individual user account with attributes such as account number, PIN, balance, and a list of transactions.
ATM Operations: Contains methods for the different functionalities like checking balance, depositing, withdrawing, and displaying transaction history.
Main ATM Application: The main class that runs the application and provides a menu-based interface for the user.
