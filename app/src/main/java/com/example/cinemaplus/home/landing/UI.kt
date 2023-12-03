package com.example.cinemaplus.home.landing

import android.content.Context
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.layout.ContentScale
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
import com.example.cinemaplus.home.profile.UserProfile
import com.example.cinemaplus.landingpage.poppins
import com.example.cinemaplus.landingpage.sFProText
import com.example.cinemaplus.showpage.MoviePageContent
import com.google.relay.compose.BorderAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.relayDropShadow

/**
 * changed the bottom design for nav buttons
 *
 * This composable was generated from the UI Package 'landing_page'.
 * Generated code; do not edit directly
 */
enum class MovieType {
    MOVIE_13
}
@Composable
fun LandingPage(
    modifier: Modifier = Modifier,
    fullName: String,
    userName: String,
    location: String,
    context: Context,
) {
    val context = LocalContext.current
    var showUserProfile by remember { mutableStateOf(false) }
    var showLandingPage by remember { mutableStateOf(false) }
    var selectedMovie by remember { mutableStateOf<MovieType?>(null) }

    TopLevel(modifier = modifier) {
        TopNavigation(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = -376.0.dp
                )
            )
        ) {
            ChooseMovie()
        }
        Search(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 22.0.dp,
                    y = 71.0.dp
                )
            )
        ) {
            SearchField(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                IconMagnifyingglass()
                Placeholder(modifier = Modifier.rowWeight(1.0f))
                SFSymbolMicrophone()
            }
        }
        VerticalScrolling(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 3.0.dp,
                    y = 59.5.dp
                )
            )
        ) {
            TopMoviesContainer(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 1.0.dp,
                        y = 432.0.dp
                    )
                )
            ) {
                Contents3 {
                    Movie13(
                        onClick = {
                            selectedMovie = MovieType.MOVIE_13
                        }
                    )
                    Movie14()
                    Movie15()
                }
            }
            when(selectedMovie) {
                MovieType.MOVIE_13 -> MoviePageContent()
            }
            TopMovies(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 386.0.dp
                    )
                )
            )
            ComingSoonContainer(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 1.0.dp,
                        y = 242.0.dp
                    )
                )
            ) {
                Contents2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 2.0.dp
                        )
                    )
                ) {
                    Movie7()
                    Movie8()
                    Movie9()
                }
            }
            ComingSoon(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 1.0.dp,
                        y = 196.0.dp
                    )
                )
            )
            NowPlayingContainer(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 1.0.dp,
                        y = 46.0.dp
                    )
                )
            ) {
                Contents1 {
                    Movie1()
                    Movie2()
                    Movie3()
                }
            }
            NowPlaying()
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

@Preview(widthDp = 385, heightDp = 844)
@Composable
private fun LandingPagePreview() {
    val context = LocalContext.current
    MaterialTheme {
        RelayContainer {
            LandingPage(
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f),
                fullName = "ryan", userName = "rkin", location = "kenya",
                context = context,
            )
        }
    }
}

@Composable
fun ChooseMovie(modifier: Modifier = Modifier) {
    RelayText(
        content = "Choose Movie ",
        fontSize = 20.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 221,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.5.em,
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
fun IconMagnifyingglass(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.landing_page_icon_magnifyingglass),
        modifier = modifier
            .requiredWidth(15.63037109375.dp)
            .requiredHeight(15.77978515625.dp)
    )
}

@Composable
fun Placeholder(modifier: Modifier = Modifier) {
    RelayText(
        content = "Search",
        fontSize = 17.0.sp,
        fontFamily = sFProText,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2941175842285155.em,
        letterSpacing = -0.40799999237060547.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}

@Composable
fun SFSymbolMicrophone(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.landing_page_sf_symbol_microphone),
        modifier = modifier
            .requiredWidth(11.87841796875.dp)
            .requiredHeight(17.6806640625.dp)
    )
}

@Composable
fun SearchField(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 151,
            green = 151,
            blue = 151
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 8.0.dp,
            top = 7.0.dp,
            end = 8.0.dp,
            bottom = 7.0.dp
        ),
        itemSpacing = 6.0,
        clipToParent = false,
        radius = 10.0,
        borderAlignment = BorderAlignment.Center,
        content = content,
        modifier = modifier.requiredWidth(343.0.dp)
    )
}

