// fun containsEven(collection: Collection<Int>): Boolean =
//         collection.any { num: Int -> if (num % 2 == 0) true else false }

// or

fun containsEven(collection: Collection<Int>): Boolean =
        collection.any { it % 2 == 0 }