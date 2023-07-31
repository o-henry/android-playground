package com.example.geoquiz

import androidx.annotation.StringRes

// model layer (data) - MVP, MVVM and so on...
// UI가 표시할 정보를 포함하는 클래스
data class Question(@StringRes val textResId: Int, val answer: Boolean)
