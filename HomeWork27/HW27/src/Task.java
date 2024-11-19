public class Task {
    int number;
    String title;
    String description;

    public Task (int number, String title, String description){
        this.number = number;
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("%d) %s: %s", getNumber(), getTitle(), getDescription());
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public int getNumber() {
        return number;
    }
}