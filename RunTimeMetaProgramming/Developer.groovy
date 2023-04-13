class Developer {

    def methodMissing(String name, args){
        println "${name}() method was called..."

        if(name.startsWith('write')){
            String language = name.split("write")[1]
            if (languages.contains(language)){
                def impl = { Object[] theArgs ->
                    println "I like to write code in $language"
                }
                getMetaClass()."$name" = impl
                return  impl(args)
            }
        }
    }
}

Developer dev = new Developer()
dev.languages << "Groovy"
dev.languages << "Java"

    println dev.metaClass.methods.size()

dev.writeGroovy()
dev.writeGroovy()
dev.writeGroovy()

    println dev.metaClass.methods.size()

//This doesnt exist so MethodMissing will be called
dev.writeGroovy()
dev.writeGroovy()

    println dev.metaClass.methods.size()