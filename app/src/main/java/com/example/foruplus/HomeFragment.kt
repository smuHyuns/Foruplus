package com.example.foruplus

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CalendarView
import android.widget.TextView
import androidx.fragment.app.Fragment
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*


class HomeFragment : Fragment() {

    private lateinit var calendarView: CalendarView
    private lateinit var day_text: TextView


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {


        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        val view = inflater.inflate(R.layout.fragment_home, container, false)

        calendarView = view.findViewById(R.id.calendarview)
        day_text = view.findViewById(R.id.tv_date)

        //날짜 형태
        val dateFormat: DateFormat = SimpleDateFormat("yyyy년MM월dd일")

        //date타입
        val date: Date = Date(calendarView.date)

        //현재 날짜 담기
        day_text.text = dateFormat.format(date)

        //CalendarView 날짜 변환 이벤트
        calendarView.setOnDateChangeListener { calendarView, year, month, dayOfMonth ->

            //날짜 변수에 담기
            var day: String = "${year}년 ${month+1}월 ${dayOfMonth}일"

            //변수 텍스트뷰에 담기
            day_text.text = day
        }

        return view
    }


}

