public class Student {
    private String nameAndSurname;
    private String pesel;
    private String phoneNumber;
    private String language;
    private boolean paid;

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public void shout() {
        System.out.println("Test test!");
    }

    @Override
    public String toString() {
        return "Student{" +
                "Imię='" + nameAndSurname + '\'' +
                ", PESEL='" + pesel + '\'' +
                ", Nr telefonu='" + phoneNumber + '\'' +
                ", Język='" + language + '\'' +
                ", Czy zapłacono='" + paid + '\'' +
                '}';
    }
}