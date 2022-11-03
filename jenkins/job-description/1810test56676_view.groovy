 
listView('1810test56676 Jobs') {
    description('1810test56676 Jobs')
    jobs {
        regex('1810test56676_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
