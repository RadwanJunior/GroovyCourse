/*
Metaclass Demo
*/

class Developer {

}

Developer dan = new Developer()

//Per instance
Developer dev = new Developer()
dev.metaClass.name = "placeholder"
dev.metaClass.writeCode = {-> println "$name loves to write code..."}
dev.writeCode()


//For every instance
// be careful using this but it is really helpful
String.metaClass.shout = {-> toUpperCase() }
println "hello placeholder".shout()

Expando e = new Expando()
e.name = "placeholder"
e.writeCode = {-> println "$name loves to write code..."}
e.writeCode()

// Expando e2 = new Expando()
// e2.writeCode()


