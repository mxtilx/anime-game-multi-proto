package org.anime_game_servers.multi_proto.gi.data.item.widget.lunch_box

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_1_0)
@ProtoModel
internal interface LunchBoxData {
    var slotMaterialMap: Map<Int, Int>
}
