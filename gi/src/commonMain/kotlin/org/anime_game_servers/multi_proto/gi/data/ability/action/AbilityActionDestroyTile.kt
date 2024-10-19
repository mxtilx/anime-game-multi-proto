package org.anime_game_servers.multi_proto.gi.data.ability.action

import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_0_0)
@ProtoModel
internal interface AbilityActionDestroyTile {
    var pos: Vector
    var rot: Vector
}
