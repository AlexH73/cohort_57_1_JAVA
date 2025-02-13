package Lessons.Lesson_24.teachers_code;

public class PhoneGen1 {
    private String phoneNumber;

    public PhoneGen1(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void call(String phoneNumber) {
        System.out.println("Calling to phone number " + phoneNumber);
    }
}
