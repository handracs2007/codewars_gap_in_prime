// https://www.codewars.com/kata/561e9c843a2ef5a40c0000a4/train/kotlin

fun gap(g: Int, m: Long, n: Long): LongArray {
    for (i in m..(n - g)) {
        if (i.toBigInteger().isProbablePrime(1) && (i + g).toBigInteger().isProbablePrime(1)) {
            // Now, check the in-between numbers
            var valid = true
            for (j in (i + 1) until i + g) {
                if (j.toBigInteger().isProbablePrime(1)) {
                    valid = false
                    break
                }
            }

            if (valid) {
                val result = LongArray(size = 2)
                result[0] = i
                result[1] = i + g

                return result
            }
        }
    }

    return LongArray(size = 0)
}

fun main() {
    println(gap(2, 100, 110).toList())
    println(gap(4, 100, 110).toList())
    println(gap(6, 100, 110).toList())
    println(gap(2, 1883, 2883).toList())
    println(gap(2, 1524, 2524).toList())
    println(gap(2, 1882, 2882).toList())
    println(gap(10,300, 400).toList())
}