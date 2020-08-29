tailrec inline fun factorial(x: Int, y: Int = 1): Int {
    if (x == 0) return y
    return factorial(x - 1, x * y)
}

fun box(): String {
    val fac = factorial(5)
    return if (fac == 120) "OK" else "FAIL"
}
