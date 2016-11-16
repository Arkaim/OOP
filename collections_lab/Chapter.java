import java.util.*;


public class Chapter implements Iterable<Page>{
	private String name;
	private ArrayList<Page> pages;

	public Chapter(String initName) {
		this.name = initName;
		this.pages = new ArrayList <Page>();
	}

	public void addPage (Page page) {
		this.pages.add(page);
	}

	public int getNumberOfPages() {
		return this.pages.size();
	}

	@Override 
	public Iterator <Page> iterator() {
		return this.pages.iterator();
	}
}

	// ArrayList <Page> pages = new ArrayList <Page>();
