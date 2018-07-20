class PhoneNumber(rawPhoneNumber: String) {
    val number = rawPhoneNumber
        .filter(Char::isDigit)
        .removePrefix("1")
        .takeIf { it.length == 10 && it[0] >= '2' && it[3] >= '2' }
}