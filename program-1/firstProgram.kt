fun main(){
    sortStringByFrequency
}

//  sort a string according to the frequency of characters
fun sortStringByFrequency(str: String): String{
    val map = mutableMapOf<Char, Int>()
    for (char in str){
        map[char] = map.getOrDefault(char, 0) + 1
    }
    val sortedMap = map.toList().sortedByDescending { (_, value) -> value }.toMap()
    var result = ""
    for ((key, value) in sortedMap){
        for (i in 0 until value){
            result += key
        }
    }
    return result
}