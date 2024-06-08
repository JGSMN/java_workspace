package section10.access2;

public class Ex10_03 {
  public static void main(String[] args) {
    NewBook book = new NewBook();
    book.title = "자바";
    book.price = 10000;
    book.info();
    
    Comic comic = new Comic();
    comic.title = "코믹";
    comic.price = 8000;
    comic.info();
    

  }
}
