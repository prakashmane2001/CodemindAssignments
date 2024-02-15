class employee {
    String name;
    int idnum;
    int phone;
    String email;
    String department;

  static void displayEmployeeDetails(employee emp) {
        System.out.println("Name: " + emp.name);
        System.out.println("ID: " + emp.idnum);
        System.out.println("Phone: " + emp.phone);
        System.out.println("Email: " + emp.email);
        System.out.println("Department: " + emp.department);
        System.out.println();
   }

     public static void main(String args[]) {
        employee[] details = new employee[3];

        details[0] = createEmployee("Prakash", 25, 478855, "pakamane2001@gmail.com", "CSE");
        details[1] = createEmployee("John", 26, 856655, "john@example.com", "IT");
        details[2] = createEmployee("Alice", 27, 445566, "alice@example.com", "HR");

        for (int i = 0; i < details.length; i++) {
            displayEmployeeDetails(details[i]);
     }
    }
    static employee createEmployee(String name, int idnum, int phone, String email, String department) {
        employee emp = new employee();
        emp.name = name;
        emp.idnum = idnum;
        emp.phone = phone;
        emp.email = email;
        emp.department = department;
        return emp;
    }
}