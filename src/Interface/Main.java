package Interface;

public class Main {
    public static void main(String[] args) {
        ITelephone usersPhone = new DeskPhone(123456);
        usersPhone.powerOn();
        usersPhone.callPhone(123456);
        usersPhone.answer();
        usersPhone.dial(999999);

        System.out.println("-".repeat(30));

        usersPhone = new MobilePhone(111111);
        usersPhone.dial(999999);
        usersPhone.powerOn();
        usersPhone.callPhone(111111);
        usersPhone.answer();
        usersPhone.dial(123456);

        System.out.println("-".repeat(30));

    }
}