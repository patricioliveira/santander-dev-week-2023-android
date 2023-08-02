package dio.me.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CurrencyExchange
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import dio.me.presentation.theme.SantanderDevWeekTheme
import dio.me.presentation.theme.Spacing_2
import dio.me.presentation.theme.Spacing_3

@Composable
fun BalanceCard(modifier: Modifier = Modifier,
                balance: Double = 0.0,
                limit: Double = 0.0
                ) {
    AppCard(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = Spacing_2)
    ) {
        Column(modifier = Modifier.padding(Spacing_2)) {
            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            )
            {
                Row(modifier = Modifier.fillMaxWidth(0.8f)) {
                    Icon(imageVector = Icons.Filled.CurrencyExchange,
                        contentDescription = "Currency"
                    )
                    Text(modifier = Modifier.padding(start = Spacing_3),
                        text = "Saldo disponivel")
                }
                Icon(imageVector = Icons.Filled.ExpandLess, contentDescription = "ExpandLess")
            }
            Text(text = "R$ 1.324,64",
                'style = TextStyle(
                    fontSize = 32.4.sp,
                    fontWeight = FontWeight.W700,
                    color = Color.Black,
                    letterSpacing = 0.32.sp
                )
            )
        }
    }
}

@Preview
@Composable
fun BalanceCardPreview() {
    SantanderDevWeekTheme {
        BalanceCard()
    }
}