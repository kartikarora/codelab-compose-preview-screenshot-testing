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

package me.kartikarora.jetlagged.data

import me.kartikarora.jetlagged.ui.composables.sleep.SleepDayData
import me.kartikarora.jetlagged.ui.composables.sleep.SleepGraphData
import me.kartikarora.jetlagged.ui.composables.sleep.SleepPeriod
import me.kartikarora.jetlagged.ui.composables.sleep.SleepType
import java.time.LocalDateTime

val sleepData = SleepGraphData(
    listOf(
            // Day 1 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now(),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().withHour(22).withMinute(2),
    endTime = LocalDateTime.now().withHour(22).withMinute(2).plusMinutes(193),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().withHour(22).withMinute(2).plusMinutes(193),
    endTime = LocalDateTime.now().withHour(22).withMinute(2).plusMinutes(193).plusMinutes(114),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().withHour(22).withMinute(2).plusMinutes(193).plusMinutes(114),
    endTime = LocalDateTime.now().withHour(22).withMinute(2).plusMinutes(193).plusMinutes(114).plusMinutes(113),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().withHour(22).withMinute(2).plusMinutes(193).plusMinutes(114).plusMinutes(113),
    endTime = LocalDateTime.now().withHour(22).withMinute(2).plusMinutes(193).plusMinutes(114).plusMinutes(113).plusMinutes(68),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().withHour(22).withMinute(2).plusMinutes(193).plusMinutes(114).plusMinutes(113).plusMinutes(68),
    endTime = LocalDateTime.now().withHour(22).withMinute(2).plusMinutes(193).plusMinutes(114).plusMinutes(113).plusMinutes(68).plusMinutes(72),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 2 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(1),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(1).withHour(23).withMinute(57),
    endTime = LocalDateTime.now().minusDays(1).withHour(23).withMinute(57).plusMinutes(228),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(1).withHour(23).withMinute(57).plusMinutes(228),
    endTime = LocalDateTime.now().minusDays(1).withHour(23).withMinute(57).plusMinutes(228).plusMinutes(219),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(1).withHour(23).withMinute(57).plusMinutes(228).plusMinutes(219),
    endTime = LocalDateTime.now().minusDays(1).withHour(23).withMinute(57).plusMinutes(228).plusMinutes(219).plusMinutes(44),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(1).withHour(23).withMinute(57).plusMinutes(228).plusMinutes(219).plusMinutes(44),
    endTime = LocalDateTime.now().minusDays(1).withHour(23).withMinute(57).plusMinutes(228).plusMinutes(219).plusMinutes(44).plusMinutes(73),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(1).withHour(23).withMinute(57).plusMinutes(228).plusMinutes(219).plusMinutes(44).plusMinutes(73),
    endTime = LocalDateTime.now().minusDays(1).withHour(23).withMinute(57).plusMinutes(228).plusMinutes(219).plusMinutes(44).plusMinutes(73).plusMinutes(45),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 3 - Score: 77
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(2),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(2).withHour(23).withMinute(25),
    endTime = LocalDateTime.now().minusDays(2).withHour(23).withMinute(25).plusMinutes(113),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(2).withHour(23).withMinute(25).plusMinutes(113),
    endTime = LocalDateTime.now().minusDays(2).withHour(23).withMinute(25).plusMinutes(113).plusMinutes(70),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(2).withHour(23).withMinute(25).plusMinutes(113).plusMinutes(70),
    endTime = LocalDateTime.now().minusDays(2).withHour(23).withMinute(25).plusMinutes(113).plusMinutes(70).plusMinutes(67),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(2).withHour(23).withMinute(25).plusMinutes(113).plusMinutes(70).plusMinutes(67),
    endTime = LocalDateTime.now().minusDays(2).withHour(23).withMinute(25).plusMinutes(113).plusMinutes(70).plusMinutes(67).plusMinutes(46),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(2).withHour(23).withMinute(25).plusMinutes(113).plusMinutes(70).plusMinutes(67).plusMinutes(46),
    endTime = LocalDateTime.now().minusDays(2).withHour(23).withMinute(25).plusMinutes(113).plusMinutes(70).plusMinutes(67).plusMinutes(46).plusMinutes(36),
    type = SleepType.Awake
)
                ),
                sleepScore = 77
            ),

            // Day 4 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(3),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(3).withHour(23).withMinute(33),
    endTime = LocalDateTime.now().minusDays(3).withHour(23).withMinute(33).plusMinutes(241),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(3).withHour(23).withMinute(33).plusMinutes(241),
    endTime = LocalDateTime.now().minusDays(3).withHour(23).withMinute(33).plusMinutes(241).plusMinutes(140),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(3).withHour(23).withMinute(33).plusMinutes(241).plusMinutes(140),
    endTime = LocalDateTime.now().minusDays(3).withHour(23).withMinute(33).plusMinutes(241).plusMinutes(140).plusMinutes(69),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(3).withHour(23).withMinute(33).plusMinutes(241).plusMinutes(140).plusMinutes(69),
    endTime = LocalDateTime.now().minusDays(3).withHour(23).withMinute(33).plusMinutes(241).plusMinutes(140).plusMinutes(69).plusMinutes(36),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(3).withHour(23).withMinute(33).plusMinutes(241).plusMinutes(140).plusMinutes(69).plusMinutes(36),
    endTime = LocalDateTime.now().minusDays(3).withHour(23).withMinute(33).plusMinutes(241).plusMinutes(140).plusMinutes(69).plusMinutes(36).plusMinutes(44),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 5 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(4),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(4).withHour(23).withMinute(24),
    endTime = LocalDateTime.now().minusDays(4).withHour(23).withMinute(24).plusMinutes(234),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(4).withHour(23).withMinute(24).plusMinutes(234),
    endTime = LocalDateTime.now().minusDays(4).withHour(23).withMinute(24).plusMinutes(234).plusMinutes(144),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(4).withHour(23).withMinute(24).plusMinutes(234).plusMinutes(144),
    endTime = LocalDateTime.now().minusDays(4).withHour(23).withMinute(24).plusMinutes(234).plusMinutes(144).plusMinutes(144),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(4).withHour(23).withMinute(24).plusMinutes(234).plusMinutes(144).plusMinutes(144),
    endTime = LocalDateTime.now().minusDays(4).withHour(23).withMinute(24).plusMinutes(234).plusMinutes(144).plusMinutes(144).plusMinutes(66),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(4).withHour(23).withMinute(24).plusMinutes(234).plusMinutes(144).plusMinutes(144).plusMinutes(66),
    endTime = LocalDateTime.now().minusDays(4).withHour(23).withMinute(24).plusMinutes(234).plusMinutes(144).plusMinutes(144).plusMinutes(66).plusMinutes(41),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 6 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(5),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(5).withHour(21).withMinute(58),
    endTime = LocalDateTime.now().minusDays(5).withHour(21).withMinute(58).plusMinutes(198),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(5).withHour(21).withMinute(58).plusMinutes(198),
    endTime = LocalDateTime.now().minusDays(5).withHour(21).withMinute(58).plusMinutes(198).plusMinutes(188),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(5).withHour(21).withMinute(58).plusMinutes(198).plusMinutes(188),
    endTime = LocalDateTime.now().minusDays(5).withHour(21).withMinute(58).plusMinutes(198).plusMinutes(188).plusMinutes(50),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(5).withHour(21).withMinute(58).plusMinutes(198).plusMinutes(188).plusMinutes(50),
    endTime = LocalDateTime.now().minusDays(5).withHour(21).withMinute(58).plusMinutes(198).plusMinutes(188).plusMinutes(50).plusMinutes(103),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(5).withHour(21).withMinute(58).plusMinutes(198).plusMinutes(188).plusMinutes(50).plusMinutes(103),
    endTime = LocalDateTime.now().minusDays(5).withHour(21).withMinute(58).plusMinutes(198).plusMinutes(188).plusMinutes(50).plusMinutes(103).plusMinutes(35),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 7 - Score: 62
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(6),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(6).withHour(20).withMinute(6),
    endTime = LocalDateTime.now().minusDays(6).withHour(20).withMinute(6).plusMinutes(132),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(6).withHour(20).withMinute(6).plusMinutes(132),
    endTime = LocalDateTime.now().minusDays(6).withHour(20).withMinute(6).plusMinutes(132).plusMinutes(80),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(6).withHour(20).withMinute(6).plusMinutes(132).plusMinutes(80),
    endTime = LocalDateTime.now().minusDays(6).withHour(20).withMinute(6).plusMinutes(132).plusMinutes(80).plusMinutes(42),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(6).withHour(20).withMinute(6).plusMinutes(132).plusMinutes(80).plusMinutes(42),
    endTime = LocalDateTime.now().minusDays(6).withHour(20).withMinute(6).plusMinutes(132).plusMinutes(80).plusMinutes(42).plusMinutes(46),
    type = SleepType.Deep
)
                ),
                sleepScore = 62
            ),

            // Day 8 - Score: 90
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(7),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(7).withHour(20).withMinute(32),
    endTime = LocalDateTime.now().minusDays(7).withHour(20).withMinute(32).plusMinutes(206),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(7).withHour(20).withMinute(32).plusMinutes(206),
    endTime = LocalDateTime.now().minusDays(7).withHour(20).withMinute(32).plusMinutes(206).plusMinutes(66),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(7).withHour(20).withMinute(32).plusMinutes(206).plusMinutes(66),
    endTime = LocalDateTime.now().minusDays(7).withHour(20).withMinute(32).plusMinutes(206).plusMinutes(66).plusMinutes(59),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(7).withHour(20).withMinute(32).plusMinutes(206).plusMinutes(66).plusMinutes(59),
    endTime = LocalDateTime.now().minusDays(7).withHour(20).withMinute(32).plusMinutes(206).plusMinutes(66).plusMinutes(59).plusMinutes(36),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(7).withHour(20).withMinute(32).plusMinutes(206).plusMinutes(66).plusMinutes(59).plusMinutes(36),
    endTime = LocalDateTime.now().minusDays(7).withHour(20).withMinute(32).plusMinutes(206).plusMinutes(66).plusMinutes(59).plusMinutes(36).plusMinutes(31),
    type = SleepType.Awake
)
                ),
                sleepScore = 90
            ),

            // Day 9 - Score: 85
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(8),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(8).withHour(20).withMinute(8),
    endTime = LocalDateTime.now().minusDays(8).withHour(20).withMinute(8).plusMinutes(164),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(8).withHour(20).withMinute(8).plusMinutes(164),
    endTime = LocalDateTime.now().minusDays(8).withHour(20).withMinute(8).plusMinutes(164).plusMinutes(49),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(8).withHour(20).withMinute(8).plusMinutes(164).plusMinutes(49),
    endTime = LocalDateTime.now().minusDays(8).withHour(20).withMinute(8).plusMinutes(164).plusMinutes(49).plusMinutes(43),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(8).withHour(20).withMinute(8).plusMinutes(164).plusMinutes(49).plusMinutes(43),
    endTime = LocalDateTime.now().minusDays(8).withHour(20).withMinute(8).plusMinutes(164).plusMinutes(49).plusMinutes(43).plusMinutes(45),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(8).withHour(20).withMinute(8).plusMinutes(164).plusMinutes(49).plusMinutes(43).plusMinutes(45),
    endTime = LocalDateTime.now().minusDays(8).withHour(20).withMinute(8).plusMinutes(164).plusMinutes(49).plusMinutes(43).plusMinutes(45).plusMinutes(31),
    type = SleepType.Awake
)
                ),
                sleepScore = 85
            ),

            // Day 10 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(9),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(9).withHour(21).withMinute(15),
    endTime = LocalDateTime.now().minusDays(9).withHour(21).withMinute(15).plusMinutes(227),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(9).withHour(21).withMinute(15).plusMinutes(227),
    endTime = LocalDateTime.now().minusDays(9).withHour(21).withMinute(15).plusMinutes(227).plusMinutes(41),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(9).withHour(21).withMinute(15).plusMinutes(227).plusMinutes(41),
    endTime = LocalDateTime.now().minusDays(9).withHour(21).withMinute(15).plusMinutes(227).plusMinutes(41).plusMinutes(69),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(9).withHour(21).withMinute(15).plusMinutes(227).plusMinutes(41).plusMinutes(69),
    endTime = LocalDateTime.now().minusDays(9).withHour(21).withMinute(15).plusMinutes(227).plusMinutes(41).plusMinutes(69).plusMinutes(46),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(9).withHour(21).withMinute(15).plusMinutes(227).plusMinutes(41).plusMinutes(69).plusMinutes(46),
    endTime = LocalDateTime.now().minusDays(9).withHour(21).withMinute(15).plusMinutes(227).plusMinutes(41).plusMinutes(69).plusMinutes(46).plusMinutes(48),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 11 - Score: 90
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(10),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(10).withHour(22).withMinute(29),
    endTime = LocalDateTime.now().minusDays(10).withHour(22).withMinute(29).plusMinutes(172),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(10).withHour(22).withMinute(29).plusMinutes(172),
    endTime = LocalDateTime.now().minusDays(10).withHour(22).withMinute(29).plusMinutes(172).plusMinutes(66),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(10).withHour(22).withMinute(29).plusMinutes(172).plusMinutes(66),
    endTime = LocalDateTime.now().minusDays(10).withHour(22).withMinute(29).plusMinutes(172).plusMinutes(66).plusMinutes(82),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(10).withHour(22).withMinute(29).plusMinutes(172).plusMinutes(66).plusMinutes(82),
    endTime = LocalDateTime.now().minusDays(10).withHour(22).withMinute(29).plusMinutes(172).plusMinutes(66).plusMinutes(82).plusMinutes(45),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(10).withHour(22).withMinute(29).plusMinutes(172).plusMinutes(66).plusMinutes(82).plusMinutes(45),
    endTime = LocalDateTime.now().minusDays(10).withHour(22).withMinute(29).plusMinutes(172).plusMinutes(66).plusMinutes(82).plusMinutes(45).plusMinutes(31),
    type = SleepType.Awake
)
                ),
                sleepScore = 90
            ),

            // Day 12 - Score: 58
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(11),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(11).withHour(21).withMinute(23),
    endTime = LocalDateTime.now().minusDays(11).withHour(21).withMinute(23).plusMinutes(43),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(11).withHour(21).withMinute(23).plusMinutes(43),
    endTime = LocalDateTime.now().minusDays(11).withHour(21).withMinute(23).plusMinutes(43).plusMinutes(37),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(11).withHour(21).withMinute(23).plusMinutes(43).plusMinutes(37),
    endTime = LocalDateTime.now().minusDays(11).withHour(21).withMinute(23).plusMinutes(43).plusMinutes(37).plusMinutes(30),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(11).withHour(21).withMinute(23).plusMinutes(43).plusMinutes(37).plusMinutes(30),
    endTime = LocalDateTime.now().minusDays(11).withHour(21).withMinute(23).plusMinutes(43).plusMinutes(37).plusMinutes(30).plusMinutes(55),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(11).withHour(21).withMinute(23).plusMinutes(43).plusMinutes(37).plusMinutes(30).plusMinutes(55),
    endTime = LocalDateTime.now().minusDays(11).withHour(21).withMinute(23).plusMinutes(43).plusMinutes(37).plusMinutes(30).plusMinutes(55).plusMinutes(51),
    type = SleepType.Awake
)
                ),
                sleepScore = 58
            ),

            // Day 13 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(12),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(12).withHour(23).withMinute(57),
    endTime = LocalDateTime.now().minusDays(12).withHour(23).withMinute(57).plusMinutes(207),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(12).withHour(23).withMinute(57).plusMinutes(207),
    endTime = LocalDateTime.now().minusDays(12).withHour(23).withMinute(57).plusMinutes(207).plusMinutes(146),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(12).withHour(23).withMinute(57).plusMinutes(207).plusMinutes(146),
    endTime = LocalDateTime.now().minusDays(12).withHour(23).withMinute(57).plusMinutes(207).plusMinutes(146).plusMinutes(47),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(12).withHour(23).withMinute(57).plusMinutes(207).plusMinutes(146).plusMinutes(47),
    endTime = LocalDateTime.now().minusDays(12).withHour(23).withMinute(57).plusMinutes(207).plusMinutes(146).plusMinutes(47).plusMinutes(53),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(12).withHour(23).withMinute(57).plusMinutes(207).plusMinutes(146).plusMinutes(47).plusMinutes(53),
    endTime = LocalDateTime.now().minusDays(12).withHour(23).withMinute(57).plusMinutes(207).plusMinutes(146).plusMinutes(47).plusMinutes(53).plusMinutes(31),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 14 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(13),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(13).withHour(22).withMinute(55),
    endTime = LocalDateTime.now().minusDays(13).withHour(22).withMinute(55).plusMinutes(180),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(13).withHour(22).withMinute(55).plusMinutes(180),
    endTime = LocalDateTime.now().minusDays(13).withHour(22).withMinute(55).plusMinutes(180).plusMinutes(110),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(13).withHour(22).withMinute(55).plusMinutes(180).plusMinutes(110),
    endTime = LocalDateTime.now().minusDays(13).withHour(22).withMinute(55).plusMinutes(180).plusMinutes(110).plusMinutes(66),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(13).withHour(22).withMinute(55).plusMinutes(180).plusMinutes(110).plusMinutes(66),
    endTime = LocalDateTime.now().minusDays(13).withHour(22).withMinute(55).plusMinutes(180).plusMinutes(110).plusMinutes(66).plusMinutes(46),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(13).withHour(22).withMinute(55).plusMinutes(180).plusMinutes(110).plusMinutes(66).plusMinutes(46),
    endTime = LocalDateTime.now().minusDays(13).withHour(22).withMinute(55).plusMinutes(180).plusMinutes(110).plusMinutes(66).plusMinutes(46).plusMinutes(34),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 15 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(14),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(14).withHour(20).withMinute(18),
    endTime = LocalDateTime.now().minusDays(14).withHour(20).withMinute(18).plusMinutes(171),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(14).withHour(20).withMinute(18).plusMinutes(171),
    endTime = LocalDateTime.now().minusDays(14).withHour(20).withMinute(18).plusMinutes(171).plusMinutes(39),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(14).withHour(20).withMinute(18).plusMinutes(171).plusMinutes(39),
    endTime = LocalDateTime.now().minusDays(14).withHour(20).withMinute(18).plusMinutes(171).plusMinutes(39).plusMinutes(74),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(14).withHour(20).withMinute(18).plusMinutes(171).plusMinutes(39).plusMinutes(74),
    endTime = LocalDateTime.now().minusDays(14).withHour(20).withMinute(18).plusMinutes(171).plusMinutes(39).plusMinutes(74).plusMinutes(74),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(14).withHour(20).withMinute(18).plusMinutes(171).plusMinutes(39).plusMinutes(74).plusMinutes(74),
    endTime = LocalDateTime.now().minusDays(14).withHour(20).withMinute(18).plusMinutes(171).plusMinutes(39).plusMinutes(74).plusMinutes(74).plusMinutes(98),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 16 - Score: 87
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(15),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(15).withHour(22).withMinute(10),
    endTime = LocalDateTime.now().minusDays(15).withHour(22).withMinute(10).plusMinutes(109),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(15).withHour(22).withMinute(10).plusMinutes(109),
    endTime = LocalDateTime.now().minusDays(15).withHour(22).withMinute(10).plusMinutes(109).plusMinutes(147),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(15).withHour(22).withMinute(10).plusMinutes(109).plusMinutes(147),
    endTime = LocalDateTime.now().minusDays(15).withHour(22).withMinute(10).plusMinutes(109).plusMinutes(147).plusMinutes(55),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(15).withHour(22).withMinute(10).plusMinutes(109).plusMinutes(147).plusMinutes(55),
    endTime = LocalDateTime.now().minusDays(15).withHour(22).withMinute(10).plusMinutes(109).plusMinutes(147).plusMinutes(55).plusMinutes(39),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(15).withHour(22).withMinute(10).plusMinutes(109).plusMinutes(147).plusMinutes(55).plusMinutes(39),
    endTime = LocalDateTime.now().minusDays(15).withHour(22).withMinute(10).plusMinutes(109).plusMinutes(147).plusMinutes(55).plusMinutes(39).plusMinutes(33),
    type = SleepType.Awake
)
                ),
                sleepScore = 87
            ),

            // Day 17 - Score: 87
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(16),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(16).withHour(21).withMinute(9),
    endTime = LocalDateTime.now().minusDays(16).withHour(21).withMinute(9).plusMinutes(66),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(16).withHour(21).withMinute(9).plusMinutes(66),
    endTime = LocalDateTime.now().minusDays(16).withHour(21).withMinute(9).plusMinutes(66).plusMinutes(95),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(16).withHour(21).withMinute(9).plusMinutes(66).plusMinutes(95),
    endTime = LocalDateTime.now().minusDays(16).withHour(21).withMinute(9).plusMinutes(66).plusMinutes(95).plusMinutes(104),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(16).withHour(21).withMinute(9).plusMinutes(66).plusMinutes(95).plusMinutes(104),
    endTime = LocalDateTime.now().minusDays(16).withHour(21).withMinute(9).plusMinutes(66).plusMinutes(95).plusMinutes(104).plusMinutes(49),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(16).withHour(21).withMinute(9).plusMinutes(66).plusMinutes(95).plusMinutes(104).plusMinutes(49),
    endTime = LocalDateTime.now().minusDays(16).withHour(21).withMinute(9).plusMinutes(66).plusMinutes(95).plusMinutes(104).plusMinutes(49).plusMinutes(36),
    type = SleepType.Awake
)
                ),
                sleepScore = 87
            ),

            // Day 18 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(17),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(17).withHour(20).withMinute(15),
    endTime = LocalDateTime.now().minusDays(17).withHour(20).withMinute(15).plusMinutes(101),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(17).withHour(20).withMinute(15).plusMinutes(101),
    endTime = LocalDateTime.now().minusDays(17).withHour(20).withMinute(15).plusMinutes(101).plusMinutes(47),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(17).withHour(20).withMinute(15).plusMinutes(101).plusMinutes(47),
    endTime = LocalDateTime.now().minusDays(17).withHour(20).withMinute(15).plusMinutes(101).plusMinutes(47).plusMinutes(161),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(17).withHour(20).withMinute(15).plusMinutes(101).plusMinutes(47).plusMinutes(161),
    endTime = LocalDateTime.now().minusDays(17).withHour(20).withMinute(15).plusMinutes(101).plusMinutes(47).plusMinutes(161).plusMinutes(73),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(17).withHour(20).withMinute(15).plusMinutes(101).plusMinutes(47).plusMinutes(161).plusMinutes(73),
    endTime = LocalDateTime.now().minusDays(17).withHour(20).withMinute(15).plusMinutes(101).plusMinutes(47).plusMinutes(161).plusMinutes(73).plusMinutes(71),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 19 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(18),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(18).withHour(21).withMinute(9),
    endTime = LocalDateTime.now().minusDays(18).withHour(21).withMinute(9).plusMinutes(277),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(18).withHour(21).withMinute(9).plusMinutes(277),
    endTime = LocalDateTime.now().minusDays(18).withHour(21).withMinute(9).plusMinutes(277).plusMinutes(50),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(18).withHour(21).withMinute(9).plusMinutes(277).plusMinutes(50),
    endTime = LocalDateTime.now().minusDays(18).withHour(21).withMinute(9).plusMinutes(277).plusMinutes(50).plusMinutes(103),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(18).withHour(21).withMinute(9).plusMinutes(277).plusMinutes(50).plusMinutes(103),
    endTime = LocalDateTime.now().minusDays(18).withHour(21).withMinute(9).plusMinutes(277).plusMinutes(50).plusMinutes(103).plusMinutes(40),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(18).withHour(21).withMinute(9).plusMinutes(277).plusMinutes(50).plusMinutes(103).plusMinutes(40),
    endTime = LocalDateTime.now().minusDays(18).withHour(21).withMinute(9).plusMinutes(277).plusMinutes(50).plusMinutes(103).plusMinutes(40).plusMinutes(48),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 20 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(19),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(19).withHour(22).withMinute(31),
    endTime = LocalDateTime.now().minusDays(19).withHour(22).withMinute(31).plusMinutes(292),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(19).withHour(22).withMinute(31).plusMinutes(292),
    endTime = LocalDateTime.now().minusDays(19).withHour(22).withMinute(31).plusMinutes(292).plusMinutes(164),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(19).withHour(22).withMinute(31).plusMinutes(292).plusMinutes(164),
    endTime = LocalDateTime.now().minusDays(19).withHour(22).withMinute(31).plusMinutes(292).plusMinutes(164).plusMinutes(54),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(19).withHour(22).withMinute(31).plusMinutes(292).plusMinutes(164).plusMinutes(54),
    endTime = LocalDateTime.now().minusDays(19).withHour(22).withMinute(31).plusMinutes(292).plusMinutes(164).plusMinutes(54).plusMinutes(67),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(19).withHour(22).withMinute(31).plusMinutes(292).plusMinutes(164).plusMinutes(54).plusMinutes(67),
    endTime = LocalDateTime.now().minusDays(19).withHour(22).withMinute(31).plusMinutes(292).plusMinutes(164).plusMinutes(54).plusMinutes(67).plusMinutes(57),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 21 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(20),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(20).withHour(22).withMinute(39),
    endTime = LocalDateTime.now().minusDays(20).withHour(22).withMinute(39).plusMinutes(242),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(20).withHour(22).withMinute(39).plusMinutes(242),
    endTime = LocalDateTime.now().minusDays(20).withHour(22).withMinute(39).plusMinutes(242).plusMinutes(119),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(20).withHour(22).withMinute(39).plusMinutes(242).plusMinutes(119),
    endTime = LocalDateTime.now().minusDays(20).withHour(22).withMinute(39).plusMinutes(242).plusMinutes(119).plusMinutes(113),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(20).withHour(22).withMinute(39).plusMinutes(242).plusMinutes(119).plusMinutes(113),
    endTime = LocalDateTime.now().minusDays(20).withHour(22).withMinute(39).plusMinutes(242).plusMinutes(119).plusMinutes(113).plusMinutes(41),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(20).withHour(22).withMinute(39).plusMinutes(242).plusMinutes(119).plusMinutes(113).plusMinutes(41),
    endTime = LocalDateTime.now().minusDays(20).withHour(22).withMinute(39).plusMinutes(242).plusMinutes(119).plusMinutes(113).plusMinutes(41).plusMinutes(36),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 22 - Score: 55
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(21),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(21).withHour(22).withMinute(56),
    endTime = LocalDateTime.now().minusDays(21).withHour(22).withMinute(56).plusMinutes(107),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(21).withHour(22).withMinute(56).plusMinutes(107),
    endTime = LocalDateTime.now().minusDays(21).withHour(22).withMinute(56).plusMinutes(107).plusMinutes(45),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(21).withHour(22).withMinute(56).plusMinutes(107).plusMinutes(45),
    endTime = LocalDateTime.now().minusDays(21).withHour(22).withMinute(56).plusMinutes(107).plusMinutes(45).plusMinutes(49),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(21).withHour(22).withMinute(56).plusMinutes(107).plusMinutes(45).plusMinutes(49),
    endTime = LocalDateTime.now().minusDays(21).withHour(22).withMinute(56).plusMinutes(107).plusMinutes(45).plusMinutes(49).plusMinutes(30),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(21).withHour(22).withMinute(56).plusMinutes(107).plusMinutes(45).plusMinutes(49).plusMinutes(30),
    endTime = LocalDateTime.now().minusDays(21).withHour(22).withMinute(56).plusMinutes(107).plusMinutes(45).plusMinutes(49).plusMinutes(30).plusMinutes(33),
    type = SleepType.Awake
)
                ),
                sleepScore = 55
            ),

            // Day 23 - Score: 97
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(22),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(22).withHour(23).withMinute(50),
    endTime = LocalDateTime.now().minusDays(22).withHour(23).withMinute(50).plusMinutes(141),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(22).withHour(23).withMinute(50).plusMinutes(141),
    endTime = LocalDateTime.now().minusDays(22).withHour(23).withMinute(50).plusMinutes(141).plusMinutes(37),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(22).withHour(23).withMinute(50).plusMinutes(141).plusMinutes(37),
    endTime = LocalDateTime.now().minusDays(22).withHour(23).withMinute(50).plusMinutes(141).plusMinutes(37).plusMinutes(57),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(22).withHour(23).withMinute(50).plusMinutes(141).plusMinutes(37).plusMinutes(57),
    endTime = LocalDateTime.now().minusDays(22).withHour(23).withMinute(50).plusMinutes(141).plusMinutes(37).plusMinutes(57).plusMinutes(84),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(22).withHour(23).withMinute(50).plusMinutes(141).plusMinutes(37).plusMinutes(57).plusMinutes(84),
    endTime = LocalDateTime.now().minusDays(22).withHour(23).withMinute(50).plusMinutes(141).plusMinutes(37).plusMinutes(57).plusMinutes(84).plusMinutes(35),
    type = SleepType.Awake
)
                ),
                sleepScore = 97
            ),

            // Day 24 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(23),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(23).withHour(23).withMinute(30),
    endTime = LocalDateTime.now().minusDays(23).withHour(23).withMinute(30).plusMinutes(119),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(23).withHour(23).withMinute(30).plusMinutes(119),
    endTime = LocalDateTime.now().minusDays(23).withHour(23).withMinute(30).plusMinutes(119).plusMinutes(240),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(23).withHour(23).withMinute(30).plusMinutes(119).plusMinutes(240),
    endTime = LocalDateTime.now().minusDays(23).withHour(23).withMinute(30).plusMinutes(119).plusMinutes(240).plusMinutes(99),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(23).withHour(23).withMinute(30).plusMinutes(119).plusMinutes(240).plusMinutes(99),
    endTime = LocalDateTime.now().minusDays(23).withHour(23).withMinute(30).plusMinutes(119).plusMinutes(240).plusMinutes(99).plusMinutes(63),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(23).withHour(23).withMinute(30).plusMinutes(119).plusMinutes(240).plusMinutes(99).plusMinutes(63),
    endTime = LocalDateTime.now().minusDays(23).withHour(23).withMinute(30).plusMinutes(119).plusMinutes(240).plusMinutes(99).plusMinutes(63).plusMinutes(41),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 25 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(24),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(24).withHour(21).withMinute(33),
    endTime = LocalDateTime.now().minusDays(24).withHour(21).withMinute(33).plusMinutes(176),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(24).withHour(21).withMinute(33).plusMinutes(176),
    endTime = LocalDateTime.now().minusDays(24).withHour(21).withMinute(33).plusMinutes(176).plusMinutes(98),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(24).withHour(21).withMinute(33).plusMinutes(176).plusMinutes(98),
    endTime = LocalDateTime.now().minusDays(24).withHour(21).withMinute(33).plusMinutes(176).plusMinutes(98).plusMinutes(103),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(24).withHour(21).withMinute(33).plusMinutes(176).plusMinutes(98).plusMinutes(103),
    endTime = LocalDateTime.now().minusDays(24).withHour(21).withMinute(33).plusMinutes(176).plusMinutes(98).plusMinutes(103).plusMinutes(33),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(24).withHour(21).withMinute(33).plusMinutes(176).plusMinutes(98).plusMinutes(103).plusMinutes(33),
    endTime = LocalDateTime.now().minusDays(24).withHour(21).withMinute(33).plusMinutes(176).plusMinutes(98).plusMinutes(103).plusMinutes(33).plusMinutes(47),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 26 - Score: 78
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(25),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(25).withHour(22).withMinute(48),
    endTime = LocalDateTime.now().minusDays(25).withHour(22).withMinute(48).plusMinutes(109),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(25).withHour(22).withMinute(48).plusMinutes(109),
    endTime = LocalDateTime.now().minusDays(25).withHour(22).withMinute(48).plusMinutes(109).plusMinutes(46),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(25).withHour(22).withMinute(48).plusMinutes(109).plusMinutes(46),
    endTime = LocalDateTime.now().minusDays(25).withHour(22).withMinute(48).plusMinutes(109).plusMinutes(46).plusMinutes(45),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(25).withHour(22).withMinute(48).plusMinutes(109).plusMinutes(46).plusMinutes(45),
    endTime = LocalDateTime.now().minusDays(25).withHour(22).withMinute(48).plusMinutes(109).plusMinutes(46).plusMinutes(45).plusMinutes(61),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(25).withHour(22).withMinute(48).plusMinutes(109).plusMinutes(46).plusMinutes(45).plusMinutes(61),
    endTime = LocalDateTime.now().minusDays(25).withHour(22).withMinute(48).plusMinutes(109).plusMinutes(46).plusMinutes(45).plusMinutes(61).plusMinutes(56),
    type = SleepType.Awake
)
                ),
                sleepScore = 78
            ),

            // Day 27 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(26),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(26).withHour(21).withMinute(52),
    endTime = LocalDateTime.now().minusDays(26).withHour(21).withMinute(52).plusMinutes(61),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(26).withHour(21).withMinute(52).plusMinutes(61),
    endTime = LocalDateTime.now().minusDays(26).withHour(21).withMinute(52).plusMinutes(61).plusMinutes(100),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(26).withHour(21).withMinute(52).plusMinutes(61).plusMinutes(100),
    endTime = LocalDateTime.now().minusDays(26).withHour(21).withMinute(52).plusMinutes(61).plusMinutes(100).plusMinutes(149),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(26).withHour(21).withMinute(52).plusMinutes(61).plusMinutes(100).plusMinutes(149),
    endTime = LocalDateTime.now().minusDays(26).withHour(21).withMinute(52).plusMinutes(61).plusMinutes(100).plusMinutes(149).plusMinutes(167),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(26).withHour(21).withMinute(52).plusMinutes(61).plusMinutes(100).plusMinutes(149).plusMinutes(167),
    endTime = LocalDateTime.now().minusDays(26).withHour(21).withMinute(52).plusMinutes(61).plusMinutes(100).plusMinutes(149).plusMinutes(167).plusMinutes(32),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 28 - Score: 58
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(27),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(27).withHour(21).withMinute(54),
    endTime = LocalDateTime.now().minusDays(27).withHour(21).withMinute(54).plusMinutes(108),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(27).withHour(21).withMinute(54).plusMinutes(108),
    endTime = LocalDateTime.now().minusDays(27).withHour(21).withMinute(54).plusMinutes(108).plusMinutes(49),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(27).withHour(21).withMinute(54).plusMinutes(108).plusMinutes(49),
    endTime = LocalDateTime.now().minusDays(27).withHour(21).withMinute(54).plusMinutes(108).plusMinutes(49).plusMinutes(48),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(27).withHour(21).withMinute(54).plusMinutes(108).plusMinutes(49).plusMinutes(48),
    endTime = LocalDateTime.now().minusDays(27).withHour(21).withMinute(54).plusMinutes(108).plusMinutes(49).plusMinutes(48).plusMinutes(37),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(27).withHour(21).withMinute(54).plusMinutes(108).plusMinutes(49).plusMinutes(48).plusMinutes(37),
    endTime = LocalDateTime.now().minusDays(27).withHour(21).withMinute(54).plusMinutes(108).plusMinutes(49).plusMinutes(48).plusMinutes(37).plusMinutes(41),
    type = SleepType.Awake
)
                ),
                sleepScore = 58
            ),

            // Day 29 - Score: 57
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(28),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(28).withHour(21).withMinute(16),
    endTime = LocalDateTime.now().minusDays(28).withHour(21).withMinute(16).plusMinutes(94),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(28).withHour(21).withMinute(16).plusMinutes(94),
    endTime = LocalDateTime.now().minusDays(28).withHour(21).withMinute(16).plusMinutes(94).plusMinutes(65),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(28).withHour(21).withMinute(16).plusMinutes(94).plusMinutes(65),
    endTime = LocalDateTime.now().minusDays(28).withHour(21).withMinute(16).plusMinutes(94).plusMinutes(65).plusMinutes(37),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(28).withHour(21).withMinute(16).plusMinutes(94).plusMinutes(65).plusMinutes(37),
    endTime = LocalDateTime.now().minusDays(28).withHour(21).withMinute(16).plusMinutes(94).plusMinutes(65).plusMinutes(37).plusMinutes(32),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(28).withHour(21).withMinute(16).plusMinutes(94).plusMinutes(65).plusMinutes(37).plusMinutes(32),
    endTime = LocalDateTime.now().minusDays(28).withHour(21).withMinute(16).plusMinutes(94).plusMinutes(65).plusMinutes(37).plusMinutes(32).plusMinutes(48),
    type = SleepType.Awake
)
                ),
                sleepScore = 57
            ),

            // Day 30 - Score: 98
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(29),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(29).withHour(22).withMinute(6),
    endTime = LocalDateTime.now().minusDays(29).withHour(22).withMinute(6).plusMinutes(221),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(29).withHour(22).withMinute(6).plusMinutes(221),
    endTime = LocalDateTime.now().minusDays(29).withHour(22).withMinute(6).plusMinutes(221).plusMinutes(74),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(29).withHour(22).withMinute(6).plusMinutes(221).plusMinutes(74),
    endTime = LocalDateTime.now().minusDays(29).withHour(22).withMinute(6).plusMinutes(221).plusMinutes(74).plusMinutes(56),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(29).withHour(22).withMinute(6).plusMinutes(221).plusMinutes(74).plusMinutes(56),
    endTime = LocalDateTime.now().minusDays(29).withHour(22).withMinute(6).plusMinutes(221).plusMinutes(74).plusMinutes(56).plusMinutes(43),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(29).withHour(22).withMinute(6).plusMinutes(221).plusMinutes(74).plusMinutes(56).plusMinutes(43),
    endTime = LocalDateTime.now().minusDays(29).withHour(22).withMinute(6).plusMinutes(221).plusMinutes(74).plusMinutes(56).plusMinutes(43).plusMinutes(34),
    type = SleepType.Awake
)
                ),
                sleepScore = 98
            ),

            // Day 31 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(30),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(30).withHour(22).withMinute(4),
    endTime = LocalDateTime.now().minusDays(30).withHour(22).withMinute(4).plusMinutes(132),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(30).withHour(22).withMinute(4).plusMinutes(132),
    endTime = LocalDateTime.now().minusDays(30).withHour(22).withMinute(4).plusMinutes(132).plusMinutes(133),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(30).withHour(22).withMinute(4).plusMinutes(132).plusMinutes(133),
    endTime = LocalDateTime.now().minusDays(30).withHour(22).withMinute(4).plusMinutes(132).plusMinutes(133).plusMinutes(118),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(30).withHour(22).withMinute(4).plusMinutes(132).plusMinutes(133).plusMinutes(118),
    endTime = LocalDateTime.now().minusDays(30).withHour(22).withMinute(4).plusMinutes(132).plusMinutes(133).plusMinutes(118).plusMinutes(90),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(30).withHour(22).withMinute(4).plusMinutes(132).plusMinutes(133).plusMinutes(118).plusMinutes(90),
    endTime = LocalDateTime.now().minusDays(30).withHour(22).withMinute(4).plusMinutes(132).plusMinutes(133).plusMinutes(118).plusMinutes(90).plusMinutes(106),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 32 - Score: 63
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(31),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(31).withHour(22).withMinute(16),
    endTime = LocalDateTime.now().minusDays(31).withHour(22).withMinute(16).plusMinutes(73),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(31).withHour(22).withMinute(16).plusMinutes(73),
    endTime = LocalDateTime.now().minusDays(31).withHour(22).withMinute(16).plusMinutes(73).plusMinutes(112),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(31).withHour(22).withMinute(16).plusMinutes(73).plusMinutes(112),
    endTime = LocalDateTime.now().minusDays(31).withHour(22).withMinute(16).plusMinutes(73).plusMinutes(112).plusMinutes(58),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(31).withHour(22).withMinute(16).plusMinutes(73).plusMinutes(112).plusMinutes(58),
    endTime = LocalDateTime.now().minusDays(31).withHour(22).withMinute(16).plusMinutes(73).plusMinutes(112).plusMinutes(58).plusMinutes(60),
    type = SleepType.Deep
)
                ),
                sleepScore = 63
            ),

            // Day 33 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(32),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(32).withHour(20).withMinute(21),
    endTime = LocalDateTime.now().minusDays(32).withHour(20).withMinute(21).plusMinutes(275),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(32).withHour(20).withMinute(21).plusMinutes(275),
    endTime = LocalDateTime.now().minusDays(32).withHour(20).withMinute(21).plusMinutes(275).plusMinutes(39),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(32).withHour(20).withMinute(21).plusMinutes(275).plusMinutes(39),
    endTime = LocalDateTime.now().minusDays(32).withHour(20).withMinute(21).plusMinutes(275).plusMinutes(39).plusMinutes(76),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(32).withHour(20).withMinute(21).plusMinutes(275).plusMinutes(39).plusMinutes(76),
    endTime = LocalDateTime.now().minusDays(32).withHour(20).withMinute(21).plusMinutes(275).plusMinutes(39).plusMinutes(76).plusMinutes(50),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(32).withHour(20).withMinute(21).plusMinutes(275).plusMinutes(39).plusMinutes(76).plusMinutes(50),
    endTime = LocalDateTime.now().minusDays(32).withHour(20).withMinute(21).plusMinutes(275).plusMinutes(39).plusMinutes(76).plusMinutes(50).plusMinutes(54),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 34 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(33),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(33).withHour(23).withMinute(28),
    endTime = LocalDateTime.now().minusDays(33).withHour(23).withMinute(28).plusMinutes(312),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(33).withHour(23).withMinute(28).plusMinutes(312),
    endTime = LocalDateTime.now().minusDays(33).withHour(23).withMinute(28).plusMinutes(312).plusMinutes(36),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(33).withHour(23).withMinute(28).plusMinutes(312).plusMinutes(36),
    endTime = LocalDateTime.now().minusDays(33).withHour(23).withMinute(28).plusMinutes(312).plusMinutes(36).plusMinutes(146),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(33).withHour(23).withMinute(28).plusMinutes(312).plusMinutes(36).plusMinutes(146),
    endTime = LocalDateTime.now().minusDays(33).withHour(23).withMinute(28).plusMinutes(312).plusMinutes(36).plusMinutes(146).plusMinutes(57),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(33).withHour(23).withMinute(28).plusMinutes(312).plusMinutes(36).plusMinutes(146).plusMinutes(57),
    endTime = LocalDateTime.now().minusDays(33).withHour(23).withMinute(28).plusMinutes(312).plusMinutes(36).plusMinutes(146).plusMinutes(57).plusMinutes(46),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 35 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(34),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(34).withHour(23).withMinute(31),
    endTime = LocalDateTime.now().minusDays(34).withHour(23).withMinute(31).plusMinutes(59),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(34).withHour(23).withMinute(31).plusMinutes(59),
    endTime = LocalDateTime.now().minusDays(34).withHour(23).withMinute(31).plusMinutes(59).plusMinutes(51),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(34).withHour(23).withMinute(31).plusMinutes(59).plusMinutes(51),
    endTime = LocalDateTime.now().minusDays(34).withHour(23).withMinute(31).plusMinutes(59).plusMinutes(51).plusMinutes(131),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(34).withHour(23).withMinute(31).plusMinutes(59).plusMinutes(51).plusMinutes(131),
    endTime = LocalDateTime.now().minusDays(34).withHour(23).withMinute(31).plusMinutes(59).plusMinutes(51).plusMinutes(131).plusMinutes(81),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(34).withHour(23).withMinute(31).plusMinutes(59).plusMinutes(51).plusMinutes(131).plusMinutes(81),
    endTime = LocalDateTime.now().minusDays(34).withHour(23).withMinute(31).plusMinutes(59).plusMinutes(51).plusMinutes(131).plusMinutes(81).plusMinutes(31),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 36 - Score: 97
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(35),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(35).withHour(20).withMinute(22),
    endTime = LocalDateTime.now().minusDays(35).withHour(20).withMinute(22).plusMinutes(100),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(35).withHour(20).withMinute(22).plusMinutes(100),
    endTime = LocalDateTime.now().minusDays(35).withHour(20).withMinute(22).plusMinutes(100).plusMinutes(103),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(35).withHour(20).withMinute(22).plusMinutes(100).plusMinutes(103),
    endTime = LocalDateTime.now().minusDays(35).withHour(20).withMinute(22).plusMinutes(100).plusMinutes(103).plusMinutes(53),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(35).withHour(20).withMinute(22).plusMinutes(100).plusMinutes(103).plusMinutes(53),
    endTime = LocalDateTime.now().minusDays(35).withHour(20).withMinute(22).plusMinutes(100).plusMinutes(103).plusMinutes(53).plusMinutes(58),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(35).withHour(20).withMinute(22).plusMinutes(100).plusMinutes(103).plusMinutes(53).plusMinutes(58),
    endTime = LocalDateTime.now().minusDays(35).withHour(20).withMinute(22).plusMinutes(100).plusMinutes(103).plusMinutes(53).plusMinutes(58).plusMinutes(63),
    type = SleepType.Awake
)
                ),
                sleepScore = 97
            ),

            // Day 37 - Score: 95
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(36),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(36).withHour(21).withMinute(1),
    endTime = LocalDateTime.now().minusDays(36).withHour(21).withMinute(1).plusMinutes(148),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(36).withHour(21).withMinute(1).plusMinutes(148),
    endTime = LocalDateTime.now().minusDays(36).withHour(21).withMinute(1).plusMinutes(148).plusMinutes(41),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(36).withHour(21).withMinute(1).plusMinutes(148).plusMinutes(41),
    endTime = LocalDateTime.now().minusDays(36).withHour(21).withMinute(1).plusMinutes(148).plusMinutes(41).plusMinutes(76),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(36).withHour(21).withMinute(1).plusMinutes(148).plusMinutes(41).plusMinutes(76),
    endTime = LocalDateTime.now().minusDays(36).withHour(21).withMinute(1).plusMinutes(148).plusMinutes(41).plusMinutes(76).plusMinutes(89),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(36).withHour(21).withMinute(1).plusMinutes(148).plusMinutes(41).plusMinutes(76).plusMinutes(89),
    endTime = LocalDateTime.now().minusDays(36).withHour(21).withMinute(1).plusMinutes(148).plusMinutes(41).plusMinutes(76).plusMinutes(89).plusMinutes(35),
    type = SleepType.Awake
)
                ),
                sleepScore = 95
            ),

            // Day 38 - Score: 52
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(37),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(37).withHour(22).withMinute(57),
    endTime = LocalDateTime.now().minusDays(37).withHour(22).withMinute(57).plusMinutes(54),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(37).withHour(22).withMinute(57).plusMinutes(54),
    endTime = LocalDateTime.now().minusDays(37).withHour(22).withMinute(57).plusMinutes(54).plusMinutes(70),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(37).withHour(22).withMinute(57).plusMinutes(54).plusMinutes(70),
    endTime = LocalDateTime.now().minusDays(37).withHour(22).withMinute(57).plusMinutes(54).plusMinutes(70).plusMinutes(35),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(37).withHour(22).withMinute(57).plusMinutes(54).plusMinutes(70).plusMinutes(35),
    endTime = LocalDateTime.now().minusDays(37).withHour(22).withMinute(57).plusMinutes(54).plusMinutes(70).plusMinutes(35).plusMinutes(30),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(37).withHour(22).withMinute(57).plusMinutes(54).plusMinutes(70).plusMinutes(35).plusMinutes(30),
    endTime = LocalDateTime.now().minusDays(37).withHour(22).withMinute(57).plusMinutes(54).plusMinutes(70).plusMinutes(35).plusMinutes(30).plusMinutes(30),
    type = SleepType.Awake
)
                ),
                sleepScore = 52
            ),

            // Day 39 - Score: 80
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(38),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(38).withHour(22).withMinute(41),
    endTime = LocalDateTime.now().minusDays(38).withHour(22).withMinute(41).plusMinutes(172),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(38).withHour(22).withMinute(41).plusMinutes(172),
    endTime = LocalDateTime.now().minusDays(38).withHour(22).withMinute(41).plusMinutes(172).plusMinutes(54),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(38).withHour(22).withMinute(41).plusMinutes(172).plusMinutes(54),
    endTime = LocalDateTime.now().minusDays(38).withHour(22).withMinute(41).plusMinutes(172).plusMinutes(54).plusMinutes(55),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(38).withHour(22).withMinute(41).plusMinutes(172).plusMinutes(54).plusMinutes(55),
    endTime = LocalDateTime.now().minusDays(38).withHour(22).withMinute(41).plusMinutes(172).plusMinutes(54).plusMinutes(55).plusMinutes(42),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(38).withHour(22).withMinute(41).plusMinutes(172).plusMinutes(54).plusMinutes(55).plusMinutes(42),
    endTime = LocalDateTime.now().minusDays(38).withHour(22).withMinute(41).plusMinutes(172).plusMinutes(54).plusMinutes(55).plusMinutes(42).plusMinutes(31),
    type = SleepType.Awake
)
                ),
                sleepScore = 80
            ),

            // Day 40 - Score: 90
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(39),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(39).withHour(20).withMinute(33),
    endTime = LocalDateTime.now().minusDays(39).withHour(20).withMinute(33).plusMinutes(112),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(39).withHour(20).withMinute(33).plusMinutes(112),
    endTime = LocalDateTime.now().minusDays(39).withHour(20).withMinute(33).plusMinutes(112).plusMinutes(56),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(39).withHour(20).withMinute(33).plusMinutes(112).plusMinutes(56),
    endTime = LocalDateTime.now().minusDays(39).withHour(20).withMinute(33).plusMinutes(112).plusMinutes(56).plusMinutes(52),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(39).withHour(20).withMinute(33).plusMinutes(112).plusMinutes(56).plusMinutes(52),
    endTime = LocalDateTime.now().minusDays(39).withHour(20).withMinute(33).plusMinutes(112).plusMinutes(56).plusMinutes(52).plusMinutes(82),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(39).withHour(20).withMinute(33).plusMinutes(112).plusMinutes(56).plusMinutes(52).plusMinutes(82),
    endTime = LocalDateTime.now().minusDays(39).withHour(20).withMinute(33).plusMinutes(112).plusMinutes(56).plusMinutes(52).plusMinutes(82).plusMinutes(46),
    type = SleepType.Awake
)
                ),
                sleepScore = 90
            ),

            // Day 41 - Score: 67
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(40),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(40).withHour(23).withMinute(39),
    endTime = LocalDateTime.now().minusDays(40).withHour(23).withMinute(39).plusMinutes(118),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(40).withHour(23).withMinute(39).plusMinutes(118),
    endTime = LocalDateTime.now().minusDays(40).withHour(23).withMinute(39).plusMinutes(118).plusMinutes(48),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(40).withHour(23).withMinute(39).plusMinutes(118).plusMinutes(48),
    endTime = LocalDateTime.now().minusDays(40).withHour(23).withMinute(39).plusMinutes(118).plusMinutes(48).plusMinutes(64),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(40).withHour(23).withMinute(39).plusMinutes(118).plusMinutes(48).plusMinutes(64),
    endTime = LocalDateTime.now().minusDays(40).withHour(23).withMinute(39).plusMinutes(118).plusMinutes(48).plusMinutes(64).plusMinutes(43),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(40).withHour(23).withMinute(39).plusMinutes(118).plusMinutes(48).plusMinutes(64).plusMinutes(43),
    endTime = LocalDateTime.now().minusDays(40).withHour(23).withMinute(39).plusMinutes(118).plusMinutes(48).plusMinutes(64).plusMinutes(43).plusMinutes(49),
    type = SleepType.Awake
)
                ),
                sleepScore = 67
            ),

            // Day 42 - Score: 76
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(41),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(41).withHour(21).withMinute(51),
    endTime = LocalDateTime.now().minusDays(41).withHour(21).withMinute(51).plusMinutes(105),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(41).withHour(21).withMinute(51).plusMinutes(105),
    endTime = LocalDateTime.now().minusDays(41).withHour(21).withMinute(51).plusMinutes(105).plusMinutes(124),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(41).withHour(21).withMinute(51).plusMinutes(105).plusMinutes(124),
    endTime = LocalDateTime.now().minusDays(41).withHour(21).withMinute(51).plusMinutes(105).plusMinutes(124).plusMinutes(34),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(41).withHour(21).withMinute(51).plusMinutes(105).plusMinutes(124).plusMinutes(34),
    endTime = LocalDateTime.now().minusDays(41).withHour(21).withMinute(51).plusMinutes(105).plusMinutes(124).plusMinutes(34).plusMinutes(37),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(41).withHour(21).withMinute(51).plusMinutes(105).plusMinutes(124).plusMinutes(34).plusMinutes(37),
    endTime = LocalDateTime.now().minusDays(41).withHour(21).withMinute(51).plusMinutes(105).plusMinutes(124).plusMinutes(34).plusMinutes(37).plusMinutes(30),
    type = SleepType.Awake
)
                ),
                sleepScore = 76
            ),

            // Day 43 - Score: 74
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(42),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(42).withHour(21).withMinute(19),
    endTime = LocalDateTime.now().minusDays(42).withHour(21).withMinute(19).plusMinutes(38),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(42).withHour(21).withMinute(19).plusMinutes(38),
    endTime = LocalDateTime.now().minusDays(42).withHour(21).withMinute(19).plusMinutes(38).plusMinutes(125),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(42).withHour(21).withMinute(19).plusMinutes(38).plusMinutes(125),
    endTime = LocalDateTime.now().minusDays(42).withHour(21).withMinute(19).plusMinutes(38).plusMinutes(125).plusMinutes(41),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(42).withHour(21).withMinute(19).plusMinutes(38).plusMinutes(125).plusMinutes(41),
    endTime = LocalDateTime.now().minusDays(42).withHour(21).withMinute(19).plusMinutes(38).plusMinutes(125).plusMinutes(41).plusMinutes(70),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(42).withHour(21).withMinute(19).plusMinutes(38).plusMinutes(125).plusMinutes(41).plusMinutes(70),
    endTime = LocalDateTime.now().minusDays(42).withHour(21).withMinute(19).plusMinutes(38).plusMinutes(125).plusMinutes(41).plusMinutes(70).plusMinutes(37),
    type = SleepType.Awake
)
                ),
                sleepScore = 74
            ),

            // Day 44 - Score: 91
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(43),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(43).withHour(20).withMinute(31),
    endTime = LocalDateTime.now().minusDays(43).withHour(20).withMinute(31).plusMinutes(189),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(43).withHour(20).withMinute(31).plusMinutes(189),
    endTime = LocalDateTime.now().minusDays(43).withHour(20).withMinute(31).plusMinutes(189).plusMinutes(109),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(43).withHour(20).withMinute(31).plusMinutes(189).plusMinutes(109),
    endTime = LocalDateTime.now().minusDays(43).withHour(20).withMinute(31).plusMinutes(189).plusMinutes(109).plusMinutes(42),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(43).withHour(20).withMinute(31).plusMinutes(189).plusMinutes(109).plusMinutes(42),
    endTime = LocalDateTime.now().minusDays(43).withHour(20).withMinute(31).plusMinutes(189).plusMinutes(109).plusMinutes(42).plusMinutes(47),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(43).withHour(20).withMinute(31).plusMinutes(189).plusMinutes(109).plusMinutes(42).plusMinutes(47),
    endTime = LocalDateTime.now().minusDays(43).withHour(20).withMinute(31).plusMinutes(189).plusMinutes(109).plusMinutes(42).plusMinutes(47).plusMinutes(54),
    type = SleepType.Awake
)
                ),
                sleepScore = 91
            ),

            // Day 45 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(44),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(44).withHour(21).withMinute(55),
    endTime = LocalDateTime.now().minusDays(44).withHour(21).withMinute(55).plusMinutes(112),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(44).withHour(21).withMinute(55).plusMinutes(112),
    endTime = LocalDateTime.now().minusDays(44).withHour(21).withMinute(55).plusMinutes(112).plusMinutes(36),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(44).withHour(21).withMinute(55).plusMinutes(112).plusMinutes(36),
    endTime = LocalDateTime.now().minusDays(44).withHour(21).withMinute(55).plusMinutes(112).plusMinutes(36).plusMinutes(263),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(44).withHour(21).withMinute(55).plusMinutes(112).plusMinutes(36).plusMinutes(263),
    endTime = LocalDateTime.now().minusDays(44).withHour(21).withMinute(55).plusMinutes(112).plusMinutes(36).plusMinutes(263).plusMinutes(74),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(44).withHour(21).withMinute(55).plusMinutes(112).plusMinutes(36).plusMinutes(263).plusMinutes(74),
    endTime = LocalDateTime.now().minusDays(44).withHour(21).withMinute(55).plusMinutes(112).plusMinutes(36).plusMinutes(263).plusMinutes(74).plusMinutes(71),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 46 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(45),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(45).withHour(22).withMinute(59),
    endTime = LocalDateTime.now().minusDays(45).withHour(22).withMinute(59).plusMinutes(200),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(45).withHour(22).withMinute(59).plusMinutes(200),
    endTime = LocalDateTime.now().minusDays(45).withHour(22).withMinute(59).plusMinutes(200).plusMinutes(102),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(45).withHour(22).withMinute(59).plusMinutes(200).plusMinutes(102),
    endTime = LocalDateTime.now().minusDays(45).withHour(22).withMinute(59).plusMinutes(200).plusMinutes(102).plusMinutes(45),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(45).withHour(22).withMinute(59).plusMinutes(200).plusMinutes(102).plusMinutes(45),
    endTime = LocalDateTime.now().minusDays(45).withHour(22).withMinute(59).plusMinutes(200).plusMinutes(102).plusMinutes(45).plusMinutes(31),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(45).withHour(22).withMinute(59).plusMinutes(200).plusMinutes(102).plusMinutes(45).plusMinutes(31),
    endTime = LocalDateTime.now().minusDays(45).withHour(22).withMinute(59).plusMinutes(200).plusMinutes(102).plusMinutes(45).plusMinutes(31).plusMinutes(97),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 47 - Score: 78
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(46),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(46).withHour(23).withMinute(6),
    endTime = LocalDateTime.now().minusDays(46).withHour(23).withMinute(6).plusMinutes(50),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(46).withHour(23).withMinute(6).plusMinutes(50),
    endTime = LocalDateTime.now().minusDays(46).withHour(23).withMinute(6).plusMinutes(50).plusMinutes(111),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(46).withHour(23).withMinute(6).plusMinutes(50).plusMinutes(111),
    endTime = LocalDateTime.now().minusDays(46).withHour(23).withMinute(6).plusMinutes(50).plusMinutes(111).plusMinutes(72),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(46).withHour(23).withMinute(6).plusMinutes(50).plusMinutes(111).plusMinutes(72),
    endTime = LocalDateTime.now().minusDays(46).withHour(23).withMinute(6).plusMinutes(50).plusMinutes(111).plusMinutes(72).plusMinutes(30),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(46).withHour(23).withMinute(6).plusMinutes(50).plusMinutes(111).plusMinutes(72).plusMinutes(30),
    endTime = LocalDateTime.now().minusDays(46).withHour(23).withMinute(6).plusMinutes(50).plusMinutes(111).plusMinutes(72).plusMinutes(30).plusMinutes(41),
    type = SleepType.Awake
)
                ),
                sleepScore = 78
            ),

            // Day 48 - Score: 58
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(47),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(47).withHour(23).withMinute(12),
    endTime = LocalDateTime.now().minusDays(47).withHour(23).withMinute(12).plusMinutes(87),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(47).withHour(23).withMinute(12).plusMinutes(87),
    endTime = LocalDateTime.now().minusDays(47).withHour(23).withMinute(12).plusMinutes(87).plusMinutes(63),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(47).withHour(23).withMinute(12).plusMinutes(87).plusMinutes(63),
    endTime = LocalDateTime.now().minusDays(47).withHour(23).withMinute(12).plusMinutes(87).plusMinutes(63).plusMinutes(49),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(47).withHour(23).withMinute(12).plusMinutes(87).plusMinutes(63).plusMinutes(49),
    endTime = LocalDateTime.now().minusDays(47).withHour(23).withMinute(12).plusMinutes(87).plusMinutes(63).plusMinutes(49).plusMinutes(35),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(47).withHour(23).withMinute(12).plusMinutes(87).plusMinutes(63).plusMinutes(49).plusMinutes(35),
    endTime = LocalDateTime.now().minusDays(47).withHour(23).withMinute(12).plusMinutes(87).plusMinutes(63).plusMinutes(49).plusMinutes(35).plusMinutes(46),
    type = SleepType.Awake
)
                ),
                sleepScore = 58
            ),

            // Day 49 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(48),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(48).withHour(23).withMinute(57),
    endTime = LocalDateTime.now().minusDays(48).withHour(23).withMinute(57).plusMinutes(330),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(48).withHour(23).withMinute(57).plusMinutes(330),
    endTime = LocalDateTime.now().minusDays(48).withHour(23).withMinute(57).plusMinutes(330).plusMinutes(47),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(48).withHour(23).withMinute(57).plusMinutes(330).plusMinutes(47),
    endTime = LocalDateTime.now().minusDays(48).withHour(23).withMinute(57).plusMinutes(330).plusMinutes(47).plusMinutes(117),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(48).withHour(23).withMinute(57).plusMinutes(330).plusMinutes(47).plusMinutes(117),
    endTime = LocalDateTime.now().minusDays(48).withHour(23).withMinute(57).plusMinutes(330).plusMinutes(47).plusMinutes(117).plusMinutes(35),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(48).withHour(23).withMinute(57).plusMinutes(330).plusMinutes(47).plusMinutes(117).plusMinutes(35),
    endTime = LocalDateTime.now().minusDays(48).withHour(23).withMinute(57).plusMinutes(330).plusMinutes(47).plusMinutes(117).plusMinutes(35).plusMinutes(33),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 50 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(49),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(49).withHour(20).withMinute(1),
    endTime = LocalDateTime.now().minusDays(49).withHour(20).withMinute(1).plusMinutes(136),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(49).withHour(20).withMinute(1).plusMinutes(136),
    endTime = LocalDateTime.now().minusDays(49).withHour(20).withMinute(1).plusMinutes(136).plusMinutes(90),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(49).withHour(20).withMinute(1).plusMinutes(136).plusMinutes(90),
    endTime = LocalDateTime.now().minusDays(49).withHour(20).withMinute(1).plusMinutes(136).plusMinutes(90).plusMinutes(57),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(49).withHour(20).withMinute(1).plusMinutes(136).plusMinutes(90).plusMinutes(57),
    endTime = LocalDateTime.now().minusDays(49).withHour(20).withMinute(1).plusMinutes(136).plusMinutes(90).plusMinutes(57).plusMinutes(66),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(49).withHour(20).withMinute(1).plusMinutes(136).plusMinutes(90).plusMinutes(57).plusMinutes(66),
    endTime = LocalDateTime.now().minusDays(49).withHour(20).withMinute(1).plusMinutes(136).plusMinutes(90).plusMinutes(57).plusMinutes(66).plusMinutes(67),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 51 - Score: 58
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(50),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(50).withHour(23).withMinute(26),
    endTime = LocalDateTime.now().minusDays(50).withHour(23).withMinute(26).plusMinutes(130),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(50).withHour(23).withMinute(26).plusMinutes(130),
    endTime = LocalDateTime.now().minusDays(50).withHour(23).withMinute(26).plusMinutes(130).plusMinutes(39),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(50).withHour(23).withMinute(26).plusMinutes(130).plusMinutes(39),
    endTime = LocalDateTime.now().minusDays(50).withHour(23).withMinute(26).plusMinutes(130).plusMinutes(39).plusMinutes(36),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(50).withHour(23).withMinute(26).plusMinutes(130).plusMinutes(39).plusMinutes(36),
    endTime = LocalDateTime.now().minusDays(50).withHour(23).withMinute(26).plusMinutes(130).plusMinutes(39).plusMinutes(36).plusMinutes(36),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(50).withHour(23).withMinute(26).plusMinutes(130).plusMinutes(39).plusMinutes(36).plusMinutes(36),
    endTime = LocalDateTime.now().minusDays(50).withHour(23).withMinute(26).plusMinutes(130).plusMinutes(39).plusMinutes(36).plusMinutes(36).plusMinutes(39),
    type = SleepType.Awake
)
                ),
                sleepScore = 58
            ),

            // Day 52 - Score: 69
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(51),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(51).withHour(20).withMinute(55),
    endTime = LocalDateTime.now().minusDays(51).withHour(20).withMinute(55).plusMinutes(39),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(51).withHour(20).withMinute(55).plusMinutes(39),
    endTime = LocalDateTime.now().minusDays(51).withHour(20).withMinute(55).plusMinutes(39).plusMinutes(45),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(51).withHour(20).withMinute(55).plusMinutes(39).plusMinutes(45),
    endTime = LocalDateTime.now().minusDays(51).withHour(20).withMinute(55).plusMinutes(39).plusMinutes(45).plusMinutes(103),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(51).withHour(20).withMinute(55).plusMinutes(39).plusMinutes(45).plusMinutes(103),
    endTime = LocalDateTime.now().minusDays(51).withHour(20).withMinute(55).plusMinutes(39).plusMinutes(45).plusMinutes(103).plusMinutes(59),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(51).withHour(20).withMinute(55).plusMinutes(39).plusMinutes(45).plusMinutes(103).plusMinutes(59),
    endTime = LocalDateTime.now().minusDays(51).withHour(20).withMinute(55).plusMinutes(39).plusMinutes(45).plusMinutes(103).plusMinutes(59).plusMinutes(33),
    type = SleepType.Awake
)
                ),
                sleepScore = 69
            ),

            // Day 53 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(52),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(52).withHour(22).withMinute(23),
    endTime = LocalDateTime.now().minusDays(52).withHour(22).withMinute(23).plusMinutes(188),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(52).withHour(22).withMinute(23).plusMinutes(188),
    endTime = LocalDateTime.now().minusDays(52).withHour(22).withMinute(23).plusMinutes(188).plusMinutes(117),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(52).withHour(22).withMinute(23).plusMinutes(188).plusMinutes(117),
    endTime = LocalDateTime.now().minusDays(52).withHour(22).withMinute(23).plusMinutes(188).plusMinutes(117).plusMinutes(34),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(52).withHour(22).withMinute(23).plusMinutes(188).plusMinutes(117).plusMinutes(34),
    endTime = LocalDateTime.now().minusDays(52).withHour(22).withMinute(23).plusMinutes(188).plusMinutes(117).plusMinutes(34).plusMinutes(48),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(52).withHour(22).withMinute(23).plusMinutes(188).plusMinutes(117).plusMinutes(34).plusMinutes(48),
    endTime = LocalDateTime.now().minusDays(52).withHour(22).withMinute(23).plusMinutes(188).plusMinutes(117).plusMinutes(34).plusMinutes(48).plusMinutes(45),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 54 - Score: 65
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(53),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(53).withHour(20).withMinute(8),
    endTime = LocalDateTime.now().minusDays(53).withHour(20).withMinute(8).plusMinutes(47),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(53).withHour(20).withMinute(8).plusMinutes(47),
    endTime = LocalDateTime.now().minusDays(53).withHour(20).withMinute(8).plusMinutes(47).plusMinutes(67),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(53).withHour(20).withMinute(8).plusMinutes(47).plusMinutes(67),
    endTime = LocalDateTime.now().minusDays(53).withHour(20).withMinute(8).plusMinutes(47).plusMinutes(67).plusMinutes(79),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(53).withHour(20).withMinute(8).plusMinutes(47).plusMinutes(67).plusMinutes(79),
    endTime = LocalDateTime.now().minusDays(53).withHour(20).withMinute(8).plusMinutes(47).plusMinutes(67).plusMinutes(79).plusMinutes(56),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(53).withHour(20).withMinute(8).plusMinutes(47).plusMinutes(67).plusMinutes(79).plusMinutes(56),
    endTime = LocalDateTime.now().minusDays(53).withHour(20).withMinute(8).plusMinutes(47).plusMinutes(67).plusMinutes(79).plusMinutes(56).plusMinutes(30),
    type = SleepType.Awake
)
                ),
                sleepScore = 65
            ),

            // Day 55 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(54),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(54).withHour(22).withMinute(29),
    endTime = LocalDateTime.now().minusDays(54).withHour(22).withMinute(29).plusMinutes(238),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(54).withHour(22).withMinute(29).plusMinutes(238),
    endTime = LocalDateTime.now().minusDays(54).withHour(22).withMinute(29).plusMinutes(238).plusMinutes(165),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(54).withHour(22).withMinute(29).plusMinutes(238).plusMinutes(165),
    endTime = LocalDateTime.now().minusDays(54).withHour(22).withMinute(29).plusMinutes(238).plusMinutes(165).plusMinutes(42),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(54).withHour(22).withMinute(29).plusMinutes(238).plusMinutes(165).plusMinutes(42),
    endTime = LocalDateTime.now().minusDays(54).withHour(22).withMinute(29).plusMinutes(238).plusMinutes(165).plusMinutes(42).plusMinutes(75),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(54).withHour(22).withMinute(29).plusMinutes(238).plusMinutes(165).plusMinutes(42).plusMinutes(75),
    endTime = LocalDateTime.now().minusDays(54).withHour(22).withMinute(29).plusMinutes(238).plusMinutes(165).plusMinutes(42).plusMinutes(75).plusMinutes(49),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 56 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(55),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(55).withHour(22).withMinute(16),
    endTime = LocalDateTime.now().minusDays(55).withHour(22).withMinute(16).plusMinutes(114),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(55).withHour(22).withMinute(16).plusMinutes(114),
    endTime = LocalDateTime.now().minusDays(55).withHour(22).withMinute(16).plusMinutes(114).plusMinutes(178),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(55).withHour(22).withMinute(16).plusMinutes(114).plusMinutes(178),
    endTime = LocalDateTime.now().minusDays(55).withHour(22).withMinute(16).plusMinutes(114).plusMinutes(178).plusMinutes(47),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(55).withHour(22).withMinute(16).plusMinutes(114).plusMinutes(178).plusMinutes(47),
    endTime = LocalDateTime.now().minusDays(55).withHour(22).withMinute(16).plusMinutes(114).plusMinutes(178).plusMinutes(47).plusMinutes(45),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(55).withHour(22).withMinute(16).plusMinutes(114).plusMinutes(178).plusMinutes(47).plusMinutes(45),
    endTime = LocalDateTime.now().minusDays(55).withHour(22).withMinute(16).plusMinutes(114).plusMinutes(178).plusMinutes(47).plusMinutes(45).plusMinutes(41),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 57 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(56),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(56).withHour(20).withMinute(0),
    endTime = LocalDateTime.now().minusDays(56).withHour(20).withMinute(0).plusMinutes(149),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(56).withHour(20).withMinute(0).plusMinutes(149),
    endTime = LocalDateTime.now().minusDays(56).withHour(20).withMinute(0).plusMinutes(149).plusMinutes(119),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(56).withHour(20).withMinute(0).plusMinutes(149).plusMinutes(119),
    endTime = LocalDateTime.now().minusDays(56).withHour(20).withMinute(0).plusMinutes(149).plusMinutes(119).plusMinutes(34),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(56).withHour(20).withMinute(0).plusMinutes(149).plusMinutes(119).plusMinutes(34),
    endTime = LocalDateTime.now().minusDays(56).withHour(20).withMinute(0).plusMinutes(149).plusMinutes(119).plusMinutes(34).plusMinutes(77),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(56).withHour(20).withMinute(0).plusMinutes(149).plusMinutes(119).plusMinutes(34).plusMinutes(77),
    endTime = LocalDateTime.now().minusDays(56).withHour(20).withMinute(0).plusMinutes(149).plusMinutes(119).plusMinutes(34).plusMinutes(77).plusMinutes(113),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 58 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(57),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(57).withHour(23).withMinute(5),
    endTime = LocalDateTime.now().minusDays(57).withHour(23).withMinute(5).plusMinutes(126),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(57).withHour(23).withMinute(5).plusMinutes(126),
    endTime = LocalDateTime.now().minusDays(57).withHour(23).withMinute(5).plusMinutes(126).plusMinutes(50),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(57).withHour(23).withMinute(5).plusMinutes(126).plusMinutes(50),
    endTime = LocalDateTime.now().minusDays(57).withHour(23).withMinute(5).plusMinutes(126).plusMinutes(50).plusMinutes(77),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(57).withHour(23).withMinute(5).plusMinutes(126).plusMinutes(50).plusMinutes(77),
    endTime = LocalDateTime.now().minusDays(57).withHour(23).withMinute(5).plusMinutes(126).plusMinutes(50).plusMinutes(77).plusMinutes(53),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(57).withHour(23).withMinute(5).plusMinutes(126).plusMinutes(50).plusMinutes(77).plusMinutes(53),
    endTime = LocalDateTime.now().minusDays(57).withHour(23).withMinute(5).plusMinutes(126).plusMinutes(50).plusMinutes(77).plusMinutes(53).plusMinutes(60),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 59 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(58),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(58).withHour(22).withMinute(9),
    endTime = LocalDateTime.now().minusDays(58).withHour(22).withMinute(9).plusMinutes(225),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(58).withHour(22).withMinute(9).plusMinutes(225),
    endTime = LocalDateTime.now().minusDays(58).withHour(22).withMinute(9).plusMinutes(225).plusMinutes(138),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(58).withHour(22).withMinute(9).plusMinutes(225).plusMinutes(138),
    endTime = LocalDateTime.now().minusDays(58).withHour(22).withMinute(9).plusMinutes(225).plusMinutes(138).plusMinutes(58),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(58).withHour(22).withMinute(9).plusMinutes(225).plusMinutes(138).plusMinutes(58),
    endTime = LocalDateTime.now().minusDays(58).withHour(22).withMinute(9).plusMinutes(225).plusMinutes(138).plusMinutes(58).plusMinutes(42),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(58).withHour(22).withMinute(9).plusMinutes(225).plusMinutes(138).plusMinutes(58).plusMinutes(42),
    endTime = LocalDateTime.now().minusDays(58).withHour(22).withMinute(9).plusMinutes(225).plusMinutes(138).plusMinutes(58).plusMinutes(42).plusMinutes(32),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 60 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(59),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(59).withHour(21).withMinute(5),
    endTime = LocalDateTime.now().minusDays(59).withHour(21).withMinute(5).plusMinutes(222),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(59).withHour(21).withMinute(5).plusMinutes(222),
    endTime = LocalDateTime.now().minusDays(59).withHour(21).withMinute(5).plusMinutes(222).plusMinutes(95),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(59).withHour(21).withMinute(5).plusMinutes(222).plusMinutes(95),
    endTime = LocalDateTime.now().minusDays(59).withHour(21).withMinute(5).plusMinutes(222).plusMinutes(95).plusMinutes(83),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(59).withHour(21).withMinute(5).plusMinutes(222).plusMinutes(95).plusMinutes(83),
    endTime = LocalDateTime.now().minusDays(59).withHour(21).withMinute(5).plusMinutes(222).plusMinutes(95).plusMinutes(83).plusMinutes(31),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(59).withHour(21).withMinute(5).plusMinutes(222).plusMinutes(95).plusMinutes(83).plusMinutes(31),
    endTime = LocalDateTime.now().minusDays(59).withHour(21).withMinute(5).plusMinutes(222).plusMinutes(95).plusMinutes(83).plusMinutes(31).plusMinutes(36),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 61 - Score: 50
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(60),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(60).withHour(22).withMinute(13),
    endTime = LocalDateTime.now().minusDays(60).withHour(22).withMinute(13).plusMinutes(83),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(60).withHour(22).withMinute(13).plusMinutes(83),
    endTime = LocalDateTime.now().minusDays(60).withHour(22).withMinute(13).plusMinutes(83).plusMinutes(65),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(60).withHour(22).withMinute(13).plusMinutes(83).plusMinutes(65),
    endTime = LocalDateTime.now().minusDays(60).withHour(22).withMinute(13).plusMinutes(83).plusMinutes(65).plusMinutes(36),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(60).withHour(22).withMinute(13).plusMinutes(83).plusMinutes(65).plusMinutes(36),
    endTime = LocalDateTime.now().minusDays(60).withHour(22).withMinute(13).plusMinutes(83).plusMinutes(65).plusMinutes(36).plusMinutes(56),
    type = SleepType.Deep
)
                ),
                sleepScore = 50
            ),

            // Day 62 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(61),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(61).withHour(20).withMinute(24),
    endTime = LocalDateTime.now().minusDays(61).withHour(20).withMinute(24).plusMinutes(126),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(61).withHour(20).withMinute(24).plusMinutes(126),
    endTime = LocalDateTime.now().minusDays(61).withHour(20).withMinute(24).plusMinutes(126).plusMinutes(197),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(61).withHour(20).withMinute(24).plusMinutes(126).plusMinutes(197),
    endTime = LocalDateTime.now().minusDays(61).withHour(20).withMinute(24).plusMinutes(126).plusMinutes(197).plusMinutes(70),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(61).withHour(20).withMinute(24).plusMinutes(126).plusMinutes(197).plusMinutes(70),
    endTime = LocalDateTime.now().minusDays(61).withHour(20).withMinute(24).plusMinutes(126).plusMinutes(197).plusMinutes(70).plusMinutes(33),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(61).withHour(20).withMinute(24).plusMinutes(126).plusMinutes(197).plusMinutes(70).plusMinutes(33),
    endTime = LocalDateTime.now().minusDays(61).withHour(20).withMinute(24).plusMinutes(126).plusMinutes(197).plusMinutes(70).plusMinutes(33).plusMinutes(65),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 63 - Score: 50
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(62),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(62).withHour(21).withMinute(13),
    endTime = LocalDateTime.now().minusDays(62).withHour(21).withMinute(13).plusMinutes(50),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(62).withHour(21).withMinute(13).plusMinutes(50),
    endTime = LocalDateTime.now().minusDays(62).withHour(21).withMinute(13).plusMinutes(50).plusMinutes(32),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(62).withHour(21).withMinute(13).plusMinutes(50).plusMinutes(32),
    endTime = LocalDateTime.now().minusDays(62).withHour(21).withMinute(13).plusMinutes(50).plusMinutes(32).plusMinutes(33),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(62).withHour(21).withMinute(13).plusMinutes(50).plusMinutes(32).plusMinutes(33),
    endTime = LocalDateTime.now().minusDays(62).withHour(21).withMinute(13).plusMinutes(50).plusMinutes(32).plusMinutes(33).plusMinutes(48),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(62).withHour(21).withMinute(13).plusMinutes(50).plusMinutes(32).plusMinutes(33).plusMinutes(48),
    endTime = LocalDateTime.now().minusDays(62).withHour(21).withMinute(13).plusMinutes(50).plusMinutes(32).plusMinutes(33).plusMinutes(48).plusMinutes(33),
    type = SleepType.Awake
)
                ),
                sleepScore = 50
            ),

            // Day 64 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(63),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(63).withHour(22).withMinute(29),
    endTime = LocalDateTime.now().minusDays(63).withHour(22).withMinute(29).plusMinutes(42),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(63).withHour(22).withMinute(29).plusMinutes(42),
    endTime = LocalDateTime.now().minusDays(63).withHour(22).withMinute(29).plusMinutes(42).plusMinutes(110),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(63).withHour(22).withMinute(29).plusMinutes(42).plusMinutes(110),
    endTime = LocalDateTime.now().minusDays(63).withHour(22).withMinute(29).plusMinutes(42).plusMinutes(110).plusMinutes(222),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(63).withHour(22).withMinute(29).plusMinutes(42).plusMinutes(110).plusMinutes(222),
    endTime = LocalDateTime.now().minusDays(63).withHour(22).withMinute(29).plusMinutes(42).plusMinutes(110).plusMinutes(222).plusMinutes(108),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(63).withHour(22).withMinute(29).plusMinutes(42).plusMinutes(110).plusMinutes(222).plusMinutes(108),
    endTime = LocalDateTime.now().minusDays(63).withHour(22).withMinute(29).plusMinutes(42).plusMinutes(110).plusMinutes(222).plusMinutes(108).plusMinutes(61),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 65 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(64),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(64).withHour(23).withMinute(41),
    endTime = LocalDateTime.now().minusDays(64).withHour(23).withMinute(41).plusMinutes(60),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(64).withHour(23).withMinute(41).plusMinutes(60),
    endTime = LocalDateTime.now().minusDays(64).withHour(23).withMinute(41).plusMinutes(60).plusMinutes(89),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(64).withHour(23).withMinute(41).plusMinutes(60).plusMinutes(89),
    endTime = LocalDateTime.now().minusDays(64).withHour(23).withMinute(41).plusMinutes(60).plusMinutes(89).plusMinutes(196),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(64).withHour(23).withMinute(41).plusMinutes(60).plusMinutes(89).plusMinutes(196),
    endTime = LocalDateTime.now().minusDays(64).withHour(23).withMinute(41).plusMinutes(60).plusMinutes(89).plusMinutes(196).plusMinutes(50),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(64).withHour(23).withMinute(41).plusMinutes(60).plusMinutes(89).plusMinutes(196).plusMinutes(50),
    endTime = LocalDateTime.now().minusDays(64).withHour(23).withMinute(41).plusMinutes(60).plusMinutes(89).plusMinutes(196).plusMinutes(50).plusMinutes(86),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 66 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(65),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(65).withHour(20).withMinute(11),
    endTime = LocalDateTime.now().minusDays(65).withHour(20).withMinute(11).plusMinutes(101),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(65).withHour(20).withMinute(11).plusMinutes(101),
    endTime = LocalDateTime.now().minusDays(65).withHour(20).withMinute(11).plusMinutes(101).plusMinutes(67),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(65).withHour(20).withMinute(11).plusMinutes(101).plusMinutes(67),
    endTime = LocalDateTime.now().minusDays(65).withHour(20).withMinute(11).plusMinutes(101).plusMinutes(67).plusMinutes(125),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(65).withHour(20).withMinute(11).plusMinutes(101).plusMinutes(67).plusMinutes(125),
    endTime = LocalDateTime.now().minusDays(65).withHour(20).withMinute(11).plusMinutes(101).plusMinutes(67).plusMinutes(125).plusMinutes(52),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(65).withHour(20).withMinute(11).plusMinutes(101).plusMinutes(67).plusMinutes(125).plusMinutes(52),
    endTime = LocalDateTime.now().minusDays(65).withHour(20).withMinute(11).plusMinutes(101).plusMinutes(67).plusMinutes(125).plusMinutes(52).plusMinutes(51),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 67 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(66),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(66).withHour(20).withMinute(32),
    endTime = LocalDateTime.now().minusDays(66).withHour(20).withMinute(32).plusMinutes(189),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(66).withHour(20).withMinute(32).plusMinutes(189),
    endTime = LocalDateTime.now().minusDays(66).withHour(20).withMinute(32).plusMinutes(189).plusMinutes(208),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(66).withHour(20).withMinute(32).plusMinutes(189).plusMinutes(208),
    endTime = LocalDateTime.now().minusDays(66).withHour(20).withMinute(32).plusMinutes(189).plusMinutes(208).plusMinutes(74),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(66).withHour(20).withMinute(32).plusMinutes(189).plusMinutes(208).plusMinutes(74),
    endTime = LocalDateTime.now().minusDays(66).withHour(20).withMinute(32).plusMinutes(189).plusMinutes(208).plusMinutes(74).plusMinutes(46),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(66).withHour(20).withMinute(32).plusMinutes(189).plusMinutes(208).plusMinutes(74).plusMinutes(46),
    endTime = LocalDateTime.now().minusDays(66).withHour(20).withMinute(32).plusMinutes(189).plusMinutes(208).plusMinutes(74).plusMinutes(46).plusMinutes(53),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 68 - Score: 63
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(67),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(67).withHour(21).withMinute(13),
    endTime = LocalDateTime.now().minusDays(67).withHour(21).withMinute(13).plusMinutes(130),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(67).withHour(21).withMinute(13).plusMinutes(130),
    endTime = LocalDateTime.now().minusDays(67).withHour(21).withMinute(13).plusMinutes(130).plusMinutes(79),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(67).withHour(21).withMinute(13).plusMinutes(130).plusMinutes(79),
    endTime = LocalDateTime.now().minusDays(67).withHour(21).withMinute(13).plusMinutes(130).plusMinutes(79).plusMinutes(34),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(67).withHour(21).withMinute(13).plusMinutes(130).plusMinutes(79).plusMinutes(34),
    endTime = LocalDateTime.now().minusDays(67).withHour(21).withMinute(13).plusMinutes(130).plusMinutes(79).plusMinutes(34).plusMinutes(30),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(67).withHour(21).withMinute(13).plusMinutes(130).plusMinutes(79).plusMinutes(34).plusMinutes(30),
    endTime = LocalDateTime.now().minusDays(67).withHour(21).withMinute(13).plusMinutes(130).plusMinutes(79).plusMinutes(34).plusMinutes(30).plusMinutes(32),
    type = SleepType.Awake
)
                ),
                sleepScore = 63
            ),

            // Day 69 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(68),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(68).withHour(21).withMinute(52),
    endTime = LocalDateTime.now().minusDays(68).withHour(21).withMinute(52).plusMinutes(189),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(68).withHour(21).withMinute(52).plusMinutes(189),
    endTime = LocalDateTime.now().minusDays(68).withHour(21).withMinute(52).plusMinutes(189).plusMinutes(185),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(68).withHour(21).withMinute(52).plusMinutes(189).plusMinutes(185),
    endTime = LocalDateTime.now().minusDays(68).withHour(21).withMinute(52).plusMinutes(189).plusMinutes(185).plusMinutes(95),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(68).withHour(21).withMinute(52).plusMinutes(189).plusMinutes(185).plusMinutes(95),
    endTime = LocalDateTime.now().minusDays(68).withHour(21).withMinute(52).plusMinutes(189).plusMinutes(185).plusMinutes(95).plusMinutes(37),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(68).withHour(21).withMinute(52).plusMinutes(189).plusMinutes(185).plusMinutes(95).plusMinutes(37),
    endTime = LocalDateTime.now().minusDays(68).withHour(21).withMinute(52).plusMinutes(189).plusMinutes(185).plusMinutes(95).plusMinutes(37).plusMinutes(34),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 70 - Score: 63
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(69),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(69).withHour(20).withMinute(43),
    endTime = LocalDateTime.now().minusDays(69).withHour(20).withMinute(43).plusMinutes(62),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(69).withHour(20).withMinute(43).plusMinutes(62),
    endTime = LocalDateTime.now().minusDays(69).withHour(20).withMinute(43).plusMinutes(62).plusMinutes(76),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(69).withHour(20).withMinute(43).plusMinutes(62).plusMinutes(76),
    endTime = LocalDateTime.now().minusDays(69).withHour(20).withMinute(43).plusMinutes(62).plusMinutes(76).plusMinutes(32),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(69).withHour(20).withMinute(43).plusMinutes(62).plusMinutes(76).plusMinutes(32),
    endTime = LocalDateTime.now().minusDays(69).withHour(20).withMinute(43).plusMinutes(62).plusMinutes(76).plusMinutes(32).plusMinutes(56),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(69).withHour(20).withMinute(43).plusMinutes(62).plusMinutes(76).plusMinutes(32).plusMinutes(56),
    endTime = LocalDateTime.now().minusDays(69).withHour(20).withMinute(43).plusMinutes(62).plusMinutes(76).plusMinutes(32).plusMinutes(56).plusMinutes(38),
    type = SleepType.Awake
)
                ),
                sleepScore = 63
            ),

            // Day 71 - Score: 87
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(70),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(70).withHour(21).withMinute(30),
    endTime = LocalDateTime.now().minusDays(70).withHour(21).withMinute(30).plusMinutes(38),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(70).withHour(21).withMinute(30).plusMinutes(38),
    endTime = LocalDateTime.now().minusDays(70).withHour(21).withMinute(30).plusMinutes(38).plusMinutes(40),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(70).withHour(21).withMinute(30).plusMinutes(38).plusMinutes(40),
    endTime = LocalDateTime.now().minusDays(70).withHour(21).withMinute(30).plusMinutes(38).plusMinutes(40).plusMinutes(147),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(70).withHour(21).withMinute(30).plusMinutes(38).plusMinutes(40).plusMinutes(147),
    endTime = LocalDateTime.now().minusDays(70).withHour(21).withMinute(30).plusMinutes(38).plusMinutes(40).plusMinutes(147).plusMinutes(58),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(70).withHour(21).withMinute(30).plusMinutes(38).plusMinutes(40).plusMinutes(147).plusMinutes(58),
    endTime = LocalDateTime.now().minusDays(70).withHour(21).withMinute(30).plusMinutes(38).plusMinutes(40).plusMinutes(147).plusMinutes(58).plusMinutes(49),
    type = SleepType.Awake
)
                ),
                sleepScore = 87
            ),

            // Day 72 - Score: 76
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(71),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(71).withHour(23).withMinute(47),
    endTime = LocalDateTime.now().minusDays(71).withHour(23).withMinute(47).plusMinutes(166),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(71).withHour(23).withMinute(47).plusMinutes(166),
    endTime = LocalDateTime.now().minusDays(71).withHour(23).withMinute(47).plusMinutes(166).plusMinutes(69),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(71).withHour(23).withMinute(47).plusMinutes(166).plusMinutes(69),
    endTime = LocalDateTime.now().minusDays(71).withHour(23).withMinute(47).plusMinutes(166).plusMinutes(69).plusMinutes(33),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(71).withHour(23).withMinute(47).plusMinutes(166).plusMinutes(69).plusMinutes(33),
    endTime = LocalDateTime.now().minusDays(71).withHour(23).withMinute(47).plusMinutes(166).plusMinutes(69).plusMinutes(33).plusMinutes(35),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(71).withHour(23).withMinute(47).plusMinutes(166).plusMinutes(69).plusMinutes(33).plusMinutes(35),
    endTime = LocalDateTime.now().minusDays(71).withHour(23).withMinute(47).plusMinutes(166).plusMinutes(69).plusMinutes(33).plusMinutes(35).plusMinutes(30),
    type = SleepType.Awake
)
                ),
                sleepScore = 76
            ),

            // Day 73 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(72),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(72).withHour(23).withMinute(27),
    endTime = LocalDateTime.now().minusDays(72).withHour(23).withMinute(27).plusMinutes(277),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(72).withHour(23).withMinute(27).plusMinutes(277),
    endTime = LocalDateTime.now().minusDays(72).withHour(23).withMinute(27).plusMinutes(277).plusMinutes(191),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(72).withHour(23).withMinute(27).plusMinutes(277).plusMinutes(191),
    endTime = LocalDateTime.now().minusDays(72).withHour(23).withMinute(27).plusMinutes(277).plusMinutes(191).plusMinutes(62),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(72).withHour(23).withMinute(27).plusMinutes(277).plusMinutes(191).plusMinutes(62),
    endTime = LocalDateTime.now().minusDays(72).withHour(23).withMinute(27).plusMinutes(277).plusMinutes(191).plusMinutes(62).plusMinutes(38),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(72).withHour(23).withMinute(27).plusMinutes(277).plusMinutes(191).plusMinutes(62).plusMinutes(38),
    endTime = LocalDateTime.now().minusDays(72).withHour(23).withMinute(27).plusMinutes(277).plusMinutes(191).plusMinutes(62).plusMinutes(38).plusMinutes(47),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 74 - Score: 58
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(73),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(73).withHour(23).withMinute(54),
    endTime = LocalDateTime.now().minusDays(73).withHour(23).withMinute(54).plusMinutes(68),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(73).withHour(23).withMinute(54).plusMinutes(68),
    endTime = LocalDateTime.now().minusDays(73).withHour(23).withMinute(54).plusMinutes(68).plusMinutes(65),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(73).withHour(23).withMinute(54).plusMinutes(68).plusMinutes(65),
    endTime = LocalDateTime.now().minusDays(73).withHour(23).withMinute(54).plusMinutes(68).plusMinutes(65).plusMinutes(38),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(73).withHour(23).withMinute(54).plusMinutes(68).plusMinutes(65).plusMinutes(38),
    endTime = LocalDateTime.now().minusDays(73).withHour(23).withMinute(54).plusMinutes(68).plusMinutes(65).plusMinutes(38).plusMinutes(32),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(73).withHour(23).withMinute(54).plusMinutes(68).plusMinutes(65).plusMinutes(38).plusMinutes(32),
    endTime = LocalDateTime.now().minusDays(73).withHour(23).withMinute(54).plusMinutes(68).plusMinutes(65).plusMinutes(38).plusMinutes(32).plusMinutes(38),
    type = SleepType.Awake
)
                ),
                sleepScore = 58
            ),

            // Day 75 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(74),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(74).withHour(21).withMinute(44),
    endTime = LocalDateTime.now().minusDays(74).withHour(21).withMinute(44).plusMinutes(102),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(74).withHour(21).withMinute(44).plusMinutes(102),
    endTime = LocalDateTime.now().minusDays(74).withHour(21).withMinute(44).plusMinutes(102).plusMinutes(222),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(74).withHour(21).withMinute(44).plusMinutes(102).plusMinutes(222),
    endTime = LocalDateTime.now().minusDays(74).withHour(21).withMinute(44).plusMinutes(102).plusMinutes(222).plusMinutes(86),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(74).withHour(21).withMinute(44).plusMinutes(102).plusMinutes(222).plusMinutes(86),
    endTime = LocalDateTime.now().minusDays(74).withHour(21).withMinute(44).plusMinutes(102).plusMinutes(222).plusMinutes(86).plusMinutes(100),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(74).withHour(21).withMinute(44).plusMinutes(102).plusMinutes(222).plusMinutes(86).plusMinutes(100),
    endTime = LocalDateTime.now().minusDays(74).withHour(21).withMinute(44).plusMinutes(102).plusMinutes(222).plusMinutes(86).plusMinutes(100).plusMinutes(41),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 76 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(75),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(75).withHour(21).withMinute(45),
    endTime = LocalDateTime.now().minusDays(75).withHour(21).withMinute(45).plusMinutes(153),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(75).withHour(21).withMinute(45).plusMinutes(153),
    endTime = LocalDateTime.now().minusDays(75).withHour(21).withMinute(45).plusMinutes(153).plusMinutes(263),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(75).withHour(21).withMinute(45).plusMinutes(153).plusMinutes(263),
    endTime = LocalDateTime.now().minusDays(75).withHour(21).withMinute(45).plusMinutes(153).plusMinutes(263).plusMinutes(112),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(75).withHour(21).withMinute(45).plusMinutes(153).plusMinutes(263).plusMinutes(112),
    endTime = LocalDateTime.now().minusDays(75).withHour(21).withMinute(45).plusMinutes(153).plusMinutes(263).plusMinutes(112).plusMinutes(40),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(75).withHour(21).withMinute(45).plusMinutes(153).plusMinutes(263).plusMinutes(112).plusMinutes(40),
    endTime = LocalDateTime.now().minusDays(75).withHour(21).withMinute(45).plusMinutes(153).plusMinutes(263).plusMinutes(112).plusMinutes(40).plusMinutes(40),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 77 - Score: 71
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(76),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(76).withHour(20).withMinute(12),
    endTime = LocalDateTime.now().minusDays(76).withHour(20).withMinute(12).plusMinutes(169),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(76).withHour(20).withMinute(12).plusMinutes(169),
    endTime = LocalDateTime.now().minusDays(76).withHour(20).withMinute(12).plusMinutes(169).plusMinutes(37),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(76).withHour(20).withMinute(12).plusMinutes(169).plusMinutes(37),
    endTime = LocalDateTime.now().minusDays(76).withHour(20).withMinute(12).plusMinutes(169).plusMinutes(37).plusMinutes(30),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(76).withHour(20).withMinute(12).plusMinutes(169).plusMinutes(37).plusMinutes(30),
    endTime = LocalDateTime.now().minusDays(76).withHour(20).withMinute(12).plusMinutes(169).plusMinutes(37).plusMinutes(30).plusMinutes(40),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(76).withHour(20).withMinute(12).plusMinutes(169).plusMinutes(37).plusMinutes(30).plusMinutes(40),
    endTime = LocalDateTime.now().minusDays(76).withHour(20).withMinute(12).plusMinutes(169).plusMinutes(37).plusMinutes(30).plusMinutes(40).plusMinutes(31),
    type = SleepType.Awake
)
                ),
                sleepScore = 71
            ),

            // Day 78 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(77),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(77).withHour(21).withMinute(10),
    endTime = LocalDateTime.now().minusDays(77).withHour(21).withMinute(10).plusMinutes(127),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(77).withHour(21).withMinute(10).plusMinutes(127),
    endTime = LocalDateTime.now().minusDays(77).withHour(21).withMinute(10).plusMinutes(127).plusMinutes(154),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(77).withHour(21).withMinute(10).plusMinutes(127).plusMinutes(154),
    endTime = LocalDateTime.now().minusDays(77).withHour(21).withMinute(10).plusMinutes(127).plusMinutes(154).plusMinutes(49),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(77).withHour(21).withMinute(10).plusMinutes(127).plusMinutes(154).plusMinutes(49),
    endTime = LocalDateTime.now().minusDays(77).withHour(21).withMinute(10).plusMinutes(127).plusMinutes(154).plusMinutes(49).plusMinutes(31),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(77).withHour(21).withMinute(10).plusMinutes(127).plusMinutes(154).plusMinutes(49).plusMinutes(31),
    endTime = LocalDateTime.now().minusDays(77).withHour(21).withMinute(10).plusMinutes(127).plusMinutes(154).plusMinutes(49).plusMinutes(31).plusMinutes(34),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 79 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(78),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(78).withHour(21).withMinute(38),
    endTime = LocalDateTime.now().minusDays(78).withHour(21).withMinute(38).plusMinutes(277),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(78).withHour(21).withMinute(38).plusMinutes(277),
    endTime = LocalDateTime.now().minusDays(78).withHour(21).withMinute(38).plusMinutes(277).plusMinutes(45),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(78).withHour(21).withMinute(38).plusMinutes(277).plusMinutes(45),
    endTime = LocalDateTime.now().minusDays(78).withHour(21).withMinute(38).plusMinutes(277).plusMinutes(45).plusMinutes(91),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(78).withHour(21).withMinute(38).plusMinutes(277).plusMinutes(45).plusMinutes(91),
    endTime = LocalDateTime.now().minusDays(78).withHour(21).withMinute(38).plusMinutes(277).plusMinutes(45).plusMinutes(91).plusMinutes(63),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(78).withHour(21).withMinute(38).plusMinutes(277).plusMinutes(45).plusMinutes(91).plusMinutes(63),
    endTime = LocalDateTime.now().minusDays(78).withHour(21).withMinute(38).plusMinutes(277).plusMinutes(45).plusMinutes(91).plusMinutes(63).plusMinutes(62),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 80 - Score: 53
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(79),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(79).withHour(21).withMinute(57),
    endTime = LocalDateTime.now().minusDays(79).withHour(21).withMinute(57).plusMinutes(40),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(79).withHour(21).withMinute(57).plusMinutes(40),
    endTime = LocalDateTime.now().minusDays(79).withHour(21).withMinute(57).plusMinutes(40).plusMinutes(52),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(79).withHour(21).withMinute(57).plusMinutes(40).plusMinutes(52),
    endTime = LocalDateTime.now().minusDays(79).withHour(21).withMinute(57).plusMinutes(40).plusMinutes(52).plusMinutes(37),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(79).withHour(21).withMinute(57).plusMinutes(40).plusMinutes(52).plusMinutes(37),
    endTime = LocalDateTime.now().minusDays(79).withHour(21).withMinute(57).plusMinutes(40).plusMinutes(52).plusMinutes(37).plusMinutes(33),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(79).withHour(21).withMinute(57).plusMinutes(40).plusMinutes(52).plusMinutes(37).plusMinutes(33),
    endTime = LocalDateTime.now().minusDays(79).withHour(21).withMinute(57).plusMinutes(40).plusMinutes(52).plusMinutes(37).plusMinutes(33).plusMinutes(44),
    type = SleepType.Awake
)
                ),
                sleepScore = 53
            ),

            // Day 81 - Score: 52
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(80),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(80).withHour(23).withMinute(37),
    endTime = LocalDateTime.now().minusDays(80).withHour(23).withMinute(37).plusMinutes(113),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(80).withHour(23).withMinute(37).plusMinutes(113),
    endTime = LocalDateTime.now().minusDays(80).withHour(23).withMinute(37).plusMinutes(113).plusMinutes(39),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(80).withHour(23).withMinute(37).plusMinutes(113).plusMinutes(39),
    endTime = LocalDateTime.now().minusDays(80).withHour(23).withMinute(37).plusMinutes(113).plusMinutes(39).plusMinutes(41),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(80).withHour(23).withMinute(37).plusMinutes(113).plusMinutes(39).plusMinutes(41),
    endTime = LocalDateTime.now().minusDays(80).withHour(23).withMinute(37).plusMinutes(113).plusMinutes(39).plusMinutes(41).plusMinutes(59),
    type = SleepType.Deep
)
                ),
                sleepScore = 52
            ),

            // Day 82 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(81),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(81).withHour(20).withMinute(47),
    endTime = LocalDateTime.now().minusDays(81).withHour(20).withMinute(47).plusMinutes(263),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(81).withHour(20).withMinute(47).plusMinutes(263),
    endTime = LocalDateTime.now().minusDays(81).withHour(20).withMinute(47).plusMinutes(263).plusMinutes(135),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(81).withHour(20).withMinute(47).plusMinutes(263).plusMinutes(135),
    endTime = LocalDateTime.now().minusDays(81).withHour(20).withMinute(47).plusMinutes(263).plusMinutes(135).plusMinutes(66),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(81).withHour(20).withMinute(47).plusMinutes(263).plusMinutes(135).plusMinutes(66),
    endTime = LocalDateTime.now().minusDays(81).withHour(20).withMinute(47).plusMinutes(263).plusMinutes(135).plusMinutes(66).plusMinutes(30),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(81).withHour(20).withMinute(47).plusMinutes(263).plusMinutes(135).plusMinutes(66).plusMinutes(30),
    endTime = LocalDateTime.now().minusDays(81).withHour(20).withMinute(47).plusMinutes(263).plusMinutes(135).plusMinutes(66).plusMinutes(30).plusMinutes(30),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 83 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(82),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(82).withHour(23).withMinute(12),
    endTime = LocalDateTime.now().minusDays(82).withHour(23).withMinute(12).plusMinutes(210),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(82).withHour(23).withMinute(12).plusMinutes(210),
    endTime = LocalDateTime.now().minusDays(82).withHour(23).withMinute(12).plusMinutes(210).plusMinutes(77),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(82).withHour(23).withMinute(12).plusMinutes(210).plusMinutes(77),
    endTime = LocalDateTime.now().minusDays(82).withHour(23).withMinute(12).plusMinutes(210).plusMinutes(77).plusMinutes(57),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(82).withHour(23).withMinute(12).plusMinutes(210).plusMinutes(77).plusMinutes(57),
    endTime = LocalDateTime.now().minusDays(82).withHour(23).withMinute(12).plusMinutes(210).plusMinutes(77).plusMinutes(57).plusMinutes(70),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(82).withHour(23).withMinute(12).plusMinutes(210).plusMinutes(77).plusMinutes(57).plusMinutes(70),
    endTime = LocalDateTime.now().minusDays(82).withHour(23).withMinute(12).plusMinutes(210).plusMinutes(77).plusMinutes(57).plusMinutes(70).plusMinutes(82),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 84 - Score: 87
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(83),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(83).withHour(23).withMinute(59),
    endTime = LocalDateTime.now().minusDays(83).withHour(23).withMinute(59).plusMinutes(59),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(83).withHour(23).withMinute(59).plusMinutes(59),
    endTime = LocalDateTime.now().minusDays(83).withHour(23).withMinute(59).plusMinutes(59).plusMinutes(47),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(83).withHour(23).withMinute(59).plusMinutes(59).plusMinutes(47),
    endTime = LocalDateTime.now().minusDays(83).withHour(23).withMinute(59).plusMinutes(59).plusMinutes(47).plusMinutes(71),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(83).withHour(23).withMinute(59).plusMinutes(59).plusMinutes(47).plusMinutes(71),
    endTime = LocalDateTime.now().minusDays(83).withHour(23).withMinute(59).plusMinutes(59).plusMinutes(47).plusMinutes(71).plusMinutes(73),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(83).withHour(23).withMinute(59).plusMinutes(59).plusMinutes(47).plusMinutes(71).plusMinutes(73),
    endTime = LocalDateTime.now().minusDays(83).withHour(23).withMinute(59).plusMinutes(59).plusMinutes(47).plusMinutes(71).plusMinutes(73).plusMinutes(49),
    type = SleepType.Awake
)
                ),
                sleepScore = 87
            ),

            // Day 85 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(84),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(84).withHour(21).withMinute(58),
    endTime = LocalDateTime.now().minusDays(84).withHour(21).withMinute(58).plusMinutes(222),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(84).withHour(21).withMinute(58).plusMinutes(222),
    endTime = LocalDateTime.now().minusDays(84).withHour(21).withMinute(58).plusMinutes(222).plusMinutes(95),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(84).withHour(21).withMinute(58).plusMinutes(222).plusMinutes(95),
    endTime = LocalDateTime.now().minusDays(84).withHour(21).withMinute(58).plusMinutes(222).plusMinutes(95).plusMinutes(93),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(84).withHour(21).withMinute(58).plusMinutes(222).plusMinutes(95).plusMinutes(93),
    endTime = LocalDateTime.now().minusDays(84).withHour(21).withMinute(58).plusMinutes(222).plusMinutes(95).plusMinutes(93).plusMinutes(34),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(84).withHour(21).withMinute(58).plusMinutes(222).plusMinutes(95).plusMinutes(93).plusMinutes(34),
    endTime = LocalDateTime.now().minusDays(84).withHour(21).withMinute(58).plusMinutes(222).plusMinutes(95).plusMinutes(93).plusMinutes(34).plusMinutes(30),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 86 - Score: 63
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(85),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(85).withHour(23).withMinute(44),
    endTime = LocalDateTime.now().minusDays(85).withHour(23).withMinute(44).plusMinutes(34),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(85).withHour(23).withMinute(44).plusMinutes(34),
    endTime = LocalDateTime.now().minusDays(85).withHour(23).withMinute(44).plusMinutes(34).plusMinutes(42),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(85).withHour(23).withMinute(44).plusMinutes(34).plusMinutes(42),
    endTime = LocalDateTime.now().minusDays(85).withHour(23).withMinute(44).plusMinutes(34).plusMinutes(42).plusMinutes(39),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(85).withHour(23).withMinute(44).plusMinutes(34).plusMinutes(42).plusMinutes(39),
    endTime = LocalDateTime.now().minusDays(85).withHour(23).withMinute(44).plusMinutes(34).plusMinutes(42).plusMinutes(39).plusMinutes(51),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(85).withHour(23).withMinute(44).plusMinutes(34).plusMinutes(42).plusMinutes(39).plusMinutes(51),
    endTime = LocalDateTime.now().minusDays(85).withHour(23).withMinute(44).plusMinutes(34).plusMinutes(42).plusMinutes(39).plusMinutes(51).plusMinutes(56),
    type = SleepType.Awake
)
                ),
                sleepScore = 63
            ),

            // Day 87 - Score: 86
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(86),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(86).withHour(22).withMinute(49),
    endTime = LocalDateTime.now().minusDays(86).withHour(22).withMinute(49).plusMinutes(136),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(86).withHour(22).withMinute(49).plusMinutes(136),
    endTime = LocalDateTime.now().minusDays(86).withHour(22).withMinute(49).plusMinutes(136).plusMinutes(68),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(86).withHour(22).withMinute(49).plusMinutes(136).plusMinutes(68),
    endTime = LocalDateTime.now().minusDays(86).withHour(22).withMinute(49).plusMinutes(136).plusMinutes(68).plusMinutes(77),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(86).withHour(22).withMinute(49).plusMinutes(136).plusMinutes(68).plusMinutes(77),
    endTime = LocalDateTime.now().minusDays(86).withHour(22).withMinute(49).plusMinutes(136).plusMinutes(68).plusMinutes(77).plusMinutes(53),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(86).withHour(22).withMinute(49).plusMinutes(136).plusMinutes(68).plusMinutes(77).plusMinutes(53),
    endTime = LocalDateTime.now().minusDays(86).withHour(22).withMinute(49).plusMinutes(136).plusMinutes(68).plusMinutes(77).plusMinutes(53).plusMinutes(35),
    type = SleepType.Awake
)
                ),
                sleepScore = 86
            ),

            // Day 88 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(87),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(87).withHour(20).withMinute(23),
    endTime = LocalDateTime.now().minusDays(87).withHour(20).withMinute(23).plusMinutes(139),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(87).withHour(20).withMinute(23).plusMinutes(139),
    endTime = LocalDateTime.now().minusDays(87).withHour(20).withMinute(23).plusMinutes(139).plusMinutes(55),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(87).withHour(20).withMinute(23).plusMinutes(139).plusMinutes(55),
    endTime = LocalDateTime.now().minusDays(87).withHour(20).withMinute(23).plusMinutes(139).plusMinutes(55).plusMinutes(170),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(87).withHour(20).withMinute(23).plusMinutes(139).plusMinutes(55).plusMinutes(170),
    endTime = LocalDateTime.now().minusDays(87).withHour(20).withMinute(23).plusMinutes(139).plusMinutes(55).plusMinutes(170).plusMinutes(46),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(87).withHour(20).withMinute(23).plusMinutes(139).plusMinutes(55).plusMinutes(170).plusMinutes(46),
    endTime = LocalDateTime.now().minusDays(87).withHour(20).withMinute(23).plusMinutes(139).plusMinutes(55).plusMinutes(170).plusMinutes(46).plusMinutes(54),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

            // Day 89 - Score: 68
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(88),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(88).withHour(20).withMinute(34),
    endTime = LocalDateTime.now().minusDays(88).withHour(20).withMinute(34).plusMinutes(120),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(88).withHour(20).withMinute(34).plusMinutes(120),
    endTime = LocalDateTime.now().minusDays(88).withHour(20).withMinute(34).plusMinutes(120).plusMinutes(55),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(88).withHour(20).withMinute(34).plusMinutes(120).plusMinutes(55),
    endTime = LocalDateTime.now().minusDays(88).withHour(20).withMinute(34).plusMinutes(120).plusMinutes(55).plusMinutes(42),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(88).withHour(20).withMinute(34).plusMinutes(120).plusMinutes(55).plusMinutes(42),
    endTime = LocalDateTime.now().minusDays(88).withHour(20).withMinute(34).plusMinutes(120).plusMinutes(55).plusMinutes(42).plusMinutes(34),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(88).withHour(20).withMinute(34).plusMinutes(120).plusMinutes(55).plusMinutes(42).plusMinutes(34),
    endTime = LocalDateTime.now().minusDays(88).withHour(20).withMinute(34).plusMinutes(120).plusMinutes(55).plusMinutes(42).plusMinutes(34).plusMinutes(36),
    type = SleepType.Awake
)
                ),
                sleepScore = 68
            ),

            // Day 90 - Score: 100
            SleepDayData(
                startDate = LocalDateTime.now().minusDays(89),
                sleepPeriods = listOf(
                    SleepPeriod(
    startTime = LocalDateTime.now().minusDays(89).withHour(22).withMinute(5),
    endTime = LocalDateTime.now().minusDays(89).withHour(22).withMinute(5).plusMinutes(325),
    type = SleepType.Light
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(89).withHour(22).withMinute(5).plusMinutes(325),
    endTime = LocalDateTime.now().minusDays(89).withHour(22).withMinute(5).plusMinutes(325).plusMinutes(133),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(89).withHour(22).withMinute(5).plusMinutes(325).plusMinutes(133),
    endTime = LocalDateTime.now().minusDays(89).withHour(22).withMinute(5).plusMinutes(325).plusMinutes(133).plusMinutes(110),
    type = SleepType.REM
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(89).withHour(22).withMinute(5).plusMinutes(325).plusMinutes(133).plusMinutes(110),
    endTime = LocalDateTime.now().minusDays(89).withHour(22).withMinute(5).plusMinutes(325).plusMinutes(133).plusMinutes(110).plusMinutes(47),
    type = SleepType.Deep
),
SleepPeriod(
    startTime = LocalDateTime.now().minusDays(89).withHour(22).withMinute(5).plusMinutes(325).plusMinutes(133).plusMinutes(110).plusMinutes(47),
    endTime = LocalDateTime.now().minusDays(89).withHour(22).withMinute(5).plusMinutes(325).plusMinutes(133).plusMinutes(110).plusMinutes(47).plusMinutes(43),
    type = SleepType.Awake
)
                ),
                sleepScore = 100
            ),

    )
)
