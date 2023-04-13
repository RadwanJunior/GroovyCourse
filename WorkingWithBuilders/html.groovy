import groovy.xml.MarkupBuilder

FileWriter writer = new FileWriter('html/about.html')
MarkupBuilder builder = new MarkupBuilder()

List courses = {
    [id:1, name: 'Apache Groovy'],
    [id:2, name: 'Spring Boot']
}

builder.html{
    head {
        title 'About first last'
        description'This is an about me page'
        keywords 'first last, Groovy, Java, Spring'
    }
    body{
        h1 'About Me'
        p 'This is a bunch of text about me...'
        section{
            h2 'Courses'
            table{
                tr{
                    th 'id'
                    th 'name'
                }
                // tr{
                //     td '1'
                //     td 'Groovy'
                // }
                // tr{
                //     td '2'
                //     td 'Spring Boot'
                // }
                courses.each { course ->
                    tr{
                        td.course.id
                        td.course.name
                    }
                }
            }
        }
    }
}