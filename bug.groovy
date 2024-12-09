def list = [1, 2, 3, 4, 5]

def doubleList(list) {
    list.each { it ->
        list << it * 2
    }
    return list
}

println doubleList(list)