package ru.rti

import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
internal class UserService(private val userRepository: UserRepository, private val userSearch: UserSearch, private val userGenerator: UserGenerator) {

    fun findAll(): List<User> {
        return userRepository.findAll()
    }

    fun main1() {
        return userGenerator.main1()
    }

    fun search(text: String): List<User> {
        return userSearch.searchUsers(text)
    }

    fun saveUser(user: User): User {
        return userRepository.save(user)
    }
}