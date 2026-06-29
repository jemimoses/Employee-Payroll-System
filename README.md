# Employee Payroll System

A Java-based desktop application for managing employee records, calculating salaries, tracking attendance, and generating payslips, backed by a MySQL database.

## Features

- **Employee Management** – Add, update, view, and delete employee records
- **Salary Calculation** – Automated computation of salary based on attendance, deductions, and allowances
- **Attendance Tracking** – Record and monitor daily employee attendance
- **Payslip Generation** – Generate detailed payslips for employees
- **Persistent Storage** – All data stored and managed using MySQL

## Tech Stack

- **Language:** Java
- **Database:** MySQL
- **Connectivity:** JDBC

## Prerequisites

Before running this project, make sure you have:

- JDK 8 or above installed
- MySQL Server installed and running
- A JDBC driver (MySQL Connector/J) added to your project

## Setup & Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/jemimoses/Employee-Payroll-System.git
   cd Employee-Payroll-System
   ```

2. **Set up the database**
   - Open MySQL and create a new database:
     ```sql
     CREATE DATABASE payroll_system;
     ```
   - Import the provided SQL schema (if available) or create the required tables for employees, attendance, and payroll.

3. **Configure database connection**
   - Update the database URL, username, and password in the project's connection class/config file to match your local MySQL setup.

4. **Compile and run**
   ```bash
   javac *.java
   java Main
   ```
   *(Adjust file/class names based on your actual entry point.)*

## Project Structure

```
Employee-Payroll-System/
├── src/                # Java source files
├── README.md
└── ...
```

## Future Enhancements

- Add role-based login (Admin/Employee)
- Export payslips as PDF
- Add a graphical dashboard for payroll analytics

## Author

**Jemi Moses**
GitHub: [@jemimoses](https://github.com/jemimoses)
