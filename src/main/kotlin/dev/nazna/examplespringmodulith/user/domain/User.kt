package dev.nazna.examplespringmodulith.user.domain

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "ユーザーモデル")
data class User(
    @field:Schema(name = "ユーザーID", required = true) val id: String,
    @field:Schema(name = "ユーザー名", required = true) val name: String,
    @field:Schema(name = "プロフィール画像") val profileImagePath: String?,
    @field:Schema(name = "ヘッダー画像") val headerImagePath: String?
)
