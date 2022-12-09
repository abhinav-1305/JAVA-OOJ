import java.util.Scanner;

 class Book{

   int num_pages;
   double price;
  String name;
  String author;
   Book(){
    num_pages=0;
    price=0.0;
    name="some_book";
    author="amshu";
  }
   Book(int num_pages,double price, String name, String author){
    this.num_pages=num_pages;
    this.price=price;
    this.name=name;
    this.author=author;
  }
  void set_data(int num_pages,double price, String name, String author)  {
       this.num_pages=num_pages;
       this.price=price;
       this.name=name;
       this.author=author;

  }
  void get_data(){
    System.out.println("Book details\nname: "+name+"\nauthor: "+author+"\nnmber of pages: "+num_pages+"\nprice: "+price);
    System.out.println("\n------------------------\n");
  }
  public String toString(){
    return ("Book details\nname: "+name+"\nauthor: "+author+"\nnmber of pages: "+num_pages+"\nprice: "+price+"\n---------------------------------\n");
  }

  
  }
class lab_2 {
  public static void main(String[] args) {
    Book b1=new Book();
    Scanner s=new Scanner(System.in);
    System.out.print("eneter the name of the book: ");
    String name=s.nextLine();
    System.out.print("eneter the author's name: ");
    String author=s.nextLine();
    System.out.print("eneter the number of pages in the book: ");
    int  num_pages=s.nextInt();
    System.out.print("eneter the price of the book: ");
    double price=s.nextDouble();
    System.out.println();
    b1.set_data(num_pages,price,name,author);
    Book b2=new Book(20,87.65,"deception point","dan brown");
    b1.get_data();
    b2.get_data();
    System.out.println(b1);
    System.out.println(b2);
    s.close();

            
    
  }



}
