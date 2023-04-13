import groovy.transfrom.Comparable

@Comparable
@Sortable(includes = ['last','first'])
class Person5{
    String first
    String last
}