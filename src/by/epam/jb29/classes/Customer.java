package by.epam.jb29.classes;

/**
 * 8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
 * Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class Customer {

    private int id;
    private String firstName;
    private String secondName;
    private String address;
    private int creditCard;
    private int bankNum;

    public Customer(){

        id = 0;
        firstName = "John";
        secondName = "Smith";
        address = "Leninskay st,1";
        creditCard = 0;
        bankNum = 0;

    }
    public Customer(int id, String firstName, String secondName, String address, int creditCard, int bankNum ){

        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.creditCard = creditCard;
        this.bankNum = bankNum;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public int getBankNum() {
        return bankNum;
    }

    public void setBankNum(int bankNum) {
        this.bankNum = bankNum;
    }

    public String toString(){
        String customer = " id: " + id + ", fist name: "+ firstName + ", second name: " + secondName + ", address: " + address + ", creditCard: " + creditCard + ", bank N:" + bankNum;
        return customer;
    }
}
