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

package me.kartikarora.jetlagged.ui.util

import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "small font",
    group = "font scales",
    fontScale = 0.5f,
    showBackground = true,
    backgroundColor = 0xFFFFFF
)
@Preview(
    name = "large font",
    group = "font scales",
    fontScale = 1.5f,
    showBackground = true,
    backgroundColor = 0xFFFFFF
)
annotation class FontScalePreviews

@Preview(showBackground = true, backgroundColor = 0xFFFFFF)
@Preview(
    device = "spec:width=1280dp,height=800dp,dpi=240",
    showBackground = true,
    backgroundColor = 0xFFFFFF
)
@Preview(
    device = "spec:width=673dp,height=841dp",
    showBackground = true,
    backgroundColor = 0xFFFFFF
)
annotation class MultiDevicePreview


@FontScalePreviews
@MultiDevicePreview
annotation class CombinedPreview