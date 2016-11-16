import java.util.*;


public class Book implements Iterable<Chapter> {
	private String name;
	private ArrayList<Chapter> chapters;

	public Book(String initName) {
		this.name = initName;
		this.chapters = new ArrayList<Chapter>();
	}

	public void addChapter (Chapter chapter) {
		this.chapters.add(chapter);
	}

	public int getNumberOfChapters () {
		return this.chapters.size();
	}

	public int getNumberOfPages(){
		int num = 0;
		Iterator <Chapter> iterator = chapters.iterator();
		while(iterator.hasNext()) {
			Chapter chapter = iterator.next();
			num +=  chapter.getNumberOfPages();	
		}
		return num;
	}

	public Iterator <Chapter> iterator() {
		return this.chapters.iterator();
	}

}