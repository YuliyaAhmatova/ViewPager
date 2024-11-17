package com.example.viewpager

import java.io.Serializable

class OnBoardingFragmentViewPagerModel(
    val name: String,
    val picture: Int,
    val writer: String
) : Serializable {

    companion object {
        val viewPagerList = mutableListOf(
            OnBoardingFragmentViewPagerModel(
                "«Девочка с персиками»",
                R.drawable.girl_persic,
                "Валентин Серов"
            ),
            OnBoardingFragmentViewPagerModel(
                "«Богатыри»",
                R.drawable.bogatiri,
                "Виктор Михайлович Васнецов"
            ),
            OnBoardingFragmentViewPagerModel(
                "«Чёрный квадрат»",
                R.drawable.chernii_cvadrat,
                "Казимир Малевич"
            ),
            OnBoardingFragmentViewPagerModel(
                "«Утро в сосновом лесу»",
                R.drawable.cocnovii_les,
                "Иван Шишкин и Константин Савицкий"
            ),
            OnBoardingFragmentViewPagerModel(
                "«Золотая осень»",
                R.drawable.gold_autom,
                "Исаак Левитан"
            ),
            OnBoardingFragmentViewPagerModel(
                "«Иван-царевич на Сером Волке»",
                R.drawable.ivan_carevich,
                "Виктор Михайлович Васнецов"
            ),
            OnBoardingFragmentViewPagerModel(
                "«Опять двойка»",
                R.drawable.dvoika,
                "Фёдор Решетников"
            ),
            OnBoardingFragmentViewPagerModel(
                "«Грачи прилетели»",
                R.drawable.grachi,
                "Алексей Саврасов"
            ),
            OnBoardingFragmentViewPagerModel(
                "«Боярыня Морозова»",
                R.drawable.boiarynya,
                "Василий Иванович Суриков"
            ),
            OnBoardingFragmentViewPagerModel(
                "«Неизвестная»",
                R.drawable.neizvest,
                "Иван Крамской"
            ),
        )
    }
}