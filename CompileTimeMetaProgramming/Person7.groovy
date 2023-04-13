import groovy.transfrom.TypeChecked

@TypeChecked

class Person5{
    String first
    String last

    String getFullName(){
        //Will return error
        // "$firstName $lastname"

        "$first $last"
    }
}