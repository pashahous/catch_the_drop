package java_selfedu.les20.ex2;

  public class Book {
      private String name;
      private String autor;
      private Integer year;
      private Integer price;

      public Book(String name, String autor, Integer year, Integer price) {
          this.name = name;
          this.autor = autor;
          this.year = year;
          this.price = price;
      }

      public String getName() {
          return name;
      }

      public String getAutor() {
          return autor;
      }

      public Integer getYear() {
          return this.year;
      }

      public Integer getPrice() {
          return price;
      }
  }
