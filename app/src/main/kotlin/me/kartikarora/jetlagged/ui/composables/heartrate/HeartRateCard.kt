/*
 * Copyright 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.kartikarora.jetlagged.ui.composables.heartrate

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import me.kartikarora.jetlagged.R
import me.kartikarora.jetlagged.data.HeartRateOverallData
import me.kartikarora.jetlagged.ui.composables.BasicInformationalCard
import me.kartikarora.jetlagged.ui.composables.CardHeading
import me.kartikarora.jetlagged.ui.theme.JetLaggedTheme
import me.kartikarora.jetlagged.ui.theme.SmallHeadingStyle
import me.kartikarora.jetlagged.ui.theme.TitleStyle
import me.kartikarora.jetlagged.ui.util.CombinedPreview

@CombinedPreview
@Composable
fun HeartRateCard(
    modifier: Modifier = Modifier,
    heartRateData: HeartRateOverallData = HeartRateOverallData()
) {
    BasicInformationalCard(
        borderColor = JetLaggedTheme.extraColors.heart,
        modifier = modifier
            .height(260.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()

        ) {
            CardHeading(text = stringResource(R.string.heart_rate_heading))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    heartRateData.averageBpm.toString(),
                    style = TitleStyle,
                    modifier = Modifier.alignByBaseline(),
                    textAlign = TextAlign.Center
                )
                Text(
                    "bpm",
                    modifier = Modifier.alignByBaseline(),
                    style = SmallHeadingStyle
                )
            }
            HeartRateGraph(heartRateData.listData)
        }
    }
}
