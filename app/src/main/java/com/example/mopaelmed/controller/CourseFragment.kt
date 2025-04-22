package com.example.mopaelmed.controller

//import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.mopaelmed.R

class CourseFragment : androidx.fragment.app.Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle? ): View? {
        return inflater.inflate(
            R.layout.fragment_course, container, false
        )
    }
        override fun onViewCreated (view: View, savedInstanceState: Bundle?){
            super.onViewCreated(view, savedInstanceState)
            val name=arguments?.getString("name")
            val description=arguments?.getString("description")
            val duration=arguments?.getString("duration")


            view.findViewById<TextView>(R.id.CourseName).text=name
            view.findViewById<TextView>(R.id.CourseDescription).text=description
            view.findViewById<TextView>(R.id.CourseDuration).text=duration


        }        }

