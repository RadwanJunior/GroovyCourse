class InvokeDemo {

    def InvokeMethod(String name, Object args){
        return "called invokeMethod $name $args"
    }

    def test(){
        return "method exists"
    }

}

def invokeDemo = new InvokeDemo()

assert invokeDemo.test() == 'method exists'
assert invokeDemo.someMethod() == 'called invokeMethod someMethod []'