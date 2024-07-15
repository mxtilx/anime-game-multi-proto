package data.item.management

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_0_0)
@ProtoModel(alternativeNames = ["MaterilaInfo"])
internal interface MaterialInfo {
    var count: Int
    var guid: Long
}
