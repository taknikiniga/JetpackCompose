package com.taknikiniga.editor.jetpackcomposeseries.medical.data

import com.taknikiniga.editor.jetpackcomposeseries.R
import com.taknikiniga.editor.jetpackcomposeseries.medical.data.model.BottomMenu
import com.taknikiniga.editor.jetpackcomposeseries.medical.data.model.DiseaseModel
import com.taknikiniga.editor.jetpackcomposeseries.medical.data.model.MedicalBlog

object Data {
    val diseaseData = mutableListOf(
        DiseaseModel(icon = R.drawable.dentist, diseaseName = "Dentist"),
        DiseaseModel(icon = R.drawable.heart, diseaseName = "Cardiologist"),
        DiseaseModel(icon = R.drawable.orthopedic, diseaseName = "Orthopedics"),
        DiseaseModel(icon = R.drawable.neurologist, diseaseName = "Neurologist"),
    )

    val medicalBlogs = listOf(
        MedicalBlog(
            title = "Understanding Hypertension: Causes and Remedies",
            description = "A comprehensive guide to high blood pressure, its symptoms, and natural treatments.",
            thumbnailUrl = "https://regencyhealthcare.in/wp-content/uploads/2018/06/1-1200x800.png",
            rating = 4.5f
        ),
        MedicalBlog(
            title = "10 Superfoods for a Healthy Heart",
            description = "Discover nutrient-rich foods that support cardiovascular health and prevent heart disease.",
            thumbnailUrl = "https://restaurantindia.s3.ap-south-1.amazonaws.com/s3fs-public/2025-03/super%20food.jpg",
            rating = 4.8f
        ),
        MedicalBlog(
            title = "Mental Health in the Modern World",
            description = "Explore the challenges of anxiety and depression in today’s fast-paced life.",
            thumbnailUrl = "https://w.ndtvimg.com/sites/3/2021/10/08162809/660-3.jpg",
            rating = 4.6f
        ),
        MedicalBlog(
            title = "How to Boost Your Immunity Naturally",
            description = "Tips and lifestyle changes to enhance your immune system without medication.",
            thumbnailUrl = "https://integrishealth.org/-/media/blog/2023/oyh_boosting-immunity-naturally.ashx?as=1&mh=405&mw=720&revision=6ce45e28-a813-4efd-9482-50eddb699c7c&hash=D06394C8AB3E0874E82E2C34E25CABEC",
            rating = 4.7f
        ),
        MedicalBlog(
            title = "The Science Behind Good Sleep",
            description = "Learn why sleep matters and how to improve your sleep cycle effectively.",
            thumbnailUrl = "https://example.com/images/sleep-science.jpg",
            rating = 4.4f
        ),
        MedicalBlog(
            title = "Managing Diabetes with Diet and Exercise",
            description = "Practical tips for controlling blood sugar levels through lifestyle changes.",
            thumbnailUrl = "https://example.com/images/diabetes-control.jpg",
            rating = 4.5f
        ),
        MedicalBlog(
            title = "Early Signs of Vitamin Deficiency",
            description = "Learn to recognize the common symptoms of essential vitamin deficiencies.",
            thumbnailUrl = "https://example.com/images/vitamin-deficiency.jpg",
            rating = 4.3f
        ),
        MedicalBlog(
            title = "Top Yoga Poses for Pain Relief",
            description = "Simple yet effective yoga techniques to manage chronic pain and improve flexibility.",
            thumbnailUrl = "https://example.com/images/yoga-pain.jpg",
            rating = 4.6f
        ),
        MedicalBlog(
            title = "The Role of Gut Health in Immunity",
            description = "Understand the connection between your digestive system and immune response.",
            thumbnailUrl = "https://example.com/images/gut-health.jpg",
            rating = 4.7f
        ),
        MedicalBlog(
            title = "Staying Hydrated: More Than Just Drinking Water",
            description = "Explore how hydration affects organs, energy, and skin health.",
            thumbnailUrl = "https://example.com/images/hydration.jpg",
            rating = 4.4f
        )
    )

    val bottomMenu = mutableListOf(
        BottomMenu(title = "Home", icon = R.drawable.house),
        BottomMenu(title = "Explore", icon = R.drawable.location),
        BottomMenu(title = "Booking", icon = R.drawable.calendar),
        BottomMenu(title = "Chat", icon = R.drawable.chatting),
        BottomMenu(title = "Profile", icon = R.drawable.profile),
    )


}