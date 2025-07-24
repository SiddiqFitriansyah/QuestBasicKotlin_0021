package com.example.test

class Motor ()

class Contact(val id: Int, var email: String)


fun main() {
    val contact = Contact(1, "mary@gmail.com")

    // Prints the value of the property: email
    println(contact.email)
    
    // Updates the value of the property: email
    contact.email = "jane@gmail.com"
    
    // Prints the new value of the property: email
    println(contact.email)

    // www.dicoding.com

/*
 * List
 * List adalah collection yang bersifat immutable, artinya elemennya tidak bisa diubah setelah List dibuat.
 * List juga mempertahankan urutan elemen yang dimasukkan.
 * Untuk membuat List, kita bisa menggunakan fungsi listOf() atau mutableListOf() jika kita ingin List yang bisa diubah.
 */

// Contoh penggunaan List
val numberList = listOf(1, 2, 3, 4, 5)
println(numberList)
println(numberList[0]) // Mengakses elemen pertama

val anyList = listOf("Circle", "Square", "Triangle", 1, 2, 3, true, false)
println(anyList)

val mutableList = mutableListOf("Circle", "Square", "Triangle")
mutableList.add("Rectangle") // Menambah elemen baru
mutableList.removeAt(1) // Menghapus elemen pada indeks 1 (Square)
mutableList[0] = "Oval" // Mengubah elemen pada indeks 0 (Circle menjadi Oval)
println(mutableList)

/*
 * Set
 * Set adalah collection yang hanya menyimpan nilai-nilai unik. Jika Anda mencoba menambahkan elemen yang sudah ada, Set akan mengabaikannya.
 * Set tidak mempertahankan urutan elemen yang dimasukkan.
 * Untuk membuat Set, kita bisa menggunakan fungsi setOf() atau mutableSetOf().
 */

 // Contoh penggunaan Set
val integerSet = setOf(1, 2, 4, 2, 1, 5)
println(integerSet)

val setA = setOf(1, 2, 4, 2, 1, 5)
val setB = setOf(1, 2, 4, 5)
println(setA == setB) // Membandingkan dua Set

println(5 in setA) // Memeriksa apakah elemen ada di Set

val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
mutableSet.add(6) // Menambah elemen baru
mutableSet.remove(1) // Menghapus elemen
println(mutableSet)

/*
 * Map
 * Map adalah collection yang menyimpan data dalam pasangan kunci-nilai (key-value pair).
 * Setiap kunci dalam Map harus unik. Jika Anda mencoba menambahkan pasangan dengan kunci yang sudah ada, nilai yang lama akan ditimpa.
 * Map tidak mempertahankan urutan elemen yang dimasukkan.
 * Untuk membuat Map, kita bisa menggunakan fungsi mapOf() atau mutableMapOf().
 */

// Contoh penggunaan Map
val capital = mapOf(
    "Jakarta" to "Indonesia",
    "London" to "England",
    "New Delhi" to "India"
)

println(capital["Jakarta"]) // Mengakses nilai menggunakan kunci
println(capital.getValue("London")) // Mengakses nilai menggunakan kunci (akan melempar exception jika kunci tidak ditemukan)

val mapKeys = capital.keys // Mendapatkan semua kunci
println(mapKeys)

val mapValues = capital.values // Mendapatkan semua nilai
println(mapValues)

val mutableCapital = mutableMapOf(
    "Jakarta" to "Indonesia",
    "London" to "England",
    "New Delhi" to "India"
)

mutableCapital.put("Amsterdam", "Netherlands") // Menambah pasangan kunci-nilai
mutableCapital.remove("London") // Menghapus pasangan kunci-nilai
println(mutableCapital)

/*
 * Collection Operations
 * Kotlin menyediakan banyak fungsi untuk memanipulasi collection, seperti filter, map, forEach, dll.
 */

}
