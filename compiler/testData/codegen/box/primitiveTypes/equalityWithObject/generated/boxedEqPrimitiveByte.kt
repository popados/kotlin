// Auto-generated by GeneratePrimitiveVsObjectEqualityTestData. Do not edit!

val nx: Byte? = 0.toByte()
val nn: Byte? = null
val x: Byte = 0.toByte()
val y: Byte = 1.toByte()

fun box(): String {
    val ax: Byte? = 0.toByte()
    val an: Byte? = null
    val bx: Byte = 0.toByte()
    val by: Byte = 1.toByte()

    return when {
        nx != 0.toByte() -> "Fail 0"
        nx == 1.toByte() -> "Fail 1"
        !(nx == 0.toByte()) -> "Fail 2"
        !(nx != 1.toByte()) -> "Fail 3"
        nx != x -> "Fail 4"
        nx == y -> "Fail 5"
        !(nx == x) -> "Fail 6"
        !(nx != y) -> "Fail 7"
        nn == 0.toByte() -> "Fail 8"
        !(nn != 0.toByte()) -> "Fail 9"
        nn == x -> "Fail 10"
        !(nn != x) -> "Fail 11"
        ax != 0.toByte() -> "Fail 12"
        ax == 1.toByte() -> "Fail 13"
        !(ax == 0.toByte()) -> "Fail 14"
        !(ax != 1.toByte()) -> "Fail 15"
        ax != x -> "Fail 16"
        ax == y -> "Fail 17"
        !(ax == x) -> "Fail 18"
        !(ax != y) -> "Fail 19"
        ax != bx -> "Fail 20"
        ax == by -> "Fail 21"
        !(ax == bx) -> "Fail 22"
        !(ax != by) -> "Fail 23"
        an == 0.toByte() -> "Fail 24"
        !(an != 0.toByte()) -> "Fail 25"
        an == x -> "Fail 26"
        !(an != x) -> "Fail 27"
        an == bx -> "Fail 28"
        !(an != bx) -> "Fail 29"
        else -> "OK"
    }
}