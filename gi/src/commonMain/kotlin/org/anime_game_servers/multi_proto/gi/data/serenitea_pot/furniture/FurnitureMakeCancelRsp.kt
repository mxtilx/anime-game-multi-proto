package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.furniture

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_1_5_0)
@ProtoCommand(RESPONSE)
internal interface FurnitureMakeCancelRsp {
    var retcode: Retcode
    var furnitureMakeSlot: FurnitureMakeSlot
    var makeId: Int
}
