package io.mlh.localhackday.blackboard.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import io.mlh.localhackday.blackboard.data.Student
import io.mlh.localhackday.blackboard.repository.StudentRepository
import retrofit2.Call

class StudentViewModel(application: Application) : AndroidViewModel(application) {

    private val studentRepository = StudentRepository(application)


    fun getLoginResults(email: String, password:String): Call<Student> {
        return studentRepository.getLoginResults(email, password)
    }

    fun insert(student: Student) {
        studentRepository.insert(student)
    }

    fun get(email: String): LiveData<Student>? {
        return studentRepository.get(email)
    }
}