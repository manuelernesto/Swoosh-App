package io.github.manuelernesto.swoosh_app.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import io.github.manuelernesto.swoosh_app.Model.Player
import io.github.manuelernesto.swoosh_app.R
import io.github.manuelernesto.swoosh_app.Utilities.PLAYER_EXTRA
import kotlinx.android.synthetic.main.activity_skiil.*

class SkiilActivity : BaseActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skiil)

        player = intent.getParcelableExtra(PLAYER_EXTRA)

    }

    fun onBeginnerCliked(view: View) {
        ballerSkillBtn.isChecked = false
        player.skill = "beginner"
    }

    fun onBallerCliked(view: View) {
        beginnerSkillBtn.isChecked = false
        player.skill = "baller"
    }

    fun onSkillFinishedClicked(view: View) {
        if (!player.skill.isEmpty()) {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(PLAYER_EXTRA, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Select one Skill...", Toast.LENGTH_SHORT).show()
        }
    }
}
