<!NO_TAIL_CALLS_FOUND!>tailrec <!NOTHING_TO_INLINE!>inline<!> fun factorial(a: Int, b: Int = 1): Int<!> {
    if (a == 0) return b

    val result = <!NON_TAIL_RECURSIVE_CALL, NO_TAIL_CALL_IN_INLINE!>factorial<!>(a - 1, a * b)
    return result
}
