
//create a new date
Date today = new Date()
println today
println "-------------------"

Date bday = new Date("01/01/1900")
println bday
//println bday.format()
println bday.format('M-d-Y')
println "-------------------"

//add and subtract
Date oneWeekFromToday = today.plus(7)
//Date oneWeekFromToday = today + 7
Date oneWeekAgo = today.minus(7)
//Date oneWeekAgo = today - 7
println oneWeekFromToday
println oneWeekAgo
println "-------------------"

//downto & upto
oneWeekFromToday.downto(today){
    println itt
}

println "-------------------"

Range twoWeeks = oneWeekAgo..oneWeekFromToday
twoWeeks.each{
    println it
}
println "-------------------"

// next & previous
Date newyear = new Date('01/01/2000')
println newyear.next()
println newyear.previous()
println "-------------------"

Date rightnow = new Date()
println rightnow.toTimestamp()