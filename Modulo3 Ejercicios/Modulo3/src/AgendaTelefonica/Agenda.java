package AgendaTelefonica;

public class Agenda {
    private Contact[] contact = new Contact[10];

    public void contactRegister(Contact Newcontact){
        boolean register = false;
        for(int i = 0; i < this.contact.length; i++){
            if (this.contact[i] == null) {
                this.contact[i] = Newcontact;
                register = true;
                System.out.println("The contact registered successfully");
                break;
            }
        }
        if(!register){
            System.out.println("The contact book is full");
        }
    }

    public boolean listVerify(){
        boolean thereContact = false;

        for (int i = 0; i < this.contact.length; i++){
            if(this.contact[i] != null){
                thereContact = true;
                break;
            }
        }

        if (!thereContact){
            System.out.println("No hay contactos registrados");
        }

        return thereContact;
    };

    public void contactList(){
        if (!listVerify()){
            return;
        } else {
            System.out.println("Book of contacts \n");
            for (int i = 0; i < this.contact.length; i++){
                if (this.contact[i] != null){
                    System.out.println(contact[i].toString());
                }
            }
        }


    }


}
