package io.github.manuelernesto.swoosh_app.Controller

import android.content.Intent
import android.os.Bundle
import io.github.manuelernesto.swoosh_app.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnstarted.setOnClickListener {
            val leagueActivity = Intent(this, LeagueActivity::class.java)
            startActivity(leagueActivity)
        }
    }
}
