package io.github.manuelernesto.swoosh_app.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import io.github.manuelernesto.swoosh_app.Model.Player
import io.github.manuelernesto.swoosh_app.R
import io.github.manuelernesto.swoosh_app.Utilities.PLAYER_EXTRA
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("", "")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(PLAYER_EXTRA, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null)
            player = savedInstanceState.getParcelable(PLAYER_EXTRA)
    }

    fun onMensClicked(view: View) {
        wonenLeagueBtn.isChecked = false
        coEdLeagueBtn.isChecked = false
        player.league = "mens"
    }

    fun onWonensClicked(view: View) {
        menLeagueBtn.isChecked = false
        coEdLeagueBtn.isChecked = false
        player.league = "womens"
    }

    fun onCoEdClicked(view: View) {
        menLeagueBtn.isChecked = false
        wonenLeagueBtn.isChecked = false
        player.league = "co-ed"
    }

    fun leagueNextClicked(view: View) {
        if (!player.league.isEmpty()) {
            val skillActivity = Intent(this, SkiilActivity::class.java)
            skillActivity.putExtra(PLAYER_EXTRA, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Select one League...", Toast.LENGTH_SHORT).show();
        }

    }


}
