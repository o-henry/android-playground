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
    /**
     * VIEW(XML)로 작성한 코드는 UI를 그리는데, 이를 안드로이드에서 사용하기 위해서 Activity(애플리케이션의 한 화면을 나타내는 컴포넌트)를 활용합니다.
     * 이제 XML을 안드로이드(코틀린)의 코드에 사용하기 위해서 inflated 라는 과정을 거쳐야 합니다. 이에 따라서 setContentView라는 함수를 통해 레이아웃을 화면에 표시합니다.
     * 버튼같은 경우는 단순 UI가 아닌 사용자와 상호작용이 일어나는 요소로 이벤트를 처리해야 합니다.
     * 이에 따라서 해당 VIEW에 접근하기 위해서 Id값을 부여하고 이에 접근 합니다.
     */
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // inflate

        trueButton = findViewById(R.id.true_button) // get reference
        falseButton = findViewById(R.id.false_button)

        // event
        trueButton.setOnClickListener { view: View ->
            Toast.makeText(
                this, R.string.correct_toast, Toast.LENGTH_SHORT
            ).show()
        }
        falseButton.setOnClickListener { view: View ->
            Toast.makeText(
                this, R.string.incorrect_toast, Toast.LENGTH_SHORT
            ).show()
        }
    }
}