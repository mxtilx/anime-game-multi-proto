package org.anime_game_servers.multi_proto.gi.data.activity.general

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.CLIENT
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_0_9_0)
@ProtoCommand(CLIENT)
internal interface LoadActivityTerrainNotify {
    var activityId: Int
}
