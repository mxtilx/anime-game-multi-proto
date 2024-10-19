package org.anime_game_servers.multi_proto.gi.data.general

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_5_0)
@ProtoModel
internal interface ExhibitionDisplayInfo {
    var detailParam: Int
    var id: Int
    var param: Int
}
