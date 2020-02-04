package br.com.vitor.jogodavelha.views

import androidx.test.rule.ActivityTestRule
import br.com.vitor.jogodavelha.R
import br.com.vitor.jogodavelha.models.Player
import com.schibsted.spain.barista.assertion.BaristaVisibilityAssertions.assertDisplayed
import kotlinx.android.synthetic.main.game_end_dialog.view.*
import org.junit.Rule
import org.junit.Test

class GameEndDialogTest {
    @Rule
    @JvmField
    var activityRule: ActivityTestRule<GameActivity> = ActivityTestRule(GameActivity::class.java)
    private fun givenGameEnded() {
        activityRule.activity.onGameWinnerChanged(Player("Heider", "x"))
    }
    @Test
    @Throws(Exception::class)
    fun display_winner_when_game_ends() {
        givenGameEnded()
        assertDisplayed(R.id.tvWinner)
    }
}
