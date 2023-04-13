Developer adham = Developer
    .builder()
    .firstName("first")
    .lastName("last")
    .middleInitial("M")
    .email("email@email.com")
    .hireDate(new Date())
    .languages(["Java","Groovy"])
    .build()

println adham
assert adham.firstName == "first"
assert adham.lastName == "last"
assert adham.languages.size() == 2