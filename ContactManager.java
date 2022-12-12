import java.util.ArrayList;

public class ContactManager {

    private ArrayList<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<Contact>();
    }

    // Kişi görüntüleme işlemi
    public Contact getContact(String name) {
        if (contacts.isEmpty()) {
            System.out.println("Rehberinizde kayıtlı kişi bulunmuyor !!");
            return null;
        } else {

            for (var item : contacts) {
                if (item.getName().equals(name)) {
                    return new Contact(item);
                }
            }
            System.out.println("Rehberinizde kayıtlı bu isimde bir kişi bulunmuyor !!");
            return null;
        }
    }

    // Rehbere ekleme islemi
    public void addContact(Contact contact) {
        contacts.add(new Contact(contact));

        System.out.println("\n Yeni kişi basariyla eklendi. \n");
    }

    // Rehberi guncelleme islemi
    public void updateContact(int index, Contact contact) {
        contacts.set(index, new Contact(contact));
    }

    // Rehberden silme islemi
    public void removeContact(int index) {
        if (contacts.isEmpty()) {
            System.out.println("Rehberinizde kayıtlı kişi bulunmuyor !!");
        }

        else if (index < 1) {
            System.out.println("Lütfen 0'dan büyük bir sayı giriniz..");
        }

        else {
            contacts.remove(index - 1);
        }
    }

    // Rehberi listeleme islemi
    public void listContacts() {

        if (contacts.isEmpty()) {
            System.out.println("\n\n Rehberinizde kayıtlı kişi bulunmuyor !!");
        } else {

            for (int i = 0; i < contacts.size(); i++) {
                System.out.println("\n" + (i + 1) + ". " + contacts.get(i).getName() + ", Numara: "
                        + contacts.get(i).getNumber());
            }
        }

    }

    // Rehberi temizleme islemi
    public void cleanContactList() {

        if (contacts.isEmpty()) {
            System.out.println("\n\n****** Rehberinizde kişi bulunmuyor !!! ******");
        } else {
            contacts.clear();
            System.out.println("\n\n****** Rehberinizde temizlendi !!! ******");

        }

    }

}
