import groovy.xml.MarkupBuilder

MarkupBuilder builder = new MarkupBuilder()
builder.omitEmptyAttributees = true
builder.omitNullAttributees = true

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