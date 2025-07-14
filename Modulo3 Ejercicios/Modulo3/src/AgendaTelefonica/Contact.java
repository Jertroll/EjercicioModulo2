package AgendaTelefonica;

public class Contact {
    private String name;
    private int number;

    public Contact(){

    }

    public Contact(String name, int number){
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    @Override
    public String toString(){
        return "The name of the contact is " + name + " and the number phone is " + number + "\n";
    };


}
