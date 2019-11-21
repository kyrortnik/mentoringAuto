package by.epam.jb29.classes;

/**
 * 9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
 * Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */
public class Book {

    private int id;
    private String name;
    private String authors;
    private String publisher;
    private int year;
    private int pages;
    private double cost;
    private boolean binding; // true = hard binding, false = soft binding


    public Book(){

        id = 0;
        name = "Crime amf punishment";
        authors = "Dostoevsky";
        publisher = "Atilla";
        year = 2019;
        pages = 777;
        cost = 3.99;
        binding = true;

    }

    public Book(int id, String name, String authors, String publisher, int year, int pages, double cost, boolean binding){
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.cost = cost;
        this.binding = binding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isBinding() {
        return binding;
    }

    public void setBinding(boolean binding) {
        this.binding = binding;
    }

    public String toString(){
        String book = "id: " + id + ", name: " + name + ", author/s: " + authors + ", publisher: " + publisher + ", year: " + year + ", pages: " + pages + ", cost: " + cost + ",binding: " + binding;
        return book;
    }
}
