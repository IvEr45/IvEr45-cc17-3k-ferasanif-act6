package com.example.mycityapp.category

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.mycityapp.R


class Categor : Fragment() {
    private lateinit var title: TextView
    private lateinit var descriptionTextView: TextView
    private lateinit var addressTextView: TextView
    private lateinit var phoneTextView: TextView
    private lateinit var imageView: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_category, container, false)
        title = view.findViewById(R.id.textViewTitle)
        descriptionTextView = view.findViewById(R.id.textViewDescription)
        addressTextView = view.findViewById(R.id.textViewAddress)
        phoneTextView = view.findViewById(R.id.textViewPhone)
        imageView = view.findViewById(R.id.imageViewItem)
        val itemName = arguments?.getString("itemName") ?: "Item not found"
        val itemDetails = getItemDetails(itemName)

        itemDetails?.let {
            title.text = it.name
            descriptionTextView.text = it.description
            addressTextView.text = it.address
            phoneTextView.text = it.phoneNumber
            imageView.setImageResource(it.imageResId)
        }

        return view
    }

    private fun getItemDetails(itemName: String): CategorData? {
        return when (itemName) {
            "Grumpy Joe" -> CategorData(
                name = "Grumpy Joe",
                description = "Known for comfort food, this spot is loved for its pizza, pasta, and burgers with generous servings.",
                address = "15 Gibraltar Rd, Baguio, 2600 Benguet",
                phoneNumber = "09164936879",
                imageResId = R.drawable.grumpy
            )
            "Craft Burgers" -> CategorData(
                name = "Craft Burgers",
                description = "Enjoy delicious burgers with friends.",
                address = "3 Gladiola street Amparo Heights St, Baguio, 2600 Benguet",
                phoneNumber = "09760123677",
                imageResId = R.drawable.craft
            )
            "Chef's Home" -> CategorData(
                name = "Chef's Home",
                description = "This casual dining spot offers fusion Asian",
                address = "No. 88 Unit C, Old Sicat Hotel, Aspiras - Palispis Hwy, Baguio, 2600 Benguet",
                phoneNumber = "09164445756",
                imageResId = R.drawable.home
            )"Balai Inasal" -> CategorData(
                name = "Balai Inasal",
                description = "Specializes in traditional Filipino grilled dishes, especially Inasal (grilled chicken) in an inviting atmosphere.",
                address = "Claro M. Recto St, cor Leonard Wood Rd, Baguio, Benguet",
                phoneNumber = "09760123677",
                imageResId = R.drawable.balai
            )"Mahii Indian Cuisine" -> CategorData(
                name = "Mahii Indian Cuisine",
                description = "A destination for Indian food enthusiasts, serving dishes like curries, biryanis, and naan.",
                address = "83 gaerlan st Roman A, Baguio, 2600 Benguet",
                phoneNumber = "09175112529",
                imageResId = R.drawable.mahii
            )"Burnham Park" -> CategorData(
                name = "Burnham Park",
                description = "One of Baguio’s iconic parks, famous for its lake, biking trails, and lush gardens.",
                address = "Jose Abad Santos Dr, Baguio, 2600 Benguet",
                phoneNumber = "0744427014",
                imageResId = R.drawable.burnham
            )"Botanical Garden" -> CategorData(
                name = "Botanical Garden",
                description = "Known for its diverse plant species, walking trails, and traditional Igorot huts.",
                address = "37 Leonard Wood Rd, Baguio, 2600 Benguet",
                phoneNumber = "09175112529",
                imageResId = R.drawable.botanical
            )"Mines View Park" -> CategorData(
                name = "Mines View Park",
                description = "A popular lookout with panoramic views of the surrounding mountains and old mining areas.",
                address = "#1 Apostol Street, corner Outlook Dr S, Baguio, 2600 Benguet",
                phoneNumber = "09190660902",
                imageResId = R.drawable.mines
            )"Wright Park" -> CategorData(
                name = "Wright Park",
                description = "Known for horseback riding and a scenic pool of pines with beautiful landscapes.",
                address = "CJ88+6RP, Wright, Park Road, Baguio, Benguet",
                phoneNumber = "09175112529",
                imageResId = R.drawable.wright
            )"Camp John Hay Park" -> CategorData(
                name = "Camp John Hay Park",
                description = "A historic site with trails, picnic areas, and Pine Trees, offering peaceful walks.",
                address = "9JW6+RG9, Camp John Hay, Baguio, Benguet",
                phoneNumber = "09175112529",
                imageResId = R.drawable.camp
            )"BenCab Museum" -> CategorData(
                name = "BenCab Museum",
                description = "An art museum showcasing works by National Artist Benedicto Cabrera and other Filipino artists.",
                address = "Km. 6 Asin Rd, Tuba, 2603 Benguet",
                phoneNumber = "0744427165",
                imageResId = R.drawable.ben
            )"Baguio Museum" -> CategorData(
                name = "Baguio Museum",
                description = "Features artifacts, cultural displays, and history exhibits about the Cordillera region.",
                address = "Dot-PTA Complex, Gov. Pack Rd, Baguio, 2600 Benguet",
                phoneNumber = "0634447451",
                imageResId = R.drawable.bag
            )"Museo Kordilyera" -> CategorData(
                name = "Museo Kordilyera",
                description = "A university-based museum dedicated to preserving the Cordillera’s cultural heritage.",
                address = "University of the Philippines Baguio Campus, 30 Gov. Pack Rd, Baguio, 2600 Benguet",
                phoneNumber = "0744425794",
                imageResId = R.drawable.museo
            )"Bell House Library Museum" -> CategorData(
                name = "Bell House Library Museum",
                description = "An old American colonial residence converted into a museum at Camp John Hay.",
                address = "Bell House, Camp John Hay, Baguio, Benguet",
                phoneNumber = "09175112529",
                imageResId = R.drawable.bell
            )"Galleria De Potenciana by Arca’s Yard" -> CategorData(
                name = "Galleria De Potenciana by Arca’s Yard",
                description = "A charming museum with art, books, and a cafe overlooking scenic views.",
                address = "CH6X+9WV, Post Office Loop, YMCA, Baguio, 2600 Benguet",
                phoneNumber = "0746190528",
                imageResId = R.drawable.gall
            )"SM City Baguio" -> CategorData(
                name = "SM City Baguio",
                description = "A large shopping mall with dining, retail stores, a cinema, and a terrace view of the mountains.",
                address = "SM City Baguio, Luneta Hill Dr, 231, Baguio, 2600 Benguet",
                phoneNumber = "0746190528",
                imageResId = R.drawable.gall
            )"Baguio Center Mall" -> CategorData(
                name = "Baguio Center Mall",
                description = "Known for local shops, dining options, and a more traditional mall experience.",
                address = "421 Magsaysay Ave, Baguio, 2600 Benguet",
                phoneNumber = "09235953213",
                imageResId = R.drawable.sm
            )"Porta Vaga Mall" -> CategorData(
                name = "Porta Vaga Mall",
                description = "A smaller mall with boutiques, dining, and some unique finds.",
                address = "CH6X+Q9H, Session Rd, Baguio, Benguet",
                phoneNumber = "0744442999",
                imageResId = R.drawable.porta
            )"Abanao Square" -> CategorData(
                name = "Abanao Square",
                description = "Features a mix of local and brand-name stores, plus some affordable dining spots.",
                address = "Abanao Corner, Zandueta St, Baguio, 2600 Benguet",
                phoneNumber = "0744463322",
                imageResId = R.drawable.aban
            )"Sky World Commercial Center" -> CategorData(
                name = "Sky World Commercial Center",
                description = " A hidden gem for souvenirs, affordable finds, and thrift shopping.",
                address = "CH6W+XVG, F. Calderon St, Baguio, 2600 Benguet",
                phoneNumber = "0746190528",
                imageResId = R.drawable.sky
            )"The Camp" -> CategorData(
                name = "The Camp",
                description = "A lively bar and club known for its good music, food, and relaxed vibe.",
                address = "110 Brgy Teachers Camp Rd, Baguio, 2600 Benguet",
                phoneNumber = "09063704335",
                imageResId = R.drawable.campy
            )"Spade Superclub" -> CategorData(
                name = "Spade Superclub",
                description = "A popular nightlife spot with DJs and events for party-goers.",
                address = "Baguio Crown Legacy Hotel, Corner Montinola Street, Kisad Road, Baguio, Benguet",
                phoneNumber = "09774737755",
                imageResId = R.drawable.spade
            )"Alberto's Bar" -> CategorData(
                name = "Alberto's Bar",
                description = "Offers a laid-back atmosphere with drinks, live music, and a view of the city.",
                address = "CH6R+MCM, Carino St, Baguio, Benguet",
                phoneNumber = "0744433467",
                imageResId = R.drawable.alber
            )"The Ampersand" -> CategorData(
                name = "The Ampersand",
                description = " A bar with a chill vibe, perfect for unwinding with a drink and listening to live performances.",
                address = "The Camp, 30 Leonard Wood Rd, Baguio, 2600 Benguet",
                phoneNumber = "0746190528",
                imageResId = R.drawable.amper
            )"Amarillo Music Bar" -> CategorData(
                name = "Amarillo Music Bar",
                description = "Known for its live music, particularly rock and indie bands, attracting music enthusiasts.",
                address = "Legarda Rd, Baguio, Benguet",
                phoneNumber = "09202195777",
                imageResId = R.drawable.amarillo
            )

            else -> null
        }
    }
}
