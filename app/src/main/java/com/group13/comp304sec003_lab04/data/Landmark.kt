package com.group13.comp304sec003_lab04.data

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.group13.comp304sec003_lab04.LandmarkList
import com.group13.comp304sec003_lab04.R

data class Landmark(
    val title: String,
    val subtitle: String,
    val description: String,
    val image: Int
)

object LandmarkData {
    val historic = listOf(
        Landmark(
            title = "Chichen Itza",
            subtitle = "Yucatán, Mexico",
            description = "A renowned archaeological site located on the Yucatán Peninsula in Mexico. It was a major city of the Maya civilization during the Terminal Classic period. Known for its iconic pyramid, El Castillo, and other impressive structures, Chichen Itza is a UNESCO World Heritage Site and one of the New Seven Wonders of the World.",
            image = R.drawable.landmark_historic_chichen
        ),
        Landmark(
            title = "Teotihuacán",
            subtitle = "State of Mexico",
            description = "An ancient Mesoamerican city known for its vast size and iconic pyramids, the Pyramid of the Sun and the Pyramid of the Moon, central to religious and cultural activities.",
            image = R.drawable.landmark_historic_teotihuacan
        ),
        Landmark(
            title = "Tulum Ruins",
            subtitle = "Quintana Roo, Mexico",
            description = "A picturesque Maya site overlooking the Caribbean Sea, known for its well-preserved ruins and strategic coastal location.",
            image = R.drawable.landmark_historic_tulumruins
        ),
        Landmark(
            title = "Monte Albán",
            subtitle = "Oaxaca, Mexico",
            description = "An ancient Zapotec city set atop a hill, featuring plazas, pyramids, and tombs that reveal rich cultural and ceremonial practices.",
            image = R.drawable.landmark_historic_montealban
        ),
    )

    val park = listOf(
        Landmark(
            title = "Chapultepec Park",
            subtitle = "Mexico City",
            description = "One of the largest urban parks in the Western Hemisphere, home to a castle, museums, lakes, and extensive green spaces.",
            image = R.drawable.landmark_park_chapultepec
        ),
        Landmark(
            title = "Sumidero Canyon National Park",
            subtitle = "Chiapas, Mexico",
            description = "A dramatic canyon carved by the Grijalva River, offering boat tours with stunning views of towering cliffs and rich biodiversity.",
            image = R.drawable.landmark_park_sumiderocanyon
        ),
        Landmark(
            title = "Copper Canyon (Barranca del Cobre)",
            subtitle = "Chihuahua, Mexico",
            description = "A group of massive canyons larger and deeper than the Grand Canyon, known for its breathtaking views and Rarámuri indigenous culture.",
            image = R.drawable.landmark_park_coppercanyon
        ),
        Landmark(
            title = "Cenote Dos Ojos",
            subtitle = "Quintana Roo, Mexico",
            description = "A natural park centered around stunning cenotes, ideal for swimming, snorkeling, and cave exploration.",
            image = R.drawable.landmark_park_cenotedosojos
        ),
    )

    val museums = listOf(
        Landmark(
            title = "National Museum of Anthropology",
            subtitle = "Mexico City",
            description = "One of the most important museums in Mexico, showcasing the cultural heritage and artifacts of Mexico’s pre-Hispanic civilizations, including the Aztec Sun Stone.",
            image = R.drawable.landmark_museums_nationalanthropology
        ),
        Landmark(
            title = "Frida Kahlo Museum (Casa Azul)",
            subtitle = "Mexico City",
            description = "The former home of renowned artist Frida Kahlo, featuring her works, personal items, and insights into her life.",
            image = R.drawable.landmark_museums_fridakahlo
        ),
        Landmark(
            title = "Palacio de Bellas Artes",
            subtitle = "Mexico City",
            description = "A cultural landmark and performance space housing a museum with rotating exhibits of Mexican and international art.",
            image = R.drawable.landmark_museums_palacio
        ),
        Landmark(
            title = "Museum of Modern Art (MAM)",
            subtitle = "Mexico City",
            description = "A museum dedicated to modern Mexican art, showcasing works from artists like Diego Rivera and Rufino Tamayo.",
            image = R.drawable.landmark_museums_mam
        ),
    )

    val touristic = listOf(
        Landmark(
            title = "Cancun Beaches",
            subtitle = "Quintana Roo, Mexico",
            description = "Famous for their white sand, turquoise waters, and vibrant nightlife, Cancun is a top destination for relaxation and entertainment.",
            image = R.drawable.landmark_touristic_cancun
        ),
        Landmark(
            title = "Xcaret Eco-Archaeological Park",
            subtitle = "Playa del Carmen, Mexico",
            description = "A sprawling park offering cultural performances, natural attractions, and immersive experiences like underground rivers and wildlife exhibits.",
            image = R.drawable.landmark_touristic_xcaret
        ),
        Landmark(
            title = "Cabo San Lucas Arch (El Arco)",
            subtitle = "Baja California Sur, Mexico",
            description = "A stunning natural rock formation where the Pacific Ocean meets the Gulf of California, popular for boat tours and photography.",
            image = R.drawable.landmark_touristic_elarco
        ),
        Landmark(
            title = "Palenque",
            subtitle = "Chiapas, Mexico",
            description = "A lesser-known but stunning Maya site surrounded by jungle, featuring intricate carvings and temples like the Temple of the Inscriptions.",
            image = R.drawable.landmark_touristic_palenque
        ),
    )
}