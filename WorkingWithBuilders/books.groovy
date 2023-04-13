
@toString(includesName = true)
class Book{
    String title
    String summary
    List<Section> section = []
}

@toString(includesName = true)
class Section{
    String title
    List<Chapter> chapters = []
}

@toString(includesName = true)
class Chapter{
    String title
}

//Java Style
// public Book createBook(){
//     Book b = new Book();
//     b.setTitle("My book");
//     b.setSummary("My Summary");

//     Section s = new Section();
//     s.setTitle("Section 1");

//     Chapter c1 = new Chapter();
//     c1.setTitle("Chapter 1");
//     Chapter c2 = new Chapter();
//     c1.setTitle("Chapter 2");

//     s.addChapter(c1,c2);
//     b.addSections().add(s);

//     return book;
// }

//Object Graph Builder

ObjectGraphBuilder builder = new ObjectGraphBuilder()
def book = builder.book(title:"Groovy in Action 2nd Edition",
                        summary: "Groovy in Actoin, Second Edition is a thoroughly revised, comprehensive guide to Groovy Programming."

    section(title: "Section 1"){
        chapter(title: 'Chapter 1')
        chapter(title: 'Chapter 2')
        chapter(title: 'Chapter 3')
    }
        section(title: "Section 2"){
        chapter(title: 'Chapter 4')
        chapter(title: 'Chapter 5')
        chapter(title: 'Chapter 6')
    }
)

println book
assert book.title = "Groovy in Actoin 2nd Edition"
assert book.sections.size() == 2
assert book.sections[0].title == "Section 1"
assert book.sections[0].chapters.size() == 3