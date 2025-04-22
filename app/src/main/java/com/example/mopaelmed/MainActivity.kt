package com.example.mopaelmed

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.mopaelmed.controller.CourseFragment
import com.example.mopaelmed.model.DataProvider

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_course)
        val course = DataProvider.getCourse()
        val bundle = Bundle().apply {
            putString("name", course.name)
            putString("description", course.description)
            putString("duration", course.duration)
        }
        val fragment = CourseFragment()
        fragment.arguments = bundle


    }
    }