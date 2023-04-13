List numbers = []

//push
10.times {
    println "push:\t ${it}"
    numbers << it
}

println numbers

//pop
for(i in 9..0){
    println "pop:\t ${it}"
    numbers.pop()
}

println numbers

//This works but what if we wanted to do at the same time
//Two people wanna use the list at the same time -> how?