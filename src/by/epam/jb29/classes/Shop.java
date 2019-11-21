package by.epam.jb29.classes;

public class Shop {
    private Customer[] customList;


    public Shop(Customer[] customList) {
        this.customList = customList;
    }

    public Shop(){
        this.customList = null;
    }



    public Customer[] getCustomList() {
        return customList;
    }

    public void setCustomList(Customer[] customList) {
        this.customList = customList;
    }

    ////////////////////////////////////////////////////////
    public static Customer[] listAlphabet(Customer[] list){
        Customer mini;
        int min;
        int minIndex;
        Customer temp;

        for (int i = 0; i<list.length;i++){

            min = list[i].getFirstName().charAt(0);
            mini = list[i];
            minIndex = i;

            for (int j = i + 1;j<list.length;j++){
                if (min > list[j].getFirstName().charAt(0)){
                    mini = list[j];
                    minIndex = j;
                }
            }
            temp = list[i];
            list[i] =  mini;
            list[minIndex] = temp;
        }
        return list;

    }


    public static void creditCardSort(Customer[] list, int a, int b){
        for (int i = 0; i<list.length;i++){
            if (list[i].getCreditCard() > a && list[i].getCreditCard() < b){
                System.out.println(list[i].toString());
            }
        }



    }

    public static void main(String[]args){
        Customer cust1 = new Customer(1,"Ivan","Ivanov","miami beach", 777,1337);
        Customer cust2 = new Customer(2,"Natasha","Rostova","St Piter", 888,1444);
        Customer cust3 = new Customer(3,"Anton","Balkonskiy","Novgorod", 222,1812);
        Customer cust4 = new Customer(7,"Boris","Britva", "London",333,1244);
        Customer[] pokypateli = {cust1,cust2,cust3,cust4};
        listAlphabet(pokypateli);

        for (int i = 0;i<pokypateli.length;i++){
            System.out.println(pokypateli[i]);
        }

        System.out.println();


        int a = 200;
        int b = 600;
        creditCardSort(pokypateli,a,b);






        /*for (int i = 0;i<pokypateli.length;i++){
            System.out.println(pokypateli[i].toString());
        }*/

    }

}
