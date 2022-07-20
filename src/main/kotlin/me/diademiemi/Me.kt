package me.diademiemi.me

import java.util.*
object Me {

    val names = arrayOf(
        "Emilia", "Jasmine"
    )

    val pronouns = arrayOf(
        "They/Them", "She/Her"
    )

    val tz = TimeZone.
        getTimeZone("Europe/Amsterdam")

    fun pronounceGIF(): String {
        val pronunciations = arrayOf(
            "χɪf", "Gif", "Jif", "Yif"
        )
        return pronunciations[Random()
            .nextInt(pronunciations.size)]
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println("I go by ${names[0]} and ${names[1]}")
        println("My pronouns are ${pronouns[0]} and ${pronouns[1]}")
        println("My timezone is ${tz.displayName}")
        println("GIF is pronounced as ${pronounceGIF()}")
    }
}

