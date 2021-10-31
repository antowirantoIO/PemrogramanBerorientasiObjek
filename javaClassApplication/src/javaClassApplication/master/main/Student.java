package javaClassApplication.master.main;

class Student {
    //Data Members
    private String name;
    private String email;

    public Student( ) {
        name = "Unassigned";
        email = "Unassigned";
    }

    public String getEmail( ) {
        return email;
    }

    public String getName( ) {
        return name;
    }

    public void setEmail(String address) {
        email = address;
    }

    public void setName(String studentName) {
        name = studentName;
    }
}
