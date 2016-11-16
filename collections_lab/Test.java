import java.util.*;


public class Test {
	public static void main(String[] args) {
		Page pageFirst = new Page(123);
		Page pageSecond = new Page(223);
		Page pageThird = new Page(323);

		Chapter chapter = new Chapter("OOP");

		chapter.addPage(pageFirst);
		chapter.addPage(pageSecond);
		chapter.addPage(pageThird);
		chapter.addPage(new Page(0));

		Iterator <Page> iterator = chapter.iterator();
		while(iterator.hasNext()) {
			Page page = iterator.next();
			System.out.println("It's Iterator: " + page.getPageNum());
		}
		System.out.println("");


		Chapter chapterFirst = new Chapter("one");
		Chapter chapterSecond = new Chapter("two");
		Chapter chapterThird = new Chapter("three");

		Book book = new Book("Math");

		book.addChapter(chapterFirst);
		book.addChapter(chapterSecond);
		book.addChapter(chapterThird);
		book.addChapter(new Chapter("null"));

		Iterator <Chapter> iterator1 = book.iterator();
		while(iterator1.hasNext()) {
			Chapter chapter1 = iterator1.next();
			System.out.println("Iterator: " + chapter1.getNumberOfPages());
		}

		System.out.println(book.getNumberOfPages());



	}
}