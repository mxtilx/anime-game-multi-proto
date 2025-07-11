package org.anime_game_servers.multi_proto.gi.data.player

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_0_0)
@ProtoModel
interface ShortAbilityHashPair {
    var abilityConfigHash: Int
    var abilityNameHash: Int
}
