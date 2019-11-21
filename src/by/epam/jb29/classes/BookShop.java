package by.epam.jb29.classes;

public class BookShop {
    private Book[] bookList;

    public BookShop(Book[] bookList){
        this.bookList = bookList;
    }

    public BookShop(){
        this.bookList = null;
    }

    public Book[] getBookList() {
        return bookList;
    }

    public void setBookList(Book[] bookList) {
        this.bookList = bookList;
    }
//////////////////////////////////////////////////////////////////////////

    public static void authorSort(Book[] bookList,String authorName){
        for (int i = 0;i<bookList.length;i++){
            if (authorName == bookList[i].getAuthors()){
                System.out.println(bookList[i].toString());
            }
        }
    }

////////////////////////////////////////////////////////

    public static void publisherSort(Book[] bookList, String publisher){
        for (int i = 0;i<bookList.length;i++) {
            if (publisher == bookList[i].getPublisher()) {
                System.out.println(bookList[i].toString());
            }
        }
    }
////////////////////////////////////////////////////////

    public static void yearSort(Book[] bookList, int year){
        for (int i = 0;i< bookList.length;i++){
            if (year < bookList[i].getYear()){
                System.out.println(bookList[i].toString());
            }
        }
    }

    public static void main(String[]args){
        Book bk1 = new Book(0,"Devils", "Dostoevsky", "C1", 1879, 567,13.95,false);
        Book bk2 = new Book(4, "Fathers and sons", "Turgeniyv", "Buka", 1914, 512,10.44,true);
        Book bk3 = new Book(23,"Night Watch", "Lukyanenko", "BelKniga", 2010,337,13.33,false);

        Book[] bookShelf = {bk1,bk2,bk3};

        authorSort(bookShelf,"Turgeniyv");
        System.out.println();

        publisherSort(bookShelf,"BelKniga");
        System.out.println();

        yearSort(bookShelf,2009);


    }

}
