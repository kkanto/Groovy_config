 
listView('Groovy Jobs') {
    description('Groovy Jobs')
    jobs {
        regex('Groovy_.+')
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
