def list = [1, 2, 3, 4, 5]

def doubleList(list) {
    def newList = []
    list.each { it ->
        newList << it
        newList << it * 2
    }
    return newList
}

println doubleList(list)