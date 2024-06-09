package section10.access2;

public class Book {
  String title;
  String author;

  Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  void infoTitle() {
    System.out.println("책의 제목은 " + title + "입니다.");
  }

  void infoAuthor() {
    System.out.println("책의 저자는 " + author + "입니다.");
  }

}
