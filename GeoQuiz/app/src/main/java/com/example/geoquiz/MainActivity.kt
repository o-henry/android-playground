package com.example.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.geoquiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // 개별 요소(id)에 접근하는 대신 전체 layout에 접근할 수 있게 한다.
    private lateinit var binding: ActivityMainBinding

    private val questionBank = listOf(
        Question(R.string.question_australia, true),
        Question(R.string.question_oceans, true),
        Question(R.string.question_mideast, false),
        Question(R.string.question_africa, false),
        Question(R.string.question_americas, true),
        Question(R.string.question_asia, true)
    )

    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // event
        binding.trueButton.setOnClickListener { view: View ->
            Toast.makeText(
                this, R.string.correct_toast, Toast.LENGTH_SHORT
            ).show()
        }
        binding.falseButton.setOnClickListener { view: View ->
            Toast.makeText(
                this, R.string.incorrect_toast, Toast.LENGTH_SHORT
            ).show()
        }
    }
}