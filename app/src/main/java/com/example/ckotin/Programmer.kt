package com.example.ckotin

class Programmer(val name: String,
                 var age: Int,
                 val languages: Array<Language>,
                 val friends: Array<Programmer>? = null) {
    enum class Language {
        KOTLIN,
        PHP,
        JAVA,
        JAVASCRIPT
    }
    fun code(){
        for(language: Language in languages){
            println("Estoy programando en $language")
        }
    }
}