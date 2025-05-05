package Lessons.Lesson_47.example;

// ===================== MODEL =====================
public class Contact {
    private Long id;
    private String name;
    private String phone;

    public Contact(Long id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{id=" + id + ", name='" + name + "', phone='" + phone + "'}";
    }
}









