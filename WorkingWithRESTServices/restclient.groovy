import groovy.net.http.ContentType
import groovy.net.http.RESTClient

//HTTPBUILDER IS A REST CLIENT

@grab('org.codehaus.groovy.modules.http-builder:http-builder:0.7.1')

String base = 'http://api.icndb.com'

def check = new RESTClient(base)
check.contentType = ContentType.JSON

check.get(path: '/jokes/random'){ response, json ->
    println response.status
    println json
}

def params = [firstName: "first", lastName: "last"]

check.get(path: '/jokes/random', query: params){ response, json ->
    println response.status
    println json
}