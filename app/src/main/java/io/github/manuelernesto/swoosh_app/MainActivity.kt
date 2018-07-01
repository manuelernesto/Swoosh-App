package io.github.manuelernesto.swoosh_app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnstarted.setOnClickListener{
            val intent = Intent(this, LeagueActivity::class.java)
            startActivity(intent)
        }
    }
}
