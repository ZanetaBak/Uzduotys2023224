public class Book {

    // Sukurti klasę Book.
    //Properties: title, pages, releaseYear
    //visi properties turi būti inkapsuliuoti.

    private String title;
    private int pages;
    private int releaseYear;

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Book() {

    }

    public Book(String title, int pages, int releaseYear) {
        this.title = title;
        this.pages = pages;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", releaseYear=" + releaseYear +
                '}';
    }



}
