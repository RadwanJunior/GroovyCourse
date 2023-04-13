import groovy.json.JsonBuilder

JsonBuilder builder = new JsonBuilder()

builder.books {
    currentBook{
        title 'The 4 hour work week'
        isbn '978-8-307-46534-1'
        author( first: 'Timothy'. last: 'Ferries', twitter: '@tferries')
        related 'The 4 Hour Body', 'The 4 hour chef'
    }

    nextBook{
        title 'The 4 hour work week'
        isbn '978-8-307-46534-1'
        author( first: 'Timothy'. last: 'Ferries', twitter: '@tferries')
        related 'The 4 Hour Body', 'The 4 hour chef'
    }
}

println builder.toString()
println builder.toPrettyString()

new File('json/books.json').write(builder.toPrettyString())