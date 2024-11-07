/*
 * Copyright 2022 The Android Open Source Project
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

package me.kartikarora.jetlagged.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import me.kartikarora.jetlagged.R
import me.kartikarora.jetlagged.data.JetLaggedScreenViewModel
import me.kartikarora.jetlagged.ui.composables.AverageTimeAsleepCard
import me.kartikarora.jetlagged.ui.composables.AverageTimeInBedCard
import me.kartikarora.jetlagged.ui.composables.WellnessCard
import me.kartikarora.jetlagged.ui.composables.backgrounds.movingStripesBackground
import me.kartikarora.jetlagged.ui.composables.common.JetLaggedHeader
import me.kartikarora.jetlagged.ui.composables.heartrate.HeartRateCard
import me.kartikarora.jetlagged.ui.composables.sleep.SleepGraphCard
import me.kartikarora.jetlagged.ui.theme.JetLaggedTheme
import me.kartikarora.jetlagged.ui.util.FontScalePreviews
import me.kartikarora.jetlagged.ui.util.MultiDevicePreview

@OptIn(ExperimentalLayoutApi::class)
@MultiDevicePreview
@FontScalePreviews
@Composable
fun JetLaggedHomeScreen(
    modifier: Modifier = Modifier,
    windowSizeClass: WindowWidthSizeClass = WindowWidthSizeClass.Compact,
    viewModel: JetLaggedScreenViewModel = viewModel(),
    onDrawerClicked: () -> Unit = {}
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(MaterialTheme.colorScheme.background)
    ) {
        Column(
            modifier = Modifier.movingStripesBackground(
                stripeColor = JetLaggedTheme.extraColors.header,
                backgroundColor = MaterialTheme.colorScheme.background,
            )
        ) {
            JetLaggedHeader(
                modifier = Modifier.fillMaxWidth(),
                headerText = stringResource(R.string.jetlagged_home_screen_heading),
                onDrawerClicked = onDrawerClicked
            )
        }

        val uiState =
            viewModel.homeUiState.collectAsStateWithLifecycle()
        val insets = WindowInsets.safeDrawing.only(
            WindowInsetsSides.Bottom + WindowInsetsSides.Horizontal
        )
        FlowRow(
            modifier = Modifier
                .fillMaxSize()
                .windowInsetsPadding(insets),
            horizontalArrangement = Arrangement.Center,
            verticalArrangement = Arrangement.Center,
            maxItemsInEachRow = 3
        ) {
            SleepGraphCard(
                uiState.value.sleepGraphData,
                Modifier.widthIn(max = 600.dp),
                stringResource(R.string.sleep)
            )
            if (windowSizeClass == WindowWidthSizeClass.Compact) {
                AverageTimeInBedCard()
                AverageTimeAsleepCard()
            } else {
                FlowColumn {
                    AverageTimeInBedCard()
                    AverageTimeAsleepCard()
                }
            }
            if (windowSizeClass == WindowWidthSizeClass.Compact) {
                WellnessCard(
                    wellnessData = uiState.value.wellnessData,
                    modifier = Modifier
                        .widthIn(max = 400.dp)
                        .heightIn(min = 200.dp)
                )
                HeartRateCard(
                    modifier = Modifier.widthIn(max = 400.dp, min = 200.dp),
                    uiState.value.heartRateData
                )
            } else {
                FlowColumn {
                    WellnessCard(
                        wellnessData = uiState.value.wellnessData,
                        modifier = Modifier
                            .widthIn(max = 400.dp)
                            .heightIn(min = 200.dp)
                    )
                    HeartRateCard(
                        modifier = Modifier.widthIn(max = 400.dp, min = 200.dp),
                        uiState.value.heartRateData
                    )
                }
            }
        }
    }
}