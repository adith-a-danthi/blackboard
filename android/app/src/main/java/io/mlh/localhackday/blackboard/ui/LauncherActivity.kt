package io.mlh.localhackday.blackboard.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.mlh.localhackday.blackboard.R
import kotlinx.android.synthetic.main.activity_launcher.*

class LauncherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)
        setupListeners()
    }

    private fun setupListeners() {
        student.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra(LoginActivity.LOGIN_TYPE_INTENT_EXTRA, LoginActivity.LOGIN_TYPE_INTENT_STUDENT)
            startActivity(intent)
        }
        teacher.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra(LoginActivity.LOGIN_TYPE_INTENT_EXTRA, LoginActivity.LOGIN_TYPE_INTENT_TEACHER)
            startActivity(intent)
        }
    }

}

