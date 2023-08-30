import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {

		ArrayList<Book> list = new ArrayList<>();
		list.add(new Book("Aesop's Fables", 120));
		list.add(new Book("365 Bedtime Stories", 137));
		list.add(new Book("Stories for 3 Year Olds", 174));
		list.add(new Book("The Goose Girl", 58));
		list.add(new Book("365 Folk Tales", 344));
		list.add(new Book("The Story - Catcher", 264));
		System.out.println(list);

//		List<Book> listTemp = new ArrayList<>();
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).pages < 100) {
//				listTemp.add(list.get(i));
//			}
//		}
//		System.out.println(listTemp);

		List<Book> booksWithPagesLessThan100 = list.stream().filter(book -> book.pages < 100).toList();
		System.out.println(list);
		System.out.println(booksWithPagesLessThan100);

		Integer count = list.stream().collect(Collectors.summingInt(a -> a.pages));
		System.out.println(count);

		Map<String, Integer> bookMap = list.stream().collect(Collectors.toMap(book -> book.name, book -> book.pages));
		System.out.println(bookMap);

	}

}

class Book {

	String name;
	int pages;

	public Book() {
	}

	public Book(String name, int pages) {
		super();
		this.name = name;
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", pages=" + pages + "]";
	}

}
