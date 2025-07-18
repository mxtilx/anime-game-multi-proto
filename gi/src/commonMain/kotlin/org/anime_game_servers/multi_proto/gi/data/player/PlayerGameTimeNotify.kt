package org.anime_game_servers.multi_proto.gi.data.player

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.NOTIFY
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_2_2_0

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface PlayerGameTimeNotify {
    var uid: Int
    var gameTime: Int
    @AddedIn(GI_2_2_0)
    var isHome: Boolean
}
