// //create a new file
// def file = new File('dummy.text')
// file.write("This is some text\n")

// //new File('dummy.txt').text = "..."
// //File refers to file and directories (can be either)

// file.append("I am some more text...\n")

// List lines = files.readLines()
// Lines.each { line ->
//     println line
// }

// list all files in a directory

// String dir = 'some path'
// new File(dir).eachFile{ file ->

//     if(file.isFile()){
//         println file.name
//     }
// }

new File('.').eachFile{ file ->
    if(file.name.endsWith('.groovy')){
        println file.name
    }
}