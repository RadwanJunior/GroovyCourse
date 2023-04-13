// def xml = '''
//     <sports>
//         <sport>
//             <name>Football</name>
//         </sport>
//     </sports>
// '''

// def sports = new XMLSlurper()

// println sports.getClass().getName()
// println sports.sport.name

def sports = new XMLSlurper().parse('data/sports.xml')

println sports
println sports.sport[2].name