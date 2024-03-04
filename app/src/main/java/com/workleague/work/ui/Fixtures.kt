package com.workleague.work.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.Icons.Default
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TopComponents() {
    Row(
        modifier = Modifier
    ) {
        MatchesComponent()
        CalendarLogoComponent()
    }
}

@Composable
fun MatchesComponent() {
    Text(
        text = "Matches",
        modifier = Modifier
            .padding(20.dp)
        //.fillMaxWidth(),
        ,
        fontSize = 15.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}

@Composable
fun CalendarLogoComponent() {
    Icon(
        Default.DateRange,
        contentDescription = "",
        modifier = Modifier
            .padding(20.dp)
    )
}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun FixturesScreenPreview() {
   TopComponents()
}