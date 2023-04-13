// String dir = '/Users/.....'
// List hidden = []
// new File(dir).eachFile{ file ->

//     if(file.isDirectory()){
//         println file.name
//     }

//     if(file.isHidden()){
//         hidden << file
//     }
// }

// println hidden

String dir = 'some path'
new File(dir).eachDir{ subfolder ->
    println subfolder
}

def groovyCourseDir = new File('some path')
println groovyCourseDir.directorySize()

//create new
new File('dummy').mkdir()
new File('one/two/three').mkdir()

new File('dummy').deleteDir()