public class Cat implements Iterable<Cats> {
  private String name;
  private String color;
  private String owner;
  private static BPScanner kb = new BPScanner();
  private ArrayList<Cats> cats;

  public static void main(String[] args) {
      while (true) {
          String input = kb.getMenuStringFromUser("List Manager","Add", "Delete", "Modify",
                  "Display", "Quit");
          if (input.equals("Quit"))
              break;
          if (input.equals("Add")) {
              addCat();
          } else if (input.equals("Display")) {
              displayCats();
          }else if(input.equals("Delete")){
              removeCat();
          }

      }
  }
  public void Cat (String initName, String initColor, String initOwner) {
    this.name = initName;
    this.color = initColor;
    this.owner = initOwner;
  }

  public void addCat (String name, String color, String owner) {
    Cat cat = new Cat(name,color,owner);
    this.cats.add(cat);
  }

  public void displayCats() {
    Iterator <Cats> iterator = cats.iterator();
    while(iterator.hasNext()){
      Cat cat = iterator.next();
      System.out.println (cat);
    }
  }

  public void removeCat(Cat remCat) {
    Iterator <Cats> iterator = cats.iterator();
    while(iterator.hasNext()) {
      Cat cat = iterator.next();
      if (remCat.equals(cat)) {
        cat.remove();
      }
    }
  }

  public Iterator <Cats> iterator() {
    return this.cats.iterator();
  }
}
