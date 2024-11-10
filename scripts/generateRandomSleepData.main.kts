import java.io.File
import java.time.format.DateTimeFormatter
import kotlin.random.Random

// Set output file path as specified
val outputFile = File("app/src/main/kotlin/me/kartikarora/jetlagged/data/FakeSleepData.kt")

// Date formatter to structure dates in Kotlin syntax
val formatter = DateTimeFormatter.ofPattern("yyyy, M, d")

// Function to generate random sleep periods within a realistic time range for each day
fun generateRandomSleepPeriods(dateExpression: String): Pair<String, Int> {
    val periods = mutableListOf<String>()
    val startHour = Random.nextInt(20, 24) // Random start time between 8 PM (20) and 11 PM (23)
    val startDateTimeExpression =
        "$dateExpression.withHour($startHour).withMinute(${Random.nextInt(0, 60)})"

    // Randomize total sleep duration between 4 hours and 12 hours from start time
    val totalSleepMinutes = Random.nextInt(240, 720) // 4 hours (240 min) to 12 hours (720 min)
    var remainingMinutes = totalSleepMinutes
    var currentStartTimeExpression = startDateTimeExpression

    // Define sleep types in sequence
    val sleepTypes = listOf("Light", "Deep", "REM", "Deep", "Awake")

    for (type in sleepTypes) {
        // Distribute time among periods with at least 30 minutes, but ensure valid range
        val periodDuration = if (remainingMinutes > 60) {
            Random.nextInt(30, (remainingMinutes / 2).coerceAtLeast(31))
        } else {
            remainingMinutes // Use remaining time if it's less than 60 minutes
        }

        remainingMinutes -= periodDuration
        val endTimeExpression = "$currentStartTimeExpression.plusMinutes($periodDuration)"

        periods.add(
            """
            SleepPeriod(
                startTime = $currentStartTimeExpression,
                endTime = $endTimeExpression,
                type = SleepType.$type
            )
            """.trimIndent()
        )

        currentStartTimeExpression = endTimeExpression
        if (remainingMinutes <= 0) break
    }

    // Calculate sleep score based on total sleep time, with a possible range of 0 to 100
    val sleepScore = ((totalSleepMinutes / 480.0) * 100).coerceIn(0.0, 100.0).toInt()

    return Pair(periods.joinToString(",\n"), sleepScore)
}

// Write the copyright, package, and imports at the top of the file
outputFile.writeText(
    """
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

    """.trimIndent() + "\n"
)

// Start of the Kotlin file with proper indentation
outputFile.appendText(
    """
    val sleepData = SleepGraphData(
        listOf(
    """.trimIndent() + "\n"
)

// Generate 90 days of data from 89 days ago to today
for (day in 0..89) {
    val dateExpression =
        if (day == 0) "LocalDateTime.now()" else "LocalDateTime.now().minusDays($day)"
    val (periods, sleepScore) = generateRandomSleepPeriods(dateExpression) // Get periods and score

    // Append SleepDayData for each day with indentation
    outputFile.appendText(
        """
            // Day ${day + 1} - Score: $sleepScore
            SleepDayData(
                startDate = $dateExpression,
                sleepPeriods = listOf(
                    $periods
                ),
                sleepScore = $sleepScore
            ),
        """.trimIndent() + "\n\n"
    )
}

// Close the list and data structure with proper indentation
outputFile.appendText(
    """
        )
    )
    """.trimIndent() + "\n"
)

println("Randomized Kotlin data for 90 days has been generated in ${outputFile.absolutePath}.")
