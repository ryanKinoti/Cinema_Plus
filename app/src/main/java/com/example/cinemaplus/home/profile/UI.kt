package com.example.cinemaplus.home.profile


import android.content.Context
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.cinemaplus.R
import com.example.cinemaplus.home.landing.LandingPage
import com.example.cinemaplus.userprofile.gilroy
import com.example.cinemaplus.userprofile.poppins
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow

/**
 * initial setup for profiles
 *
 * This composable was generated from the UI Package 'user_profile'.
 * Generated code; do not edit directly
 */
@Composable
fun UserProfile(
    modifier: Modifier = Modifier,
    fullName: String,
    userName: String,
    location: String,
    context: Context,
) {
    val context = LocalContext.current
    var showUserProfile by remember { mutableStateOf(false) }
    var showLandingPage by remember { mutableStateOf(false) }

    TopLevel(modifier = modifier) {
        TopNavigation(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -2.0.dp,
                    y = -376.0.dp
                )
            )
        ) {
            Title()
        }
        UserInfo(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 32.0.dp,
                    y = 91.0.dp
                )
            )
        ) {
            Rectangle12269()
            Group363(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 72.0.dp,
                        y = 20.0.dp
                    )
                )
            ) {
                PeterAduku()
                BabydriverEmailCom(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 23.0.dp
                        )
                    )
                )
            }
            Ellipse16(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 16.0.dp,
                        y = 16.0.dp
                    )
                )
            )
            IconsaxLinearArrowright21(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 290.0.dp,
                        y = 28.0.dp
                    )
                )
            ) {
                Vector1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = -1.0.dp,
                            y = -1.0.dp
                        )
                    ).rowWeight(1.0f).columnWeight(1.0f)
                )
            }
        }
        Rewards(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 30.0.dp,
                    y = 201.0.dp
                )
            )
        ) {
            Border2()
            ReferralsAndRewards(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 48.0.dp,
                        y = 14.0.dp
                    )
                )
            )
            IconsaxBoldGift(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                Vector111(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                Vector112(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
            IconsaxLinearArrowright22(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 290.0.dp,
                        y = 12.0.dp
                    )
                )
            ) {
                Vector12(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = -1.0.dp,
                            y = -1.0.dp
                        )
                    ).rowWeight(1.0f).columnWeight(1.0f)
                )
            }
        }
        Notifications(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 30.0.dp,
                    y = 314.0.dp
                )
            )
        ) {
            Border3()
            Notifications(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 48.0.dp,
                        y = 14.0.dp
                    )
                )
            )
            IconsaxLinearArrowright23(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 290.0.dp,
                        y = 12.0.dp
                    )
                )
            ) {
                Vector32(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = -1.0.dp,
                            y = -1.0.dp
                        )
                    ).rowWeight(1.0f).columnWeight(1.0f)
                )
            }
            IconsaxBoldNotification(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 16.0.dp,
                        y = 12.0.dp
                    )
                )
            ) {
                Vector31(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
        Language(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 30.0.dp,
                    y = 378.0.dp
                )
            )
        ) {
            Border4()
            Language(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 48.0.dp,
                        y = 14.0.dp
                    )
                )
            )
            IconsaxLinearArrowright24(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 290.0.dp,
                        y = 12.0.dp
                    )
                )
            ) {
                Vector42(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = -1.0.dp,
                            y = -1.0.dp
                        )
                    ).rowWeight(1.0f).columnWeight(1.0f)
                )
            }
            IconsaxBoldLanguagesquare(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 16.0.dp,
                        y = 12.0.dp
                    )
                )
            ) {
                Vector41(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
        Security(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 30.0.dp,
                    y = 442.0.dp
                )
            )
        ) {
            Border5()
            Security(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 48.0.dp,
                        y = 14.0.dp
                    )
                )
            )
            IconsaxLinearArrowright25(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 290.0.dp,
                        y = 12.0.dp
                    )
                )
            ) {
                Vector52(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = -1.0.dp,
                            y = -1.0.dp
                        )
                    ).rowWeight(1.0f).columnWeight(1.0f)
                )
            }
            IconsaxBoldSecuritysafe(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 16.0.dp,
                        y = 12.0.dp
                    )
                )
            ) {
                Vector51(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
        Help(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 30.0.dp,
                    y = 555.0.dp
                )
            )
        ) {
            Border6()
            HelpCentre(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 48.0.dp,
                        y = 14.0.dp
                    )
                )
            )
            IconsaxLinearArrowright26(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 290.0.dp,
                        y = 12.0.dp
                    )
                )
            ) {
                Vector62(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = -1.0.dp,
                            y = -1.0.dp
                        )
                    ).rowWeight(1.0f).columnWeight(1.0f)
                )
            }
            IconsaxBoldClipboardtext(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 16.0.dp,
                        y = 12.0.dp
                    )
                )
            ) {
                Vector612(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                Vector611(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
        Bugs(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 30.0.dp,
                    y = 619.0.dp
                )
            )
        ) {
            Border7()
            ReportABug(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 48.0.dp,
                        y = 14.0.dp
                    )
                )
            )
            IconsaxLinearArrowright27(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 290.0.dp,
                        y = 12.0.dp
                    )
                )
            ) {
                Vector72(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = -1.0.dp,
                            y = -1.0.dp
                        )
                    ).rowWeight(1.0f).columnWeight(1.0f)
                )
            }
            IconsaxBoldFlag(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 16.0.dp,
                        y = 12.0.dp
                    )
                )
            ) {
                Vector71(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
        Divider2(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 29.0.dp,
                    y = 512.0.dp
                )
            )
        )
        Divider1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 29.0.dp,
                    y = 263.0.dp
                )
            )
        )
        SettingsAndPreferences(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 30.0.dp,
                    y = 281.0.dp
                )
            )
        )
        Support(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 30.0.dp,
                    y = 522.0.dp
                )
            )
        )
        Logout(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 46.0.dp,
                    y = 691.0.dp
                )
            )
        ) {
            LogOut(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 32.0.dp,
                        y = 3.0.dp
                    )
                )
            )
            IconsaxLinearLogoutcurve {
                Vector(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = -0.75.dp,
                            y = -0.75.dp
                        )
                    ).rowWeight(1.0f).columnWeight(1.0f)
                )
            }
        }

        if (showUserProfile) {
            UserProfile(
                fullName = fullName,
                userName = userName,
                location = location,
                context = context,
            )
        }
        AccountCircle(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 73.05419921875.dp,
                    y = 783.0477294921875.dp
                )
            ),
            onClickAction = {
                showUserProfile = true
            }
        ) {
            AccountCircleDrawing(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        LocationOn(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 183.3876953125.dp,
                    y = 783.0477294921875.dp
                )
            )
        ) {
            LocationOnDrawing(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }

        if (showLandingPage) {
            LandingPage(
                fullName = fullName,
                userName = userName,
                location = location,
                context = context,
            )
        }
        OtherHouses(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 284.35791015625.dp,
                    y = 784.6446533203125.dp
                )
            ),
            onClickAction = {
                showLandingPage = true
            }
        ) {
            OtherHousesDrawing(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
    }
}

