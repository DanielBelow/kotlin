tailrec inline fun factorial(a: Int, b: Int = 1): Int {
    if (a == 0) return b

    val result = factorial(a - 1, a * b)
    return result
}
