package org.anime_game_servers.multi_proto.gi.data.quest.giving

import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_CB2)
@ProtoCommand(RESPONSE)
internal interface ItemGivingRsp {
    var retcode: Retcode
    var givingId: Int
    @AddedIn(GI_2_6_0)
    var givingGroupId: Int
}
