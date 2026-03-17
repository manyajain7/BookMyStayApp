class Customer {
    int id; String name;
    Customer(int id,String name){
        this.id=id; this.name=name;
    }
}

public class BookMyStayApp {
    public static void main(String[] args) {
        Customer c=new Customer(1,"Manya");
        System.out.println(c.id+" "+c.name);
    }
}