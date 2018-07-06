package io.github.manuelernesto.swoosh_app.Controller

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.github.manuelernesto.swoosh_app.Model.Player
import io.github.manuelernesto.swoosh_app.R
import io.github.manuelernesto.swoosh_app.Utilities.PLAYER_EXTRA
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player: Player = intent.getParcelableExtra(PLAYER_EXTRA)

        searchLeaguesTxt.text = "Looking for ${player.league} ${player.skill} near you!"
    }
}
