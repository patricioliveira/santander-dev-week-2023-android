package dio.me.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dio.me.presentation.theme.SantanderDevWeekTheme

@Composable
fun CreditCard(
    modifier: Modifier = Modifier,
    number: String = ""
){
    AppCard(
        modifier = Modifier.fillMaxWidth().height(66.dp),
        containerColor = MaterialTheme.colorScheme.primary
    ) {

    }
}

@Preview
@Composable
fun CreditCardPreview(){
    SantanderDevWeekTheme {
        CreditCard(number = "0000")
    }
}