package me.kartikarora.jetlagged

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import me.kartikarora.jetlagged.data.heartRateGraphData
import me.kartikarora.jetlagged.data.sleepData
import me.kartikarora.jetlagged.ui.composables.backgrounds.FadingCircleBackground
import me.kartikarora.jetlagged.ui.composables.common.JetLaggedHeader
import me.kartikarora.jetlagged.ui.composables.common.JetLaggedHeaderTabs
import me.kartikarora.jetlagged.ui.composables.common.SleepTab
import me.kartikarora.jetlagged.ui.composables.heartrate.HeartRateCard
import me.kartikarora.jetlagged.ui.composables.heartrate.HeartRateGraph
import me.kartikarora.jetlagged.ui.composables.sleep.SleepBar
import me.kartikarora.jetlagged.ui.composables.sleep.SleepGraphCard
import me.kartikarora.jetlagged.ui.screens.JetLaggedHomeScreen
import me.kartikarora.jetlagged.ui.screens.JetLaggedSleepScreen
import me.kartikarora.jetlagged.ui.util.CombinedPreview

class PreviewsForTest {
    @Composable
    @CombinedPreview
    fun JetLaggedHomeScreenPreview() {
        JetLaggedHomeScreen()
    }

    @Composable
    @CombinedPreview
    fun JetLaggedHSleepScreenPreview() {
        JetLaggedSleepScreen()
    }

    @Composable
    @CombinedPreview
    fun JetLaggedHeaderPreview(@PreviewParameter(HeaderPreviewDataProvider::class) header: String) {
        JetLaggedHeader(headerText = header)
    }

    @Composable
    @CombinedPreview
    fun JetLaggedHeaderTabsPreview() {
        JetLaggedHeaderTabs(onTabSelected = {}, selectedTab = SleepTab.Month)
    }

    // Heart Rate
    @Composable
    @CombinedPreview
    fun HeartRateCardPreview() {
        HeartRateCard()
    }

    @Composable
    @CombinedPreview
    fun HeartRateGraphPreview() {
        HeartRateGraph(heartRateGraphData)
    }

    // Sleep
    @CombinedPreview
    @Composable
    fun SleepBarPreview() {
        SleepBar(sleepData = sleepData.sleepDayData.first())
    }

    @CombinedPreview
    @Composable
    fun SleepGraphCardPreview(
    ) {
        SleepGraphCard(sleepState = sleepData)
    }

    @CombinedPreview
    @Composable
    fun SleepGraphCardWithHeaderPreview(
    ) {
        SleepGraphCard(sleepState = sleepData, cardHeading = "JetLagged")
    }

    // UI
    @CombinedPreview
    @Composable
    fun FadingCirclePreview() {
        FadingCircleBackground(bubbleSize = 48.dp, color = Color.Magenta)
    }
}

class HeaderPreviewDataProvider : PreviewParameterProvider<String> {
    override val values: Sequence<String> = sequenceOf("JetLagged", "Sleep", "Home")
}