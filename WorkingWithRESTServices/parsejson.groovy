

JsonSlurper slurper = new JsonSlurper()
def json = slurper.parseText(books)

println json.books.currentBook.title


JsonSlurper slurper = new JsonSlurper()
def json = slurper.parse(new File('data/books.json'))

println json.books.currentBook
println json.books.currentBook.title
println json.books.currentBook.twitter
println json.books.currentBook.related

