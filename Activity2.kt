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

}