@Composable
fun Search(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier
            .requiredWidth(343.0.dp)
            .requiredHeight(36.0.dp)
    )
}

@Composable
fun Movie13(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    RelayImage(
        image = painterResource(R.drawable.landing_page_movie_13),
        radius = 20.0,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .requiredWidth(100.0.dp)
            .requiredHeight(130.0.dp)
    )
}

@Composable
fun Movie14(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.landing_page_movie_14),
        radius = 20.0,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .requiredWidth(100.0.dp)
            .requiredHeight(130.0.dp)
    )
}

@Composable
fun Movie15(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.landing_page_movie_15),
        radius = 20.0,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .requiredWidth(100.0.dp)
            .requiredHeight(130.0.dp)
    )
}

@Composable
fun Contents3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 20.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun TopMoviesContainer(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
            .requiredWidth(370.0.dp)
            .requiredHeight(130.0.dp)
    )
}

@Composable
fun TopMovies(modifier: Modifier = Modifier) {
    RelayText(
        content = "Top movies",
        fontSize = 17.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.5.em,
        letterSpacing = -0.30000001192092896.sp,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Movie7(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.landing_page_movie_7),
        radius = 20.0,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .requiredWidth(100.0.dp)
            .requiredHeight(130.0.dp)
    )
}

@Composable
fun Movie8(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.landing_page_movie_8),
        radius = 20.0,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .requiredWidth(100.0.dp)
            .requiredHeight(130.0.dp)
    )
}

@Composable
fun Movie9(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.landing_page_movie_9),
        radius = 20.0,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .requiredWidth(100.0.dp)
            .requiredHeight(130.0.dp)
    )
}

@Composable
fun Contents2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 20.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun ComingSoonContainer(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
            .requiredWidth(370.0.dp)
            .requiredHeight(130.0.dp)
    )
}

@Composable
fun ComingSoon(modifier: Modifier = Modifier) {
    RelayText(
        content = "Coming Soon",
        fontSize = 17.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.5.em,
        letterSpacing = -0.30000001192092896.sp,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun Movie1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.landing_page_movie_1),
        radius = 20.0,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .requiredWidth(100.0.dp)
            .requiredHeight(130.0.dp)
    )
}

@Composable
fun Movie2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.landing_page_movie_2),
        radius = 20.0,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .requiredWidth(100.0.dp)
            .requiredHeight(130.0.dp)
    )
}

@Composable
fun Movie3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.landing_page_movie_3),
        radius = 20.0,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .requiredWidth(100.0.dp)
            .requiredHeight(130.0.dp)
    )
}

@Composable
fun Contents1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        itemSpacing = 20.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun NowPlayingContainer(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
            .requiredWidth(370.0.dp)
            .requiredHeight(130.0.dp)
    )
}

@Composable
fun NowPlaying(modifier: Modifier = Modifier) {
    RelayText(
        content = "Now Playing",
        fontSize = 17.0.sp,
        fontFamily = poppins,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.5.em,
        letterSpacing = -0.30000001192092896.sp,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun VerticalScrolling(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier
            .requiredWidth(371.0.dp)
            .requiredHeight(677.0.dp)
    )
}

@Composable
fun AccountCircleDrawing(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.landing_page_account_circle_drawing),
        modifier = modifier
            .requiredWidth(33.89794921875.dp)
            .requiredHeight(33.89794921875.dp)
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
        vector = painterResource(R.drawable.landing_page_location_on_drawing),
        modifier = modifier
            .requiredWidth(27.2314453125.dp)
            .requiredHeight(33.89794921875.dp)
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
        modifier = modifier
            .requiredWidth(27.2314453125.dp)
            .requiredHeight(33.89794921875.dp)
    )
}

@Composable
fun OtherHousesDrawing(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.landing_page_other_houses_drawing),
        modifier = modifier
            .requiredWidth(37.2744140625.dp)
            .requiredHeight(30.478271484375.dp)
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
        contentPadding = PaddingValues(0.dp),
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
        modifier = modifier
            .fillMaxWidth(1.0f)
            .fillMaxHeight(1.0f)
            .relayDropShadow(
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
