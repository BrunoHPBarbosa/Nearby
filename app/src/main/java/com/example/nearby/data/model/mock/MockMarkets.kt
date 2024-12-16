package com.example.nearby.data.model.mock

import com.example.nearby.data.model.Market
import com.example.nearby.data.model.Rule

val mockMarkets = listOf(
    Market(
        id = "022576ea-4441-4b8a-89e5-d5f32104c7c4",
        categoryId = "147b1a88-b3d3-4232-8b8f-c1f006f1e86d",
        name = "Sabor Grill",
        description = "Churrascaria com cortes nobres e buffet variado. Experiencia completa para os amantes de carne.",
        coupons = 10,
        /*rules = listOf(
            Rule(id = "1", description = "Valido ate o dia 25/12", marketId = "022576ea-4441-4b8a-89e5-d5f32104c7c4"),
            Rule(id = "2", description = "Disponivel apenas para consumo Local", marketId = "022576ea-4441-4b8a-89e5-d5f32104c7c4")
        ),*/
        latitude = -24.559742330991911,
        longitude = -47.65814845249887,
        address = "Av. Paulista - Bela Vista",
        phone =  "(11) 94567-1212",
        cover = "https://images.unsplash.com/photo-1498654896293-37aacf11fd9?w=400&h=300"
    ),
    Market(
        id = "012576ea-4441-4b8a-89e5-d5f32104c7c4",
        categoryId = "146b1a88-b3d3-4232-8b8f-c1f006f1e86d",
        name = "Café Central",
        description = "Cafe aconchegante com opcoes de lanches e bebidas artesanais.Perfeito para uma pausa.",
        coupons = 10,
      //  rules = emptyList(),
        latitude = -23.559742330991911,
        longitude = -46.65814845249887,
        address = "Av. Paulista - Bela Vista",
        phone =  "(11) 94567-1212",
        cover = "https://images.unsplash.com/photo-1551218808-94e220e084d2?w=400&h=300"

    )
)
