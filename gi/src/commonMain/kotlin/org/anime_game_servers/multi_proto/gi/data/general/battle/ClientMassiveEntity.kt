package org.anime_game_servers.multi_proto.gi.data.general.battle

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB2)
@ProtoModel
internal interface ClientMassiveEntity {
    var configId: Int
    var entityType: Int
    var objId: Long
    
    @OneOf(
        types = [
            OneOfEntry(MassiveBoxInfo::class, "box_info"),
            OneOfEntry(MassiveGrassInfo::class, "grass_info"),
            OneOfEntry(MassiveWaterInfo::class, "water_info"),
        ]
    )
    var entityInfo: OneOfType
}
