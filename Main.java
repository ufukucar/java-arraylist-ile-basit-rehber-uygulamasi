import java.util.Scanner;

class Main {

    static ContactManager contactManager = new ContactManager();

    public static void main(String[] args) {

        System.out.println("\n ----- JAVA ILE TELOFON REHBERI UYGULAMASI ----- \n");

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println(
                    "\n Kişi eklemek için e,\n Kişi silmek için s,\n Rehberi görmek için l,\n Rehberi temizlemek için t,\n Çıkış için q tuşuna basınız..");

            String input = scanner.nextLine();

            if (input.equals("q")) {
                System.out.println("\nSistemden çıkılıyor...");
                System.exit(0);
                break;
            }

            ManageContacts(input);

        }

        scanner.close();

    }

    public static void ManageContacts(String input) {

        Scanner scanner = new Scanner(System.in);

        if (input.equals("e")) {
            System.out.println("\n Lütfen kişi adı giriniz: ");
            String name = scanner.nextLine();

            System.out.println("\n Lütfen kişinin numarasını giriniz: ");
            String number = scanner.nextLine();

            contactManager.addContact(new Contact(name, number));
        }

        else if (input.equals("s")) {
            System.out.println("\n Lütfen silmek istediğiniz kişinin sırasını yazınız: ");
            int index = scanner.nextInt();
            scanner.nextLine();
            contactManager.removeContact(index);

        } else if (input.equals("l")) {
            contactManager.listContacts();
        }

        else if (input.equals("t")) {
            contactManager.cleanContactList();
        }

    }
}