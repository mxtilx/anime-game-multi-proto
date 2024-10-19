package org.anime_game_servers.multi_proto.gi.data.item.widget.type_avatar_attach

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_2_0)
@RemovedIn(GI_1_5_0)
@ProtoModel
internal interface AttachAvatarWidgetData {
    var cdOverTime: Int
    var materialId: Int
}
