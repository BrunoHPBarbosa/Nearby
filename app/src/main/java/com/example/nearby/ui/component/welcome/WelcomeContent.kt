package com.example.nearby.ui.component.welcome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.nearby.R
import com.example.nearby.ui.theme.Typography

@Composable
fun WelcomeContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text(text = "Veja como Funciona:", style = Typography.bodyLarge)
        WelcomeHowItWorksTip(
            modifier = Modifier.fillMaxWidth(),
            title = "Encontre estabelecimentos",
            subtitle = "Veja locais perto de voce que sao parceiros Neaby",
            iconRes = R.drawable.ic_map_pin
        )
        WelcomeHowItWorksTip(
            modifier = Modifier.fillMaxWidth(),
            title = "Ative o cupom com QR Code",
            subtitle = "Escaneie o codigo no estabelecimento para usar o benefício",
            iconRes = R.drawable.ic_qrcode
        )
        WelcomeHowItWorksTip(
            modifier = Modifier.fillMaxWidth(),
            title = "Garanta vantagens perto de voce",
            subtitle = "Ative cupons onde estiver , em diferentes tipos de estabelecimentos",
            iconRes = R.drawable.ic_ticket
        )
    }
}
