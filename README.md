# Bank Management System - Java ATM Simulator

Welcome to the Bank Management System project, an ATM Simulator implemented in Java with a MySQL database. This system allows users to perform various banking operations such as deposit, withdrawal, pin change, balance inquiry, mini statement, and fast cash withdrawal. Additionally, the project includes a signup process for new users.

## Project Structure

All the project files, including different classes and icons, are organized in the `src` folder. The graphical user interface (GUI) is built using Java's JFrame, ensuring compatibility with both Mac and Windows operating systems.

## Getting Started

To run this project, follow the steps below:

1. Start the MySQL server.
2. Execute the provided database instructions to set up the necessary tables.

## Database Instructions

1. Create a database named `bankmanagementsystem` in MySQL:

   ```sql
   create database bankmanagementsystem;
   ```

2. Select the newly created database:

   ```sql
   use bankmanagementsystem;
   ```

3. Create the 'signup' table:

   ```sql
   create table signup(formno varchar(20), name varchar(20), father_name varchar(20), dob varchar(20), gender varchar(20),email varchar(30), marital_status varchar(20), address varchar(40), city varchar(25), pincode varchar(20), state varchar(25));
   ```

4. Create the 'signuptwo' table:

   ```sql
   create table signuptwo(formno varchar(20), religion varchar(20), category varchar(20), income varchar(20), education varchar(20), occupation varchar(20), pan varchar(20), aadhar varchar(20), seniorcitizen varchar(20), existingaccount varchar(20));
   ```

5. Create the 'signupthree' table:

   ```sql
   create table signupthree(formno varchar(20), accountType varchar(40), cardnumber varchar(25), pin varchar(10), facility varchar(100));
   ```

6. Create the 'login' table:

   ```sql
   create table login(formno varchar(20), cardnumber varchar(25), pin varchar(10));
   ```

7. Create the 'bank' table:

   ```sql
   create table bank(pin varchar(10), date varchar(50), type varchar(20), amount varchar(20));
   ```

## Usage

Run the Java program after setting up the MySQL database. Log in with the existing account or sign up for a new one to use the ATM Simulator.

**Note:** This project is designed for educational purposes and is based on the Indian banking system.

Feel free to explore and contribute to the project. Happy coding!

## Author

- **[Shivam Wadhwa](https://github.com/wadhwashivam)**

## Icons

Icons used in the project are available in the `src` folder.

## Compatibility

This project runs perfectly fine on any operating system, including Mac and Windows.
