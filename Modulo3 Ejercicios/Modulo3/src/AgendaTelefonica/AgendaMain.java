package AgendaTelefonica;

public class AgendaMain {
    public static void main(String[] args){
    Contact contacto1 = new Contact("Jeremy", 88888888);
    Contact contacto2 = new Contact("Noe", 881188118);
    Contact contacto3 = new Contact("Kevin", 12345678);

    Agenda agendaPrincipal = new Agenda();

    agendaPrincipal.contactRegister(contacto1);
    agendaPrincipal.contactRegister(contacto2);
    agendaPrincipal.contactRegister(contacto3);

    agendaPrincipal.contactList();


    }
}
