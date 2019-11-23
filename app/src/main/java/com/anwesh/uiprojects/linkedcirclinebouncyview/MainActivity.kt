package com.anwesh.uiprojects.linkedcirclinebouncyview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.circlelinebouncyview.CircleLineBouncyView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CircleLineBouncyView.create(this)
    }
}
