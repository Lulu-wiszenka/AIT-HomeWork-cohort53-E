public class Author {
    private String fName;
    private String lName;
    private int age;

    public Author(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public String toString() {
        return String.format("%s %s (%d)", getfName(), getlName(), getage());
    }

    public int getage() {
        return age;
    }
    public String getfName() {
        return fName;
    }
    public String getlName() {
        return lName;
    }
}