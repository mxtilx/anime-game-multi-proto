package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.gallery

import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_3_0)
@ProtoModel
internal interface HomeRacingGalleryRecord {
    var playerInfo: HomeGroupPlayerInfo
    var timestamp: Int
    var useTime: Int
}
