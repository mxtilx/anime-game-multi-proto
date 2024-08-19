package org.anime_game_servers.multi_proto.gi.data.achievement

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_0_0)
@ProtoModel
interface Achievement {
    var curProgress: Int
    var finishedTimestamp: Int
    var id: Int
    var status: Status
    var totalProgress: Int
}