//@Preview(widthDp = 390, heightDp = 844)
//@Composable
//private fun UserProfilePreview() {
//    MaterialTheme {
//        RelayContainer {
//            UserProfile(
//                fullName = "",
//                userName = "",
//                location = "",
//                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
//            )
//        }
//    }
//}

@Composable
fun Title(modifier: Modifier = Modifier) {
    RelayText(
        content = "My Profile",
        fontSize = 20.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 221,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.5.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun TopNavigation(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 63.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Rectangle12269(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_rectangle_12269),
        modifier = modifier.requiredWidth(330.0.dp).requiredHeight(80.0.dp)
    )
}

@Composable
fun PeterAduku(modifier: Modifier = Modifier) {
    RelayText(
        content = "Peter Aduku",
        fontSize = 16.0.sp,
        fontFamily = gilroy,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.1929999589920044.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun BabydriverEmailCom(modifier: Modifier = Modifier) {
    RelayText(
        content = "babydriver@email.com",
        fontFamily = gilroy,
        color = Color(
            alpha = 255,
            red = 189,
            green = 189,
            blue = 189
        ),
        height = 1.1599999836512975.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun Group363(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(146.0.dp).requiredHeight(39.0.dp)
    )
}

@Composable
fun Ellipse16(modifier: Modifier = Modifier) {
    RelayVector(modifier = modifier.requiredWidth(48.0.dp).requiredHeight(48.0.dp))
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_vector_1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.91015625.dp,
                top = 4.0800018310546875.dp,
                end = 7.9921875.dp,
                bottom = 4.0800018310546875.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconsaxLinearArrowright21(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun UserInfo(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(330.0.dp).requiredHeight(80.0.dp)
    )
}

@Composable
fun Border2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_border_2),
        modifier = modifier.requiredWidth(330.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun ReferralsAndRewards(modifier: Modifier = Modifier) {
    RelayText(
        content = "Referrals and rewards",
        fontSize = 16.0.sp,
        fontFamily = gilroy,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.1929999589920044.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector111(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_vector_1_1_1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.5.dp,
                top = 5.0.dp,
                end = 2.5.dp,
                bottom = 2.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector112(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_vector_1_1_2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 5.87109375.dp,
                top = 2.0036163330078125.dp,
                end = 5.8798828125.dp,
                bottom = 7.8526611328125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconsaxBoldGift(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 16.0.dp,
                top = 12.0.dp,
                end = 290.0.dp,
                bottom = 12.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_vector_1_2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.91015625.dp,
                top = 4.0800018310546875.dp,
                end = 7.9921875.dp,
                bottom = 4.0800018310546875.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconsaxLinearArrowright22(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Rewards(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(330.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Border3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_border_3),
        modifier = modifier.requiredWidth(330.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Notifications(modifier: Modifier = Modifier) {
    RelayText(
        content = "Notifications",
        fontSize = 16.0.sp,
        fontFamily = gilroy,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.1929999589920044.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector32(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_vector_3_2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.91015625.dp,
                top = 4.0800018310546875.dp,
                end = 7.9921875.dp,
                bottom = 4.079998016357422.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconsaxLinearArrowright23(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Vector31(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_vector_3_1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.310546875.dp,
                top = 1.9998397827148438.dp,
                end = 4.3056640625.dp,
                bottom = 2.000001907348633.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconsaxBoldNotification(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Notifications(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(330.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Border4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_border_4),
        modifier = modifier.requiredWidth(330.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Language(modifier: Modifier = Modifier) {
    RelayText(
        content = "Language",
        fontSize = 16.0.sp,
        fontFamily = gilroy,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.1929999589920044.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector42(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_vector_4_2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.91015625.dp,
                top = 4.079999923706055.dp,
                end = 7.9921875.dp,
                bottom = 4.0800018310546875.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconsaxLinearArrowright24(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Vector41(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_vector_4_1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.0.dp,
                top = 2.0.dp,
                end = 2.009765625.dp,
                bottom = 2.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconsaxBoldLanguagesquare(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Language(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(330.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Border5(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_border_5),
        modifier = modifier.requiredWidth(330.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Security(modifier: Modifier = Modifier) {
    RelayText(
        content = "Security",
        fontSize = 16.0.sp,
        fontFamily = gilroy,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.1929999589920044.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector52(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_vector_5_2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.91015625.dp,
                top = 4.0800018310546875.dp,
                end = 7.9921875.dp,
                bottom = 4.0800018310546875.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconsaxLinearArrowright25(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Vector51(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_vector_5_1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.08984375.dp,
                top = 2.0074691772460938.dp,
                end = 3.08984375.dp,
                bottom = 2.00250244140625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconsaxBoldSecuritysafe(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Security(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(330.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Border6(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_border_6),
        modifier = modifier.requiredWidth(330.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun HelpCentre(modifier: Modifier = Modifier) {
    RelayText(
        content = "Help centre",
        fontSize = 16.0.sp,
        fontFamily = gilroy,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.1929999589920044.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector62(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_vector_6_2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.91015625.dp,
                top = 4.0800018310546875.dp,
                end = 7.9921875.dp,
                bottom = 4.0800018310546875.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconsaxLinearArrowright26(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Vector612(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_vector_6_1_2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.759765625.dp,
                top = 2.0.dp,
                end = 7.7705078125.dp,
                bottom = 17.300003051757812.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector611(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_vector_6_1_1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.2900390625.dp,
                top = 4.0825347900390625.dp,
                end = 3.2900390625.dp,
                bottom = 2.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconsaxBoldClipboardtext(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Help(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(330.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Border7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_border_7),
        modifier = modifier.requiredWidth(330.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun ReportABug(modifier: Modifier = Modifier) {
    RelayText(
        content = "Report a bug",
        fontSize = 16.0.sp,
        fontFamily = gilroy,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.1929999589920044.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector72(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_vector_7_2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.91015625.dp,
                top = 4.079986572265625.dp,
                end = 7.9921875.dp,
                bottom = 4.08001708984375.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconsaxLinearArrowright27(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Vector71(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_vector_7_1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 4.400390625.dp,
                top = 2.0.dp,
                end = 4.765625.dp,
                bottom = 2.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconsaxBoldFlag(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Bugs(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(330.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Divider2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_divider_2),
        modifier = modifier.requiredWidth(330.0.dp).requiredHeight(1.0.dp)
    )
}

@Composable
fun Divider1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_divider_1),
        modifier = modifier.requiredWidth(330.0.dp).requiredHeight(1.0.dp)
    )
}

@Composable
fun SettingsAndPreferences(modifier: Modifier = Modifier) {
    RelayText(
        content = "Settings and Preferences",
        fontFamily = gilroy,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.192999976021903.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Support(modifier: Modifier = Modifier) {
    RelayText(
        content = "Support",
        fontFamily = gilroy,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.192999976021903.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun LogOut(modifier: Modifier = Modifier) {
    RelayText(
        content = "Log out",
        fontFamily = gilroy,
        color = Color(
            alpha = 255,
            red = 235,
            green = 87,
            blue = 87
        ),
        height = 1.192999976021903.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(600.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.5.dp,
                top = 2.489990234375.dp,
                end = 2.5.dp,
                bottom = 2.470001220703125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconsaxLinearLogoutcurve(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Logout(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(81.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun AccountCircleDrawing(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_account_circle_drawing),
        modifier = modifier.requiredWidth(33.8984375.dp).requiredHeight(33.89794921875.dp)
    )
}

@Composable
fun AccountCircle(
    modifier: Modifier = Modifier,
    onClickAction: () -> Unit = {},
    content: @Composable () -> Unit,  // Content inside the AccountCircle
) {
    Button(
        onClick = onClickAction,
        modifier = modifier
            .requiredWidth(33.89794921875.dp)
            .requiredHeight(33.89794921875.dp),
        // You can add styling for the button here
        contentPadding = PaddingValues(0.dp), // Adjust padding as needed
    ) {
        content()
    }
}

@Composable
fun LocationOnDrawing(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_location_on_drawing),
        modifier = modifier.requiredWidth(27.2314453125.dp).requiredHeight(33.89794921875.dp)
    )
}

@Composable
fun LocationOn(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(27.2314453125.dp).requiredHeight(33.89794921875.dp)
    )
}

@Composable
fun OtherHousesDrawing(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.user_profile_other_houses_drawing),
        modifier = modifier.requiredWidth(37.2744140625.dp).requiredHeight(30.478240966796875.dp)
    )
}

@Composable
fun OtherHouses(
    modifier: Modifier = Modifier,
    onClickAction: () -> Unit = {},
    content: @Composable () -> Unit,
) {
    Button(
        onClick = onClickAction,
        modifier = modifier
            .requiredWidth(33.89794921875.dp)
            .requiredHeight(33.89794921875.dp),
        // You can add styling for the button here
        contentPadding = PaddingValues(0.dp), // Adjust padding as needed
    ) {
        content()
    }
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 2,
            green = 22,
            blue = 44
        ),
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f).relayDropShadow(
            color = Color(
                alpha = 63,
                red = 0,
                green = 0,
                blue = 0
            ),
            borderRadius = 0.0.dp,
            blur = 4.0.dp,
            offsetX = 0.0.dp,
            offsetY = 4.0.dp,
            spread = 0.0.dp
        )
    )
}
