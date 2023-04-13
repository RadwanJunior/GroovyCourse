import groovy.xml.MarkupBuilder

FileWriter writer = new FileWriter('data/sports.xml')
MarkupBuilder builder = new MarkupBuilder(writer)
builder.doubleQuotes = true

//No sports method will be initially cuaght by nomethod ast
builder.sports{
    sport(id:1){
        name 'Baseball'
    }
    sport(id:2){
        name 'Basketball'
    }
    sport(id:3){
        name 'Football'
    }
    sport(id:4){
        name 'Hockey'
    }
    sport(id:null, foo: ''){
        name ''
    }
}