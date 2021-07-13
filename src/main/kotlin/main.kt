fun main(args: Array<String>) {
    println("True")
}


    fun isLove(
        flower1: Int,
        flower2: Int
    ): Boolean {
        return if (flower1 != flower2){
            flower1 % 2 == 0 && flower2 % 2 != 0 || flower1 % 2 != 0 && flower2 == 0

        } else {
            false
        }
    }
