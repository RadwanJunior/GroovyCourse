import groovy.transfrom.CompileStatic

@CompileStatic
class SomeClass {
    String foo(){
        "foo"
    }

    String bar(){
        "bar"
    }

    @CompileStatic(TypeCheckingMode.SKIP)
    void noReturn(){

    }
}