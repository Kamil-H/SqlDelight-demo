import com.kamilh.moduleA.HockeyPlayer
import com.kamilh.moduleA.PlayerStorage
import com.kamilh.moduleB.Database
import com.kamilh.moduleB.PlayerQueries
import com.squareup.sqldelight.sqlite.driver.JdbcSqliteDriver

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val driver = JdbcSqliteDriver(JdbcSqliteDriver.IN_MEMORY)
    val database = Database(driver)
    Database.Schema.create(driver)
    val storage = PlayerStorage(database.playerQueries)
    val queries = PlayerQueries(database.playerQueriesQueries)

    val hockeyPlayer = HockeyPlayer(player_number = 1, full_name = "Full Name")

    storage.insert(hockeyPlayer)

    println(queries.allPlayers())
}