package co.ehsansetayesh.creditcards

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.ehsansetayesh.creditcards.ui.theme.ComposeCreditCardsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCreditCardsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DisplayCards()
                }
            }
        }
    }
}

@Composable
fun DisplayCards() {
    val cards = listOf(
        CardInfo(
            cardNumber = "1234 5678 0000 9999",
            cardHolder = "John Smith",
            providerImage = R.drawable.master_logo,
            backgroundImage = R.drawable.cardback1
        ),
        CardInfo(
            cardNumber = "1234 5678 0000 9999",
            cardHolder = "John Smith",
            providerImage = R.drawable.visa_logo,
            backgroundImage = R.drawable.cardback2
        ),
        CardInfo(
            cardNumber = "1234 5678 0000 9999",
            cardHolder = "John Smith",
            providerImage = R.drawable.master_logo,
            backgroundImage = R.drawable.cardback3
        ),
        CardInfo(
            cardNumber = "1234 5678 0000 9999",
            cardHolder = "John Smith",
            providerImage = R.drawable.visa_logo,
            backgroundImage = R.drawable.cardback4
        ),
        CardInfo(
            cardNumber = "1234 5678 0000 9999",
            cardHolder = "John Smith",
            providerImage = R.drawable.master_logo,
            backgroundImage = R.drawable.cardback5
        ),
        CardInfo(
            cardNumber = "1234 5678 0000 9999",
            cardHolder = "John Smith",
            providerImage = R.drawable.visa_logo,
            backgroundImage = R.drawable.cardback6
        ),
        CardInfo(
            cardNumber = "1234 5678 0000 9999",
            cardHolder = "John Smith",
            providerImage = R.drawable.master_logo,
            backgroundImage = R.drawable.cardback7
        ),
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxHeight()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(cards) { cardInfo: CardInfo ->
            CreditCard(cardInfo = cardInfo)
        }
    }
}