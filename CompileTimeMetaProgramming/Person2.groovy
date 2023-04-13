import groovy.transfrom.EqualsAndHashCode

@toString(includeName = true, excludes = ["email"])

@EqualsAndHashCode(excludes = ["email"])
class Person {

    String first
    String last
    String email


    // @Override
    // public String toString(){
    //     return "Person{" +
    //             "first= '" + first + '\'' +
    //             ", last= '" + last + '\'' +
    //             ", email= '" + email + '\'' +
    //             '}';
    // }
}