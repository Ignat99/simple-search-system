package ru.rti

import org.springframework.web.client.RestTemplate
import java.net.URI
import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    val url = URI("http://localhost:8080/users")
    for (i in 1..100L) {
        postUser(url, i)
    }
}

internal fun genUser(id: Long): User {
    return User(
            id, names[Random().nextInt(names.size)],
            surnames[Random().nextInt(surnames.size)],
            "+7-999-999-99-99")
}

internal fun postUser(url: URI, id: Long): Unit {
    val restTemplate = RestTemplate()
    val response = restTemplate.postForEntity(url, genUser(id), String::class.java)
    println(response)
}

val names = listOf("Александр",
        "Сергей",
        "Андрей",
        "Владимир",
        "Алексей",
        "Дмитрий",
        "Николай",
        "Евгений",
        "Иван",
        "Михаил",
        "Игорь",
        "Виктор",
        "Олег",
        "Павел",
        "Максим",
        "Василий",
        "Анатолий",
        "Виталий",
        "Роман",
        "Денис",
        "Валерий",
        "Константин",
        "Вячеслав",
        "Антон",
        "Вадим",
        "Илья",
        "Петр",
        "Владислав",
        "Геннадий",
        "Руслан",
        "Григорий",
        "Станислав",
        "Леонид",
        "Борис",
        "Артем",
        "Кирилл",
        "Артём",
        "Валентин",
        "Эдуард",
        "Георгий",
        "Федор",
        "Артур",
        "Степан",
        "Егор",
        "Ярослав",
        "Пётр")

val surnames = listOf(
        "Смирнов",
        "Иванов",
        "Кузнецов",
        "Соколов",
        "Попов",
        "Лебедев",
        "Козлов",
        "Новиков",
        "Морозов",
        "Петров",
        "Волков",
        "Соловьёв",
        "Васильев",
        "Зайцев",
        "Павлов",
        "Семёнов",
        "Голубев",
        "Виноградов",
        "Богданов",
        "Воробьёв",
        "Фёдоров",
        "Михайлов",
        "Беляев",
        "Тарасов",
        "Белов",
        "Комаров",
        "Орлов",
        "Киселёв",
        "Макаров",
        "Андреев",
        "Ковалёв",
        "Ильин",
        "Гусев",
        "Титов",
        "Кузьмин",
        "Кудрявцев",
        "Баранов",
        "Куликов",
        "Алексеев",
        "Степанов",
        "Яковлев",
        "Сорокин",
        "Сергеев",
        "Романов",
        "Захаров",
        "Борисов",
        "Королёв",
        "Герасимов",
        "Пономарёв",
        "Григорьев",
        "Лазарев",
        "Медведев",
        "Ершов",
        "Никитин",
        "Соболев",
        "Рябов",
        "Поляков",
        "Цветков",
        "Данилов",
        "Жуков",
        "Фролов",
        "Журавлёв",
        "Николаев",
        "Крылов",
        "Максимов",
        "Сидоров",
        "Осипов",
        "Белоусов",
        "Федотов",
        "Дорофеев",
        "Егоров",
        "Матвеев",
        "Бобров",
        "Дмитриев",
        "Калинин",
        "Анисимов",
        "Петухов",
        "Антонов",
        "Тимофеев",
        "Никифоров",
        "Веселов",
        "Филиппов",
        "Марков",
        "Большаков",
        "Суханов",
        "Миронов",
        "Ширяев",
        "Александров",
        "Коновалов",
        "Шестаков",
        "Казаков",
        "Ефимов",
        "Денисов",
        "Громов",
        "Фомин",
        "Давыдов",
        "Мельников",
        "Щербаков",
        "Блинов",
        "Колесников")