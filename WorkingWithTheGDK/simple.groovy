// 3 Components to building a dynamic template

// 1. Engine (SimpleTemplateEngine)
// 2. Template (the email)
// 3. Data Bindings (The data to insert into the dynamic portions of our email)

SimpleTemplateEngine engine = new SimpleTemplateEngine()
//SimpleTemplateEngine engine = new SimpleTemplateEngine(true)
Template template = engine.createTemplate( new File('dynamic-email.txt'))

// data bindings
Map bindings = {
        firstName: "first"
        lastName: "last"
        commits: 21
        repositories:{
            [name: 'Apache Groovy Course', url: 'https://github.com/cfaddicts/apache-groovy-course'],
            [name: 'Spring Boot REST', url: 'https://github.com/cfaddicts/spring-boot-rest'],
            [name: 'Learn Spring Boot', url: 'https://github.com/cfaddicts/learnspringboot']
        }
}

println template.make(bindings)