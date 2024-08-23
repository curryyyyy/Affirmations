package com.example.affirmations.model

import android.content.res.Resources
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import java.sql.RowId

data class Affirmation(
    @StringRes val stringResourcesId: Int,
    @DrawableRes val imageResourcesId: Int
)
