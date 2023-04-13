// DatabaseConnection dbConnection = new DatabaseConnection()
// println dbConnection

DatabaseConnection db = DatabaseConnection.private static  instance

static  getInstance(args) { 
    if (!instance) instance = new (args)
    return instance
}

println db