package com.jessto.dineyrator.android.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.jessto.dineyrator.android.R
import com.jessto.dineyrator.android.ui.theme.Dimens.Dimensions.dp24
import com.jessto.dineyrator.android.ui.theme.Dimens.Dimensions.dp32

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    onProfileClick: (() -> Unit)? = null,
    onMenuClick: (() -> Unit)? = null,
) {
    CenterAlignedTopAppBar(
        title = {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = stringResource(R.string.app_name),
                    color = MaterialTheme.colorScheme.onBackground,
                )
            }
        },
        modifier = Modifier.fillMaxWidth(),
        navigationIcon = { onMenuClick?.let { MenuIcon(it) } },
        actions = { onProfileClick?.let { ProfileIcon(it) } },
        colors =
            TopAppBarDefaults.centerAlignedTopAppBarColors(
              containerColor = MaterialTheme.colorScheme.secondary,
        ),
        scrollBehavior = null,
    )
}

@Composable
private fun ProfileIcon(onClick: (() -> Unit)) =
    IconButton(
        modifier =
        Modifier
            .padding(horizontal = dp24)
            .size(dp32),
        onClick = { onClick() },
    ) {
        Icon(
            modifier = Modifier.size(dp32),
            imageVector = Icons.Outlined.AccountCircle,
            contentDescription = stringResource(id = R.string.cd_ic_profile),
            tint = Color.Unspecified,
        )
    }

@Composable
private fun MenuIcon(onClick: (() -> Unit)) =
    IconButton(
        modifier =
        Modifier
            .padding(horizontal = dp24),
        onClick = { onClick() },
    ) {
        Icon(
            modifier = Modifier.size(dp32),
            imageVector = Icons.Outlined.Menu,
            contentDescription = stringResource(id = R.string.cd_ic_menu),
            tint = Color.Unspecified,
        )
    }