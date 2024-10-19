package org.anime_game_servers.multi_proto.gi.data.spiral_abyss.run

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.spiral_abyss.TowerTeam

@AddedIn(GI_0_9_0)
@ProtoCommand(REQUEST)
internal interface TowerTeamSelectReq {
    var floorId: Int
    var towerTeamList: List<TowerTeam>
}
