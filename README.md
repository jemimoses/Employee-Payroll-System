# Employee Payroll System

Java + MySQL/JDBC payroll system demonstrating OOP (abstraction, inheritance, polymorphism).

## Structure
```
src/
  Employee.java           # abstract base class
  FullTimeEmployee.java   # fixed monthly salary
  PartTimeEmployee.java   # hourly wage
  DBConnection.java       # JDBC connection config
  PayrollSystem.java      # add/remove/display + DB save/read
  Main.java               # entry point / demo
schema.sql                 # MySQL table setup
```

## Setup

1. **Create the database**
   ```bash
   mysql -u root -p < schema.sql
   ```

2. **Download MySQL Connector/J** (JDBC driver) and place the `.jar` in this folder.
   https://dev.mysql.com/downloads/connector/j/

3. **Update DB credentials** in `src/DBConnection.java` (URL, USER, PASSWORD) to match your local MySQL.

4. **Compile**
   ```bash
   cd src
   javac -cp .;../mysql-connector-j-8.x.x.jar *.java   # Windows
   javac -cp .:../mysql-connector-j-8.x.x.jar *.java   # Mac/Linux
   ```

5. **Run**
   ```bash
   java -cp .;../mysql-connector-j-8.x.x.jar Main       # Windows
   java -cp .:../mysql-connector-j-8.x.x.jar Main       # Mac/Linux
   ```

## Expected output
Prints in-memory employee list, saves both employees to MySQL, then reads them back from the DB.
